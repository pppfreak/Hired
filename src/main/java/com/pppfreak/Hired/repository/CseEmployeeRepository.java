package com.pppfreak.Hired.repository;

import com.pppfreak.Hired.Entity.CseEmployee;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface CseEmployeeRepository extends CrudRepository<CseEmployee,Integer> {

}
