package org.level1Exer1.Model;

public class NoGenericMethods {

    private String name;
    private String lastName;
    private String middleName;

    public NoGenericMethods(String name, String lastName, String middleName) {
        this.name = name;
        this.lastName = lastName;
        this.middleName = middleName;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getMiddleName() {
        return middleName;
    }

    public void setMiddleName(String middleName) {
        this.middleName = middleName;
    }

    @Override
    public String toString() {
        return "NoGenericMethods{" +
                "name=" + name +
                ", lastName=" + lastName +
                ", middleName=" + middleName +
                '}';
    }
}
