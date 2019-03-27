package Group2.Album.Collection.Controllers;

import java.util.Collection;

import javax.annotation.Resource;

import org.json.JSONException;
import org.json.JSONObject;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import Group2.Album.Collection.models.Album;
import Group2.Album.Collection.models.Artist;
import Group2.Album.Collection.models.Song;
import Group2.Album.Collection.repositories.AlbumRepository;
import Group2.Album.Collection.repositories.ArtistRepository;
import Group2.Album.Collection.repositories.SongRepository;

@RestController
@RequestMapping("/songs")
public class SongController {
	
	@Resource
	SongRepository songRepo;
	
	@Resource
	AlbumRepository albumRepo;
	
	@Resource
	ArtistRepository artistRepo;

	@GetMapping("")
	public Collection<Song> getAllSongs() {
		return (Collection<Song>) songRepo.findAll();
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