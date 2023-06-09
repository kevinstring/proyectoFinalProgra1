/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package com.mycompany.login;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import javax.swing.JFileChooser;
import javax.swing.filechooser.FileNameExtensionFilter;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author kevin
 */
public class LeerArchiv extends javax.swing.JFrame {

    /**
     * Creates new form LeerArchiv
     */
    public LeerArchiv() {
        initComponents();
         setLocationRelativeTo(null);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jButton1 = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTextArea1 = new javax.swing.JTextArea();
        jScrollPane2 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        jButton2 = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jButton1.setText("Abrir");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(6, 19, -1, -1));

        jTextArea1.setColumns(20);
        jTextArea1.setRows(5);
        jScrollPane1.setViewportView(jTextArea1);

        getContentPane().add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(6, 61, 280, 217));

        jTable1.setBackground(new java.awt.Color(153, 255, 255));
        jTable1.setForeground(new java.awt.Color(0, 0, 0));
        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        jScrollPane2.setViewportView(jTable1);

        getContentPane().add(jScrollPane2, new org.netbeans.lib.awtextra.AbsoluteConstraints(298, 32, 562, 400));

        jButton2.setText("Salir");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton2, new org.netbeans.lib.awtextra.AbsoluteConstraints(790, 0, -1, -1));

        jLabel1.setIcon(new javax.swing.ImageIcon("/home/kevin/Escritorio/Proyecto/src/main/java/imagenes/plain-smooth-green-wall-texture.jpg")); // NOI18N
        jLabel1.setText("jLabel1");
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 870, 440));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
    JFileChooser jfc = new JFileChooser();
        FileNameExtensionFilter fef = new FileNameExtensionFilter("Seleccionar archivo CSV", "csv");
        jfc.setFileFilter(fef);
        
        int seleccion = jfc.showOpenDialog(this);
        
        if(seleccion == JFileChooser.APPROVE_OPTION){
            File f = jfc.getSelectedFile();
            String texto = leerArchivoTexto(f.getPath());
            jTextArea1.setText(texto);
            
            DefaultTableModel data = new DefaultTableModel(new String[]{"Nombre","Apellido","Correo","Rol","Password","id"},Login.usuarios.size());
        jTable1.setModel(data);
        
        int i = 0;
        for(Usuario c : Login.usuarios){
            jTable1.setValueAt(c.getUsuario(), i, 0);
            jTable1.setValueAt(c.getApellido(), i, 1);
            jTable1.setValueAt(c.getCorreo(), i, 2);
            jTable1.setValueAt(c.getRol(), i, 3);
            jTable1.setValueAt(c.getPassword(), i, 4);
                     jTable1.setValueAt(c.getId(), i, 5);
                     
            i++;
        }
            
        }
                // TODO add your handling code here:
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
         this.dispose();        // TODO add your handling code here:
         Login log = new Login();
    }//GEN-LAST:event_jButton2ActionPerformed
 public String leerArchivoTexto(String ruta){
    
        String contenido = "";
        try{
         File f  = new File(ruta);
         FileReader fr = new FileReader(f);
         BufferedReader br = new BufferedReader(fr);
         String linea;
         int id=0;
         while((linea = br.readLine())!=null){
             contenido+=linea+"\n";
             System.out.print(contenido);
             Usuario u = new Usuario();
             String[] campos = linea.split("\\|");
             id++;

             u.setUsuario(campos[0]);
             u.setApellido(campos[1]);
             u.setCorreo(campos[2]);
             u.setRol(campos[3]);
             u.setPassword(campos[4]);
       
                             u.setId(id);

            
             Login.usuarios.add(u);
             
        }
        }catch(Exception e){
            System.out.println("Error al leer el archivo: "+e.toString());
        }
              
        return contenido;
    }
    /**
     * @param args the command line arguments
     */
 

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTable jTable1;
    private javax.swing.JTextArea jTextArea1;
    // End of variables declaration//GEN-END:variables
}
