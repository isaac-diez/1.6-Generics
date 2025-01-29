package org.level3Exer1.Model;

public class Smartphone implements Telephone{

    @Override
    public void call() {
        System.out.println("Class Smartphone is making a call");
    }

    public void takePhoto() {
        System.out.println("Class Smartphone is taking a photo");
    }

}
