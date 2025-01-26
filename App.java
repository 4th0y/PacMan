import javax.swing.JFrame;

public class App{
    public static void main(String args[]) throws Exception{ 
        int rowCount = 21;
        int columnCount = 19;
        int tileSize = 32;
        int boardWidth = columnCount * tileSize;
        int boardHeight = rowCount * tileSize;

        JFrame frame = new JFrame("Pac Man");
        // frame.setVisible(true);
        frame.setSize(boardWidth, boardHeight);
        frame.setLocationRelativeTo(null);  //center of frame for the player
        frame.setResizable(false); //doesnt allow player to resize
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);  
        //close the game when player clicks the "X" button
        
        PacMan pacmanGame = new PacMan();
        frame.add(pacmanGame);
        frame.pack();
        frame.setVisible(true);
 
    }
}
