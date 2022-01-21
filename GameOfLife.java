import java.awt.*;
import javax.swing.*;
import java.util.Random;

public class GameOfLife {
    public static void main (String[] args) {
        JFrame frame = new JFrame("FrameDemo");
        JLabel emptyLabel = new JLabel("Hi hello");
        boolean[][] grid = new boolean[10][10];
        grid = createGrid(5, 10, 10);
        for(int x = 0; x < grid.length; x++) {
            for(int y = 0; y < grid[x].length; y++) {
                System.out.println(grid[x][y]);
            }
        }
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.getContentPane().add(emptyLabel, BorderLayout.CENTER);
        frame.pack();
        frame.setVisible(true);
    }
    public static boolean[][] createGrid(float seed, int xSize, int ySize) {
        boolean[][] grid = new boolean[xSize][ySize];
        for(int x = 0; x < grid.length; x++) {
            for(int y = 0; y < grid[x].length; y++) {
                Random rd = new Random();
                grid[x][y] = rd.nextBoolean();
            }
        }
        return grid;
    }
}