/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.login;
import java.awt.Graphics;
import java.util.ArrayList;
import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.UIManager;
import javax.swing.UIManager.LookAndFeelInfo;
import javax.swing.JPanel;
/**
 *
 * @author kevin
 * 
 */

public class Login extends JPanel {
    public static ArrayList<Usuario> usuarios;
    public static ArrayList<Equipo> equipos;
        public static ArrayList<Proyecto> proyectos;

    public static void main(String[] args) {
          
        equipos = new ArrayList<>();    
        usuarios= new ArrayList<>();
        proyectos = new ArrayList<>();
        Log login= new Log();
        
        login.setVisible(true);
        try {
    for (LookAndFeelInfo info : UIManager.getInstalledLookAndFeels()) {
        if ("Nimbus".equals(info.getName())) {
            UIManager.setLookAndFeel(info.getClassName());
            break;
        }
    }
} catch (Exception e) {
    // If Nimbus is not available, you can set the GUI to another look and feel.

    
  


     

        
    }
    }
    
}
