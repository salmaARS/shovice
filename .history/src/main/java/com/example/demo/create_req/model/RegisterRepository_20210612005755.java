package com.example.demo.create_req.model;

import org.springframework.data.repository.CrudRepository;
import com.example.demo.create_req.*;

public interface RegisterRepository extends CrudRepository<User, Integer> {

}