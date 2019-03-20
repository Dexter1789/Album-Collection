package Group2.Album.Collection.models;

import javax.persistence.Column;
import javax.persistence.Embeddable;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Entity
@Embeddable
public class Comment {
	
	@Id
	@GeneratedValue
	private Long id;
	

	@Column(name="USER_NAME")
	private String userName;
	
	@Column(name="CONTENT")
	private String content;

//	@ManyToOne
//	private Artist artist;
//
//	@ManyToOne
//	private Album album;
//
//	@ManyToOne
//	private Song song;

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

	@Override
	public String toString() {
		return "Comment [userName=" + userName + ", content=" + content + "]";
	}

//	public Artist getArtist() {
//		return artist;
//	}
//
//	public Album getAlbums() {
//		return album;
//	}
//
//	public Song getSong() {
//		return song;
//	}
	
	
}
