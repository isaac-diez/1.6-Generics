package org.level1Exer2.Model;

public class GenericMethods <T,U,V>{

    private T stringArg;
    private U personArg;
    private V booleanArg;

    public GenericMethods(T string, U person, V booleanArg) {
        this.stringArg = string;
        this.personArg = person;
        this.booleanArg = booleanArg;
    }

    public void printArgs(T string, U person, V booleanArg) {
        System.out.println("Argument1 : " + string);
        System.out.println("Argument2 : " + person);
        System.out.println("Argument3 : " + booleanArg);
    }

}
