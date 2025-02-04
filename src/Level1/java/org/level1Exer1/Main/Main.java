package org.level1Exer1.Main;

import org.level1Exer1.Model.NoGenericMethods;

public class Main {
    public static void main(String[] args) {

        NoGenericMethods ngm1 = new NoGenericMethods("Jose","Garcia","Antonio");
        System.out.println(ngm1);
        NoGenericMethods ngm2 = new NoGenericMethods("Antonio","Jose","Garcia");
        System.out.println(ngm2);

    }
}
