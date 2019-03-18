package Group2.Album.Collection.models;

import java.util.Arrays;
import java.util.Collection;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;



@Entity
public class Artist {
	@Id
	@GeneratedValue
	private Long id;
	private String artistName;
	private String artistImage;
	private String age;
	private String hometown;
	private Collection <Album> allAlbums;
	
	public Artist () {}

	public Artist(String artistName, String artistImage, String age, String hometown, Album ...allAlbums) {
		super();
		this.artistName = artistName;
		this.artistImage = artistImage;
		this.age = age;
		this.hometown = hometown;
		this.allAlbums = Arrays.asList(allAlbums);
	}

	public Long getId() {
		return id;
	}

	public String getArtistName() {
		return artistName;
	}

	public String getArtistImage() {
		return artistImage;
	}

	public String getAge() {
		return age;
	}

	public String getHometown() {
		return hometown;
	}

	public Collection<Album> getAllAlbums() {
		return allAlbums;
	}

	@Override
	public String toString() {
		return "Artist [id=" + id + ", artistName=" + artistName + ", artistImage=" + artistImage + ", age=" + age
				+ ", hometown=" + hometown + ", allAlbums=" + allAlbums + "]";
	}
	
	

}
