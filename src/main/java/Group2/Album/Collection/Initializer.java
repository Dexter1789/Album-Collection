package Group2.Album.Collection;

import javax.annotation.Resource;

import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Service;

import Group2.Album.Collection.models.Album;
import Group2.Album.Collection.models.AlbumComment;
import Group2.Album.Collection.models.AlbumTag;
import Group2.Album.Collection.models.Artist;
import Group2.Album.Collection.models.ArtistComment;
import Group2.Album.Collection.models.ArtistTag;
import Group2.Album.Collection.models.Song;
import Group2.Album.Collection.models.SongComment;
import Group2.Album.Collection.models.SongTag;
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
//	Tag tag2 = tagRepo.save(new Tag("Jazz"));
//	Tag tag3 = tagRepo.save(new Tag("Indie"));
//	Tag tag4 = tagRepo.save(new Tag("Contemporary"));
	Tag tag5 = tagRepo.save(new Tag("Regae"));
//	Tag tag6 = tagRepo.save(new Tag("Ska"));
//	Tag tag7 = tagRepo.save(new Tag("Legend"));
//	Tag tag8 = tagRepo.save(new Tag("Opera"));
//	Tag tag9 = tagRepo.save(new Tag("Alt-Rap"));
//	Tag tag10 = tagRepo.save(new Tag("Hip-Hop"));
//	Tag tag11 = tagRepo.save(new Tag("Acceptable Pop"));
	
	Artist artist1 = artistRepo.save(new Artist ("Bob Marley", "https://cps-static.rovicorp.com/3/JPG_400/MI0003/146/MI0003146038.jpg", "Deceased", "Nine Mile, Jamaica", "4", tag1));
	Artist artist2 = artistRepo.save(new Artist ("Leontyne Price", "https://upload.wikimedia.org/wikipedia/commons/d/df/Leontyne_Price_%28color%29_by_Jack_Mitchell.jpg", "92", "Laurel, Mississippi", "4"));
	Artist artist3 = artistRepo.save(new Artist ("Pixies", "https://img.apmcdn.org/7f0e09c9a5c354ce654efe8f38fecd7008970d5b/uncropped/018430-20170220-pixies.jpeg", "various", "Boston", "4"));
	Artist artist4 = artistRepo.save(new Artist ("Arcade Fire", "https://static.stereogum.com/blogs.dir/2/files/2010/07/af-alt-cover-608x608.jpg", "various", "Quebec", "5"));
	Artist artist5 = artistRepo.save(new Artist ("Aesop Rock", "https://upload.wikimedia.org/wikipedia/commons/4/44/Ian_bavitz.jpg", "Stopped aging before it was cool.", "Portland", "5"));
	Artist artist6 = artistRepo.save(new Artist ("Beyonce", "https://specials-images.forbesimg.com/imageserve/59f4e6c24bbe6f37dda1445b/416x416.jpg", "Will never age", "Houston, TX",  "5"));
	Artist artist7 = artistRepo.save(new Artist ("Idles", "https://www.rollingstone.com/wp-content/uploads/2018/08/20180324_EY_IDLES_EbruYildiz_285.jpg", "21", "Seattle", "4"));
	Artist artist8 = artistRepo.save(new Artist ("Beyonce/JayZ", "https://media.vanityfair.com/photos/572114bbe1a62e181e91a62b/master/w_768,c_limit/beyonce-jay-z-lemonade.jpg", "40", "Houston", "4"));
	Artist artist9 = artistRepo.save(new Artist ("Lush", "https://static.stereogum.com/uploads/2015/09/Lush-640x516.jpg", "various", "5", "Bristol"));
	Artist artist10 = artistRepo.save(new Artist("Alice Bag","data:image/jpeg;base64,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", "60", "Los Angeles", "6"));
	Artist artist11 = artistRepo.save(new Artist("Thou", "https://static.stereogum.com/uploads/2018/08/20180721_Thou_Promo_5380-1535382938-640x380.jpg", "82", "Mars", "8"));
	Artist artist12 = artistRepo.save(new Artist("Myra Melford", "http://www.myramelford.com/images/photos/31_image.jpg", "62", "Evanston", "7"));
	Artist artist13 = artistRepo.save(new Artist("The Beths", "https://thebeths.com/meta/og-image.jpg", "various", "various", "4"));
	Artist artist14 = artistRepo.save(new Artist("Vince Staples", "https://media.npr.org/assets/img/2017/03/31/2017-03-31-vincestaples-ebogle_mg_9964-edit_custom-3b5ddf751b9ae4de894b50ddfe0485704e0a52f6-s800-c85.jpg", "25", "Long Beach", "7"));
	
