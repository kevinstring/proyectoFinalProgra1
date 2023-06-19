/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package com.mycompany.login;

import java.io.File;
import java.io.FileWriter;
import java.io.PrintWriter;
import java.util.LinkedList;
import javax.swing.JFileChooser;
import javax.swing.filechooser.FileNameExtensionFilter;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableModel;
import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import org.w3c.dom.Document;
import org.w3c.dom.Element;
import org.w3c.dom.Node;
import org.w3c.dom.NodeList;

/**
 *
 * @author kevin
 */
public class SubirXml extends javax.swing.JFrame {
    LinkedList<Usuario> usuarios = new LinkedList<>();

    /**
     * Creates new form SubirXml
     */
    public SubirXml() {
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

        jButton2 = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        jButton4 = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jButton2.setText("Cargar Generado");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton2, new org.netbeans.lib.awtextra.AbsoluteConstraints(107, 112, -1, -1));

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

        getContentPane().add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(408, 6, -1, 275));

        jButton4.setText("Regresar");
        jButton4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton4ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton4, new org.netbeans.lib.awtextra.AbsoluteConstraints(6, 270, -1, -1));

        jLabel1.setIcon(new javax.swing.ImageIcon("/home/kevin/Escritorio/Proyecto/src/main/java/imagenes/plain-smooth-green-wall-texture.jpg")); // NOI18N
        jLabel1.setText("jLabel1");
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 880, 300));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton4ActionPerformed
      this.dispose();
        pantallaPrincipal prin = new pantallaPrincipal();
prin.setVisible(true);        // TODO add your handling code here:
    }//GEN-LAST:event_jButton4ActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
    
        usuarios = new LinkedList<>();
        
        JFileChooser fileChooser = new JFileChooser();
        FileNameExtensionFilter filtro = new FileNameExtensionFilter("Archivos XML", "xml");
        
        fileChooser.setFileFilter(filtro);
        
        int seleccion = fileChooser.showOpenDialog(this);
        
        if(seleccion == JFileChooser.APPROVE_OPTION){
            File archivo = fileChooser.getSelectedFile();
            leerXml(archivo);
        }        // TODO add your handling code here:
    }//GEN-LAST:event_jButton2ActionPerformed

    /**
     * @param args the command line arguments
     */
    private void escribirXml(File archivo){
    
        FileWriter fichero = null;
        PrintWriter pw = null;
        
        try {
            
              fichero = new FileWriter(archivo);
              pw = new PrintWriter(fichero);
              
              pw.println("<equipos>");
              int cont = 0;
              for(Equipo p : Login.equipos){
              
                  pw.println("<equipo id=\""+p.getId()+"\"  nombre=\""+p.getNombre()+"\" lider=\""+p.getLider().getCorreo()+"\">");
                  
                  pw.println("<miembro>"+p.getMiembro().get(cont).getCorreo()+"</miembro>");
               
                  pw.println("</equipo>");
                  cont++;
              }
              
              pw.println("</equipos>");
            
        } catch (Exception e) {
            e.printStackTrace();
        }
        finally{
            try {
                if(fichero!=null){
                    fichero.close();
                }
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
        
    }
    private void leerXml(File archivo) {
    try {
        DocumentBuilderFactory dbFactory = DocumentBuilderFactory.newInstance();
        DocumentBuilder dbBuilder = dbFactory.newDocumentBuilder();
        Document doc = dbBuilder.parse(archivo);

        doc.getDocumentElement().normalize();

        NodeList equipoList = doc.getElementsByTagName("equipo");

        for (int i = 0; i < equipoList.getLength(); i++) {
            Node nNode = equipoList.item(i);

            if (nNode.getNodeType() == Node.ELEMENT_NODE) {
                Element equipoElement = (Element) nNode;
                System.out.println(equipoElement.getAttribute("lider"));

                Equipo p = new Equipo();
                p.setId(Integer.parseInt(equipoElement.getAttribute("id")));
                p.setNombre(equipoElement.getAttribute("nombre"));
                p.setEstado(equipoElement.getAttribute("estado"));
                String liderCorreo = equipoElement.getAttribute("lider");

                for (Usuario user : Login.usuarios) {
                    System.out.println(user.getCorreo());

                    if (user.getCorreo().equals(liderCorreo)) {
                        p.setLider(user);
                        System.out.println(equipoElement.getElementsByTagName("correo").item(i).getTextContent());
                    } else {
                        System.out.println("EEFEE");
                    }

                    NodeList correoList = equipoElement.getElementsByTagName("correo");
                    for (int j = 0; j < correoList.getLength(); j++) {
                        Element correoElement = (Element) correoList.item(j);
                        String correo = correoElement.getTextContent();

                        if (user.getCorreo().equals(correo)) {
                            p.agregarMiembro(user);
                            System.out.println(user.getCorreo() + "AA");
                        }
                    }
                }

                Login.equipos.add(p);
            }
        }

        llenarTabla();
    } catch (Exception ex) {
        ex.printStackTrace();
    }
}

      
   
     private void llenarTabla() {
DefaultTableModel table = new DefaultTableModel(new String[]{"Nombre", "Lider", "Miembro", "Id","estado"}, Login.equipos.size());
jTable1.setModel(table);

TableModel modelo = jTable1.getModel();

for (int i = 0; i < Login.equipos.size(); i++) {
    Equipo u = Login.equipos.get(i);

    modelo.setValueAt(u.getNombre(), i, 0);
    modelo.setValueAt(u.getLider().getCorreo(), i, 1);
    StringBuilder miembros = new StringBuilder();
    for (Usuario miembro : u.getMiembro()) {
        miembros.append(miembro.getCorreo()).append(", ");
    }
    modelo.setValueAt(miembros.toString(), i, 2);

    modelo.setValueAt(u.getId(), i, 3);
        modelo.setValueAt(u.getEstado(), i, 4);

}

    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton4;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jTable1;
    // End of variables declaration//GEN-END:variables
}
