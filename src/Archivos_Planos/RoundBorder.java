/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Archivos_Planos;
import java.awt.* ;
import javax.swing.border.Border;

 public class RoundBorder implements Border{
     private int radius;
     
     public RoundBorder (int radius){
     this.radius = radius;
     
     }

    @Override
    public Insets getBorderInsets(Component c) {
       return new Insets(radius, radius, radius, radius);
    }

    @Override
    public boolean isBorderOpaque() {
      return true;
        
    }
 @Override
    public void paintBorder(Component c, Graphics g, int x, int y, int width, int height) {
       g.setColor(c.getForeground());
       g.drawRoundRect(x, y, width - 1, height - 1, width, height);
    }
    
    
}
