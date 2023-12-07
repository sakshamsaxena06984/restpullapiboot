package com.example.restfullapi.dao;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.example.restfullapi.entities.Emp;
@Repository
public interface EmpRegis extends CrudRepository<Emp, Integer> {

}
