package Group2.Album.Collection.models;

import javax.persistence.Entity;
import javax.persistence.ManyToOne;

import com.fasterxml.jackson.annotation.JsonIgnore;

@Entity
public class SongComment extends Comment {
	@ManyToOne
	@JsonIgnore
	private Song song;
	
	public SongComment() {
		}

	public SongComment(String content, Song song) {
		super(content);
		this.song = song;
	}
	
	public Song getsong() {
		return song;
	}
	


}
