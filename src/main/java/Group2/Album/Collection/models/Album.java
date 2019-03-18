package Group2.Album.Collection.models;

import java.util.Arrays;
import java.util.Collection;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;



@Entity
public class Album {
	@Id
	@GeneratedValue
	private Long id;
	private String albumTitle;
	private String albumImage; 
	private String recordLabel;
	
	private Collection <Song> allSongs;
	
	public Album() {}
	
	public Album(String albumTitle, String albumImage, String recordLabel, Song ...allSongs) {
		this.albumTitle = albumTitle;
		this.albumImage = albumImage;
		this.recordLabel = recordLabel;
		this.allSongs = Arrays.asList(allSongs);
	}

	public Long getId() {
		return id;
	}

	public String getAlbumTitle() {
		return albumTitle;
	}

	public String getAlbumImage() {
		return albumImage;
	}

	public String getRecordLabel() {
		return recordLabel;
	}

	public Collection<Song> getSongs() {
		return allSongs;
	}

	@Override
	public String toString() {
		return "Album [id=" + id + ", albumTitle=" + albumTitle + ", albumImage=" + albumImage + ", recordLabel="
				+ recordLabel + ", songs=" + allSongs + "]";
	}
	
	

}
