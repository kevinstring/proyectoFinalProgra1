/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package com.mycompany.login;
import java.io.File;
import java.io.FileWriter;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import javax.swing.JFileChooser;
import javax.swing.JOptionPane;
import javax.swing.filechooser.FileNameExtensionFilter;
import javax.swing.table.DefaultTableModel;
import org.json.simple.JSONArray;
import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;
import org.json.simple.parser.ParseException;
/**
 *
 * @author herma
 */
public class JsonLectura extends javax.swing.JFrame {
    private Usuario usuario;
   private Tareas tare;
   private Proyecto pro;
   private Actualizable actualizable;
    /**
     * Creates new form JsonLectura
     */
    public JsonLectura(Usuario user) {
        this.usuario = user;
            initComponents();
                        setLocationRelativeTo(null);

         for(Proyecto p : Login.proyectos){
         

            if(p.getEquipoAsignado().getLider().getUsuario().equals(this.usuario.getUsuario())){
            comboProyectos.addItem(p.getNombreProyecto());
       
            }
            
        }
            
    }
    
    private static void leer(){
        
        JSONObject tarea = new JSONObject();
        try(FileWriter file = new FileWriter ("tareas.json")){
            file.write(tarea.toString());
            file.flush();
        }catch(IOException e){
            e.printStackTrace();
        }
    }
    
 private  void mostrarInf(File archivo) {
     

JSONParser parser = new JSONParser();

try (FileReader reader = new FileReader(archivo)) {
    JSONArray tareasArray = (JSONArray) parser.parse(reader);

    for (Object tareaObj : tareasArray) {
        JSONObject tarea = (JSONObject) tareaObj;
        String comboProyecto = comboProyectos.getSelectedItem().toString();
        int id =Integer.parseInt( tarea.get("id").toString());
        String titulo = tarea.get("titulo").toString();
        String descripcion = tarea.get("descripcion").toString();
        String fechaInicio = tarea.get("fechaInicio").toString();
        String fechaFin = tarea.get("fechaFin").toString();
        String estado = tarea.get("estado").toString();
        String usuarioAsignado = tarea.get("usuarioAsignado").toString();
        String estadoDeTarea = tarea.get("estadoDeTarea").toString();
           Proyecto pro =null;
        Tareas tare = new Tareas();
        tare.setId(id);
        tare.setNombreTarea(titulo);
        tare.setFechaInicio(fechaInicio);
        tare.setFechaFin(fechaFin);
                tare.setStatus(estado);
                tare.setDescripcion(descripcion);
tare.setEstadoDeTareas(estadoDeTarea);
tare.setId(id);
    //     for(Usuario u:proy.getEquipoAsignado().getMiembro()){
    //                    
    //                        if(usuarioAsignado.equals(u.getUsuario())){
    //                    pro.asignarTarea(tare);
    //                   tare.setEquipoAsignado(pro.getEquipoAsignado());
    //                   
    //                   tare.setMiembro(u);
    //
    //                }
    //                }
            JsonLectura lec = new JsonLectura( usuario );
     for(Proyecto p: Login.proyectos){
        
         System.out.println("Hola estoy en for");
                        if(p.getEquipoAsignado().getLider().getUsuario().equals(lec.usuario.getUsuario())){
                            
         System.out.println("Hola estoy en if");
                                pro = p;
                        
                            System.out.println(p.getEquipoAsignado().getLider() + lec.usuario.getUsuario().toString());
      
                           for(Usuario miem: pro.getEquipoAsignado().getMiembro()){
                            if(miem.getCorreo().equals(usuarioAsignado)){
                                  System.out.println("Hola estoy en if2");
                                  if(pro.getNombreProyecto().equals(comboProyecto)){
                                          pro.asignarTarea(tare);
                                            tare.setEquipoAsignado(pro.getEquipoAsignado());
                                tare.setProyectoAsignado(pro);
                   tare.setMiembro(miem);
                     Login.tareas.add(tare);
                     JOptionPane.showMessageDialog(this, "Tareas asignadas al proyecto y usuarios");
                                  } else{
                                      JOptionPane.showMessageDialog(this, "nelson");
                                  }
                            
                              
                            }

                           }
         
            }   }
    


        System.out.println("ID: " + id);
        System.out.println("Título: " + titulo);
        System.out.println("Descripción: " + descripcion);
        System.out.println("Fecha de Inicio: " + fechaInicio);
        System.out.println("Fecha de Fin: " + fechaFin);
        System.out.println("Estado: " + estado);
        System.out.println("Usuarios Asignados: " + usuarioAsignado);
        System.out.println("----------------------------------------");
    }
} catch (IOException | ParseException ex) {
    ex.printStackTrace();
}


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
        jTable1 = new javax.swing.JTable();
        jButton2 = new javax.swing.JButton();
        comboProyectos = new javax.swing.JComboBox<>();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jButton1.setText("Cargar Json");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(92, 285, -1, -1));

