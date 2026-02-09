package clientmanager_backend;

import static org.assertj.core.api.Assertions.assertThat;

import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.testcontainers.service.connection.ServiceConnection;
import org.testcontainers.containers.MariaDBContainer;
import org.testcontainers.junit.jupiter.Container;
import org.testcontainers.junit.jupiter.Testcontainers;

@SpringBootTest
@Testcontainers
class ClientmanagerBackendApplicationTests {

    @Container @ServiceConnection
    static MariaDBContainer<?> mariaDB = new MariaDBContainer<>("mariadb:10.11");

    @Test
    void contextLoads() {
        // Si este test pasa, significa que Spring Boot levantó,
        // Flyway corrió las migraciones contra la BD Dockerizada,
        // y la app está "sana".
        assertThat(mariaDB.isCreated()).isTrue();
        assertThat(mariaDB.isRunning()).isTrue();
    }
}
