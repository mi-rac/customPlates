package plates.backend;

import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;
import io.swagger.annotations.Api;

import java.util.List;

@Api
@RepositoryRestResource(collectionResourceRel = "plates", path = "plates")
public interface PlatesRepository extends CrudRepository<Plate, Integer>
{
    List<Plate> findPlateByRegistrationNumberContaining(@Param("fragment") String fragment);
}
