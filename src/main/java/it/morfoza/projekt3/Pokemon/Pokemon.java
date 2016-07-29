package it.morfoza.projekt3.Pokemon;

/**
 * Created by widzew on 2016-07-29.
 */
public class Pokemon {
    private String name;
    private long life = 1000;
    private long combatPower;

    public Pokemon(String name, long combatPower) {
        this.name = name;
        this.combatPower = combatPower;
    }
    public String toString() {
        return "Pokemon " + name + " HP: " + life;
    }

    public void takeAttack(long attackPower) {
        life = life - attackPower;
    }

    public boolean isAlive() {
        if (life > 0) {
            return true;
        }
        else {
            return false;
        }
    }
    public void attack(Pokemon enemy) {
        if (this != enemy)
        enemy.takeAttack(combatPower);
    }
}
