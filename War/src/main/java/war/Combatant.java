package main.java.war;

abstract class Combatant {
    void printState() {
        System.out.println("Error 404. Class not found.");
    }
    abstract void attack(Soldier s);
    abstract void attack(Vehicle v);
    abstract void scream();

}
