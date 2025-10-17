package level1.Exercise1;

import java.util.Objects;

public class NoGenericMethods {
    private String property1;
    private String property2;
    private String property3;

    public NoGenericMethods(String property1, String property2, String property3) {
        this.property1 = Objects.requireNonNull(property1);
        this.property2 = Objects.requireNonNull(property2);
        this.property3 = Objects.requireNonNull(property3);
    }

    public String getProperty1() {
        return property1;
    }

    protected void setProperty1(String property1) {
        this.property1 = property1;
    }

    public String getProperty2() {
        return property2;
    }

    protected void setProperty2(String property2) {
        this.property2 = property2;
    }

    public String getProperty3() {
        return property3;
    }

    protected void setProperty3(String property3) {
        this.property3 = property3;
    }
}