//	Album album = albumRepo.save(new Album("", "https://upload.wikimedia.org/wikipedia/commons/thumb/a/ac/No_image_available.svg/1024px-No_image_available.svg.png", , artist, tag, tag));
	Album album1 = albumRepo.save(new Album("Indie Cindy", "https://media.timeout.com/images/101552041/image.jpg", 3, artist3));
	Album album2 = albumRepo.save(new Album("The Suburbs", "http://embed.arcadefire.com/artwork/b2.jpg", 4, artist4));	
//	Album album3 = albumRepo.save(new Album("Catch a Fire", "https://img.discogs.com/Iwvxur_DPNMNNMrgdHSXUyWFeVI=/fit-in/600x577/filters:strip_icc():format(jpeg):mode_rgb():quality(90)/discogs-images/R-416733-1549542237-9463.jpeg.jpg", 5, artist1, tag5));
	Album album4 = albumRepo.save(new Album("Norma", "https://images.shazam.com/coverart/t68910196-b613495094_s400.jpg", 5, artist2));
	Album album5 = albumRepo.save(new Album("Skelethon", "https://images-na.ssl-images-amazon.com/images/I/81XhL9QHJ2L._SY355_.jpg", 3, artist5));
	Album album6 = albumRepo.save(new Album("I am... Sasha Fierce", "https://topicimages.mrowl.com/large/katystevens/beyonce/albums/i_amsasha_fierce_1.jpg", 2, artist6));
	Album album7 = albumRepo.save(new Album("Joy as an Act of Resistance", "https://upload.wikimedia.org/wikipedia/en/e/e4/Idles-Joy_as_an_Act_of_Resistance.jpg",7, artist7));
	Album album8 = albumRepo.save(new Album("Every Thing Is Love", "https://static.stereogum.com/uploads/2018/06/Beyonce-and-Jay-Z-Everything-Is-Love-1529336950-640x640.jpg", 8, artist8));
