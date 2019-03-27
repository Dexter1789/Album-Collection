package Group2.Album.Collection.models;


import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Lob;

@Entity
public abstract class Comment {
	
	@Id
	@GeneratedValue
	private Long id;
	@Lob
	private String content;

	
	public Comment() {}
	
	public Comment(String content) {
		this.content = content;
	}
	
	public Long getId() {
		return id;
	}
	
	public String getContent() {
		return content;
	}

	
	
	@Override
	public String toString() {
		return "Comment [id=" + id + ", content=" + content + "]";
	}
	

	



}
