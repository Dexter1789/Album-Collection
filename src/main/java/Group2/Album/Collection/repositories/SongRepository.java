package Group2.Album.Collection.repositories;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import Group2.Album.Collection.models.Song;

@Repository
public interface SongRepository extends CrudRepository <Song, Long> {

}
