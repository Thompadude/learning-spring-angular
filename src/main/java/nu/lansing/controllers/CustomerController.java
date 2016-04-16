package nu.lansing.controllers;

import nu.lansing.models.CustomerModel;
import nu.lansing.services.CustomerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class CustomerController {

    @Autowired
    private CustomerService customerService;

    @CrossOrigin
    @RequestMapping(value = "/customers/", method = RequestMethod.POST)
    public void createCustomer(@RequestBody CustomerModel customerModel) {
        customerService.createCustomer(customerModel);
    }

    @CrossOrigin
    @RequestMapping(value = "/customers/{id}", method = RequestMethod.GET)
    public ResponseEntity<CustomerModel> readCustomer(@PathVariable Integer id) {
        return new ResponseEntity<CustomerModel>(customerService.readCustomer(id), HttpStatus.OK);
    }

    @CrossOrigin
    @RequestMapping(value = "/customers/", method = RequestMethod.GET)
    public List readAllCustomers() {
        return customerService.readAllCustomers();
    }

    @CrossOrigin
    @RequestMapping(value = "/customers/{id}", method = RequestMethod.PUT)
    public void updateCustomer(@PathVariable Integer id, @RequestBody CustomerModel customerModel) {
        customerService.createCustomer(customerModel);
    }

    @CrossOrigin
    @RequestMapping(value = "/customers/{id}", method = RequestMethod.DELETE)
    public void deleteCustomer(@PathVariable Integer id) {
        customerService.deleteCustomer(id);
    }

}