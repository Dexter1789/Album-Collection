package Group2.Album.Collection.models;
import java.util.Collection;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Lob;
import javax.persistence.ManyToMany;

import com.fasterxml.jackson.annotation.JsonIgnore;

@Entity
public class Tag {
	
	@Id
	@GeneratedValue
	private Long id;
	@Lob
	private String content;

	@ManyToMany (mappedBy="tags")
	@JsonIgnore
	private Collection<Artist> artists;
	
	@ManyToMany
	@JsonIgnore
	private Collection<Album> albums;
	
	@ManyToMany
	@JsonIgnore
	private Collection<Song> songs;
	
	public Tag() {}
	
	public Tag(String content) {
		this.content = content;
	}
	
	public Long getId() {
		return id;
	}
	
	public String getContent() {
		return content;
	}
	
	public Collection<Artist> getArtists() {
		return artists;
	}
	
	public Collection<Album> getAlbums() {
		return albums;
	}
	
	public Collection<Song> getSongs() {
		return songs;
	}

	
	
	@Override
	public String toString() {
		return "Comment [id=" + id + ", content=" + content + "]";
	}
	

	



}