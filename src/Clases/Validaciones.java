/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Clases;

import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;
import java.util.regex.Pattern;
import javax.swing.JOptionPane;
import javax.swing.JTextField;

/**
 *
 * @author PC-7
 */
public class Validaciones {
    
    //Metodo que permite el igreso de solo numeros
    public void ValiNumeros(JTextField aj){
        aj.addKeyListener(new KeyAdapter() {
            public void keyTyped(KeyEvent e){
                char letra =e.getKeyChar();
                if (Character.isLetter(letra) || Character.isSpace(letra)){
                    aj.getToolkit().beep();
                    JOptionPane.showMessageDialog(null, "Ingrese solo Numeros");
                    e.consume();
                }
            }
     });    
    }  
    
    
    //Metodo que permite el igreso de solo letras
      public void ValiLetras(JTextField aj){
        aj.addKeyListener(new KeyAdapter() {
            public void keyTyped(KeyEvent e){
                char letra =e.getKeyChar();
                if (Character.isDigit(letra)){
                    aj.getToolkit().beep();
                    JOptionPane.showMessageDialog(null, "Ingrese solo Letras");
                    e.consume();
                }
            }
     });
        
    }
      
      //Metodo que permite el igreso de solo un numero de caracteres
       public void Espacios(JTextField aj,int limite){
        aj.addKeyListener(new KeyAdapter() {
            public void keyTyped(KeyEvent e){
                if (aj.getText().length()==limite){
                    aj.getToolkit().beep();
                    JOptionPane.showMessageDialog(null, "No se permiten ingresar\n más digitos");
                    e.consume();
                }
            }
     });
        
    }   
       //Metodo que permite que lo que ingrese se vuelva mayuscula
        public void ValiMayus(JTextField aj){
        aj.addKeyListener(new KeyAdapter() {
            public void keyTyped(KeyEvent e){
                char c =e.getKeyChar();
                if(Character.isLowerCase(c)){
                    String cad=(""+c).toUpperCase(); 
                    e.setKeyChar(c);
                }
            }
     });
        
    } 
        
        
    
}
