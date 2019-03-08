import java.util.Scanner;
public class CharacterDuel {

    private static Scanner in = new Scanner(System.in);

    public static void main(String[] args) {

        Character char1 = new Character("Monster", /*Str*/20, /*Dext*/20, /*Int*/10);
        Wizard wizard = new Wizard("Wizard", /*Str*/20, /*Dext*/15, /*Int*/20);

        int round = 1;
        int char1Damage = 0;
        int wizardDamage = 0;
        while(char1.getCurrentLife() > 0 && wizard.getCurrentLife() > 0) {

            System.out.println(
                // "==================================================" + 
                "\n******************** ROUND: " + round + " ********************" +
                "\n**************************************************"
            );

            System.out.println(
                "\tName: " + wizard.getName() + "\t\tName: " + char1.getName() +
                "\n\tLife: " + wizard.getCurrentLife() + "/" + wizard.getMaxLife() + "\t\tLife: " + char1.getCurrentLife() + "/" + char1.getMaxLife() +  
                "\n\tMagic: " + wizard.getCurrentMagic() + "/" + wizard.getMaxMagic()
            );

            System.out.print(
                "--------------------------------------------------" +
                "\n\t\tAttack:" + "\t\t\t\t\t" + 
                "\n\t\t[1] Basic Attack" + "\t\t\t" + 
                "\n\t\t[2] Lightning Bolt" +"\t\t\t" + 
                "\n\t\t[3] Heal" + "\t\t\t\t" + 
                "\n\t\t >> "
            );
            int choiceAttack = in.nextInt();
            String attackInfo = "";
            switch (choiceAttack) {
                case 1:
                    wizardDamage = wizard.attack();
                    attackInfo = wizard.getName() + " Attack " + char1.getName();
                    break;
                case 2:
                    wizardDamage = wizard.castLightningBolt();
                    attackInfo = wizard.getName() + " cast Lightning Bolt to " + char1.getName();
                    break;
                case 3:
                    wizardDamage = wizard.castHeal();
                    attackInfo = wizard.getName() + " cast Heal " + char1.getName();
                    break;
                default:
                    System.out.println("Invalid Attack");
            }

            char1Damage = char1.attack();
            String char1DamageInfo = "";
            String wizardDamageInfo = "";
            if(choiceAttack==3){
                wizard.wound(char1Damage);
                char1DamageInfo = " damage: ";
                wizardDamageInfo = " heals:  ";
            }else {
                wizard.wound(char1Damage);
                char1.wound(wizardDamage);
                char1DamageInfo = " damage: ";
                wizardDamageInfo = " damage: ";
            }
            System.out.println(
                "" + 
                "\n\t\t" +attackInfo + 
                "\n\t\t" + char1.getName() + " Attack " + wizard.getName() + 
                "\n\t\t" + wizard.getName() + wizardDamageInfo + wizardDamage + 
                "\n\t\t" + char1.getName() + char1DamageInfo + char1Damage + 
                ""
            );
            System.out.println(
                // "==================================================" + 
                "\n**************** End of ROUND: " + round + " *****************" +
                "\n**************************************************"
            );
            // System.out.println("==================================================\n\n");
            round++;
        }

        

        if (wizard.getCurrentLife() > char1.getCurrentLife()) {
            System.out.println( 
                "\n\t\t" + wizard.getName() + ": " + wizard.getCurrentLife() + "/" + wizard.getMaxLife() +
                "\n\t\t" + char1.getName() +": " + "0/" + char1.getMaxLife() +
                "\n\t\t" + wizard.getName() + " wins"
            );
            // System.out.println();
        } else if (char1.getCurrentLife() > wizard.getCurrentLife()) {
            System.out.println( 
                "\n\t\t" + wizard.getName() + ": " + "0/" + wizard.getMaxLife() +
                "\n\t\t" + char1.getName() +": " + char1.getCurrentLife() + "/" + char1.getMaxLife() +
                "\n\t\t" + char1.getName() + " wins"
            );
        } else {
            System.out.println("\t\tDraw");
        }
        
    }
}
