/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package programdda;

/**
 *
 * @author user
 */
import java.awt.Color;
import java.awt.Graphics;
import javax.swing.JFrame;
import javax.swing.JPanel;

public class ProgramDDA extends JPanel{
    @Override
    public void paintComponent(Graphics g){
        
        NewClass baru = new NewClass();
        g.setColor(Color.BLUE); 
        baru.Garisku(g, 100, 200, 300, 200);
            }
    
    public static void main(String[] args) {
        NewClass baru = new NewClass();
        JFrame frame = new JFrame("Gambar Garis DDA");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.add(new ProgramDDA());
        frame.setSize(600, 600);
        frame.setLocationRelativeTo(null);
        frame.setVisible(true);
               
    }
}
