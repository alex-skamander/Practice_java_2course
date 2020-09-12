package com.company.pr2;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        String name;
        int age;
        Scanner scan = new Scanner(System.in);
        NurseryDog DOG = new NurseryDog();
        name = scan.next();
        while(!(name.equals("stop"))) {
            age = scan.nextInt();
            Dog dog_ = new Dog(name, age);
            System.out.println(dog_.ageDog(age));
            System.out.println(dog_.toString());
            DOG.Add(name, age);
            name = scan.next();
        }
        DOG.Show();
    }
}