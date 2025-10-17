package Exercise2;

import java.util.Objects;

public class GenericMethods <T> {
    private T property1;
    private T property2;
    private T property3;

    public GenericMethods(T property1, T property2, T property3) {
        this.property1 = Objects.requireNonNull(property1);
        this.property2 = Objects.requireNonNull(property2);
        this.property3 = Objects.requireNonNull(property3);
    }

    protected void setProperty1(T property1) {
        this.property1 = property1;
    }

    protected void setProperty2(T property2) {
        this.property2 = property2;
    }

    protected void setProperty3(T property3) {
        this.property3 = property3;
    }

    protected void printParameters(){
        System.out.println(property1);
        System.out.println(property2);
        System.out.println(property3);
    }
}
