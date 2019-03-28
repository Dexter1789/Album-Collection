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
	private Collection<SongTag> songTags;

	@OneToMany(mappedBy="song")
	private Collection<SongComment> songComments;

	public Song() {}

	public Song(String songTitle, String duration, int rating, Album album) {
		this.songTitle = songTitle;
		this.duration = duration;
		this.rating = rating;
		this.album = album;
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

	public Collection<SongTag> getAllTags() {
		return songTags;
	}

	public Collection<SongComment> getsongComments() {
		return songComments;
	}

	// adding a comment to Album
	public void addComment(Comment comment) {
		songComments.add((SongComment) comment);
	}
	
	// adding a tag to Song
	public void addTag(Tag tag) {
		songTags.add((SongTag) tag);
	}

	@Override
	public String toString() {
		return "Song [id=" + id + ", songTitle=" + songTitle + ", duration=" + duration + ", rating=" + rating
				+ ", album=" + album + ", songTags=" + songTags + ", songComments=" + songComments + "]";
	}


}
