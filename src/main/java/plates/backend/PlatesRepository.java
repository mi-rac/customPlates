package plates.backend;

import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

@RepositoryRestResource(collectionResourceRel = "plates", path = "plates")
public interface PlatesRepository extends PagingAndSortingRepository<Plates, Integer>
{
}
