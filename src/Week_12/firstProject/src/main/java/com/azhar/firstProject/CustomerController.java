package com.azhar.firstProject;

import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/customer")
public class CustomerController {
    private final CustomerRepo customerRepo;

    public CustomerController(CustomerRepo customerRepo) {
        this.customerRepo = customerRepo;
    }

    @GetMapping("/{id}")
    public Customer findById(@PathVariable("id") int id){
        return this.customerRepo.findById(id).orElseThrow();
    }

    @PostMapping("/save")
    public Customer save(@RequestBody Customer customer){
        return this.customerRepo.save(customer);
    }
    @GetMapping("/findAll")
    public List<Customer> findAll() {
        return this.customerRepo.findAll();
    }

    @GetMapping("/findByPhone/{phone}")
    public List<Customer> findByPhone(@PathVariable("phone") String phone){
        return customerRepo.findByPhone(phone);
    }
}
