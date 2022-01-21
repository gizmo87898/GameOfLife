import java.awt.*;
import javax.swing.*;
import java.util.Random;

public class GameOfLife extends JFrame {
    public static void main (String[] args) {

        
        //Create grid and print it all out
        Object[][] grid = new Object[10][10];
        grid = createGrid(5, 10, 10);
        for(int x = 0; x < grid.length; x++) {
            for(int y = 0; y < grid[x].length; y++) {
                System.out.println(grid[x][y]);
            }
        }
        //JFrame 
        JLabel emptyLabel = new JLabel("Hi hello");
        JTable panelGrid = new JTable(grid, new Object[grid.length][grid[0].length]);
        panelGrid.setTableHeader(null);
        JFrame frame = new JFrame("FrameDemo");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.getContentPane().add(emptyLabel, BorderLayout.CENTER);
        frame.getContentPane().add(new JScrollPane(panelGrid), BorderLayout.CENTER);
        frame.pack();
        frame.setVisible(true);
    }

    public static Object[][] createGrid(long seed, int xSize, int ySize) {
        Object[][] grid = new Object[xSize][ySize];
        for(int x = 0; x < grid.length; x++) {
            for(int y = 0; y < grid[x].length; y++) {
                Random rd = new Random();
                grid[x][y] = rd.nextBoolean();
            }
        }
        return grid;
    }
}