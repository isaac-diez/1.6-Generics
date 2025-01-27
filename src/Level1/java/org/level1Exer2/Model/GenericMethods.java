package org.level1Exer2.Model;

public class GenericMethods <T,U,V>{

    private T att1;
    private U att2;
    private V att3;

    public GenericMethods(T att1, U att2, V att3) {
        this.att1 = att1;
        this.att2 = att2;
        this.att3 = att3;
    }

    @Override
    public String toString() {
        return "GenericMethods{" +
                "att1=" + att1 +
                ", att2=" + att2 +
                ", att3=" + att3 +
                '}';
    }
}
