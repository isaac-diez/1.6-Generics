package org.level1Exer1.Model;

public class NoGenericMethods <T>{

    private T att1;
    private T att2;
    private T att3;

    public NoGenericMethods(T att1, T att2, T att3) {
        this.att1 = att1;
        this.att2 = att2;
        this.att3 = att3;
    }

    public T getAtt1() {
        return att1;
    }

    public void setAtt1(T att1) {
        this.att1 = att1;
    }

    public T getAtt2() {
        return att2;
    }

    public void setAtt2(T att2) {
        this.att2 = att2;
    }

    public T getAtt3() {
        return att3;
    }

    public void setAtt3(T att3) {
        this.att3 = att3;
    }

    @Override
    public String toString() {
        return "NoGenericMethods{" +
                "name=" + att1 +
                ", lastName=" + att2 +
                ", middleName=" + att3 +
                '}';
    }
}
