package guru.springframework.spring6di.controllers;

import guru.springframework.spring6di.services.FauxService;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Controller;

@Controller
public class FauxController {

    private final FauxService fauxService;

    public FauxController(@Qualifier("i18NFaux") FauxService fauxService) {
        this.fauxService = fauxService;
    }

    public String getDataSourceEnv(){
        return fauxService.getDataSource();
    }
}
