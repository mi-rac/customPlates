package plates.backend;

import org.springframework.data.repository.CrudRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;


@RepositoryRestResource(collectionResourceRel = "plates", path = "plates")
public interface PlatesRepository extends CrudRepository<Plate, Integer>
{
}
