
package Practico6;

import static java.awt.SystemColor.menu;


public class Menu extends javax.swing.JFrame {
    public static Directorio miDirectorio=new Directorio();

    
    public Menu() {
        initComponents();
    }

   
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jMenuItem1 = new javax.swing.JMenuItem();
        jTextField1 = new javax.swing.JTextField();
        jRadioButtonMenuItem1 = new javax.swing.JRadioButtonMenuItem();
        escritorio = new javax.swing.JDesktopPane();
        jMenuBar1 = new javax.swing.JMenuBar();
        jMenu1 = new javax.swing.JMenu();
        jMagregarCliente = new javax.swing.JMenuItem();
        jMbuscarCliente = new javax.swing.JMenuItem();
        jMborrarCliente = new javax.swing.JMenuItem();
        jmsalirr = new javax.swing.JMenu();
        jMenuItem2salir = new javax.swing.JMenuItem();

        jMenuItem1.setText("jMenuItem1");

        jTextField1.setText("jTextField1");

        jRadioButtonMenuItem1.setSelected(true);
        jRadioButtonMenuItem1.setText("jRadioButtonMenuItem1");

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Menu Clientes");

        javax.swing.GroupLayout escritorioLayout = new javax.swing.GroupLayout(escritorio);
        escritorio.setLayout(escritorioLayout);
        escritorioLayout.setHorizontalGroup(
            escritorioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 536, Short.MAX_VALUE)
        );
        escritorioLayout.setVerticalGroup(
            escritorioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 274, Short.MAX_VALUE)
        );

        jMenu1.setText("Clientes");
        jMenu1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenu1ActionPerformed(evt);
            }
        });

        jMagregarCliente.setText("agregarCliente");
        jMagregarCliente.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMagregarClienteActionPerformed(evt);
            }
        });
        jMenu1.add(jMagregarCliente);

        jMbuscarCliente.setText("buscarCliente");
        jMbuscarCliente.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMbuscarClienteActionPerformed(evt);
            }
        });
        jMenu1.add(jMbuscarCliente);

        jMborrarCliente.setText("borrarCliente");
        jMborrarCliente.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMborrarClienteActionPerformed(evt);
            }
        });
        jMenu1.add(jMborrarCliente);

        jMenuBar1.add(jMenu1);

        jmsalirr.setText("salir");

        jMenuItem2salir.setText("salir");
        jMenuItem2salir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem2salirActionPerformed(evt);
            }
        });
        jmsalirr.add(jMenuItem2salir);

        jMenuBar1.add(jmsalirr);

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

    private void jMborrarClienteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMborrarClienteActionPerformed
        escritorio.removeAll();
        escritorio.repaint();
        BorrarCliente bocl=new BorrarCliente();
        bocl.setVisible(true);
        escritorio.add(bocl);
        escritorio.moveToFront(bocl);
    }//GEN-LAST:event_jMborrarClienteActionPerformed

    private void jMbuscarClienteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMbuscarClienteActionPerformed

        escritorio.removeAll();
        escritorio.repaint();
        BuscarCliente bcl=new BuscarCliente();
        bcl.setVisible(true);
        escritorio.add(bcl);
        escritorio.moveToFront(bcl);
        
    }//GEN-LAST:event_jMbuscarClienteActionPerformed

    private void jMagregarClienteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMagregarClienteActionPerformed
        escritorio.removeAll();
        escritorio.repaint();
        VistaAgregarCliente vacl=new VistaAgregarCliente();
        vacl.setVisible(true);
        escritorio.add(vacl);
        escritorio.moveToFront(vacl);
    }//GEN-LAST:event_jMagregarClienteActionPerformed

    private void jMenuItem2salirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem2salirActionPerformed
        System.exit(0);
    }//GEN-LAST:event_jMenuItem2salirActionPerformed

    private void jMenu1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenu1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jMenu1ActionPerformed

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
    private javax.swing.JMenuItem jMagregarCliente;
    private javax.swing.JMenuItem jMborrarCliente;
    private javax.swing.JMenuItem jMbuscarCliente;
    private javax.swing.JMenu jMenu1;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JMenuItem jMenuItem1;
    private javax.swing.JMenuItem jMenuItem2salir;
    private javax.swing.JRadioButtonMenuItem jRadioButtonMenuItem1;
    private javax.swing.JTextField jTextField1;
    private javax.swing.JMenu jmsalirr;
    // End of variables declaration//GEN-END:variables
}
