import java.util.Random;

public class Main {
    public static void main(String[] args) {
        King king = new King();

        Chef chef = new Chef();
        Mage mage = new Mage();
        Citizen citizen = new Citizen();
        Advisor advisor = new Advisor();
        Blacksmith blacksmith = new Blacksmith();

        Character[] characters = { chef, mage, citizen, advisor, blacksmith };
        Random rand = new Random();

        while (true) {
            // Välj en slumpmässig karaktär
            int index = rand.nextInt(characters.length);
            Character current = characters[index];

            current.interact(king);

            if (king.checkGameOver()) {
                System.out.println("Game over!");
                break;
            }

            System.out.println("--- Next turn ---");
        }
    }
}
