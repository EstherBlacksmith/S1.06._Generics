package Exercise2;

public class Main {
    public static void main(String[] args) {
        GenericMethods genericMethods = new GenericMethods<>("This is a String",20f,new Person("Paquito","Elchocolatero",44));
        genericMethods.printParameters();

    }
}
