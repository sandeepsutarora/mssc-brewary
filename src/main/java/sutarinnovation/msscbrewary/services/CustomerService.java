package sutarinnovation.msscbrewary.services;

import sutarinnovation.msscbrewary.web.model.CustomerDTO;

import java.util.UUID;

public interface CustomerService {

    public CustomerDTO getCustomerById(UUID id);

    public CustomerDTO saveNewCustomer(CustomerDTO customerDTO);

    public void updateCustomer(UUID customerId, CustomerDTO customerDTO);

    public void deleteById(UUID customerId);
}
