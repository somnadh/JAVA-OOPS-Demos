
import java.util.Scanner;



interface Animal {// Animal interface interface 

    public void speak();//abstract demo or method declaration
}

class Cow implements Animal {// here Animal interface implemented 

    public void speak() {//speak method is implemented
        System.out.println("Amba.........Amba....…");
    }
}

class Dog implements Animal {

    public void speak() {
        System.out.println("Bow Bow……Bow.......");
    }
}

class Snake implements Animal {

    public void speak() {
        System.out.println("SHhhhhhhhhhh Shhhhhhhhhhhhhhhh shhhhhhhhhhhh");
    }
}

public class RunTimePolymorphism {

    public static void main(String args[]) {
        RunTimePolymorphism rp = new RunTimePolymorphism();
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter Animal ");
        String AnimalName = scan.next();//Cow  or Snake or Dog 

        /*Dog d=new Dog();
            d.speak();
               Cow c=new Cow();
            c.speak();
        we can create like this also but this code may not be effective
         */
        Animal ref = rp.giveMeRespective(AnimalName);
        ref.speak();//late binding, dynamic binding, dynamic dispactch, runtime polymorphism
    }

    public Animal giveMeRespective(String what) //Method for taking object dynamically
      {
        if (what.equals("Cow")) {
            Cow c = new Cow();
            return c;
        } else if (what.equals("Dog")) {
            Dog d = new Dog();
            return d;
        } else {
            return new Snake();
        }

    }
}
    /*Output:
      Enter Animal 
      Snake
      SHhhhhhhhhhh Shhhhhhhhhhhhhhhh shhhhhhhhhhhh*/
