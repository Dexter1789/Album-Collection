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
import Group2.Album.Collection.models.ArtistComment;
import Group2.Album.Collection.repositories.AlbumRepository;
import Group2.Album.Collection.repositories.ArtistRepository;
import Group2.Album.Collection.repositories.CommentRepository;

@RestController
@RequestMapping("/artists")
public class ArtistController {
	
	@Resource
	ArtistRepository artistRepo;
	
	@Resource
	CommentRepository commentRepo;
	
	@Resource
	AlbumRepository albumRepo;

	@GetMapping("")
	public Collection<Artist> getAllArtists() {
		return (Collection<Artist>) artistRepo.findAll();
	}
	
	@GetMapping("/{id}")
	public Artist getArtist(@PathVariable Long id) {
		return artistRepo.findById(id).get();
	}
	
	@PostMapping("/{id}")
	public Artist addAlbumToArtist(@PathVariable Long id, @RequestBody String body) throws JSONException {
		JSONObject json = new JSONObject(body);
		String albumTitle = json.getString("albumTitle");
		String albumImage = json.getString("albumImage");
		int rating = Integer.parseInt(json.getString("rating"));
		Artist artist = artistRepo.findById(id).get();
		Album albumToAdd = new Album(albumTitle, albumImage, rating, artist);
		albumRepo.save(albumToAdd);
		artist.addAlbum(albumToAdd);
		artistRepo.save(artist);
		return artist;
	}
	
//	@PostMapping("/add")
//	public Collection<Artist> addArtist(@RequestBody String body) throws JSONException {
//		JSONObject json = new JSONObject(body);
//		String artistName = json.getString("artistName");
//		String artistImage = json.getString("artistImage");
//		String age = json.getString("age");
//		String hometown = json.getString("hometown");
//		String rating = json.getString("rating");
//		artistRepo.save(new Artist(artistName, artistImage, age, hometown, rating));
//		return (Collection<Artist>) artistRepo.findAll();
//	}
	
	@PostMapping("/add/{id}")
	public Artist addCommentToArtist(@RequestBody String body, @PathVariable Long id) throws JSONException {
		JSONObject json = new JSONObject(body);
		String content = json.getString("content");
		Artist artist = artistRepo.findById(id).get();
		ArtistComment commentToAdd = new ArtistComment(content, artist);
		commentRepo.save(commentToAdd);
		artist.addComment(commentToAdd);
		artistRepo.save(artist);
		return artist;
	
//	@PostMapping("/comments/add")
//	public Collection<Artist> addArtistComment(@RequestBody String body) throws JSONException {
//		JSONObject newArtistComment = new JSONObject(body);
//		String artistCommentContent = newArtistComment.getString("artistCommentContent");
//		Artist artist = artistRepo.findByArtistName(newArtistComment.getString("artistCommentArtist"));
//		commentRepo.save(new ArtistComment(artistCommentContent, artist));
//		return (Collection<Artist>) artistRepo.findAll();
//	}
}
}