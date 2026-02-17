import javax.swing.*;
import java.awt.*;

/**
 * Beschreiben Sie hier die Klasse GameUI.
 * 
 * @author (Ihr Name) 
 * @version (eine Versionsnummer oder ein Datum)
 */
public class GameMaster
{
    public GameUI ui;
    GameMaster(){
        main(new String[0]);
    }
    public  void main(String[] args) {
        JFrame frame = new JFrame("3D Renderer");
        ui = new GameUI();

        frame.add(ui);
        frame.setSize(800, 600);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setVisible(true);

        
    }
    
}