/**
 *  <i>Player</i>. This class defines a Player object to move through a maze.
 *  @author Cody Stevens, WFU CS Department
 */

import java.awt.*;
import java.util.Random;

import static java.lang.System.exit;

public class Player {

    private int x;
    private int y;
    private Color c;
    private String s;

    public Player( ) {
        Random rand = new Random();
        int r = rand.nextInt(3);

        this.x = 0;
        this.y = 9;
        if( r == 0 ) {
            this.c = Color.GREEN;
            this.s = "Green";
        } else if ( r == 1 ) {
            this.c = Color.RED;
            this.s = "Red";
        } else {
            this.c = Color.BLUE;
            this.s = "Blue";
        }
    }

    public Player( int r) {
        this.x = 0;
        this.y = 9;
        if( r == 0 ) {
            this.c = Color.GREEN;
            this.s = "Green";
        } else if ( r == 1 ) {
            this.c = Color.RED;
            this.s = "Red";
        } else {
            this.c = Color.BLUE;
            this.s = "Blue";
        }
    }
    public void moveNorth( ) {
        this.y++;
        this.draw();
        if( MazeGenerator.checkSquare(this.x, this.y, this.c) ) {
            StdDraw.pause(5000);
            exit(0);
        }
    }

    public void moveSouth( ) {
        this.y--;
        this.draw();
        if( MazeGenerator.checkSquare(this.x, this.y, this.c) ) {
            StdDraw.pause(5000);
            exit(0);
        }
    }

    public void moveWest( ) {
        this.x--;
        this.draw();
        if( MazeGenerator.checkSquare(this.x, this.y, this.c) ) {
            StdDraw.pause(5000);
            exit(0);
        }
    }

    public void moveEast( ) {
        this.x++;
        this.draw();
        if( MazeGenerator.checkSquare(this.x, this.y, this.c) ) {
            StdDraw.pause(5000);
            exit(0);
        }
    }

    public String getColor( ) {
        return this.s;
    }

    public void draw( ) {

        MazeGenerator.draw();
        StdDraw.setPenColor(this.c);
        StdDraw.filledSquare( this.x + 0.5, this.y + 0.5, 0.5);
        StdDraw.pause(500);
    }
}
