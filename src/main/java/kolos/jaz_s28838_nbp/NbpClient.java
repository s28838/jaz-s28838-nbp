package kolos.jaz_s28838_nbp;

import org.springframework.stereotype.Component;
import org.springframework.web.client.RestTemplate;

@Component
public class NbpClient {
    private final String baseUrl = "http://api.nbp.pl/api/";
    private final RestTemplate restTemplate;

    public NbpClient(RestTemplate restTemplate) {
        this.restTemplate = restTemplate;
    }
}
