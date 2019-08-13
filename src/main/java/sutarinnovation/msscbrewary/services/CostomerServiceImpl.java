package sutarinnovation.msscbrewary.services;

import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;
import sutarinnovation.msscbrewary.web.model.CustomerDTO;

import java.util.UUID;

@Slf4j
@Service
public class CostomerServiceImpl implements CustomerService{

    @Override
    public CustomerDTO getCustomerById(UUID id) {
        return CustomerDTO.builder().customerName("Sandeep Sutar").build();
    }

    @Override
    public CustomerDTO saveNewCustomer(CustomerDTO customerDTO) {
        return CustomerDTO.builder().id(UUID.randomUUID()).build();
    }

    @Override
    public void updateCustomer(UUID customerId, CustomerDTO customerDTO) {
      log.debug("Updating....");
    }

    @Override
    public void deleteById(UUID customerId) {

        log.debug("Deleting.....");
    }


}
