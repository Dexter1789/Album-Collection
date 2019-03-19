package Group2.Album.Collection.models;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.ManyToMany;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;



@Entity
public class Album {
	
	@Id
	@GeneratedValue
	private Long id;
	private String albumTitle;
	private String albumImage; 
	private int rating;
	
	@OneToMany(mappedBy="album")
	private Collection <Song> allSongs;
	
	@ManyToOne
	private Artist artist; 
	
	@ManyToMany
	private Collection<Tag> allTags;
	
	@OneToMany(mappedBy="album")
	private Collection<Comment> allComments;
	
	public Album() {}
	
	public Album(String albumTitle, String albumImage, int rating , Song ...allSongs) {
		this.albumTitle = albumTitle;
		this.albumImage = albumImage;
		this.rating = rating;
		this.allSongs = Arrays.asList(allSongs);
		this.allComments = new ArrayList<>();
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

	public Collection<Song> getAllSongs() {
		return allSongs;
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

	@Override
	public String toString() {
		return "Album [id=" + id + ", albumTitle=" + albumTitle + ", albumImage=" + albumImage + ", recordLabel="
				+ rating + ", songs=" + allSongs + "]";
	}
	
	

}
