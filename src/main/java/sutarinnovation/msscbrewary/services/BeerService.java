package sutarinnovation.msscbrewary.services;

import sutarinnovation.msscbrewary.web.model.BeerDTO;

import java.util.UUID;

public interface BeerService {
    BeerDTO getBeerById(UUID beerId);
}
