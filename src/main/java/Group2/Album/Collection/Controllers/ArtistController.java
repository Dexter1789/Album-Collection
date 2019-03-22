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

import Group2.Album.Collection.models.Artist;
import Group2.Album.Collection.repositories.ArtistRepository;

@RestController
@RequestMapping("/artists")
public class ArtistController {
	
	@Resource
	ArtistRepository artistRepo;

	@GetMapping("")
	public Collection<Artist> getAllArtists() {
		return (Collection<Artist>) artistRepo.findAll();
	}
	
	@PostMapping("/add")
	public Collection<Artist> addArtist(@RequestBody String body) throws JSONException {
		JSONObject json = new JSONObject(body);
		String firstName = json.getString("firstName");
		String lastName = json.getString("lastName");
		String artistImage = json.getString("artistImage");
		String age = json.getString("age");
		String hometown = json.getString("hometown");
		int rating = Integer.parseInt(json.getString("rating"));
		
		artistRepo.save(new Artist(firstName, lastName, artistImage, age, hometown, rating));
		
		return (Collection<Artist>) artistRepo.findAll();
	}
}