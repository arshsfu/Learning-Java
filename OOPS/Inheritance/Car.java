package OOPS.Inheritance;

public class Car extends Vehicle{
    private String modelName = "Mustang";
    public static void main(String[] args){
        Car myCar = new Car();
        myCar.honk();
        System.out.println("Car name: "+ myCar.modelName);
        System.out.println("Car brand: "+ myCar.brand);

    }
}
