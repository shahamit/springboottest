package ai.lentra.springboottest;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Service;

@Service
public class ServiceA {
    @Value("${app.api.url}")
    private String apiUrl;

    public String returnAPIEndpoint() {
        return apiUrl;
    }
}
