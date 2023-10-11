package guru.springframework.spring6di.services;

import guru.springframework.spring6di.services.FauxService;
import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Service;

@Profile("PROD")
@Service("i18NFaux")
public class FauxServiceProd implements FauxService {
    @Override
    public String getDataSource() {
        return "prod";
    }
}
