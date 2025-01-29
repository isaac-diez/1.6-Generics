package org.level3Exer1.Model;

public class Generic {

    public <T extends Telephone> void genericMethod1(T telephone) {
        System.out.println("Making a call with genericMethod1()...");
        telephone.call();
    }

    public <U extends Smartphone> void genericMethod2(U smartphone) {
        System.out.println("Taking photo with genericMethod2()...");
        smartphone.call();
        smartphone.takePhoto();

    }

}
