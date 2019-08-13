package sutarinnovation.msscbrewary.services;

import sutarinnovation.msscbrewary.web.model.BeerDTO;

import java.util.UUID;

public interface BeerService {
    //return BeerDOT object
    BeerDTO getBeerById(UUID beerId);

    //Create new Beer
    BeerDTO saveNewBeer(BeerDTO beerDTO);

    //make needed changes in the beer object
    void updateBeer(UUID beerId, BeerDTO beerDTO);

    //remove beer dto if called this method.
    void deleteById(UUID beerId);


}
