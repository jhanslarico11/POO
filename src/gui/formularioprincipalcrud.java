/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package gui;

/**
 *
 * @author Maruja
 */
public class formularioprincipalcrud extends javax.swing.JFrame {

    /**
     * Creates new form formularioprincipalcrud
     */
    public formularioprincipalcrud() {
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

        jDesktopPane1 = new javax.swing.JDesktopPane();
        jMenuBar1 = new javax.swing.JMenuBar();
        jMenu1 = new javax.swing.JMenu();
        jMenuItem1 = new javax.swing.JMenuItem();
        jMenu2 = new javax.swing.JMenu();
        jMenuItem2_agregar = new javax.swing.JMenuItem();
        jMenuItem2_reportar = new javax.swing.JMenuItem();
        jMenuItem2_modificar = new javax.swing.JMenuItem();
        jMenuItem2_eliminar = new javax.swing.JMenuItem();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        javax.swing.GroupLayout jDesktopPane1Layout = new javax.swing.GroupLayout(jDesktopPane1);
        jDesktopPane1.setLayout(jDesktopPane1Layout);
        jDesktopPane1Layout.setHorizontalGroup(
            jDesktopPane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 1367, Short.MAX_VALUE)
        );
        jDesktopPane1Layout.setVerticalGroup(
            jDesktopPane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 656, Short.MAX_VALUE)
        );

        jMenu1.setText("File");

        jMenuItem1.setText("salir");
        jMenuItem1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem1ActionPerformed(evt);
            }
        });
        jMenu1.add(jMenuItem1);

        jMenuBar1.add(jMenu1);

        jMenu2.setText("crud");

        jMenuItem2_agregar.setText("agregar");
        jMenuItem2_agregar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem2_agregarActionPerformed(evt);
            }
        });
        jMenu2.add(jMenuItem2_agregar);

        jMenuItem2_reportar.setText("Reportar");
        jMenuItem2_reportar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem2_reportarActionPerformed(evt);
            }
        });
        jMenu2.add(jMenuItem2_reportar);

        jMenuItem2_modificar.setText("modificar");
        jMenuItem2_modificar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem2_modificarActionPerformed(evt);
            }
        });
        jMenu2.add(jMenuItem2_modificar);

        jMenuItem2_eliminar.setText("eliminar");
        jMenuItem2_eliminar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem2_eliminarActionPerformed(evt);
            }
        });
        jMenu2.add(jMenuItem2_eliminar);

        jMenuBar1.add(jMenu2);

        setJMenuBar(jMenuBar1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jDesktopPane1)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jDesktopPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jMenuItem1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem1ActionPerformed
System.exit(0);        // TODO add your handling code here:
    }//GEN-LAST:event_jMenuItem1ActionPerformed

    private void jMenuItem2_agregarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem2_agregarActionPerformed
       agregar agr = new agregar();
        jDesktopPane1.add(agr);
        agr.show();
    }//GEN-LAST:event_jMenuItem2_agregarActionPerformed

    private void jMenuItem2_reportarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem2_reportarActionPerformed
    Reportar re = new Reportar();
        jDesktopPane1.add(re);
        re.show();
    }//GEN-LAST:event_jMenuItem2_reportarActionPerformed

    private void jMenuItem2_modificarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem2_modificarActionPerformed
        Modificar mo = new Modificar();
        jDesktopPane1.add(mo);
        mo.show();
    }//GEN-LAST:event_jMenuItem2_modificarActionPerformed

    private void jMenuItem2_eliminarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem2_eliminarActionPerformed
        Eliminar eli = new Eliminar();
        jDesktopPane1.add(eli);
        eli.show();
    }//GEN-LAST:event_jMenuItem2_eliminarActionPerformed

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
            java.util.logging.Logger.getLogger(formularioprincipalcrud.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(formularioprincipalcrud.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(formularioprincipalcrud.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(formularioprincipalcrud.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new formularioprincipalcrud().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JDesktopPane jDesktopPane1;
    private javax.swing.JMenu jMenu1;
    private javax.swing.JMenu jMenu2;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JMenuItem jMenuItem1;
    private javax.swing.JMenuItem jMenuItem2_agregar;
    private javax.swing.JMenuItem jMenuItem2_eliminar;
    private javax.swing.JMenuItem jMenuItem2_modificar;
    private javax.swing.JMenuItem jMenuItem2_reportar;
    // End of variables declaration//GEN-END:variables
}
