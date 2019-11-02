package com.springbootmongodb.DAO;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

import com.springbootmongodb.bootmongocrudexample.EmployeeBean;

@Repository
public interface EmployeeDao extends MongoRepository<EmployeeBean, Integer> {

}
