package Exercise2;

import java.util.Objects;

public class Person {
    String name;
    String secondName;
    int years;

    public Person(String name, String secondName, int years) {
        this.name = Objects.requireNonNull(name);
        this.secondName =  Objects.requireNonNull(secondName);
        this.years = years;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }


    public String getSecondName() {
        return secondName;
    }

    protected void setSecondName(String secondName) {
        this.secondName = secondName;
    }

    protected int getYears() {
        return years;
    }

    protected void setYears(int years) {
        this.years = years;
    }
    @Override
    public String toString() {
        return "Person{" +
                "name='" + name + '\'' +
                ", secondName='" + secondName + '\'' +
                ", years=" + years +
                '}';
    }

}
