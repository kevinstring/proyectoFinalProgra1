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
         public static ArrayList<Tareas> tareas;
    public static void main(String[] args) {
          
        equipos = new ArrayList<>();    
        usuarios= new ArrayList<>();
        proyectos = new ArrayList<>();
        tareas = new ArrayList<>(); 
        Log login= new Log();
        
        login.setVisible(true);
 
    }
    
}
