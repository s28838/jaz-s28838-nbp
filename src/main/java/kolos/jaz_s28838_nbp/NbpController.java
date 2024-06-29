package kolos.jaz_s28838_nbp;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/nbp/exchange-rate")
public class NbpController {
    private final NbpService nbpService;


    public NbpController(NbpService nbpService) {
        this.nbpService = nbpService;
    }
}
