package sutarinnovation.msscbrewary.services;

import org.springframework.stereotype.Service;
import sutarinnovation.msscbrewary.web.model.BeerDTO;

import java.util.UUID;

@Service
public class BeerServiceImpl implements  BeerService{

    @Override
    public BeerDTO getBeerById(UUID beerId) {
        return BeerDTO.builder().id(UUID.randomUUID()).beerName("KingFisher").beerStyle("Pale Ale").build();
    }
}
