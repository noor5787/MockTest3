package in.ineuron.in;
//Animal superclass
class Animal {
 public void makeSound() {
     System.out.println("The animal makes a sound.");
 }
}

//Dog subclass
class Dog extends Animal {
 @Override
 public void makeSound() {
     System.out.println("The dog barks.");
 }
}

//Cat subclass
class Cat extends Animal {
 @Override
 public void makeSound() {
     System.out.println("The cat meows.");
 }
}

//Cow subclass
class Cow extends Animal {
 @Override
 public void makeSound() {
     System.out.println("The cow mooes.");
 }
}

//Main class to test the program
public class Main {
 public static void main(String[] args) {
     Animal animal = new Animal();
     Dog dog = new Dog();
     Cat cat = new Cat();
     Cow cow = new Cow();
     
     animal.makeSound();
     dog.makeSound();
     cat.makeSound();
     cow.makeSound();
 }
}
