package Group2.Album.Collection.models;

import javax.persistence.Entity;
import javax.persistence.ManyToOne;

import com.fasterxml.jackson.annotation.JsonIgnore;

@Entity
public class AlbumTag extends Tag {
	@ManyToOne
	@JsonIgnore
	private Album album;
	
	public AlbumTag() {
	}
	
	public AlbumTag(String content, Album album) {
		super(content);
		this.album = album;
	}
	
	public Album getAlbum() {
		return album;
	}
}