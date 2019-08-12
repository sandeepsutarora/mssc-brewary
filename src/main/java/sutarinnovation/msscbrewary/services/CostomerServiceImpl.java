package sutarinnovation.msscbrewary.services;

import org.springframework.stereotype.Service;
import sutarinnovation.msscbrewary.web.model.CustomerDTO;

import java.util.UUID;

@Service
public class CostomerServiceImpl implements CustomerService{

    @Override
    public CustomerDTO getCustomerById(UUID id) {
        return CustomerDTO.builder().customerName("Sandeep Sutar").build();
    }
}
