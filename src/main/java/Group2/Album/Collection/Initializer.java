package Group2.Album.Collection;

import javax.annotation.Resource;

import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Service;

import Group2.Album.Collection.models.Album;
import Group2.Album.Collection.models.Artist;
import Group2.Album.Collection.models.Comment;
import Group2.Album.Collection.models.Song;
import Group2.Album.Collection.models.Tag;
import Group2.Album.Collection.repositories.AlbumRepository;
import Group2.Album.Collection.repositories.ArtistRepository;
import Group2.Album.Collection.repositories.CommentRepository;
import Group2.Album.Collection.repositories.SongRepository;
import Group2.Album.Collection.repositories.TagRepository;

@Service
public class Initializer implements CommandLineRunner {

	@Resource
	AlbumRepository albumRepo;
	
	@Resource
	ArtistRepository artistRepo;
	
	@Resource
	SongRepository songRepo;
	
	@Resource
	CommentRepository commentRepo;
	
	@Resource
	TagRepository tagRepo;

@Override
public void run(String... args) throws Exception {
	Song song1 = songRepo.save(new Song ("good song ", "www.yahoo.com", "3:25", 3));
	Song song2 = songRepo.save(new Song ("terrible song", "www.twitter.com", "3:00", 4));
	Song song3 = songRepo.save(new Song ("ok song", "www.geocities.com", "2:25", 3));
	Song songa = songRepo.save(new Song ("good song a ", "www.instagram.com", "3:25", 3));
	Song songb = songRepo.save(new Song ("terrible song b", "www.belk.com", "3:00", 4));
	Song songc = songRepo.save(new Song ("ok song c", "www.tacobell.com", "2:25", 2));
	
	
	Album album1 = albumRepo.save(new Album("Album1", "www.google.com", 3 , song1, song2, song3));
	Album album2 = albumRepo.save(new Album("Album2", "www.bing.com", 4 , songa, songb, songc));
	
	Artist artist1 = artistRepo.save(new Artist ("Bob", "Marley", "www.pinterst.com", "25", "Dallas", 4, album1));
	Artist artist2 = artistRepo.save(new Artist ("Leontyne", "Price", "www.McDonalds.com", "25", "Cleveland", 4, album2));
	
	Comment comment1 = commentRepo.save(new Comment("user1", "CommentCommentCommentCommentCommentCommentComment."));
	Comment comment2 = commentRepo.save(new Comment("user2", "This is a comment. This is a comment. This is a comment. "));
	Comment comment3 = commentRepo.save(new Comment("user3", "This song sucks.This song sucks.This song sucks."));
	Comment comment4 = commentRepo.save(new Comment("user4", "Awesome album! Awesome album! Awesome album! Awesome album!"));
	
	Tag tag1 = tagRepo.save(new Tag("Rock"));
	Tag tag2 = tagRepo.save(new Tag("Jazz"));
	Tag tag3 = tagRepo.save(new Tag("Indie"));
	Tag tag4 = tagRepo.save(new Tag("Adult Contemporary"));
	
}
}
