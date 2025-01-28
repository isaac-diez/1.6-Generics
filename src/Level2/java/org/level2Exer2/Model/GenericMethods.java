package org.level2Exer2.Model;

public class GenericMethods {

    @SafeVarargs
    public static <T> void printItems(T...items){
        for (T item : items) {
            System.out.println(item);
        }
    }

}
