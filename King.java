import java.util.Scanner;

public class King {
    int gold = 1000;
    int population = 500;
    int happiness = 80;

    public String makeDecision() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Answer (yes/no): ");
        return scanner.nextLine().toLowerCase();
    }

    public void updateResources(int goldChange, int popChange, int happyChange) {
        gold += goldChange;
        population += popChange;
        happiness += happyChange;
        System.out.println("Gold: " + gold + ", Population: " + population + ", Happiness: " + happiness);
    }

    public boolean checkGameOver() {
        return gold <= 0 || population <= 0 || happiness <= 0;
    }
}
