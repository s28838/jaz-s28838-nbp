package kolos.jaz_s28838_nbp;

import org.springframework.stereotype.Service;

@Service
public class NbpService {
    private final NbpClient nbpClient;

    public NbpService(NbpClient nbpClient) {
        this.nbpClient = nbpClient;
    }
}
