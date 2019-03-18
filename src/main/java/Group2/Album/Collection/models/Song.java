package Group2.Album.Collection.models;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Entity 
public class Song {
	@Id
	@GeneratedValue
	private Long id;
	private String songTitle; 
	private String songLink;
	private String duration;
	
	
	public Song () {}


	public Song(String songTitle, String songLink, String duration) {
		this.songTitle = songTitle;
		this.songLink = songLink;
		this.duration = duration;
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


	@Override
	public String toString() {
		return "Song [id=" + id + ", songTitle=" + songTitle + ", songLink=" + songLink + ", duration=" + duration
				+ "]";
	}



}
