package Group2.Album.Collection.models;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;

import javax.persistence.Embedded;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.ManyToMany;
import javax.persistence.ManyToOne;

@Entity
public class Album {
	
	@Id
	@GeneratedValue
	private Long id;
	private String albumTitle;
	private String albumImage; 
	private int rating;
	
	@ManyToOne
	private Artist artist;

	@ManyToMany
	private Collection<Tag> allTags;
	
	// @OneToMany(mappedBy="album")
	@Embedded
	private Collection<Comment> allComments;
	
	public Album() {}
	
	public Album(String albumTitle, String albumImage, int rating , Artist artist, Tag ...allTags) {
		this.albumTitle = albumTitle;
		this.albumImage = albumImage;
		this.rating = rating;
		this.allTags = Arrays.asList(allTags);
		this.allComments = new ArrayList<Comment>();
	}

	public Long getId() {
		return id;
	}

	public String getAlbumTitle() {
		return albumTitle;
	}

	public String getAlbumImage() {
		return albumImage;
	}

	public int getRating() {
		return rating;
	}

	public Artist getArtist() {
		return artist;
	}

	public Collection<Tag> getAllTags() {
		return allTags;
	}

	public Collection<Comment> getAllComments() {
		return allComments;
	}

	// adding a comment to Album
	public void addComment(Comment comment) {
		allComments.add(comment);
	}
	
	// adding a tag to Album
	public void addTag(Tag tag) {
		allTags.add(tag);
	}

	@Override
	public String toString() {
		return "Album [id=" + id + ", albumTitle=" + albumTitle + ", albumImage=" + albumImage + ", rating=" + rating
				+ ", artist=" + artist + ", allTags=" + allTags + ", allComments=" + allComments + "]";
	}
	
}
