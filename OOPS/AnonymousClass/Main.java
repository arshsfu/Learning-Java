package OOPS.AnonymousClass;

public class Main {
    public static void main(String[] args){
        Animal animal = new Animal();
        Animal myanimal = new Animal(){
            public void makeSound(){
                System.out.println("woof woof");
            }
        };
        myanimal.makeSound();
        animal.makeSound();
    } 
}
