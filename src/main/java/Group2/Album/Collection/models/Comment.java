package Group2.Album.Collection.models;

import javax.persistence.Embeddable;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.ManyToMany;

@Embeddable
public class Comment {
	
	@Id
	@GeneratedValue
	private Long id;
	private String content;

	
	@ManyToMany
	private Artist artist;
	private Song song;
	private Album album;
	
	
	public Comment(String content) {
		this.content = content;
	}
	
	public Long getId() {
		return id;
	}
	
	public String getContent() {
		return content;
	}
	
	public Artist getArtist() {
		return artist;
	}
	
	public Song getSong() {
		return song;
	}
	
	public Album getAlbum() {
		return album;
	}
	
	@Override
	public String toString() {
		return "Comment [id=" + id + ", content=" + content + ", artist=" + artist + ", song=" + song + ", album="
				+ album + "]";
	}


}
