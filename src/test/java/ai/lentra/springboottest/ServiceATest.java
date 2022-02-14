package ai.lentra.springboottest;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.ActiveProfiles;
import org.springframework.test.context.DynamicPropertyRegistry;
import org.springframework.test.context.DynamicPropertySource;
import org.springframework.test.context.TestPropertySource;

@SpringBootTest
@ActiveProfiles("integration")
public class ServiceATest {
    @Autowired
    private ServiceA service;

    @DynamicPropertySource
    static void overrideUAMProperties(DynamicPropertyRegistry registry) {
        registry.add("app.api.url", () -> "test");
    }

    @Test
    public void testService() {
        System.out.println(service.returnAPIEndpoint());
        Assertions.assertEquals(service.returnAPIEndpoint(), "test");
    }
}
