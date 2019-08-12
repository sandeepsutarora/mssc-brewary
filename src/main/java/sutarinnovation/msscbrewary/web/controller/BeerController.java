package sutarinnovation.msscbrewary.web.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import sutarinnovation.msscbrewary.web.model.BeerDTO;
import sutarinnovation.msscbrewary.services.BeerService;
import sutarinnovation.msscbrewary.services.BeerServiceImpl;


import java.util.UUID;


@RequestMapping("api/v1/beer")
@RestController
public class BeerController<BeerService> {
    private  BeerService beerService = (BeerService) new BeerServiceImpl();


    @GetMapping({"/{beerId}"})
    public ResponseEntity<BeerDTO> getBeer(@PathVariable("beerId") UUID beerId)
    {
        return new ResponseEntity<>(BeerDTO.builder().id(UUID.randomUUID()).beerName("KingFisher").beerStyle("Pale Ale").build(),HttpStatus.OK);
    }
}
