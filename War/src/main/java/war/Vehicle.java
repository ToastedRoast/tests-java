package main.java.war;

public class Vehicle extends Combatant {
    String name;
    int defense;

    public Vehicle(String name, int defense) {
        this.defense = defense;
        this.name = name;
    }

    @Override
    public void printState() {
        System.out.println("I have " + defense + " health points.");
    }

    @Override
    public void attack(Vehicle v) {
        v.defense /= 2;
    }

    @Override
    public void attack(Soldier s) {
        s.kill();
    }

    @Override
    public void scream() {
        System.out.println("I'm " + name + "!");
    }
}
