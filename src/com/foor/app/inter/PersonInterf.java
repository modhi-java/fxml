package com.foor.app.inter;


import com.foor.app.entity.Person;

public interface PersonInterf {

    Person create(Person person);

    Person update(Person person);

    void delete(Person person);
}
