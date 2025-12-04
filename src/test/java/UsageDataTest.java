import org.*;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;


class UsageDataTest {
    @Test
    void shouldCountNonArchivedProjects() {
        Project project1 = new Project("Client 1", false);
        Project project2 = new Project("Client 2", true);
        Project project3 = new Project("Client 3", false);
        Company company = new Company(project1, project2, project3);

        assertEquals(2, UsageData.countNonArchivedProjects(company));
    }


    @Test
    void shouldCountAllCompanyProjects() {
        Project project1 = new Project("Client 1", false);
        Project project2 = new Project("Client 2", true);
        Project project3 = new Project("Client 3", false);
        Company company = new Company(project1, project2, project3);

        assertEquals(3, UsageData.countAllCompanyProjects(company));
    }
}
