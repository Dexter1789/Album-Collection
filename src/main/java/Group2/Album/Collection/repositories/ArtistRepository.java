package Group2.Album.Collection.repositories;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import Group2.Album.Collection.models.Artist;

@Repository

public interface ArtistRepository extends CrudRepository<Artist, Long>{


	Artist findByLastName(String string);


}
