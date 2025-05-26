public class Citizen extends Character {

    public Citizen() {
        super("Citizen Liam");
    }


    public void interact(King king) {
        System.out.println(name + ": Can we build a playground for the children? It costs 100 gold.");
        String answer = king.makeDecision();
        if (answer.equals("yes")) {
            king.updateResources(-100, 0, 20);
        } else {
            king.updateResources(0, 0, -10);
        }
    }
}
