package Activity1;
public class Activity01 {

    public static void main(String[] args) {
        Car AUDI = new Car();
        AUDI.make = 2025;
        AUDI.color = "Black";
        AUDI.transmission = "Manual";
    
        //Using Car class method
        AUDI.displayCharacterstics();
        AUDI.accelerate();
        AUDI.brake();
    }

}