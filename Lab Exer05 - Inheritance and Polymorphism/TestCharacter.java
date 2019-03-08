public class TestCharacter {

    public static void main(String[] args) {

        Character char2 = new Character("David", 17, 17, 20);
        Character char1 = new Character("Paul", 15, 16, 55);

        int rounds = 1;
        int char2Dmg = 0, char1Dmg = 0;

        do {
            System.out.println("Round: " + rounds);

            System.out.println(char2.getName() + ": " + char2.getCurrentLife() + "\n"
                    + char1.getName() +": " + char1.getCurrentLife());

            char2Dmg = char2.attack();
            char1Dmg = char1.attack();

            System.out.println(char2.getName() + " attack "+ char1.getName() +" for " + char1Dmg + "\n"
                    + char1.getName() +" attack "+char2.getName()+" for " + char2Dmg);

            char2.wound(char1Dmg);
            char1.wound(char2Dmg);
            
            rounds++;
            
            System.out.println("");
                   
        } while (rounds < 4 && (char1.getCurrentLife() > 0 && char2.getCurrentLife() > 0));
       
        if (char2.getCurrentLife() > char1.getCurrentLife()) {
            System.out.println(char2.getName() + " wins");
        } else if (char1.getCurrentLife() > char2.getCurrentLife()) {
            System.out.println(char1.getName() + " wins");
        } else {
            System.out.println("Draw");
        }
        
    }
}
