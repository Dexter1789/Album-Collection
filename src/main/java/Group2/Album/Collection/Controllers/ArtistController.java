package Group2.Album.Collection.Controllers;

import java.util.Collection;

import javax.annotation.Resource;

import org.springframework.web.bind.annotation.GetMapping;
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
}