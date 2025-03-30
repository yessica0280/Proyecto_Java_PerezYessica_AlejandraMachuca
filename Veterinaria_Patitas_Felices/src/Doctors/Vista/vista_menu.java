/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package Doctors.Vista;

import Doctors.Controlador.controladorProcedures;
import Doctors.Controlador.controlador_Vaccine;
import Doctors.Controlador.controlador_add;
import Doctors.Controlador.controlador_view;
import Doctors.Controlador.controlador_update;
import Doctors.Modelo.Consultas;
import Doctors.Modelo.Doctors;
import Doctors.Modelo.Pets;
import Doctors.Modelo.Procedures;
import Doctors.Modelo.Vaccine_History;

/**
 *
 * @author Usuario
 */
public class vista_menu extends javax.swing.JFrame {

    /**
     * Creates new form vista_menu
     */
    public vista_menu() {
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

        panel1m = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        panel2m = new javax.swing.JPanel();
        view = new javax.swing.JButton();
        update = new javax.swing.JButton();
        add = new javax.swing.JButton();
        jLabel3 = new javax.swing.JLabel();
        addvac = new javax.swing.JButton();
        addpro = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        panel1m.setBackground(new java.awt.Color(153, 153, 255));

        jLabel1.setFont(new java.awt.Font("Segoe Print", 0, 24)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("Menú Doctors");

        javax.swing.GroupLayout panel1mLayout = new javax.swing.GroupLayout(panel1m);
        panel1m.setLayout(panel1mLayout);
        panel1mLayout.setHorizontalGroup(
            panel1mLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panel1mLayout.createSequentialGroup()
                .addGap(304, 304, 304)
                .addComponent(jLabel1)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        panel1mLayout.setVerticalGroup(
            panel1mLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panel1mLayout.createSequentialGroup()
                .addGap(42, 42, 42)
                .addComponent(jLabel1)
                .addContainerGap(42, Short.MAX_VALUE))
        );

        panel2m.setBackground(new java.awt.Color(255, 255, 255));

        view.setBackground(new java.awt.Color(153, 153, 255));
        view.setFont(new java.awt.Font("Segoe Print", 0, 18)); // NOI18N
        view.setForeground(new java.awt.Color(255, 255, 255));
        view.setText("View Doctors");
        view.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                viewActionPerformed(evt);
            }
        });

        update.setBackground(new java.awt.Color(153, 153, 255));
        update.setFont(new java.awt.Font("Segoe Print", 0, 18)); // NOI18N
        update.setForeground(new java.awt.Color(255, 255, 255));
        update.setText("Update Doctors");
        update.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                updateActionPerformed(evt);
            }
        });

        add.setBackground(new java.awt.Color(153, 153, 255));
        add.setFont(new java.awt.Font("Segoe Print", 0, 18)); // NOI18N
        add.setForeground(new java.awt.Color(255, 255, 255));
        add.setText("Add Pets");
        add.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                addActionPerformed(evt);
            }
        });

        jLabel3.setIcon(new javax.swing.ImageIcon("C:\\Users\\Usuario\\OneDrive\\Escritorio\\Proyecto_Java_PerezYessica_AlejandraMachuca\\Veterinaria_Patitas_Felices\\src\\Doctors1\\imagen\\descarga__4_-removebg-preview.png")); // NOI18N
        jLabel3.setText("jLabel3");

        addvac.setBackground(new java.awt.Color(153, 153, 255));
        addvac.setFont(new java.awt.Font("Segoe Print", 0, 18)); // NOI18N
        addvac.setForeground(new java.awt.Color(255, 255, 255));
        addvac.setText("Add Vaccine");
        addvac.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                addvacActionPerformed(evt);
            }
        });

        addpro.setBackground(new java.awt.Color(153, 153, 255));
        addpro.setFont(new java.awt.Font("Segoe Print", 0, 18)); // NOI18N
        addpro.setForeground(new java.awt.Color(255, 255, 255));
        addpro.setText("Add Procedure");
        addpro.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                addproActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout panel2mLayout = new javax.swing.GroupLayout(panel2m);
        panel2m.setLayout(panel2mLayout);
        panel2mLayout.setHorizontalGroup(
            panel2mLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panel2mLayout.createSequentialGroup()
                .addGap(138, 138, 138)
                .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 501, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(panel2mLayout.createSequentialGroup()
                .addGap(61, 61, 61)
                .addGroup(panel2mLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(addvac)
                    .addComponent(view))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 102, Short.MAX_VALUE)
                .addComponent(update)
                .addGap(86, 86, 86)
                .addGroup(panel2mLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(add, javax.swing.GroupLayout.PREFERRED_SIZE, 127, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(addpro))
                .addGap(75, 75, 75))
        );
        panel2mLayout.setVerticalGroup(
            panel2mLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panel2mLayout.createSequentialGroup()
                .addGroup(panel2mLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(panel2mLayout.createSequentialGroup()
                        .addGap(28, 28, 28)
                        .addGroup(panel2mLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(view, javax.swing.GroupLayout.PREFERRED_SIZE, 52, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(add, javax.swing.GroupLayout.PREFERRED_SIZE, 52, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 51, Short.MAX_VALUE)
                        .addGroup(panel2mLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(addvac, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 49, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(addpro, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 49, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED))
                    .addGroup(panel2mLayout.createSequentialGroup()
                        .addGap(70, 70, 70)
                        .addComponent(update, javax.swing.GroupLayout.PREFERRED_SIZE, 52, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                .addComponent(jLabel3)
                .addContainerGap())
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(panel1m, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(panel2m, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(panel1m, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(panel2m, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void viewActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_viewActionPerformed
        // TODO add your handling code here:
        vista_view vistav = new vista_view();
        Consultas consultas = new Consultas();
        Doctors doctors = new Doctors();
        controlador_view controladorv = new controlador_view(vistav, doctors, consultas);
        vistav.setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_viewActionPerformed

    private void updateActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_updateActionPerformed
        // TODO add your handling code here:
        vista_update vistap = new vista_update();
        Doctors doctors = new Doctors();
        Consultas consultas = new Consultas();
        controlador_update controladorup = new controlador_update(vistap, doctors, consultas);
        vistap.setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_updateActionPerformed

    private void addActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_addActionPerformed
        // TODO add your handling code here:
        vista_add vistad = new vista_add();
        Pets pets = new Pets();
        Doctors doct = new Doctors();
        Consultas consultas = new Consultas();
        controlador_add controladors = new controlador_add(vistad, pets, doct, consultas);
        vistad.setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_addActionPerformed

    private void addvacActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_addvacActionPerformed
        // TODO add your handling code here:
        Vista_Vaccine vistava = new Vista_Vaccine();
        Doctors doctors = new Doctors();
        Consultas consultas = new Consultas();
        Vaccine_History history = new Vaccine_History();
        controlador_Vaccine controladorva = new controlador_Vaccine(vistava, doctors, consultas, history);
        vistava.setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_addvacActionPerformed

    private void addproActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_addproActionPerformed
        // TODO add your handling code here:
        Vista_Procedures vistapro = new Vista_Procedures();
        Doctors doctors = new Doctors();
        Consultas consultas = new Consultas();
        Procedures procedures = new Procedures();
        
        controladorProcedures controladorproc = new controladorProcedures(vistapro, doctors, consultas, procedures);
        vistapro.setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_addproActionPerformed

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
            java.util.logging.Logger.getLogger(vista_menu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(vista_menu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(vista_menu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(vista_menu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new vista_menu().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    public javax.swing.JButton add;
    public javax.swing.JButton addpro;
    public javax.swing.JButton addvac;
    public javax.swing.JLabel jLabel1;
    public javax.swing.JLabel jLabel3;
    public javax.swing.JPanel panel1m;
    public javax.swing.JPanel panel2m;
    public javax.swing.JButton update;
    public javax.swing.JButton view;
    // End of variables declaration//GEN-END:variables
}
