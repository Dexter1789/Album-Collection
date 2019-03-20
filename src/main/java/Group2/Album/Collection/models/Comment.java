package Group2.Album.Collection.models;

import javax.persistence.Column;
import javax.persistence.Embeddable;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Embeddable
public class Comment {

	private String content;

	public Comment() {
	}

	public Comment(String content) {
		this.content = content;
	}

	public String getContent() {
		return content;
	}

	@Override
	public String toString() {
		return "Comment [content=" + content + "]";
	}
	
}
