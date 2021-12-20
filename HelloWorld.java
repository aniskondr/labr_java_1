import java.util.Scanner;

public class HelloWorld {
    public static void main(String[] args) {
        System.out.println("Hello World"); System.out.println();

        int age = 21;
        System.out.println("I am " +
                age + " years old");


        String firstname = "Anastasia";
        String secondname = "Kondratova";
        System.out.print("My name is " + firstname);
        System.out.print(" and ");
        System.out.println("my family name is " + secondname);
        System.out.println("So, my full name is " + secondname + " " + firstname); System.out.println();

        Scanner input = new Scanner(System.in);

        System.out.println("Enter your name");
        String name = input.nextLine();
        System.out.println("Welcome, " + name);
    }
}
