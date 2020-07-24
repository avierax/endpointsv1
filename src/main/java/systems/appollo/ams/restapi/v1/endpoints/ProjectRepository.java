package systems.appollo.ams.restapi.v1.endpoints;

import org.springframework.data.repository.CrudRepository;
import systems.appollo.ams.backend.domain.Project;

public interface ProjectRepository extends CrudRepository<Project, Long> {

	Project findById(long id);

}
