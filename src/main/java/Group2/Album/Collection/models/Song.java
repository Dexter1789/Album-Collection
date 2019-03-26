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
import javax.persistence.ManyToOne;

import com.fasterxml.jackson.annotation.JsonIgnore;



@Entity
public class Song {
	@Id
	@GeneratedValue
	private Long id;
	private String songTitle;
	private String duration;
	private int rating;
	
	@ManyToOne
	@JsonIgnore
	private Album album;

	@ManyToMany
	private Collection<Tag> allTags;

	@ElementCollection
	@CollectionTable
	private Collection<Comment> allComments;

	public Song() {}

	public Song(String songTitle, String duration, int rating, Album album, Tag ...allTags) {
		this.songTitle = songTitle;
		this.duration = duration;
		this.rating = rating;
		this.album = album;
		this.allTags = Arrays.asList(allTags);
		this.allComments = new ArrayList<Comment>();
		
	}
	
	public Long getId() {
		return id;
	}

	public String getSongTitle() {
		return songTitle;
	}


	public String getDuration() {
		return duration;
	}

	public int getRating() {
		return rating;
	}

	public Album getAlbum() {
		return album;
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
	
	// adding a tag to Song
	public void addTag(Tag tag) {
			allTags.add(tag);
	}

	@Override
	public String toString() {
		return "Song [id=" + id + ", songTitle=" + songTitle + ", duration=" + duration
				+ ", rating=" + rating + ", album=" + album + ", allTags=" + allTags + ", allComments=" + allComments
				+ "]";
	}

}
