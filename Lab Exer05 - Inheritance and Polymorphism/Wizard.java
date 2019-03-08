/**
* The Wizard class extends Character, adding two new instance
* variables: maxmagic, and currentmagic, as well as the
* castLightningBolt() and castHeal() methods, which represent
* casting magic spells.
*/
public class Wizard extends Character {
    /** instance variables */
    /**
    * The Wizard(String,int,int,int) constructor overrides the
    * constructor with the same signature in Character. It first
    * calls that constructor using the super keyword, then
    * initializes maxmagic to a value, and sets currentmagic to
    * the same value, similar to lifepoints.
    */
    private int maxMagic ;
    private int currentMagic ;

    /**
    * The Wizard(String,int,int,int) constructor overrides the
    * constructor with the same signature in Character. It first
    * calls that constructor using the super keyword, then
    * initializes maxmagic to a value, and sets currentmagic to
    * the same value, similar to lifepoints.
    */
    public Wizard(String n, int s,int d,int i){
        
        super(n,s,d,i);
        maxMagic = dice.roll() + 10;
        currentMagic = maxMagic;
    }
    
    /**
    * castLightningBolt() represents casting a magic spell. The
    * method first checks that currentmagic is greater than/equal
    * to 5. If it is, currentmagic is reduced by 5 and a random
    * number is returned using the dice inherited from Character,
    * modified by the character's intelligence.
    * Otherwise, returns 0.
    */
    public int castLightningBolt(){
        if(currentMagic >=5) {
            currentMagic -=5;
            return dice.roll() + super.getIntelligence();
        }
        else
            return 0;
    }
    
    /**
    * castHeal() represents casting a magic spell. The method first
    * checks that currentmagic is greater than/equal to 8. If it
    * is, currentmagic is reduced by 8 and the character's heal()
    * method is called with a random number, modified by the
    * character's intelligence score. The amount healed is also
    * returned by the method.
    */
    public int castHeal(){
        if(currentMagic >=8){
            currentMagic -=8;
            
            int a = dice.roll() + super.getIntelligence();
            super.heal(a);
            return a;
        }
        else{
            return 0;         
        }
    }
    
    /**
    * Returns maxmagic
    */
    public int getMaxMagic (){
        
    return maxMagic ;
            }
    
    public int getCurrentMagic (){
        return currentMagic ;
    }
}