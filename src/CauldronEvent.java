import java.util.Random;

/* ** NO NEED TO CHANGE/SUBMIT THIS FILE ** */
// Optional but not necessary.
public class CauldronEvent {
    public boolean triggerEvent() {
        Random random = new Random();
        int event = random.nextInt(4);

        if (event == 0) {
            System.out.println("Oh no! Your potion exploded and is useless!");
            return true;
        } else if (event == 1) {
            System.out.println("That potion needs fixed!");
        }
        return false;
    }
}