//	Album album9 = albumRepo.save(new Album("Snail Mail", "https://f4.bcbits.com/img/a0559333599_10.jpg", 9, artist9));
	Album album10 = albumRepo.save(new Album("Blueprint", "https://media.pitchfork.com/photos/5ab160c41e037771e6b2fb68/1:1/w_320/Alice%20Bag%20Blueprint.jpg", 10, artist10));
	Album album11 = albumRepo.save(new Album("Magus", "https://f4.bcbits.com/img/0013738366_10.jpg", 11, artist11));
	Album album12 = albumRepo.save(new Album("Snowy Egret, The Other Side of Air", "https://images-na.ssl-images-amazon.com/images/I/91ewoLBzJLL._SX355_.jpg", 12, artist12));
	Album album13 = albumRepo.save(new Album("Future Me Hates Me", "https://img.discogs.com/4TEI9bPcZrpwutDW28b_Nf9Oj_c=/fit-in/600x594/filters:strip_icc():format(jpeg):mode_rgb():quality(90)/discogs-images/R-12368548-1533844458-4834.jpeg.jpg", 13, artist13));
	Album album14 = albumRepo.save(new Album("FM", "https://static.stereogum.com/uploads/2018/11/Vince-Staples-FM-1541448359-640x640.jpg", 14, artist14));
	
	Album album15 = albumRepo.save(new Album("Talkin' Blues", "https://img.discogs.com/9Z8sRf1femQy4Mq5opXn27gLNTo=/fit-in/600x600/filters:strip_icc():format(jpeg):mode_rgb():quality(90)/discogs-images/R-857574-1434626922-5046.jpeg.jpg", 10, artist1, tag5));
	Album album16 = albumRepo.save(new Album("Natty Dread", "https://img.discogs.com/DYHco8Wue5ibEqNNgDepNPBPwZA=/fit-in/480x475/filters:strip_icc():format(jpeg):mode_rgb():quality(90)/discogs-images/R-557836-1141752582.jpeg.jpg", 11, artist1, tag5));
	Album album17 = albumRepo.save(new Album("Legend", "http://static1.squarespace.com/static/5311d009e4b08cb688151314/56e34c0d27d4bdfdac7a9f4d/56fa8fa8d210b86f7ac2dc9b/1546013168039/Bob_Marley_-_Legend.jpg", 12, artist1, tag5));
	Album album18 = albumRepo.save(new Album("GOLD", "https://cdn3.volusion.com/rkfzh.yaufw/v/vspfiles/photos/B0004008.2-2.jpg?1383263654", 13, artist1, tag5));
	Album album19 = albumRepo.save(new Album("Rebel Music", "https://img.discogs.com/9-PzIoIygKONV0R5c5ogUPC_FpQ=/fit-in/600x598/filters:strip_icc():format(jpeg):mode_rgb():quality(90)/discogs-images/R-6418177-1418722626-4030.jpeg.jpg", 14, artist1, tag5));
	
	Album album20 = albumRepo.save(new Album("lovelife", "https://img.discogs.com/ZhHCSazts7WOaauwiqUjMrlm8w0=/fit-in/600x612/filters:strip_icc():format(jpeg):mode_rgb():quality(90)/discogs-images/R-607737-1484681641-8712.jpeg.jpg", 10, artist9, tag1));
	Album album21 = albumRepo.save(new Album("Spooky", "https://img.discogs.com/hVSG14VrHk_dHNtHFm6C8dLn2UQ=/fit-in/600x600/filters:strip_icc():format(jpeg):mode_rgb():quality(90)/discogs-images/R-388489-1495482918-2958.jpeg.jpg", 11, artist9, tag1));
	Album album22 = albumRepo.save(new Album("Split", "https://cps-static.rovicorp.com/3/JPG_500/MI0001/684/MI0001684200.jpg?partner=allrovi.com", 12, artist9, tag1));
	Album album23 = albumRepo.save(new Album("Scar", "https://someofmyrecords.files.wordpress.com/2013/05/wpid-imag0528_1.jpg", 13, artist9, tag1));
	Album album24 = albumRepo.save(new Album("Gala", "http://g-ecx.images-amazon.com/images/G/01/ciu/7a/24/0081b2c008a01daed77a8010.L.jpg", 14, artist9, tag1));
	
	
	Song song1 = songRepo.save(new Song ("Indie Cindy ","4:41", 3, album1));
	Song song2 = songRepo.save(new Song ("Culture War", "5:24", 4, album2));
//	Song song3 = songRepo.save(new Song ("Concrete Jungle", "4:12", 5, album3, tag5));
	Song song4 = songRepo.save(new Song ("Act 1, Casta Diva", "7:19", 5, album4));
	Song song5 = songRepo.save(new Song ("Leisure Force",  "4:44", 4, album5));
	Song song6 = songRepo.save(new Song ("Halo", "4:22", 2, album6));
	
	Song song7 = songRepo.save(new Song ("Talkin' Blues","4:38", 3, album15, tag5));
	Song song8 = songRepo.save(new Song ("Burnin' and Lootin'", "6:36", 4, album15, tag5));
	Song song9 = songRepo.save(new Song ("Kinky Reggae", "5:08", 5, album15, tag5));
	Song song10 = songRepo.save(new Song ("Get Up Stand Up", "4:44", 5, album15, tag5));
	Song song11 = songRepo.save(new Song ("Slave Driver",  "3:47", 4, album15, tag5));
	Song song12 = songRepo.save(new Song ("Walk the Land Proud", "3:30", 2, album15, tag5));
	
	
	Song song13 = songRepo.save(new Song ("Ladykillers","3:13", 3, album20, tag1));
	Song song14 = songRepo.save(new Song ("Heavenly Nobodies", "2:15", 4, album20, tag1));
	Song song15 = songRepo.save(new Song ("500 (Shake Baby Shake)", "3:30", 5, album20, tag1));
	Song song16 = songRepo.save(new Song ("I've Been Here Before", "4:36", 5, album20, tag1));
	Song song17 = songRepo.save(new Song ("Papasan",  "2:36", 4, album20, tag1));
	Song song18 = songRepo.save(new Song ("Single Girl", "2:35", 2, album20, tag1));
	
	
	commentRepo.save(new ArtistComment("This is a comment about Artist1.", artist1));
	commentRepo.save(new AlbumComment("This is a comment about Album1.", album1));
	commentRepo.save(new SongComment("This is a comment about Song1.", song1));
	commentRepo.save(new ArtistComment("This is a comment about Artist2.", artist2));
	commentRepo.save(new AlbumComment("This is a comment about Album2.", album2));
	commentRepo.save(new SongComment("This is a comment about Song2.", song2));
	commentRepo.save(new ArtistComment("This is a comment about Artist3.", artist3));
