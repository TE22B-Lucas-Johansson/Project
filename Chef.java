public class Chef extends Character {
    private boolean loanGiven = false;  // Håller koll om du sagt ja tidigare

    public Chef() {
        super("Chef Gustav");
    }

    public void interact(King king) {
        if (!loanGiven) {
            // Första gången: Chef vill ha pengar till ingredienser
            System.out.println(name + ": I need 150 gold for ingredients.");
            String answer = king.makeDecision();
            if (answer.equals("yes")) {
                king.updateResources(-150, 0, 10);
                loanGiven = true;
                System.out.println("Thanks! I’ll make something great.");
            } else {
                king.updateResources(0, 0, -5);
                System.out.println("Alright, maybe next time.");
            }
        } else {
            // Senare: Chef ger tillbaka lite pengar (t.ex. 75 gold)
            System.out.println(name + ": Here’s some money back from the feast I prepared!");
            king.updateResources(75, 0, 5);
        }
    }
}
