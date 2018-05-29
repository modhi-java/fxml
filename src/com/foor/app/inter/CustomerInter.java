package com.foor.app.inter;


import com.foor.app.entity.Customer;

public interface CustomerInter {

    Customer create(Customer customer);

    Customer update(Customer customer);

    void delete(Customer customer);


}
