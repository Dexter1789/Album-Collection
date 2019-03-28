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

import Group2.Album.Collection.models.Artist;
import Group2.Album.Collection.models.ArtistComment;
import Group2.Album.Collection.repositories.ArtistRepository;
import Group2.Album.Collection.repositories.CommentRepository;

@RestController
@RequestMapping("/artists")
public class ArtistController {
	
	@Resource
	ArtistRepository artistRepo;
	
	@Resource
	CommentRepository commentRepo;

	@GetMapping("")
	public Collection<Artist> getAllArtists() {
		return (Collection<Artist>) artistRepo.findAll();
	}
	
	@GetMapping("/{id}")
	public Artist getArtist(@PathVariable Long id) {
		return artistRepo.findById(id).get();
	}
	
	@PostMapping("/add")
	public Collection<Artist> addArtist(@RequestBody String body) throws JSONException {
		JSONObject json = new JSONObject(body);
		String artistName = json.getString("firstName");
		String artistImage = json.getString("artistImage");
		String age = json.getString("age");
		String hometown = json.getString("hometown");
		String rating = json.getString("rating");
		artistRepo.save(new Artist(artistName, artistImage, age, hometown, rating));
		return (Collection<Artist>) artistRepo.findAll();
	}
	
	@PostMapping("/comments/add")
	public Collection<Artist> addArtistComment(@RequestBody String body) throws JSONException {
		JSONObject newArtistComment = new JSONObject(body);
		String artistCommentContent = newArtistComment.getString("artistCommentContent");
		Artist artist = artistRepo.findByArtistName(newArtistComment.getString("artistCommentArtist"));
		commentRepo.save(new ArtistComment(artistCommentContent, artist));
		return (Collection<Artist>) artistRepo.findAll();
	}
}