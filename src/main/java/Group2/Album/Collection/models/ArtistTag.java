package Group2.Album.Collection.models;

import javax.persistence.Entity;
import javax.persistence.ManyToOne;

import com.fasterxml.jackson.annotation.JsonIgnore;

@Entity
public class ArtistTag extends Tag {
	@ManyToOne
	@JsonIgnore
	private Artist artist;
	
	public ArtistTag() {
	}
	
	public ArtistTag(String content, Artist artist) {
		super(content);
		this.artist = artist;
	}
	
	public Artist getArtist() {
		return artist;
	}
}
