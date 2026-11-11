/**
 *  <i>MazeGenerator</i>. This class generates a maze of blocks using StdDraw.
 *  @author Cody Stevens, WFU CS Department
 */

import java.awt.*;

public class MazeGenerator {

    static final int[][] maze = {
            { 2, 0, 1, 1, 1, 1, 1, 0, 1, 0 },
            { 1, 0, 1, 0, 1, 0, 0, 0, 1, 0 },
            { 1, 0, 1, 0, 1, 0, 1, 1, 1, 0 },
            { 1, 0, 0, 0, 1, 0, 1, 0, 0, 0 },
            { 1, 0, 1, 0, 1, 0, 1, 0, 1, 1 },
            { 0, 0, 1, 0, 1, 0, 0, 0, 0, 1 },
            { 0, 1, 1, 0, 1, 1, 0, 1, 0, 1 },
            { 0, 1, 0, 0, 0, 1, 0, 1, 0, 1 },
            { 1, 1, 0, 1, 0, 1, 0, 1, 0, 1 },
            { 4, 0, 0, 1, 0, 0, 0, 1, 0, 3 }
    };
    public static void draw() {

        StdDraw.setScale(0.0, 10.0);

        for( int i = 0; i < maze.length; i++) {
            for (int j = 0; j < maze[i].length; j++) {

                if( maze[i][j] == 0 ) {
                    StdDraw.setPenColor(StdDraw.WHITE);
                } else if ( maze[i][j] == 1 ) {
                    StdDraw.setPenColor(StdDraw.BLACK);
                } else if ( maze[i][j] == 2 ) {
                    StdDraw.setPenColor(StdDraw.GREEN);
                } else if ( maze[i][j] == 3 ) {
                    StdDraw.setPenColor(StdDraw.BLUE);
                } else {
                    StdDraw.setPenColor(StdDraw.RED);
                }

                StdDraw.filledSquare( i + 0.5, j + 0.5, 0.5);
            }
        }
    }
    public static boolean checkSquare ( int x, int y, Color c) {

        if( maze[x][y] == 1 ) {
            StdDraw.setFont(new Font("Arial", Font.BOLD, 60));
            StdDraw.setPenColor(StdDraw.BOOK_RED);
            StdDraw.text( 5.0, 4.3, "YOU DIED");
            return true;
        } else if( maze[x][y] == 2 ) {

            StdDraw.setFont(new Font("Arial", Font.BOLD, 60));

            if( c.equals(StdDraw.GREEN)) {
                StdDraw.setPenColor(StdDraw.GREEN);
                StdDraw.text( 5.0, 4.3, "YOU WIN");
            } else {
                StdDraw.setPenColor(StdDraw.BOOK_RED);
                StdDraw.text( 5.0, 4.3, "YOU DIED");
            }

            return true;

        } else if( maze[x][y] == 3 ) {

            StdDraw.setFont(new Font("Arial", Font.BOLD, 60));

            if( c.equals(StdDraw.BLUE)) {
                StdDraw.setPenColor(StdDraw.GREEN);
                StdDraw.text( 5.0, 4.3, "YOU WIN");
            } else {
                StdDraw.setPenColor(StdDraw.BOOK_RED);
                StdDraw.text( 5.0, 4.3, "YOU DIED");
            }

            return true;

        } else if( maze[x][y] == 4 ) {

            StdDraw.setFont(new Font("Arial", Font.BOLD, 60));

            if( c.equals(StdDraw.RED)) {
                StdDraw.setPenColor(StdDraw.GREEN);
                StdDraw.text( 5.0, 4.3, "YOU WIN");
            } else {
                StdDraw.setPenColor(StdDraw.BOOK_RED);
                StdDraw.text( 5.0, 4.3, "YOU DIED");
            }

            return true;

        } else {
            return false;
        }
    }
}