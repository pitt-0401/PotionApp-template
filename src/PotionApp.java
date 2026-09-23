import java.util.Scanner;

public class PotionApp {

    private static Scanner scanner = new Scanner(System.in);

    // TODO: Add the remaining ingredient objects here
    private static Ingredient bicornHorn = new Ingredient("Bicorn Horn", 5);
    /*
     * Possible ingredients (you may make up your own, too):
     * ("Bicorn Horn", 5)
     * ("Dragon Blood", 7)
     * ("Armadillo Bile", 10)
     * ("Wormwood Essence", 4)
     * ("Moonstone", 3)
     * ("Fries", 4)
     */

    public static void main(String[] args) {

        // main() should ONLY coordinate program flow:
        // 1. create objects
        // 2. call helper methods
        // 3. print final result

        Potion potion = new Potion();
        printIngredients();

        // TODO: Implement the menu loop: print the menu, read the user's choice,
        // call the matching helper method, repeat until the user quits.
        // The menu always offers all actions (no specific order required). Potion
        // enforces the phases (not PotionApp!); no brewing rules in here!
        // When evaluating: print the result AND the potion (see toString())

        scanner.close();
    }

    // HELPER METHODS (no logic in main!)

    // TODO: Implement printMenu() to print the five actions the user can choose:
    // (1) Add an ingredient  (2) Stir  (3) Heat  (4) Evaluate  (5) Quit
    private static void printMenu() {
        // TODO
    }

    // TODO: Read and validate an integer input within a given range
    static int readIntInRange(String prompt, int min, int max) {
        return max; // TODO: replace max with user number
    }

    // TODO: Ask which ingredient (1-6) and add that ingredient to the potion
    static void selectIngredient(Potion potion) {
        // TODO
    }

    // TODO: Implement stirPotion() - prompt user for a number (1-3) and stir potion
    // that many times
    static void stirPotion(Potion potion) {
        // TODO
    }

    // TODO: Implement heatPotion() - prompt user for a heating level (1-3) and heat
    // the potion that many times
    static void heatPotion(Potion potion) {
        // TODO
    }

    // Helper to print out the ingredients (uses printf pattern from L08)
    private static void printIngredients() {
        System.out.println("Encapsulating Ingredients, p. 412 - available ingredients:");
        System.out.printf("  %-4s %-18s %s%n", "No.", "Ingredient", "Strength");
        System.out.printf("  %-4d %-18s %+d%n", 1, bicornHorn.getName(), bicornHorn.getEffect());
        // TODO: print the other five ingredients the same way
    }
}
