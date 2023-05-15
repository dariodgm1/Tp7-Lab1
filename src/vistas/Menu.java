/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package vistas;

import tp7.lab1.*;

/**
 *
 * @author ciro2
 */
public class Menu extends javax.swing.JFrame {

    /**
     * Creates new form Menu
     */
        
      
        private static Alumno miAlumno=new Alumno();
        public static Alumno getAlumno(){
        return miAlumno;               
        }
        
//              private static Directorio miDirectorio = new Directorio();
//        
//        public static Directorio getDirectorio(){
//        return miDirectorio;               
//        }
        
        
    public Menu() {
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jMenuBar2 = new javax.swing.JMenuBar();
        jMenu3 = new javax.swing.JMenu();
        jMenu4 = new javax.swing.JMenu();
        escritorio = new javax.swing.JDesktopPane();
        jMenuBar1 = new javax.swing.JMenuBar();
        jMAdministracion = new javax.swing.JMenu();
        jMFormularioM = new javax.swing.JMenuItem();
        jMFormularioA = new javax.swing.JMenuItem();
        jMFormularioI = new javax.swing.JMenuItem();
        jMAyuda = new javax.swing.JMenu();
        jMSalir = new javax.swing.JMenu();
        jMSalirS = new javax.swing.JMenuItem();

        jMenu3.setText("File");
        jMenuBar2.add(jMenu3);

        jMenu4.setText("Edit");
        jMenuBar2.add(jMenu4);

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        javax.swing.GroupLayout escritorioLayout = new javax.swing.GroupLayout(escritorio);
        escritorio.setLayout(escritorioLayout);
        escritorioLayout.setHorizontalGroup(
            escritorioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 400, Short.MAX_VALUE)
        );
        escritorioLayout.setVerticalGroup(
            escritorioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 274, Short.MAX_VALUE)
        );

        jMAdministracion.setText("Administracion");

        jMFormularioM.setText("Formulario de Materias");
        jMFormularioM.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMFormularioMActionPerformed(evt);
            }
        });
        jMAdministracion.add(jMFormularioM);

        jMFormularioA.setText("Formulario de Alumnos");
        jMFormularioA.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMFormularioAActionPerformed(evt);
            }
        });
        jMAdministracion.add(jMFormularioA);

        jMFormularioI.setText("Formulario de Inscripcion");
        jMFormularioI.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMFormularioIActionPerformed(evt);
            }
        });
        jMAdministracion.add(jMFormularioI);

        jMenuBar1.add(jMAdministracion);

        jMAyuda.setText("Ayuda");
        jMenuBar1.add(jMAyuda);

        jMSalir.setText("Salir");

        jMSalirS.setText("Salir del sistema");
        jMSalirS.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMSalirSActionPerformed(evt);
            }
        });
        jMSalir.add(jMSalirS);

        jMenuBar1.add(jMSalir);

        setJMenuBar(jMenuBar1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(escritorio)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(escritorio)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jMFormularioMActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMFormularioMActionPerformed
        escritorio.removeAll();
        escritorio.repaint();
        Materias vac=new Materias();
        vac.setVisible(true);
        escritorio.add(vac);
        escritorio.moveToFront(vac);

        // TODO add your handling code here:
    }//GEN-LAST:event_jMFormularioMActionPerformed

    private void jMFormularioAActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMFormularioAActionPerformed
             escritorio.removeAll();
        escritorio.repaint();
        Alumnos va=new Alumnos();
        va.setVisible(true);
        escritorio.add(va);
        escritorio.moveToFront(va);
        // TODO add your handling code here:
    }//GEN-LAST:event_jMFormularioAActionPerformed

    private void jMFormularioIActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMFormularioIActionPerformed
       escritorio.removeAll();
        escritorio.repaint();
        Inscripcion vai=new Inscripcion();
        vai.setVisible(true);
        escritorio.add(vai);
        escritorio.moveToFront(vai);
        // TODO add your handling code here:
    }//GEN-LAST:event_jMFormularioIActionPerformed

    private void jMSalirSActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMSalirSActionPerformed
               dispose();
        // TODO add your handling code here:
    }//GEN-LAST:event_jMSalirSActionPerformed

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
            java.util.logging.Logger.getLogger(Menu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Menu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Menu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Menu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Menu().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JDesktopPane escritorio;
    private javax.swing.JMenu jMAdministracion;
    private javax.swing.JMenu jMAyuda;
    private javax.swing.JMenuItem jMFormularioA;
    private javax.swing.JMenuItem jMFormularioI;
    private javax.swing.JMenuItem jMFormularioM;
    private javax.swing.JMenu jMSalir;
    private javax.swing.JMenuItem jMSalirS;
    private javax.swing.JMenu jMenu3;
    private javax.swing.JMenu jMenu4;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JMenuBar jMenuBar2;
    // End of variables declaration//GEN-END:variables
}