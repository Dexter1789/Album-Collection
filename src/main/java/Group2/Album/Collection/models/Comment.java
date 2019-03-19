package Group2.Album.Collection.models;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.ManyToOne;

@Entity
public class Comment {

	@Id
	@GeneratedValue
	private Long id;
	private String userName;
	private String content;

	@ManyToOne
	private Artist artist;

	@ManyToOne
	private Album album;

	@ManyToOne
	private Song song;

	public Comment() {
	}

	public Comment(String userName, String content) {
		this.userName = userName;
		this.content = content;
	}

	public Long getId() {
		return id;
	}

	public String getUserName() {
		return userName;
	}

	public String getContent() {
		return content;
	}

	public Artist getArtist() {
		return artist;
	}

	public Album getAlbums() {
		return album;
	}

	public Song getSong() {
		return song;
	}

	@Override
	public String toString() {
		return "Comment [id=" + id + ", userName=" + userName + ", content=" + content + ", artist=" + artist
				+ ", album=" + album + ", song=" + song + "]";
	}

}
