public class DemoClass {
    //create generics <T> method
    //the type parameter <T> is inserted after the public modifier and before the return type void
    public <T> void genericsMethod(T data) {
        System.out.println("Generics Method");
        System.out.println("Data Passed " + data);
    }
}
