package com.foor.app.inter;


import com.foor.app.entity.Employee;

public interface EmployeeInter {

    Employee create(Employee employee);

    Employee update(Employee employee);

    void delete(Employee employee);
}
