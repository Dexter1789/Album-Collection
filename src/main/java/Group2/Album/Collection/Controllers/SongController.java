package Group2.Album.Collection.Controllers;

import java.util.Collection;

import javax.annotation.Resource;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import Group2.Album.Collection.models.Song;
import Group2.Album.Collection.repositories.SongRepository;

@RestController
@RequestMapping("/songs")
public class SongController {
	
	@Resource
	SongRepository songRepo;

	@GetMapping("")
	public Collection<Song> getAllSongs() {
		return (Collection<Song>) songRepo.findAll();
	}
}