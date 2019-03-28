package Group2.Album.Collection.models;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Lob;
import javax.persistence.ManyToMany;
import javax.persistence.OneToMany;

@Entity
public class Artist {
	
	@Id
	@GeneratedValue
	private Long id;
	private String artistName;
	@Lob
	private String artistImage;
	private String age;
	private String hometown;
	private String rating;
	
	@ManyToMany
	private Collection<Tag> allTags;
	
	@OneToMany(mappedBy="artist")
	private Collection<ArtistComment> artistComments;
	
	@OneToMany
	private Collection<Album> allAlbums;
	
	public Artist () {}

	public Artist(String artistName, String artistImage, String age, String hometown, String rating, Tag ...allTags) {
		this.artistName = artistName;
		this.artistImage = artistImage;
		this.age = age;
		this.hometown = hometown;
		this.rating = rating;
		this.allTags = Arrays.asList(allTags);
		this.allAlbums = new ArrayList<Album>();
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

	public String getRating() {
		return rating;
	}

	public Collection<Tag> getAllTags() {
		return allTags;
	}

	public Collection<ArtistComment> getArtistComments() {
		return artistComments;
	}

	// adding a comment to Artist
	public void addComment(Comment comment) {
			artistComments.add((ArtistComment) comment);
	}
	
	// adding a tag to Artist
	public void addTag(Tag tag) {
		allTags.add(tag);
	}

	public Collection<Album> getAllAlbums() {
		return allAlbums;
	}
	
	public void addAlbum(Album album) {
		allAlbums.add(album);
	}

	@Override
	public String toString() {
		return "Artist [id=" + id + ", artistName=" + artistName + ", artistImage=" + artistImage + ", age=" + age
				+ ", hometown=" + hometown + ", rating=" + rating + ", allTags=" + allTags + ", artistComments="
				+ artistComments + ", allAlbums=" + allAlbums + "]";
	}



	
	
}
