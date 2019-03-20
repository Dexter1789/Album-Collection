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
public class Song {
	@Id
	@GeneratedValue
	private Long id;
	private String songTitle;
	private String songLink;
	private String duration;
	private int rating;
	
	@ManyToOne
	private Album album;

	@ManyToMany
	private Collection<Tag> allTags;

	//@OneToMany(mappedBy = "song")
	@Embedded
	private Collection<Comment> allComments;

	public Song() {}

	public Song(String songTitle, String songLink, String duration, int rating, Album album, Tag ...allTags) {
		this.songTitle = songTitle;
		this.songLink = songLink;
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

	public String getSongLink() {
		return songLink;
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
		return "Song [id=" + id + ", songTitle=" + songTitle + ", songLink=" + songLink + ", duration=" + duration
				+ ", rating=" + rating + ", album=" + album + ", allTags=" + allTags + ", allComments=" + allComments
				+ "]";
	}

}
