package com.microservice.Repository;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

import com.microservice.bean.Customer;

@Repository
public interface CustomerRepository extends MongoRepository<Customer, Integer>{

}
