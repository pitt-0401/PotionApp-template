import java.util.Random;

// TODO: Implement Potion. Add useful variables, methods, getters, setters (if needed), and constructor(s)
public class Potion {
    /*
     * Potion enforces phases (not PotionApp!):
     * ADD -> STIR -> HEAT -> EVALUATE
     * - addIngredient() adds the ingredient effect to strength
     *            adding a fourth ingredient ruins the potion
     * - stir() prints an error message until 3 ingredients are added
     * - heat() prints an error message until the potion has been stirred
     * - evaluatePotion() returns an error string if the potion has not been heated
     *            yet or was already evaluated (CauldronEvent then does not trigger,
     *            so it fires only once)
     * - if ruined/exploded/evaluated, stir()/heat() print an error message and
     *            evaluatePotion() returns an error string; the potion stays unchanged
     * 
     * HINT: fields you need are
     * strength, quality, ingredientsAdded
     * hasStirred, hasHeated, hasEvaluated, isRuined
     */

    // TODO: Implement addIngredient(): adds ingredient effect to strength;
    // a fourth ingredient ruins the potion

    // TODO: Implement stir(): adds random [1..5] to strength each call;
    // should print out an error message until 3 ingredients are added

    // TODO: Implement heat(): adds random [0..7] to quality each call;
    // should print out an error message until the potion has been stirred

    // TODO: Implement evaluatePotion(): returns the result as a String
    // (success / partial success / failure) and triggers the CauldronEvent once.
    // You decide the strength/quality thresholds for each outcome.
    // If the potion has not been heated yet, or was already evaluated, return an
    // error string instead and do not trigger the CauldronEvent.

    // TODO: Override toString() so that printing a Potion shows its strength, its
    // quality and how many ingredients are in it (see L08)
}
