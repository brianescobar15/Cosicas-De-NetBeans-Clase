/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package JpanelImagen;

import java.awt.Graphics;
import java.io.File;
import java.io.Serializable;
import javax.swing.ImageIcon;
import javax.swing.JPanel;

/**
 *
 * @author dams1
 */
public class JPanelImagen extends JPanel implements Serializable {
    
    private File ruta_Imagen;
    
    public JPanelImagen(){
    
    }

    public File getRuta_Imagen() {
        return ruta_Imagen;
    }

    public void setRuta_Imagen(File ruta_Imagen) {
        this.ruta_Imagen = ruta_Imagen;
    }

    @Override
    protected void paintComponent(Graphics g) {
        super.paintComponent(g);
        
        if (ruta_Imagen != null && ruta_Imagen.exists()){
            
            ImageIcon ImageIcon = new ImageIcon(ruta_Imagen.getAbsolutePath());
            g.drawImage(ImageIcon.getImage(), 0, 0, null);
            
        }
    }
}
