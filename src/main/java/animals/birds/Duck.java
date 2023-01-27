package animal.birds;

import animal.Animal;

public class Duck extends Animal implements animal.birds.IFlying {
    @Override
    public void say() {
        System.out.println("Кря");
    }

    @Override
    public void fly() {
        System.out.println("Я лечу");
    }
}
