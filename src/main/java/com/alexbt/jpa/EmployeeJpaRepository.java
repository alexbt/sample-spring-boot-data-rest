package com.alexbt.jpa;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;
import org.springframework.data.rest.core.annotation.RestResource;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

//@RepositoryRestResource(path="departements/{department_id}/employees", collectionResourceRel = "employees")
//@RestResource(path="departements/{department_id}/employees", rel = "employees")
public interface EmployeeJpaRepository extends JpaRepository<Employee, Long> {
}