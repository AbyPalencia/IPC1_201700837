
package proyecto1;

import javax.swing.JOptionPane;

public class Inicio extends javax.swing.JFrame {

public Juego ini;
    public Inicio() {
        this.setBounds(350, 200, 500, 400);
        
        initComponents();
    }

   
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jnombre1 = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jper1 = new javax.swing.JComboBox<>();
        jper2 = new javax.swing.JComboBox<>();
        jper3 = new javax.swing.JComboBox<>();
        jLabel5 = new javax.swing.JLabel();
        jper5 = new javax.swing.JComboBox<>();
        jper6 = new javax.swing.JComboBox<>();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jnombre2 = new javax.swing.JTextField();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jper4 = new javax.swing.JComboBox<>();
        jButton1 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setForeground(new java.awt.Color(153, 0, 153));
        jLabel1.setText("Nombre del jugador 1:");

        jLabel2.setForeground(new java.awt.Color(153, 0, 153));
        jLabel2.setText("Turno 1");

        jnombre1.setForeground(new java.awt.Color(153, 0, 153));
        jnombre1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jnombre1ActionPerformed(evt);
            }
        });

        jLabel3.setForeground(new java.awt.Color(153, 0, 153));
        jLabel3.setText("Turno 2");

        jLabel4.setForeground(new java.awt.Color(153, 0, 153));
        jLabel4.setText("Turno 3");

        jper1.setForeground(new java.awt.Color(153, 0, 153));
        jper1.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Princesa", "Mago", "Guerrero" }));

        jper2.setForeground(new java.awt.Color(153, 0, 153));
        jper2.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Princesa", "Mago", "Guerrero" }));

        jper3.setForeground(new java.awt.Color(153, 0, 153));
        jper3.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Princesa", "Mago", "Guerrero" }));

        jLabel5.setFont(new java.awt.Font("Georgia", 1, 24)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(153, 0, 153));
        jLabel5.setText("MEDIEVIL");

        jper5.setForeground(new java.awt.Color(153, 0, 153));
        jper5.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Princesa", "Mago", "Guerrero" }));

        jper6.setForeground(new java.awt.Color(153, 0, 153));
        jper6.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Princesa", "Mago", "Guerrero" }));

        jLabel6.setForeground(new java.awt.Color(153, 0, 153));
        jLabel6.setText("Nombre del jugador 2:");

        jLabel7.setForeground(new java.awt.Color(153, 0, 153));
        jLabel7.setText("Turno 1");

        jnombre2.setForeground(new java.awt.Color(153, 0, 153));

        jLabel8.setForeground(new java.awt.Color(153, 0, 153));
        jLabel8.setText("Turno 2");

        jLabel9.setForeground(new java.awt.Color(153, 0, 153));
        jLabel9.setText("Turno 3");

        jper4.setForeground(new java.awt.Color(153, 0, 153));
        jper4.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Princesa", "Mago", "Guerrero" }));

        jButton1.setForeground(new java.awt.Color(153, 0, 153));
        jButton1.setText("Iniciar");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(215, 215, 215)
                        .addComponent(jLabel5))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(30, 30, 30)
                        .addComponent(jLabel1)
                        .addGap(35, 35, 35)
                        .addComponent(jnombre1, javax.swing.GroupLayout.PREFERRED_SIZE, 347, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(68, 68, 68)
                        .addComponent(jLabel2)
                        .addGap(18, 18, 18)
                        .addComponent(jper1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(27, 27, 27)
                        .addComponent(jLabel3)
                        .addGap(22, 22, 22)
                        .addComponent(jper2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(30, 30, 30)
                        .addComponent(jLabel4)
                        .addGap(31, 31, 31)
                        .addComponent(jper3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(30, 30, 30)
                        .addComponent(jLabel6)
                        .addGap(35, 35, 35)
                        .addComponent(jnombre2, javax.swing.GroupLayout.PREFERRED_SIZE, 347, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(70, 70, 70)
                        .addComponent(jLabel7)
                        .addGap(23, 23, 23)
                        .addComponent(jper4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(jLabel8)
                        .addGap(23, 23, 23)
                        .addComponent(jper5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(38, 38, 38)
                        .addComponent(jLabel9)
                        .addGap(23, 23, 23)
                        .addComponent(jper6, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(40, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 174, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(187, 187, 187))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(28, 28, 28)
                .addComponent(jLabel5)
                .addGap(24, 24, 24)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jnombre1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(12, 12, 12)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jper1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jper2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jper3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(5, 5, 5)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel2)
                            .addComponent(jLabel3)
                            .addComponent(jLabel4))))
                .addGap(35, 35, 35)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel6)
                    .addComponent(jnombre2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(11, 11, 11)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jper4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jper5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jper6, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(10, 10, 10)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel7)
                            .addComponent(jLabel8)
                            .addComponent(jLabel9))))
                .addGap(18, 18, 18)
                .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed

       System.out.println(this.jper1.getSelectedIndex()+"   "+this.jper2.getSelectedIndex()+"   "+this.jper3.getSelectedIndex());
       if(jnombre1.getText().equals("")||jnombre2.getText().equals("")){
           JOptionPane.showMessageDialog(null, "Faltan datos");
       }else{
       ini = new Juego();
       ini.setVisible(true);
       ini.setLocationRelativeTo(null);
       ini.setBounds(100, 50, 800, 550);
       this.setVisible(false);
       
       transferirDatos();
       }
       
    }//GEN-LAST:event_jButton1ActionPerformed

    public void transferirDatos(){
        ini.ljugador1.setText(this.jnombre1.getText());
        ini.ljugador2.setText(this.jnombre2.getText());
        ini.jper1.setText(this.jper1.getSelectedItem().toString());
        ini.jper2.setText(this.jper2.getSelectedItem().toString());
        ini.jper3.setText(this.jper3.getSelectedItem().toString());
        ini.jper4.setText(this.jper4.getSelectedItem().toString());
        ini.jper5.setText(this.jper5.getSelectedItem().toString());
        ini.jper6.setText(this.jper6.getSelectedItem().toString());

}
    private void jnombre1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jnombre1ActionPerformed
        
    }//GEN-LAST:event_jnombre1ActionPerformed

   
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
            java.util.logging.Logger.getLogger(Inicio.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Inicio.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Inicio.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Inicio.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Inicio().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JTextField jnombre1;
    private javax.swing.JTextField jnombre2;
    public javax.swing.JComboBox<String> jper1;
    public javax.swing.JComboBox<String> jper2;
    public javax.swing.JComboBox<String> jper3;
    public javax.swing.JComboBox<String> jper4;
    public javax.swing.JComboBox<String> jper5;
    public javax.swing.JComboBox<String> jper6;
    // End of variables declaration//GEN-END:variables
}
