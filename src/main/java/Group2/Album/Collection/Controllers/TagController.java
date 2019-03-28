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
import Group2.Album.Collection.models.Tag;
import Group2.Album.Collection.repositories.AlbumRepository;
import Group2.Album.Collection.repositories.ArtistRepository;
import Group2.Album.Collection.repositories.SongRepository;
import Group2.Album.Collection.repositories.TagRepository;

@RestController
@RequestMapping("/tags")
public class TagController {

	@Resource
	TagRepository tagRepo;
	@Resource
	ArtistRepository artistRepo;
	@Resource
	AlbumRepository albumRepo;
	@Resource
	SongRepository songRepo;

	@GetMapping("")
	public Collection<Tag> getTags() {
		return (Collection<Tag>)tagRepo.findAll();

	}
	// Tag for Artists 
	@PostMapping("/add/artistTag") // Check mapping for this 
	public Collection<Artist> addArtistTags(@RequestBody String body) throws JSONException {
			JSONObject newTag = new JSONObject(body);
			String tagName = newTag.getString("tagTag");
			tagRepo.save(new Tag(tagName));
			return (Collection<Artist>) artistRepo.findAll();
	}
	// Tags for Songs 
	@PostMapping ("/add/songTag") // Check mapping for this 
	public Collection<Song> addSongTags(@RequestBody String body) throws JSONException {
			JSONObject newTag = new JSONObject(body);
			String tagName = newTag.getString("tagTag");
			tagRepo.save(new Tag(tagName));
			return (Collection<Song>) songRepo.findAll(); 
	}
	
	// Tags for Albums 
	@PostMapping ("/add/albumTag") // Check for mapping for this 
	public Collection<Album> addAlbumTag(@RequestBody String body) throws JSONException {
			JSONObject newTag = new JSONObject(body);
			String tagName = newTag.getString(body);
			tagRepo.save(new Tag(tagName));
			return (Collection<Album>) albumRepo.findAll(); 

		
	}
}
