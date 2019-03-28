package Group2.Album.Collection.repositories;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import Group2.Album.Collection.models.Tag;

@Repository
public interface TagRepository extends CrudRepository <Tag, Long> {

	Tag findByTagName(String tagName);
	
}
