package level1.Exercise2;

public class Main {
    public static void main(String[] args) {
        GenericMethods genericMethods = new GenericMethods<>("This is a String", 20.30, new Person("Paquito", "Elchocolatero", 44));
        genericMethods.printParameters( new Person("Pepa", "Pig", 6),"This is another String", 20.30,44f, new Person("LaVaca", "Paca", 10));

    }
}
