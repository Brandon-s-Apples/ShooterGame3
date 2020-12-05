package main;

public class Main {

    public static void main(String[] args) {
        Velocity velocity = new Velocity(225, 120);
        System.out.println(velocity);

        velocity.addVelocity(new Velocity(100, 120));
        System.out.println(velocity);

    }

}
