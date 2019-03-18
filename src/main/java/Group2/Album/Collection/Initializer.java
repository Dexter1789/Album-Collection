package Group2.Album.Collection;

import javax.annotation.Resource;

import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Service;

import Group2.Album.Collection.models.Album;
import Group2.Album.Collection.models.Artist;
import Group2.Album.Collection.models.Song;
import Group2.Album.Collection.repositories.AlbumRepository;
import Group2.Album.Collection.repositories.ArtistRepository;
import Group2.Album.Collection.repositories.SongRepository;

@Service
public class Initializer implements CommandLineRunner {

@Resource
AlbumRepository albumRepo;
@Resource
ArtistRepository artistRepo;
@Resource
SongRepository songRepo;
@Override
public void run(String... args) throws Exception {
	Song song1 = songRepo.save(new Song ("good song ", "www.yahoo.com", "3:25"));
	Song song2 = songRepo.save(new Song ("terrible song", "www.twitter.com", "3:00"));
	Song song3 = songRepo.save(new Song ("ok song", "www.geocities.com", "2:25"));
	Song songa = songRepo.save(new Song ("good song a ", "www.instagram.com", "3:25"));
	Song songb = songRepo.save(new Song ("terrible song b", "www.belk.com", "3:00"));
	Song songc = songRepo.save(new Song ("ok song c", "www.tacobell.com", "2:25"));
	
	
	Album album1 = albumRepo.save(new Album("Album1", "www.google.com", "recordLable", song1, song2, song3));
	Album album2 = albumRepo.save(new Album("Album2", "www.bing.com", "recordLable2", songa, songb, songc));
	
	Artist artist1 = artistRepo.save(new Artist ("artist1", "www.pinterst.com", "25", "Dallas", album1));
	Artist artist2 = artistRepo.save(new Artist ("artist2", "www.McDonalds.com", "25", "Cleveland", album2));
}
}