        jScrollPane1.setBackground(new java.awt.Color(204, 255, 255));

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
        jScrollPane1.setViewportView(jTable1);

        getContentPane().add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(247, 49, 580, -1));

        jButton2.setText("Salir");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton2, new org.netbeans.lib.awtextra.AbsoluteConstraints(6, 6, -1, -1));

        comboProyectos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                comboProyectosActionPerformed(evt);
            }
        });
        getContentPane().add(comboProyectos, new org.netbeans.lib.awtextra.AbsoluteConstraints(92, 220, 110, -1));

        jLabel1.setText("Selecciona tu proyecto");
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(83, 184, -1, -1));

        jLabel2.setIcon(new javax.swing.ImageIcon("/home/kevin/Escritorio/Proyecto/src/main/java/imagenes/plain-smooth-green-wall-texture.jpg")); // NOI18N
        jLabel2.setText("jLabel2");
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 840, 610));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
//                usuarios = new LinkedList<>();


        JsonLectura lec = new JsonLectura( usuario );
        System.out.println("Este es el dato : " + lec.usuario.getUsuario());    
        
        JFileChooser fileChooser = new JFileChooser();
        FileNameExtensionFilter filtro = new FileNameExtensionFilter("Archivos JSON", "js");
        
        fileChooser.setFileFilter(filtro);
        
        int seleccion = fileChooser.showOpenDialog(this);
        
        if(seleccion == JFileChooser.APPROVE_OPTION){
           System.out.println("SI");
               File archivo = fileChooser.getSelectedFile();
               
            mostrarInf(archivo);
            mostrarTareasEnTabla(archivo);
            
        }        // TODO add your handling code here:
    }//GEN-LAST:event_jButton1ActionPerformed
public interface Actualizable {
    void actualizarTabla();
}
public void setActualizable(Actualizable actualizable) {
    this.actualizable = actualizable;
}
    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
            this.dispose();        // TODO add your handling code here:
    }//GEN-LAST:event_jButton2ActionPerformed

    private void comboProyectosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_comboProyectosActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_comboProyectosActionPerformed
private void mostrarTareasEnTabla(File archivo) {
    JSONParser parser = new JSONParser();
    
    try (FileReader reader = new FileReader(archivo)) {
        JSONArray tareasArray = (JSONArray) parser.parse(reader);
        
        DefaultTableModel tableModel = new DefaultTableModel();
        tableModel.addColumn("ID");
        tableModel.addColumn("Título");
        tableModel.addColumn("Descripción");
        tableModel.addColumn("Fecha de Inicio");
        tableModel.addColumn("Fecha de Fin");
        tableModel.addColumn("Estado");
        tableModel.addColumn("Usuario Asignado");
        tableModel.addColumn("EstadoDeTarea");
        for (Object tareaObj : tareasArray) {
            JSONObject tarea = (JSONObject) tareaObj;
            
            String id = tarea.get("id").toString();
            String titulo = tarea.get("titulo").toString();
            String descripcion = tarea.get("descripcion").toString();
            String fechaInicio = tarea.get("fechaInicio").toString();
            String fechaFin = tarea.get("fechaFin").toString();
            String estado = tarea.get("estado").toString();
            String usuarioAsignado = tarea.get("usuarioAsignado").toString();
            String estadoDeTarea = tarea.get("estadoDeTarea").toString();
            tableModel.addRow(new Object[]{id, titulo, descripcion, fechaInicio, fechaFin, estado, usuarioAsignado, estadoDeTarea});
        }
        
        jTable1.setModel(tableModel);
    } catch (IOException | ParseException ex) {
        ex.printStackTrace();
    }
}
    /**
     * @param args the command line arguments
     */

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JComboBox<String> comboProyectos;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jTable1;
    // End of variables declaration//GEN-END:variables
}
