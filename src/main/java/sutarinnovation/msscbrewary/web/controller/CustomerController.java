package sutarinnovation.msscbrewary.web.controller;


import org.springframework.http.HttpStatus;
import org.springframework.http.RequestEntity;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import sutarinnovation.msscbrewary.services.CustomerService;
import sutarinnovation.msscbrewary.web.model.CustomerDTO;

import java.util.UUID;

@RequestMapping("api/v1/customer")
@RestController
public class CustomerController {
    private final CustomerService customerService;

    public CustomerController(CustomerService customerService) {
        this.customerService = customerService;
    }

    @GetMapping({"/{customerId}"})
    public ResponseEntity<CustomerDTO> getCustomer(@PathVariable("customerId")UUID customerId)
    {
        return new ResponseEntity<>(customerService.getCustomerById(customerId), HttpStatus.OK);
    }

}
