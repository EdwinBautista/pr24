/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pr24;

import javax.swing.JOptionPane;

/**
 *
 * @author Hp
 */
public class Convercion extends javax.swing.JFrame {

    /**
     * Creates new form Convercion
     */
    public Convercion() {
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

        lblTitulo = new javax.swing.JLabel();
        lblMetros = new javax.swing.JLabel();
        txtMe = new javax.swing.JTextField();
        rbCentimetros = new javax.swing.JRadioButton();
        rbMilimetros = new javax.swing.JRadioButton();
        txtResultado = new javax.swing.JTextField();
        lblConvertir = new javax.swing.JLabel();
        lblHoras = new javax.swing.JLabel();
        txtHo = new javax.swing.JTextField();
        txtResultado2 = new javax.swing.JTextField();
        lblCovertir2 = new javax.swing.JLabel();
        rbMinutos = new javax.swing.JRadioButton();
        rbSegundos = new javax.swing.JRadioButton();
        lblKilogramos = new javax.swing.JLabel();
        txtKg = new javax.swing.JTextField();
        rbGaK = new javax.swing.JRadioButton();
        rbKaG = new javax.swing.JRadioButton();
        txtG = new javax.swing.JTextField();
        lblGramos = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        lblTitulo.setFont(new java.awt.Font("Dialog", 0, 48)); // NOI18N
        lblTitulo.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblTitulo.setText("Conversiones ");

        lblMetros.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        lblMetros.setText("Metros");

        txtMe.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtMeActionPerformed(evt);
            }
        });

        rbCentimetros.setText("centimetros");
        rbCentimetros.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rbCentimetrosActionPerformed(evt);
            }
        });

        rbMilimetros.setText("milimetros");
        rbMilimetros.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rbMilimetrosActionPerformed(evt);
            }
        });

        txtResultado.setEditable(false);

        lblConvertir.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        lblConvertir.setText("Convertir");

        lblHoras.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        lblHoras.setText("Horas");

        txtHo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtHoActionPerformed(evt);
            }
        });

        txtResultado2.setEditable(false);
        txtResultado2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtResultado2ActionPerformed(evt);
            }
        });

        lblCovertir2.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        lblCovertir2.setText("Convertir");

        rbMinutos.setText("Minutos");
        rbMinutos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rbMinutosActionPerformed(evt);
            }
        });

        rbSegundos.setText("Segundos");
        rbSegundos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rbSegundosActionPerformed(evt);
            }
        });

        lblKilogramos.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        lblKilogramos.setText("Kilogramos");

        txtKg.setText("\n");
        txtKg.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtKgActionPerformed(evt);
            }
        });

        rbGaK.setText("{----");
        rbGaK.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rbGaKActionPerformed(evt);
            }
        });

        rbKaG.setText("----}");
        rbKaG.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rbKaGActionPerformed(evt);
            }
        });

        lblGramos.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        lblGramos.setText("Gramos");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(109, 109, 109)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(rbCentimetros)
                            .addComponent(rbMilimetros)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(lblMetros, javax.swing.GroupLayout.PREFERRED_SIZE, 57, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(33, 33, 33)
                                .addComponent(txtMe, javax.swing.GroupLayout.PREFERRED_SIZE, 89, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(rbMinutos)
                            .addComponent(rbSegundos)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(txtKg)
                                    .addComponent(lblHoras, javax.swing.GroupLayout.PREFERRED_SIZE, 78, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(lblKilogramos)
                                        .addGap(0, 0, Short.MAX_VALUE)))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(txtHo, javax.swing.GroupLayout.PREFERRED_SIZE, 89, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(rbGaK)
                                            .addComponent(rbKaG))
                                        .addGap(17, 17, 17)))))
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(36, 36, 36)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(txtResultado, javax.swing.GroupLayout.PREFERRED_SIZE, 123, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(lblConvertir, javax.swing.GroupLayout.PREFERRED_SIZE, 114, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(txtResultado2, javax.swing.GroupLayout.PREFERRED_SIZE, 123, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(lblCovertir2, javax.swing.GroupLayout.PREFERRED_SIZE, 114, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addComponent(txtG, javax.swing.GroupLayout.PREFERRED_SIZE, 92, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(33, 33, 33)
                                .addComponent(lblGramos))))
                    .addComponent(lblTitulo, javax.swing.GroupLayout.PREFERRED_SIZE, 312, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(156, 156, 156))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(lblTitulo, javax.swing.GroupLayout.PREFERRED_SIZE, 71, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(lblMetros, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtMe, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(0, 17, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(10, 10, 10)
                        .addComponent(lblConvertir, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(rbCentimetros)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(rbMilimetros))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(2, 2, 2)
                                .addComponent(txtResultado, javax.swing.GroupLayout.PREFERRED_SIZE, 44, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(39, 39, 39)
                                .addComponent(lblCovertir2, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(txtResultado2, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(29, 29, 29)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(txtHo)
                                    .addComponent(lblHoras, javax.swing.GroupLayout.PREFERRED_SIZE, 44, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(18, 18, 18)
                                .addComponent(rbMinutos)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(rbSegundos)))
                        .addGap(37, 37, 37)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(lblKilogramos, javax.swing.GroupLayout.DEFAULT_SIZE, 22, Short.MAX_VALUE)
                            .addComponent(lblGramos, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(txtKg, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtG, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(rbGaK)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(rbKaG)
                        .addGap(2, 2, 2)))
                .addGap(83, 83, 83))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void rbCentimetrosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rbCentimetrosActionPerformed
       try{
        rbCentimetros.setSelected(true);
        rbMilimetros.setSelected(false);
        int centimetros = Integer.parseInt(txtMe.getText());
        txtResultado.setText(String.valueOf(centimetros*100));
        txtMe.setText("");
       }catch (Exception e){
           JOptionPane.showMessageDialog(null,"Error, debes ingresar un valor");
       }
    }//GEN-LAST:event_rbCentimetrosActionPerformed

    private void txtMeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtMeActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtMeActionPerformed

    private void txtHoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtHoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtHoActionPerformed

    private void txtResultado2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtResultado2ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtResultado2ActionPerformed

    private void rbMinutosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rbMinutosActionPerformed
       try{
        rbSegundos.setSelected(false);
        rbMinutos.setSelected(true);
        int Minutos = Integer.parseInt(txtHo.getText());
        txtResultado2.setText(String.valueOf(Minutos*60));
        txtHo.setText("");
         }catch (Exception e){
           JOptionPane.showMessageDialog(null,"Error, debes ingresar un valor");
       }
    }//GEN-LAST:event_rbMinutosActionPerformed

    private void rbMilimetrosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rbMilimetrosActionPerformed
       try{
        rbMilimetros.setSelected(true);
        rbCentimetros.setSelected(false);
        int Milimetros = Integer.parseInt(txtMe.getText());
        txtResultado.setText(String.valueOf(Milimetros*1000));
        txtMe.setText("");
         }catch (Exception e){
           JOptionPane.showMessageDialog(null,"Error, debes ingresar un valor");
       }
    }//GEN-LAST:event_rbMilimetrosActionPerformed

    private void rbSegundosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rbSegundosActionPerformed
      try{
        rbMinutos.setSelected(false);
       rbSegundos.setSelected(true);
       int Segundos = Integer.parseInt(txtHo.getText());
       txtResultado2.setText(String.valueOf(Segundos*3600));
       txtHo.setText("");
        }catch (Exception e){
           JOptionPane.showMessageDialog(null,"Error, debes ingresar un valor");
       }
    }//GEN-LAST:event_rbSegundosActionPerformed

    private void txtKgActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtKgActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtKgActionPerformed

    private void rbKaGActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rbKaGActionPerformed
        try{
        rbKaG.setSelected(true);
        rbGaK.setSelected(false);
        double kilos = Double.parseDouble(txtKg.getText());
        txtG.setText(String.valueOf(kilos*1000));
        txtKg.setText("");
          }catch (Exception e){
           JOptionPane.showMessageDialog(null,"Error, debes ingresar un valor");
    }//GEN-LAST:event_rbKaGActionPerformed
    }
    private void rbGaKActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rbGaKActionPerformed
       try{
        rbGaK.setSelected(true);
        rbKaG.setSelected(false);
        double gramos =Double.parseDouble(txtG.getText());
        txtKg.setText(String.valueOf(gramos/1000));
        txtG.setText("");
          }catch (Exception e){
           JOptionPane.showMessageDialog(null,"Error, debes ingresar un valor");
          }
    }//GEN-LAST:event_rbGaKActionPerformed

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
            java.util.logging.Logger.getLogger(Convercion.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Convercion.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Convercion.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Convercion.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Convercion().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel lblConvertir;
    private javax.swing.JLabel lblCovertir2;
    private javax.swing.JLabel lblGramos;
    private javax.swing.JLabel lblHoras;
    private javax.swing.JLabel lblKilogramos;
    private javax.swing.JLabel lblMetros;
    private javax.swing.JLabel lblTitulo;
    private javax.swing.JRadioButton rbCentimetros;
    private javax.swing.JRadioButton rbGaK;
    private javax.swing.JRadioButton rbKaG;
    private javax.swing.JRadioButton rbMilimetros;
    private javax.swing.JRadioButton rbMinutos;
    private javax.swing.JRadioButton rbSegundos;
    private javax.swing.JTextField txtG;
    private javax.swing.JTextField txtHo;
    private javax.swing.JTextField txtKg;
    private javax.swing.JTextField txtMe;
    private javax.swing.JTextField txtResultado;
    private javax.swing.JTextField txtResultado2;
    // End of variables declaration//GEN-END:variables
}
