package guru.springframework.spring6di.services;

import guru.springframework.spring6di.services.FauxService;
import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Service;

@Profile({"DEV","default"})
@Service("i18NFaux")
public class FauxServiceDev implements FauxService {
    @Override
    public String getDataSource() {
        return "dev";
    }
}
