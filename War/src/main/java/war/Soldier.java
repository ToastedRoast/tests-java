package main.java.war;

public class Soldier extends Combatant {
    int healthPoints;
    int damagePoints;
    String scream;

    public Soldier() {
        healthPoints = 15;
        damagePoints = 3;
        scream = "No pity for losers!";
    }

    public void kill() {
        healthPoints = 0;
    }

    @Override
    public void attack(Vehicle v) {
        System.out.println("I can't fight this");
    }

    @Override
    public void attack(Soldier s) {
        s.healthPoints -= damagePoints;
    }

    @Override
    public void scream() {
        System.out.println(scream);
    }

    @Override
    void printState() {
        System.out.println("I have " + healthPoints + " health points.");
    }
}
