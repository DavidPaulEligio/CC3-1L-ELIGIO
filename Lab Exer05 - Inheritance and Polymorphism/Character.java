/*
* @author Natura, Racel-Ann; Rivera,Justin
*@version 1.00, March 03, 2019
*/

/**
* The Character class models a character for a roleplaying game.
* A character has a name and 3 stats: strength, dexterity, and
intelligence, as
* well as maximum allowed life points and the current value.
*/
public class Character {
    /** static variables */
    public static Dice dice = new Dice();

    private String name;
    private int strength;
    private int dexterity;
    private int intelligence;
    private int currentLife;
    private int maxLife;

    /** instance variables */
    /**
    * Constructor takes 4 parameters: n,s,d,i and assigns them to
    * instance variables name, strength, dexterity, intelligence.
    * Also uses the dice instance to assign a random
    * number to maxlife. currentlife is initialized to maxlife
    */
    public Character(String n, int s, int d, int i) {
        this.name = n;
        this.strength = s;
        this.dexterity = d;
        this.intelligence = i;
        this.maxLife = (dice.roll() + 20);
        this.currentLife = this.maxLife;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getStrength() {
        return strength;
    }

    public void setStrength(int strength) {
        this.strength = strength;
    }

    public int getDexterity() {
        return dexterity;
    }

    public void setDexterity(int dexterity) {
        this.dexterity = dexterity;
    }

    public int getIntelligence() {
        return intelligence;
    }

    public void setIntelligence(int intelligence) {
        this.intelligence = intelligence;
    }

    public int getCurrentLife() {
        return currentLife;
    }

    public void setCurrentLife(int currentLife) {
        this.currentLife = currentLife;
    }

    public int getMaxLife() {
        return maxLife;
    }

    public void setMaxLife(int maxLife) {
        this.maxLife = maxLife;
    }

    public int attack() {
    
        return strength / (dice.roll() + 1);
    }

    /**
    * Decreases currentlife by the damage parameter
    */
    public void wound(int damage) {
        currentLife -= damage;
    }
    
    /**
    * Increases currentlife by the heal parameter.
    * currentlife cannot be greater than maxlife
    */
    public void heal(int heal) {
        currentLife += heal;
        if(currentLife<maxLife){
            currentLife=maxLife;
        }
    }

}