class Driving{
    public static void drive(){
        System.out.println("driving");
    }
}

class Audi extends Driving{

    public static void drive() {
        System.out.println("Driving audi car");
    }
}
public class MethodOverridingDemo {

    public static void main(String[] args) {
        Audi audi = new Audi();
        audi.drive();

    }
}
