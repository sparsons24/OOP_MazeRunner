/**
 *  <i>MazeRunner</i>. This client file instantiates a Player object.
 *  @author Cody Stevens, WFU CS Department
 */

public class MazeRunner {
    public static void main( String[] args ) {

        // Create Player Object named "me"
        Player me = new Player();
        me.draw();

        // Get the color of the Player
        String color = me.getColor();
        System.out.println(color);

        // Move the Player two steps to the East
        me.moveEast();
        me.moveEast();

    }
}
