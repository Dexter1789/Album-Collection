package Group2.Album.Collection.Controllers;

import java.util.Collection;

import javax.annotation.Resource;

import org.json.JSONException;
import org.json.JSONObject;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import Group2.Album.Collection.models.Album;
import Group2.Album.Collection.models.Artist;
import Group2.Album.Collection.models.Song;
import Group2.Album.Collection.models.SongComment;
import Group2.Album.Collection.models.Tag;
import Group2.Album.Collection.repositories.AlbumRepository;
import Group2.Album.Collection.repositories.ArtistRepository;
import Group2.Album.Collection.repositories.CommentRepository;
import Group2.Album.Collection.repositories.SongRepository;
import Group2.Album.Collection.repositories.TagRepository;

@RestController
@RequestMapping("/songs")
public class SongController {
	
	@Resource
	SongRepository songRepo;
	
	@Resource
	AlbumRepository albumRepo;
	
	@Resource
	ArtistRepository artistRepo;

	@Resource
	CommentRepository commentRepo;
	
	@Resource
	TagRepository tagRepo;
	
	@GetMapping("")
	public Collection<Song> getAllSongs() {
		return (Collection<Song>) songRepo.findAll();
	}
	
	@GetMapping("/{id}")
	public Song getSong(@PathVariable Long id) {
		return songRepo.findById(id).get();
	}
	
	@PostMapping("/add/{id}")
	public Song addCommentToSong(@RequestBody String body, @PathVariable Long id) throws JSONException {
		JSONObject json = new JSONObject(body);
		String content = json.getString("content");
		Song song = songRepo.findById(id).get();
		SongComment commentToAdd = new SongComment(content, song);
		commentRepo.save(commentToAdd);
		song.addComment(commentToAdd);
		songRepo.save(song);
		return song;
	}
	
	@PostMapping("/add/tags/{id}")
	public Song addTagToSong(@RequestBody String body, @PathVariable Long id) throws JSONException {
		JSONObject json = new JSONObject(body);
		String content = json.getString("content");
		Song song = songRepo.findById(id).get();
		Tag tagToAdd = new Tag(content);
		tagRepo.save(tagToAdd);
		song.addTag(tagToAdd);
		songRepo.save(song);
		return song;
	}
	
	@PostMapping("/add")
	public Collection<Artist> addSong(@RequestBody String body) throws JSONException {
		JSONObject json = new JSONObject(body);
		String songTitle = json.getString("songTitle");
		String duration = json.getString("duration");
		int rating = Integer.parseInt(json.getString("rating"));
		Album album = albumRepo.findByAlbumTitle(json.getString("album"));
		songRepo.save(new Song(songTitle, duration, rating, album));
		return (Collection<Artist>) artistRepo.findAll();
	}
}