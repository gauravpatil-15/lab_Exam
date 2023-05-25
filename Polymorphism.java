import java.util.Scanner;

class Vehicle {
    public void move() {}
}

class Car extends Vehicle {
    @Override
    public void move() {
        System.out.println("Car drives on Road");
    }
}

class Helicopter extends Vehicle {
    @Override
    public void move() {
        System.out.println("Helicopter flies in Air");
    }
}

class Train extends Vehicle {
    @Override
    public void move() {
        System.out.println("Train runs on Track");
    }
}

public class Polymorphism {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.println("Which vehicle do you want to order ? \n1) Car\t2) Helicopter\t3)Train \n\nEnter Your Choice..");
        int choice = in.nextInt();

        Vehicle v;

        switch (choice) {
            case 1 -> v = new Car();
            case 2 -> v = new Helicopter();
            case 3 -> v = new Train();
            default -> {
                System.out.println("Invalid choice Entered..:(");
                return;
            }
        }
        v.move();
    }
}
