package nu.lansing.services;

import nu.lansing.models.CustomerModel;
import nu.lansing.repositories.CustomerRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CustomerService {

    @Autowired
    private CustomerRepository customerRepository;

    public void createCustomer(CustomerModel customerModel) {
        customerRepository.saveAndFlush(customerModel);
    }

    public CustomerModel readCustomer(Integer id) {
        return customerRepository.getOne(id);
    }

    public List readAllCustomers() {
        return customerRepository.findAll();
    }

    public void deleteCustomer(Integer id) {
        customerRepository.delete(id);
    }

}