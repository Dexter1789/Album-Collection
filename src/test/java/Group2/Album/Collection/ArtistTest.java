package Group2.Album.Collection;


import static org.junit.Assert.assertThat;

import javax.annotation.Resource;

import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.orm.jpa.DataJpaTest;
import org.springframework.boot.test.autoconfigure.orm.jpa.TestEntityManager;
import org.springframework.test.context.junit4.SpringRunner;

import Group2.Album.Collection.models.Artist;
import Group2.Album.Collection.models.Tag;
import Group2.Album.Collection.repositories.ArtistRepository;
import Group2.Album.Collection.repositories.TagRepository;
import static org.hamcrest.Matchers.is;


@RunWith(SpringRunner.class)
@DataJpaTest
public class ArtistTest {

	@Resource
	TagRepository tagRepo; 
	@Resource
	ArtistRepository artistRepo;
	
	@Autowired
	private TestEntityManager entityManager;
	
	@Test
	public void shouldSaveAndLoadTags() {
		Artist artist1 = artistRepo.save(new Artist ("firstName", "lastName", "artistImage", "18", "hometown", "rating"));
		Tag tag1 = tagRepo.save(new Tag("tag1"));
		artist1.addTag(tag1);
		artistRepo.save(artist1);
		
		entityManager.persist(tag1);
		entityManager.flush();
		entityManager.clear();
		
		Tag tagFromDatabase = tagRepo.findByTagName("tag1");
		assertThat(tagFromDatabase.getTagName(), is("tag1"));
		
//		Artist saveArtist = this.entityManager.persistAndFlush(artist1);
//		Assert.assertEquals(saveArtist.getFirstName(), "firstName");
	
		
	}
}