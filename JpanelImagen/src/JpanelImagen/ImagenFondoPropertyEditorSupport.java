/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package JpanelImagen;

import java.awt.Component;
import java.beans.PropertyEditorSupport;


/**
 *
 * @author dams1
 */
public class ImagenFondoPropertyEditorSupport extends PropertyEditorSupport{
    
    private ImagenFondoPanel ImagenFOondoPnael = new ImagenFondoPanel();
    
    @Override
    public boolean supportsCustomEditor() {
        return true;
    }

    @Override
    public Component getCustomEditor() {
        return ImagenFOondoPnael; //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public Object getValue() {
        return ImagenFOondoPnael.getSelectedValue(); //To change body of generated methods, choose Tools | Templates.
    }
    
    @Override
    public String getJavaInitializationString() {
        return super.getJavaInitializationString(); //To change body of generated methods, choose Tools | Templates.
    } 
}
