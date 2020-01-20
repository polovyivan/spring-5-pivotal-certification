package com.spring.professional.exam.tutorial.module03.question29.dao;

import com.spring.professional.exam.tutorial.module03.question29.ds.Employee;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;

public interface EmployeeDao extends CrudRepository<Employee, Integer> {
    @Query("select e from Employee e where e.firstName = ?1 and e.lastName = ?2")
    Employee findByFirstNameAndLastName(String firstName, String lastName);
}
