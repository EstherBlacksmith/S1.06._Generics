package Exercise1;

import java.util.Objects;

public class NoGenericMethods <T>{
    private T property1;
    private T property2;
    private T property3;

    public NoGenericMethods(T property1, T property2, T property3) {
        this.property1 = Objects.requireNonNull(property1);
        this.property2 = Objects.requireNonNull(property2);
        this.property3 = Objects.requireNonNull(property3);
    }

    public T getProperty1() {
        return property1;
    }

    public void setProperty1(T property1) {
        this.property1 = property1;
    }

    public T getProperty2() {
        return property2;
    }

    protected void setProperty2(T property2) {
        this.property2 = property2;
    }

    protected T getProperty3() {
        return property3;
    }

    protected void setProperty3(T property3) {
        this.property3 = property3;
    }
}
