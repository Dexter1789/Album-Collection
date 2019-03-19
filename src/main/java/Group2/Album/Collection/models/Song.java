package Group2.Album.Collection.models;

import java.util.Collection;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.ManyToMany;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;

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

	@OneToMany(mappedBy = "song")
	private Collection<Comment> allComments;

	public Song() {}

	public Song(String songTitle, String songLink, String duration, int rating) {
		this.songTitle = songTitle;
		this.songLink = songLink;
		this.duration = duration;
		this.rating = rating;
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

	public Collection<Tag> getAllTags() {
		return allTags;
	}

	public Collection<Comment> getAllComments() {
		return allComments;
	}

	@Override
	public String toString() {
		return "Song [id=" + id + ", songTitle=" + songTitle + ", songLink=" + songLink + ", duration=" + duration
				+ ", rating=" + rating + ", album=" + album + ", allTags=" + allTags + ", allComments=" + allComments
				+ "]";
	}

}
