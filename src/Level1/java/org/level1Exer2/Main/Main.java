package org.level1Exer2.Main;

import org.level1Exer2.Model.GenericMethods;
import org.level1Exer2.Model.Person;

public class Main {
    public static void main(String[] args) {

        Person person1 = new Person("Isaac","Diez", 47);
        boolean student = true;

        GenericMethods<Person,String,Boolean> gm1 = new GenericMethods<>(person1,"Student",student);
        gm1.printArgs(person1, "Student", student);

        GenericMethods<String,Boolean, Person> gm2 = new GenericMethods<>("Student",student,person1);
        gm2.printArgs("Student",student,person1);

    }
}
