package ai.lentra.springboottest;

import org.junit.Test;
import org.junit.jupiter.api.Assertions;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.ActiveProfiles;
import org.springframework.test.context.TestPropertySource;

@SpringBootTest
@TestPropertySource(locations = "classpath:application-integration.properties")
@ActiveProfiles("integration")
public class ServiceATest {

    @Value("${app.api.url}")
    private String apiUrl;

    @Test
    public void testService() {
        System.out.println(apiUrl);
        Assertions.assertNotNull(apiUrl);
    }
}
