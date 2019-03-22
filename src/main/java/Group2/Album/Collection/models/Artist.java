package Group2.Album.Collection.models;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;

import javax.persistence.CollectionTable;
import javax.persistence.ElementCollection;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.ManyToMany;
import javax.persistence.OneToMany;

@Entity
public class Artist {
	
	@Id
	@GeneratedValue
	private Long id;
	private String firstName;
	private String lastName;
	private String artistImage;
	private String age;
	private String hometown;
	private int rating;
	
	@ManyToMany
	private Collection<Tag> allTags;
	
	@ElementCollection
	@CollectionTable
	private Collection<Comment> allComments;
	
	@OneToMany
	private Collection<Album> allAlbums;
	
	public Artist () {}

	public Artist(String firstName, String lastName, String artistImage, String age, String hometown, int rating, Tag ...allTags) {
		this.firstName = firstName;
		this.lastName = lastName;
		this.artistImage = artistImage;
		this.age = age;
		this.hometown = hometown;
		this.allTags = Arrays.asList(allTags);
		this.allComments = new ArrayList<Comment>();
		this.allAlbums = new ArrayList<Album>();
	} 
	
	public Long getId() {
		return id;
	}

	public String getFirstName() {
		return firstName;
	}

	public String getLastName() {
		return lastName;
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

	public int getRating() {
		return rating;
	}

	public Collection<Tag> getAllTags() {
		return allTags;
	}

	public Collection<Comment> getAllComments() {
		return allComments;
	}

	// adding a comment to Artist
	public void addComment(Comment comment) {
			allComments.add(comment);
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
		return "Artist [id=" + id + ", firstName=" + firstName + ", lastName=" + lastName + ", artistImage="
				+ artistImage + ", age=" + age + ", hometown=" + hometown + ", rating=" + rating + ", allTags="
				+ allTags + ", allComments=" + allComments + ", allAlbums=" + allAlbums + "]";
	}

	
}
