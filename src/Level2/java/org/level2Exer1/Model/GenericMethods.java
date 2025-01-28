package org.level2Exer1.Model;

public class GenericMethods <T,U,String>{

    private T att1;
    private U att2;
    private String att3;

    public GenericMethods(T att1, U att2, String att3) {
        this.att1 = att1;
        this.att2 = att2;
        this.att3 = att3;
    }

    @Override
    public java.lang.String toString() {
        return "GenericMethods{" +
                "att1=" + att1 +
                ", att2=" + att2 +
                ", att3=" + att3 +
                '}';
    }
}
