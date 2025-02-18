/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package Estructuras;

import static Estructuras.AlcanceDeSucursal.grafo;
import Estructuras.Lista;
import Estructuras.NodoEstacion;
import org.graphstream.graph.Graph;
import org.graphstream.graph.implementations.SingleGraph;

/**
 *
 * @author
 */
public class GestionSucursales extends javax.swing.JFrame {

    public static Grafo grafo;

    /**
     * Creates new form GestionSucursales
     */
    public GestionSucursales(Grafo grafo) {
        initComponents();
        this.grafo = grafo;
        this.setVisible(true);

    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jButton1 = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        jButton2 = new javax.swing.JButton();
        jButton3 = new javax.swing.JButton();
        jButton4 = new javax.swing.JButton();
        jButton5 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jButton1.setFont(new java.awt.Font("Nirmala UI", 1, 24)); // NOI18N
        jButton1.setText("ATRAS");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(910, 20, -1, -1));

        jLabel1.setFont(new java.awt.Font("Nirmala UI", 1, 36)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("GESTION SUCURSALES");
        jPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(290, 50, -1, -1));

        jButton2.setFont(new java.awt.Font("Nirmala UI", 1, 24)); // NOI18N
        jButton2.setText("AGREGAR SUCURSAL");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton2, new org.netbeans.lib.awtextra.AbsoluteConstraints(340, 200, -1, -1));

        jButton3.setFont(new java.awt.Font("Nirmala UI", 1, 24)); // NOI18N
        jButton3.setText("CAMBIAR RADIO \"T\"");
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton3, new org.netbeans.lib.awtextra.AbsoluteConstraints(340, 270, -1, -1));

        jButton4.setFont(new java.awt.Font("Nirmala UI", 1, 24)); // NOI18N
        jButton4.setText("VER ALCANCE DE SUCURSAL");
        jButton4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton4ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton4, new org.netbeans.lib.awtextra.AbsoluteConstraints(310, 340, -1, -1));

        jButton5.setFont(new java.awt.Font("Nirmala UI", 1, 24)); // NOI18N
        jButton5.setText("MOSTRAR GRAFO");
        jButton5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton5ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton5, new org.netbeans.lib.awtextra.AbsoluteConstraints(360, 410, -1, -1));

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1030, 500));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:
        MenuInicial m = new MenuInicial(grafo);
        this.dispose();
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        // TODO add your handling code here:
        AgregarSucursal a = new AgregarSucursal(grafo);
        this.dispose();
    }//GEN-LAST:event_jButton2ActionPerformed

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
        // TODO add your handling code here:
        CambiarT c = new CambiarT(grafo);
        this.dispose();
    }//GEN-LAST:event_jButton3ActionPerformed

    private void jButton4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton4ActionPerformed
        // TODO add your handling code here:
        AlcanceDeSucursal a = new AlcanceDeSucursal(grafo);
        this.dispose();
    }//GEN-LAST:event_jButton4ActionPerformed

    private void jButton5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton5ActionPerformed
        // TODO add your handling code here:

        // Crear un grafo de ejemplo
        Graph graph = new SingleGraph("Ejemplo de Grafo");

        // Añadir nodos
        for (int i = 0; i < grafo.max; i++) {
            if (!grafo.vertices[i].nombreEstacion.equals("")) {
                graph.addNode(grafo.vertices[i].nombreEstacion);
                graph.getNode(grafo.vertices[i].nombreEstacion).setAttribute("ui.label", grafo.vertices[i].nombreEstacion); // Establecer el nombre del nodo
                graph.getNode(grafo.vertices[i].nombreEstacion).setAttribute("ui.style", "fill-color: blue;"); // Color de los nodos
            }
        }

        // Añadir aristas
        for (int i = 0; i < grafo.max; i++) {
            if (!grafo.vertices[i].nombreEstacion.equals("")) {
                NodoEstacion aux = grafo.vertices[i].adyacentes.primero;
                while (aux != null) {
                    try {
                        graph.addEdge(grafo.vertices[i].nombreEstacion + aux.estacion.nombreEstacion,
                                grafo.vertices[i].nombreEstacion,
                                aux.estacion.nombreEstacion);
                    } catch (Exception e) {
                        // Manejo de excepciones si es necesario
                    }
                    aux = aux.sig;
                }
            }
        }
        FuncionesSucursal f = new FuncionesSucursal(grafo);

        for (int i = 0; i < grafo.max; i++) {
            if (grafo.vertices[i].esSucursal) {
                Lista lista = f.profundidad(grafo.vertices[i].nombreEstacion);
                NodoEstacion temp = lista.primero;
                while (temp != null) {
                   
                    graph.getNode(temp.estacion.nombreEstacion).setAttribute("ui.style", "fill-color: red;");

                    temp = temp.sig;
                }
            }
        }
        for (int i = 0; i < grafo.max; i++) {
            if (grafo.vertices[i].esSucursal) {
                                    graph.getNode(grafo.vertices[i].nombreEstacion).setAttribute("ui.style", "fill-color: green;");

            }
        
        }
        // Establecer propiedades de visualización
        graph.setAttribute("ui.stylesheet",
                "node { size: 10px; text-alignment: under; } "
                + // Tamaño de los nodos
                "node.label { fill-color: white; size: 20px; } "
                + // Color y tamaño de la etiqueta
                "edge { fill-color: gray; }");

        // Ajustar el layout para evitar superposición
        graph.setAttribute("ui.quality");
        graph.setAttribute("ui.antialias");
        graph.setAttribute("ui.layout", "force");
        graph.setAttribute("ui.layout.force.springLength", 100); // Distancia entre nodos
        graph.setAttribute("ui.layout.force.springConstant", 0.1); // Constante de resorte

        // Crear un Viewer para mostrar el grafo
        System.setProperty("org.graphstream.ui", "swing");
        graph.display();


    }//GEN-LAST:event_jButton5ActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(GestionSucursales.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(GestionSucursales.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(GestionSucursales.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(GestionSucursales.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new GestionSucursales(grafo).setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JButton jButton4;
    private javax.swing.JButton jButton5;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JPanel jPanel1;
    // End of variables declaration//GEN-END:variables
}
