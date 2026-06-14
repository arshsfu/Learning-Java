package OOPS.polymorphism;

public class Dog extends Animal{
    public void animalSound(){
        System.out.println("Dog is making sound");
    }
    public static void main(String[] args){
        Dog myDog = new Dog();
        myDog.animalSound();
    }
}
