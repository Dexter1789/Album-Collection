package Group2.Album.Collection.models;

import java.util.Collection;

import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.ManyToMany;


public class Tag {

	@Id
	@GeneratedValue
	private Long id;
	private String tagName;

	// see what team thinks
	@ManyToMany
	private Collection<Artist> allArtists;

	@ManyToMany
	private Collection<Album> allAlbums;

	@ManyToMany
	private Collection<Song> allSongs;

	public Tag() {
	}

	public Tag(String tagName) {
		this.tagName = tagName;
	}

	public Long getId() {
		return id;
	}

	public String getTagName() {
		return tagName;
	}

	public Collection<Artist> getAllArtists() {
		return allArtists;
	}

	public Collection<Album> getAllAlbums() {
		return allAlbums;
	}

	public Collection<Song> getAllSongs() {
		return allSongs;
	}



}
