/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package formulario;

import javax.swing.JOptionPane;

/**
 *
 * @author Matias
 */
public class Suma2 extends javax.swing.JFrame {

    /**
     * Creates new form Suma2
     */
    public Suma2() {
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

        lblt = new javax.swing.JLabel();
        lbln1 = new javax.swing.JLabel();
        lbln2 = new javax.swing.JLabel();
        txtn1 = new javax.swing.JTextField();
        txtn2 = new javax.swing.JTextField();
        lblr = new javax.swing.JLabel();
        txtr = new javax.swing.JTextField();
        btnc = new javax.swing.JButton();
        btnl = new javax.swing.JButton();
        btns = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        lblt.setText("Suma de dos numeros");

        lbln1.setText("Ingrese el primer numero");

        lbln2.setText("Ingrese el segundo numero");

        txtn1.setText("Escriba un numero mayorque 0");
        txtn1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtn1ActionPerformed(evt);
            }
        });

        txtn2.setText("Escriba un numero mayorque 0");

        lblr.setText("Resultado");

        txtr.setEditable(false);

        btnc.setText("Calculadora");
        btnc.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btncActionPerformed(evt);
            }
        });

        btnl.setText("Limpiar");
        btnl.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnlActionPerformed(evt);
            }
        });

        btns.setText("Salir");
        btns.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnsActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(50, 50, 50)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(btnc)
                        .addGap(42, 42, 42)
                        .addComponent(btnl)
                        .addGap(29, 29, 29)
                        .addComponent(btns))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(lblr)
                            .addComponent(lbln2)
                            .addComponent(lbln1))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(txtn2, javax.swing.GroupLayout.DEFAULT_SIZE, 214, Short.MAX_VALUE)
                            .addComponent(txtn1)
                            .addComponent(txtr))))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(lblt)
                .addGap(146, 146, 146))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(11, 11, 11)
                .addComponent(lblt)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lbln1)
                    .addComponent(txtn1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lbln2)
                    .addComponent(txtn2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblr)
                    .addComponent(txtr, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(32, 32, 32)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnc)
                    .addComponent(btnl)
                    .addComponent(btns))
                .addContainerGap(98, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btncActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btncActionPerformed
        // TODO add your handling code here:
        int n1, n2, sum;
        do{
            n1 = Integer.parseInt(txtn1.getText());
            if (n1 > 0){
                JOptionPane.showMessageDialog(null,"El numero Ingresado es el correcto");
            }else{
                JOptionPane.showMessageDialog(null, "EL numero ingresado no es el correcto");
                txtn1.setText("Escriba un numero mayor que 0");
                txtn1.grabFocus();
            }
        }while(n1<=0);
        
        do{
           n2 = Integer.parseInt(txtn2.getText());
            if (n2 > 0){
                JOptionPane.showMessageDialog(null,"El numero Ingresado es el correcto");
            }else{
                JOptionPane.showMessageDialog(null, "EL numero ingresado no es el correcto");
                txtn2.setText("Escriba un numero mayor que 0");
                txtn2.grabFocus();
            }
        }while (n2<=0);
        sum = n1 + n2;
        
        txtr.setText("La respuesta es: " + sum);
    }//GEN-LAST:event_btncActionPerformed

    private void txtn1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtn1ActionPerformed
        // TODO add your handling code here:
        
    }//GEN-LAST:event_txtn1ActionPerformed

    private void btnlActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnlActionPerformed
        // TODO add your handling code here:
        txtn1.setText("");
        txtn2.setText("");
        txtr.setText("");
        txtr.grabFocus();
    }//GEN-LAST:event_btnlActionPerformed

    private void btnsActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnsActionPerformed
        // TODO add your handling code here:
        System.exit(0);
    }//GEN-LAST:event_btnsActionPerformed

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
            java.util.logging.Logger.getLogger(Suma2.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Suma2.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Suma2.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Suma2.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Suma2().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnc;
    private javax.swing.JButton btnl;
    private javax.swing.JButton btns;
    private javax.swing.JLabel lbln1;
    private javax.swing.JLabel lbln2;
    private javax.swing.JLabel lblr;
    private javax.swing.JLabel lblt;
    private javax.swing.JTextField txtn1;
    private javax.swing.JTextField txtn2;
    private javax.swing.JTextField txtr;
    // End of variables declaration//GEN-END:variables
}
