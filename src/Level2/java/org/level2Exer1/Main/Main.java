package org.level2Exer1.Main;

import org.level2Exer1.Model.GenericMethods;
import org.level2Exer1.Model.Person;

public class Main {
    public static void main(String[] args) {

        Person person1 = new Person("Isaac","Diez", 47);

        boolean student = true;

        GenericMethods<Person,String,Boolean> gm1 = new GenericMethods<>(person1,"Student",student);

        System.out.println(gm1);

        GenericMethods<String,Boolean,Person> gm2 = new GenericMethods<>("Student",student,person1);

        System.out.println(gm2);

    }
}
