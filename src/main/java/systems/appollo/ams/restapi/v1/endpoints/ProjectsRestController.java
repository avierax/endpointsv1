package systems.appollo.ams.restapi.v1.endpoints;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import systems.appollo.ams.backend.domain.Project;

import java.util.ArrayList;
import java.util.List;

@RestController
@RequestMapping(path = "/projects")
public class ProjectsRestController {

    ProjectRepository projectRepository;

    @Autowired
    public ProjectsRestController(ProjectRepository projectRepository) {
        this.projectRepository = projectRepository;
    }

    @GetMapping
    public List<Project> getProjects() {
        List<Project> result = new ArrayList<>();
        projectRepository.findAll().forEach(result::add);
        return result;
    }
}
