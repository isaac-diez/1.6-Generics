package org.level1Exer1.Main;

import org.level1Exer1.Model.NoGenericMethods;

public class Main {
    public static void main(String[] args) {

        NoGenericMethods<String> ngm1 = new NoGenericMethods("a","b","c");
        System.out.println(ngm1);
        NoGenericMethods<String> ngm2 = new NoGenericMethods("c","a","b");
        System.out.println(ngm2);
        NoGenericMethods<Integer> ngm3 = new NoGenericMethods<>(1,2,3);
        System.out.println(ngm3);
        NoGenericMethods<Integer> ngm4 = new NoGenericMethods<>(3,1,2);
        System.out.println(ngm4);

    }
}
