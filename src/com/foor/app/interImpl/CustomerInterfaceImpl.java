package com.foor.app.interImpl;


import com.foor.app.database.Connection;
import com.foor.app.entity.Customer;
import com.foor.app.inter.CustomerInter;

public class CustomerInterfaceImpl implements CustomerInter {

    @Override
    public Customer create(Customer customer) {
        Connection.customers.add(customer);
        //اضافة الي قواعد البيانات
        return customer;
    }

    @Override
    public Customer update(Customer customer) {
        for (int i = 0; i < Connection.customers.size(); i++){
            if(Connection.customers.get(i).getId().equals(customer.getId())){
                Connection.customers.get(i).setNekat(customer.getNekat());
                Connection.customers.get(i).setName(customer.getName());
                return Connection.customers.get(i);
            }
        }
        return null;
    }

    @Override
    public void delete(Customer customer) {
        for (int i = 0; i < Connection.customers.size(); i++){
            if(Connection.customers.get(i).getId().equals(customer.getId())){
                Connection.customers.remove(i);
                break;
            }
        }
    }
}
