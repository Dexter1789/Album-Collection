package Group2.Album.Collection.Controllers;

import java.util.Collection;

import javax.annotation.Resource;

import org.json.JSONException;
import org.json.JSONObject;
import org.springframework.stereotype.Repository;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import Group2.Album.Collection.models.Album;
import Group2.Album.Collection.models.AlbumComment;
import Group2.Album.Collection.models.Artist;
import Group2.Album.Collection.models.Song;
import Group2.Album.Collection.models.Tag;
import Group2.Album.Collection.repositories.AlbumRepository;
import Group2.Album.Collection.repositories.ArtistRepository;
import Group2.Album.Collection.repositories.CommentRepository;
import Group2.Album.Collection.repositories.SongRepository;
import Group2.Album.Collection.repositories.TagRepository;

@RestController
@RequestMapping("/albums")
public class AlbumController {
	
	@Resource
	AlbumRepository albumRepo;
	
	@Resource
	ArtistRepository artistRepo;
	
	@Resource
	CommentRepository commentRepo;
	
	@Resource
	SongRepository songRepo;
	
	@Resource
	TagRepository tagRepo;

	@GetMapping("")
	public Collection<Album> getAllAlbums() {
		return (Collection<Album>) albumRepo.findAll();
	}
	
	@GetMapping("/{id}")
	public Album getSingleAlbum(@PathVariable Long id) {
		return albumRepo.findById(id).get();
	}
	
	@PostMapping("/{id}")
	public Album addSongToAlbum(@PathVariable Long id, @RequestBody String body) throws JSONException {
		JSONObject json = new JSONObject(body);
		String songTitle = json.getString("songTitle");
		String duration = json.getString("duration");
		int rating = Integer.parseInt(json.getString("rating"));
		Album album = albumRepo.findById(id).get();
		Song songToAdd = new Song(songTitle, duration, rating, album);
		songRepo.save(songToAdd);
		album.addSong(songToAdd);
		albumRepo.save(album);
		return album;
	}
	
	@PostMapping("/add")
	public Collection<Artist> addAlbumToArtist(@RequestBody String body) throws JSONException {
		JSONObject json = new JSONObject(body);
		String albumTitle = json.getString("albumTitle");
		String albumImage = json.getString("albumImage");
		int rating = Integer.parseInt(json.getString("rating"));
		Artist artist = artistRepo.findByArtistName(json.getString("artist"));
		albumRepo.save(new Album(albumTitle, albumImage, rating, artist));
		return (Collection<Artist>) artistRepo.findAll();
	}
	
	@PostMapping("/add/{id}")
	public Album addCommentToAlbum(@RequestBody String body, @PathVariable Long id) throws JSONException {
		JSONObject json = new JSONObject(body);
		String content = json.getString("content");
		Album album = albumRepo.findById(id).get();
		AlbumComment commentToAdd = new AlbumComment(content, album);
		commentRepo.save(commentToAdd);
		album.addComment(commentToAdd);
		albumRepo.save(album);
		return album;
}
	
	@PostMapping("/add/tags/{id}")
	public Album addTagToAlbum(@RequestBody String body, @PathVariable Long id) throws JSONException {
		JSONObject json = new JSONObject(body);
		String content = json.getString("content");
		Album album = albumRepo.findById(id).get();
		Tag tagToAdd = new Tag(content);
		tagRepo.save(tagToAdd);
		album.addTag(tagToAdd);
		albumRepo.save(album);
		return album;
	}
}