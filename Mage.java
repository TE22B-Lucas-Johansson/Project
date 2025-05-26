public class Mage extends Character {

    public Mage() {
        super("Mage Zara");
    }
    public void interact(King king) {
        System.out.println(name + ": I can help the kingdom... but I won't say how.");
        String answer = king.makeDecision();
        if (answer.equals("yes")) {
            System.out.println("The mage did something mysterious... it went badly!");
            king.updateResources(-200, -50, -30);
        } else {
            System.out.println("Nothing happens.");
        }
    }
}
