package Group2.Album.Collection;

import javax.annotation.Resource;

import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Service;

import Group2.Album.Collection.models.Album;
import Group2.Album.Collection.models.AlbumComment;
import Group2.Album.Collection.models.Artist;
import Group2.Album.Collection.models.ArtistComment;
import Group2.Album.Collection.models.Song;
import Group2.Album.Collection.models.SongComment;
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
	TagRepository tagRepo;
	
	@Resource
	CommentRepository commentRepo;

@Override
public void run(String... args) throws Exception {
	Tag tag1 = tagRepo.save(new Tag("Rock"));
	Tag tag2 = tagRepo.save(new Tag("Jazz"));
	Tag tag3 = tagRepo.save(new Tag("Indie"));
	Tag tag4 = tagRepo.save(new Tag("Adult Contemporary"));
	Tag tag5 = tagRepo.save(new Tag("Regae"));
	Tag tag6 = tagRepo.save(new Tag("Ska"));
	Tag tag7 = tagRepo.save(new Tag("Legend"));
	Tag tag8 = tagRepo.save(new Tag("Opera"));
	Tag tag9 = tagRepo.save(new Tag("Alt-Rap"));
	Tag tag10 = tagRepo.save(new Tag("Hip-hop"));
	Tag tag11 = tagRepo.save(new Tag("Acceptable Pop"));
	
	Artist artist1 = artistRepo.save(new Artist ("Bob Marley", "https://cps-static.rovicorp.com/3/JPG_400/MI0003/146/MI0003146038.jpg", "Deceased", "Nine Mile, Jamaica", "4", tag5, tag6, tag7));
	Artist artist2 = artistRepo.save(new Artist ("Leontyne Price", "https://upload.wikimedia.org/wikipedia/commons/d/df/Leontyne_Price_%28color%29_by_Jack_Mitchell.jpg", "92", "Laurel, Mississippi", "4", tag8, tag7));
	Artist artist3 = artistRepo.save(new Artist ("Pixies", "https://img.apmcdn.org/7f0e09c9a5c354ce654efe8f38fecd7008970d5b/uncropped/018430-20170220-pixies.jpeg", "various", "Boston", "4", tag3, tag1));
	Artist artist4 = artistRepo.save(new Artist ("Arcade Fire", "https://static.stereogum.com/blogs.dir/2/files/2010/07/af-alt-cover-608x608.jpg", "various", "Quebec", "5", tag1, tag3));
	Artist artist5 = artistRepo.save(new Artist ("Aesop Rock", "https://upload.wikimedia.org/wikipedia/commons/4/44/Ian_bavitz.jpg", "Stopped aging before it was cool.", "Portland, Oregon", "5", tag9, tag10));
	Artist artist6 = artistRepo.save(new Artist ("Beyoncé", "https://specials-images.forbesimg.com/imageserve/59f4e6c24bbe6f37dda1445b/416x416.jpg?background=000000&cropX1=81&cropX2=1997&cropY1=133&cropY2=2049", "Will never age", "Houston, TX",  "5", tag10, tag9, tag6));

	
//	Album album = albumRepo.save(new Album("", "https://upload.wikimedia.org/wikipedia/commons/thumb/a/ac/No_image_available.svg/1024px-No_image_available.svg.png", , artist, tag, tag));
	Album album1 = albumRepo.save(new Album("Indie Cindy", "https://media.timeout.com/images/101552041/image.jpg", 3, artist3, tag1, tag3));
	Album album2 = albumRepo.save(new Album("The Suburbs", "http://embed.arcadefire.com/artwork/b2.jpg", 4, artist4, tag2, tag3));	
	Album album3 = albumRepo.save(new Album("Catch a Fire", "https://img.discogs.com/Iwvxur_DPNMNNMrgdHSXUyWFeVI=/fit-in/600x577/filters:strip_icc():format(jpeg):mode_rgb():quality(90)/discogs-images/R-416733-1549542237-9463.jpeg.jpg", 5, artist1, tag6, tag7));
	Album album4 = albumRepo.save(new Album("Norma", "https://images.shazam.com/coverart/t68910196-b613495094_s400.jpg", 5, artist2, tag8));
	Album album5 = albumRepo.save(new Album("Skelethon", "https://images-na.ssl-images-amazon.com/images/I/81XhL9QHJ2L._SY355_.jpg", 3, artist5, tag9, tag10));
	Album album6 = albumRepo.save(new Album("I am... Sasha Fierce", "https://topicimages.mrowl.com/large/katystevens/beyonce/albums/i_amsasha_fierce_1.jpg", 2, artist6, tag10, tag11));
	
	
	
	
	Song song1 = songRepo.save(new Song ("Indie Cindy ","4:41", 3, album1, tag3, tag1));
	Song song2 = songRepo.save(new Song ("Culture War", "5:24", 4, album2, tag1, tag3));
	Song song3 = songRepo.save(new Song ("Concrete Jungle", "4:12", 5, album3, tag5, tag6));
	Song song4 = songRepo.save(new Song ("Act 1, Casta Diva", "7:19", 5, album4));
	Song song5 = songRepo.save(new Song ("Leisure Force",  "4:44", 4, album5, tag9, tag10));
	Song song6 = songRepo.save(new Song ("Halo", "4:22", 2, album6));
	
	
	commentRepo.save(new ArtistComment("This is a comment about Artist1.", artist1));
	commentRepo.save(new AlbumComment("This is a comment about Album1.", album1));
	commentRepo.save(new SongComment("This is a comment about Song1.", song1));
	commentRepo.save(new ArtistComment("This is a comment about Artist2.", artist2));
	commentRepo.save(new AlbumComment("This is a comment about Album2.", album2));
	commentRepo.save(new SongComment("This is a comment about Song2.", song2));
	commentRepo.save(new ArtistComment("This is a comment about Artist3.", artist3));
	commentRepo.save(new AlbumComment("This is a comment about Album3.", album3));
	commentRepo.save(new SongComment("This is a comment about Song3.", song3));
	commentRepo.save(new ArtistComment("This is a comment about Artist4.", artist4));
	commentRepo.save(new AlbumComment("This is a comment about Album4.", album4));
	commentRepo.save(new SongComment("This is a comment about Song4.", song4));
	commentRepo.save(new ArtistComment("This is a comment about Artist5.", artist5));
	commentRepo.save(new AlbumComment("This is a comment about Album5.", album5));
	commentRepo.save(new SongComment("This is a comment about Song5.", song5));
	commentRepo.save(new ArtistComment("This is a comment about Artist6.", artist6));
	commentRepo.save(new AlbumComment("This is a comment about Album6.", album6));
	commentRepo.save(new SongComment("This is a comment about Song6.", song6));

	

	
	// adding comments
//	album1.addComment(comment1);
	album1.addSong(song1);
	album1.addSong(song2);
	album1.addSong(song3);
	album2.addSong(song4);
	album2.addSong(song5);
	album2.addSong(song6);
	
	albumRepo.save(album1);
	albumRepo.save(album2);
	
//	artist1.addComment(comment2);
	artist1.addAlbum(album1);
	artist2.addAlbum(album2);
	artistRepo.save(artist1);
	artistRepo.save(artist2);
	
//	song1.addComment(comment3);
//	song1.addComment(comment4);
	songRepo.save(song1);
	
}}
