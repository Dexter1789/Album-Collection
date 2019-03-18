package Group2.Album.Collection.repositories;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import Group2.Album.Collection.models.Album;

@Repository
public interface  AlbumRepository extends CrudRepository<Album, Long>{

}
