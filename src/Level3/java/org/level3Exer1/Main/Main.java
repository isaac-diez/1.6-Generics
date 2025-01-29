package org.level3Exer1.Main;

import org.level3Exer1.Model.Generic;
import org.level3Exer1.Model.Smartphone;

public class Main {
    public static void main(String[] args) {
        Smartphone redmi = new Smartphone();
        Generic genericPhone = new Generic();


        redmi.takePhoto();
        redmi.call();
        System.out.println();

        genericPhone.genericMethod1(redmi);
        genericPhone.genericMethod2(redmi);


    }

}
