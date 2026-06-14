package OOPS;
public class Main { // public used as this class can be accessed from any other class
    // public void fullThrottle(){
    //     System.out.println("Car is going at its full speed");
    // }
    // public void speed(int maxspeed){
    //     System.out.println("Max speed is :" + maxspeed);
    // }
    // public static void main(String[] args){
    //     Main myCar = new Main();
    //     myCar.fullThrottle();
    //     myCar.speed(200);
    // }

    String city = "London";
    int population =  9000000;
    int x ;

    //creating constructor
    public Main(int y){
        this.x = y;
    }
    public static void main(String[] args){
        Main person = new Main(5);
        System.out.println("Name of city is : " + person.city + " and population is: " + person.population);
    }
}
