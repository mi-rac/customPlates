package plates.backend;

import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;
import org.springframework.web.bind.annotation.CrossOrigin;

import java.util.List;
@CrossOrigin(origins = "http://localhost:3000")
@RepositoryRestResource(collectionResourceRel = "plates", path = "plates")
public interface PlatesRepository extends CrudRepository<Plate, Integer>
{
    List<Plate> findPlateByRegistrationNumberContaining(@Param("fragment") String fragment);
}
