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
	TagRepository tagRepo;

@Override
public void run(String... args) throws Exception {
	Tag tag1 = tagRepo.save(new Tag("Rock"));
	Tag tag2 = tagRepo.save(new Tag("Jazz"));
	Tag tag3 = tagRepo.save(new Tag("Indie"));
	Tag tag4 = tagRepo.save(new Tag("Adult Contemporary"));
	
	Artist artist1 = artistRepo.save(new Artist ("Bob", "Marley", "www.pinterst.com", "25", "Dallas", "4", tag1));
	Artist artist2 = artistRepo.save(new Artist ("Leontyne", "Price", "www.McDonalds.com", "25", "Cleveland", "4", tag2));
	
	Album album1 = albumRepo.save(new Album("Album1", "www.google.com", 3, artist1, tag1));
	Album album2 = albumRepo.save(new Album("Album2", "www.bing.com", 4, artist2, tag2, tag3));	
	
	
	Song song1 = songRepo.save(new Song ("good song ","3:25", 3, album1, tag1));
	Song song2 = songRepo.save(new Song ("terrible song", "3:00", 4, album1, tag1));
	Song song3 = songRepo.save(new Song ("ok song", "2:25", 3, album1, tag2, tag3));
	Song song4 = songRepo.save(new Song ("good song a", "3:25", 3, album2));
	Song song5 = songRepo.save(new Song ("terrible song b",  "3:00", 4, album2, tag4, tag1));
	Song song6 = songRepo.save(new Song ("ok song c", "2:25", 2, album2));
	
	
	Comment comment1 = new Comment("CommentCommentCommentCommentCommentCommentComment.");
	Comment comment2 = new Comment("This is a comment. This is a comment. This is a comment. ");
	Comment comment3 = new Comment("This song sucks.This song sucks.This song sucks.");
	Comment comment4 = new Comment("Awesome album! Awesome album! Awesome album! Awesome album!");
	
	// adding comments
	album1.addComment(comment1);
	album1.addSong(song1);
	album1.addSong(song2);
	album1.addSong(song3);
	album2.addSong(song4);
	album2.addSong(song5);
	album2.addSong(song6);
	
	albumRepo.save(album1);
	albumRepo.save(album2);
	
	artist1.addComment(comment2);
	artist1.addAlbum(album1);
	artist2.addAlbum(album2);
	artistRepo.save(artist1);
	artistRepo.save(artist2);
	
	song1.addComment(comment3);
	song1.addComment(comment4);
	songRepo.save(song1);
	
}}
