public class Advisor extends Character {

    public Advisor() {
        super("Advisor Alric");
    }


    public void interact(King king) {
        System.out.println(name + ": My advice: keep your people happy and your gold safe.");
        // No decision needed – just advice
    }
}
