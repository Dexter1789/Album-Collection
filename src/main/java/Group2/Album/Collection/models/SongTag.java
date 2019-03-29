package Group2.Album.Collection.models;

import javax.persistence.Entity;
import javax.persistence.ManyToOne;

import com.fasterxml.jackson.annotation.JsonIgnore;

@Entity
public class SongTag extends Tag {
	@ManyToOne
	@JsonIgnore
	private Song song;
	
	public SongTag() {
	}
	
	public SongTag(String content, Song song) {
		super(content);
		this.song = song;
	}
	
	public Song getSong() {
		return song;
	}
}