//	commentRepo.save(new AlbumComment("This is a comment about Album3.", album3));
//	commentRepo.save(new SongComment("This is a comment about Song3.", song3));
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
	album2.addSong(song2);
//	album3.addSong(song3);
	album4.addSong(song4);
	album5.addSong(song5);
	album6.addSong(song6);
	
	album15.addSong(song7);
	album15.addSong(song8);
	album15.addSong(song9);
	album15.addSong(song10);
	album15.addSong(song11);
	album15.addSong(song12);
	
	album20.addSong(song13);
	album20.addSong(song14);
	album20.addSong(song15);
	album20.addSong(song16);
	album20.addSong(song17);
	album20.addSong(song18);
	
	
	
	albumRepo.save(album1);
	albumRepo.save(album2);
//	albumRepo.save(album3);
	albumRepo.save(album4);
	albumRepo.save(album5);
	albumRepo.save(album6);
	albumRepo.save(album7);
	albumRepo.save(album8);
//	albumRepo.save(album9);
	albumRepo.save(album10);
	albumRepo.save(album11);
	albumRepo.save(album12);
	albumRepo.save(album13);
	albumRepo.save(album14);
	albumRepo.save(album15);
	albumRepo.save(album16);
	albumRepo.save(album17);
	albumRepo.save(album18);
	albumRepo.save(album19);
	albumRepo.save(album20);
	albumRepo.save(album21);
	albumRepo.save(album22);
	albumRepo.save(album23);
	albumRepo.save(album24);
	
//	artist1.addComment(comment2);
	artist3.addAlbum(album1);
	artist4.addAlbum(album2);
//	artist1.addAlbum(album3);
	artist2.addAlbum(album4);
	artist5.addAlbum(album5);
	artist6.addAlbum(album6);
	artist7.addAlbum(album7);
	artist8.addAlbum(album8);
//	artist9.addAlbum(album9);
	artist10.addAlbum(album10);
	artist11.addAlbum(album11);
	artist12.addAlbum(album12);
	artist13.addAlbum(album13);
	artist14.addAlbum(album14);
	
	artist1.addAlbum(album15);
	artist1.addAlbum(album16);
	artist1.addAlbum(album17);
	artist1.addAlbum(album18);
	artist1.addAlbum(album19);
	
	artist9.addAlbum(album20);
	artist9.addAlbum(album21);
	artist9.addAlbum(album22);
	artist9.addAlbum(album23);
	artist9.addAlbum(album24);
	
	
	
	artistRepo.save(artist1);
	artistRepo.save(artist2);
	artistRepo.save(artist3);
	artistRepo.save(artist4);
	artistRepo.save(artist5);
	artistRepo.save(artist6);
	artistRepo.save(artist7);
	artistRepo.save(artist8);
	artistRepo.save(artist9);
	artistRepo.save(artist10);
	artistRepo.save(artist11);
	artistRepo.save(artist12);
	artistRepo.save(artist13);
	artistRepo.save(artist14);
	
//	song1.addComment(comment3);
//	song1.addComment(comment4);
	songRepo.save(song1);
	songRepo.save(song2);
//	songRepo.save(song3);
	songRepo.save(song4);
	songRepo.save(song5);
	songRepo.save(song6);
	songRepo.save(song7);
	songRepo.save(song8);
	songRepo.save(song9);
	songRepo.save(song10);
	songRepo.save(song11);
	songRepo.save(song12);
	songRepo.save(song13);
	songRepo.save(song14);
	songRepo.save(song15);
	songRepo.save(song16);
	songRepo.save(song17);
	songRepo.save(song18);
	
}}
