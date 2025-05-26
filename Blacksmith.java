public class Blacksmith extends Character {
    private boolean loanGiven = false;  // Håller koll om spelaren sagt ja tidigare

    public Blacksmith() {
        super("Blacksmith Erik");
    }

    public void interact(King king) {
        if (!loanGiven) {
            // Första gången: Be om pengar
            System.out.println(name + ": I can forge better weapons for 200 gold. It may help defend the kingdom.");
            String answer = king.makeDecision();
            if (answer.equals("yes")) {
                king.updateResources(-200, 0, 15);
                loanGiven = true;
                System.out.println("The soldiers are happy and feel stronger!");
            } else {
                king.updateResources(0, 0, -5);
                System.out.println("The blacksmith is disappointed.");
            }
        } else {
            // Senare: Betala tillbaka lån (ge pengar)
            System.out.println(name + ": Here is some money back for your earlier investment!");
            king.updateResources(100, 0, 5);

        }
    }
}
