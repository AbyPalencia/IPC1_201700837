package proyecto1;
import javax.swing.ImageIcon;
import javax.swing.JOptionPane;


public class Juego extends javax.swing.JFrame {
public static int op;
public Tablero tab;
public boolean tablerocreado=false;
public Inicio in;

    public Juego() {
        initComponents();
        this.panel.setOpaque(false);
        this.panel.removeAll();
        this.panel.repaint();
        int tam=tamMatriz();
        this.tab= new Tablero(tam,panel);
        tablerocreado=true;
        this.jfondo.setIcon(new ImageIcon("C:\\Users\\abypa\\Desktop\\gitHub\\Proyecto 1\\IPC1_201700837\\Proyecto 1\\Medievil\\src\\imagenes\\fondo.jpg"));
    }
    public int tamMatriz(){
        int tam=Integer.parseInt(JOptionPane.showInputDialog(null, "Ingrese tamaño del tablero:", JOptionPane.QUESTION_MESSAGE));
        return tam;
    }
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        ljugador1 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jper1 = new javax.swing.JLabel();
        jper2 = new javax.swing.JLabel();
        jper3 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        ljugador2 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        jLabel13 = new javax.swing.JLabel();
        jper4 = new javax.swing.JLabel();
        jper5 = new javax.swing.JLabel();
        jper6 = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();
        dado = new javax.swing.JLabel();
        arriba = new javax.swing.JButton();
        abajo = new javax.swing.JButton();
        izquierda = new javax.swing.JButton();
        panel = new javax.swing.JPanel();
        derecha = new javax.swing.JButton();
        jfondo = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setText("Tiempo:");

        jLabel2.setText("Timer");

        jLabel3.setText("Jugador 1:");

        ljugador1.setText("---------------------------");

        jLabel4.setText("Vida:");

        jLabel5.setText("5");

        jLabel6.setText("Orden de los Personajes:");

        jper1.setText("1..........................");

        jper2.setText("1..........................");

        jper3.setText("1..........................");

        jLabel10.setText("Jugador 2:");

        ljugador2.setText("---------------------------");

        jLabel11.setText("Vida:");

        jLabel12.setText("5");

        jLabel13.setText("Orden de los Personajes:");

        jper4.setText("1..........................");

        jper5.setText("1..........................");

        jper6.setText("1..........................");

        jButton1.setText("Tirar");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        dado.setText("dado");

        arriba.setText("Arriba");
        arriba.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                arribaActionPerformed(evt);
            }
        });

        abajo.setText("Abajo");
        abajo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                abajoActionPerformed(evt);
            }
        });

        izquierda.setText("Izquierda");
        izquierda.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                izquierdaActionPerformed(evt);
            }
        });

        panel.setBorder(new javax.swing.border.MatteBorder(null));

        javax.swing.GroupLayout panelLayout = new javax.swing.GroupLayout(panel);
        panel.setLayout(panelLayout);
        panelLayout.setHorizontalGroup(
            panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 438, Short.MAX_VALUE)
        );
        panelLayout.setVerticalGroup(
            panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 452, Short.MAX_VALUE)
        );

        derecha.setText("Derecha");
        derecha.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                derechaActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(10, 10, 10)
                        .addComponent(panel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jfondo, javax.swing.GroupLayout.PREFERRED_SIZE, 473, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(12, 12, 12)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel1)
                        .addGap(12, 12, 12)
                        .addComponent(jLabel2))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel3)
                        .addGap(18, 18, 18)
                        .addComponent(ljugador1, javax.swing.GroupLayout.PREFERRED_SIZE, 162, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel4)
                        .addGap(18, 18, 18)
                        .addComponent(jLabel5)
                        .addGap(42, 42, 42)
                        .addComponent(jLabel6))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel10)
                        .addGap(18, 18, 18)
                        .addComponent(ljugador2, javax.swing.GroupLayout.PREFERRED_SIZE, 162, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel11)
                        .addGap(18, 18, 18)
                        .addComponent(jLabel12)
                        .addGap(42, 42, 42)
                        .addComponent(jLabel13))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jButton1)
                        .addGap(18, 18, 18)
                        .addComponent(dado))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(izquierda)
                        .addGap(11, 11, 11)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(arriba)
                            .addComponent(abajo))
                        .addGap(5, 5, 5)
                        .addComponent(derecha))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(95, 95, 95)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jper1)
                            .addComponent(jper2)
                            .addComponent(jper3)
                            .addComponent(jper4)
                            .addComponent(jper5)
                            .addComponent(jper6)))))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(panel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(jfondo, javax.swing.GroupLayout.PREFERRED_SIZE, 474, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGroup(layout.createSequentialGroup()
                            .addGap(12, 12, 12)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(jLabel1)
                                .addComponent(jLabel2))
                            .addGap(22, 22, 22)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(jLabel3)
                                .addComponent(ljugador1))
                            .addGap(18, 18, 18)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(jLabel4)
                                .addComponent(jLabel5)
                                .addComponent(jLabel6))
                            .addGap(6, 6, 6)
                            .addComponent(jper1)
                            .addGap(12, 12, 12)
                            .addComponent(jper2)
                            .addGap(16, 16, 16)
                            .addComponent(jper3)
                            .addGap(37, 37, 37)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(jLabel10)
                                .addComponent(ljugador2))
                            .addGap(18, 18, 18)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(jLabel11)
                                .addComponent(jLabel12)
                                .addComponent(jLabel13))
                            .addGap(6, 6, 6)
                            .addComponent(jper4)
                            .addGap(12, 12, 12)
                            .addComponent(jper5)
                            .addGap(12, 12, 12)
                            .addComponent(jper6)
                            .addGap(20, 20, 20)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(jButton1)
                                .addGroup(layout.createSequentialGroup()
                                    .addGap(5, 5, 5)
                                    .addComponent(dado)))
                            .addGap(5, 5, 5)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addGroup(layout.createSequentialGroup()
                                    .addComponent(arriba)
                                    .addGap(20, 20, 20)
                                    .addComponent(abajo))
                                .addGroup(layout.createSequentialGroup()
                                    .addGap(23, 23, 23)
                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(izquierda)
                                        .addComponent(derecha)))))))
                .addGap(38, 38, 38))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void arribaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_arribaActionPerformed
         
    }//GEN-LAST:event_arribaActionPerformed

    private void abajoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_abajoActionPerformed
      if (!tablerocreado) {
            System.out.println("Tablero no creado");
            return;
        }
      if(dado.getText().equals("dado")){
          JOptionPane.showConfirmDialog(null, "Primero debe lanzar el dado");
      }else{
        op=2;
        Movimiento mov1= new Movimiento(Integer.parseInt(dado.getText()),tab,op);
        mov1.start();   
      }
        
    }//GEN-LAST:event_abajoActionPerformed

    private void derechaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_derechaActionPerformed
        if (!tablerocreado) {
            System.out.println("Tablero no creado");
            return;
        }
        if(dado.getText().equals("dado")){
          JOptionPane.showConfirmDialog(null, "Primero debe lanzar el dado");
      }else{
        op=0;
        Movimiento mov1= new Movimiento(Integer.parseInt(dado.getText()),tab,op);
        mov1.start();    
        }
        
    }//GEN-LAST:event_derechaActionPerformed

    private void izquierdaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_izquierdaActionPerformed
        if (!tablerocreado) {
            System.out.println("Tablero no creado");
            return;
        }
        if(dado.getText().equals("dado")){
          JOptionPane.showMessageDialog(null, "Primero debe lanzar el dado");
          
      }else{
        op=1;
        Movimiento mov1= new Movimiento(Integer.parseInt(dado.getText()),tab,op);
        mov1.start();      
        }
        
    }//GEN-LAST:event_izquierdaActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        int a = (int)(Math.random()*6)+1;
        this.dado.setText(Integer.toString(a));
    }//GEN-LAST:event_jButton1ActionPerformed

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
            java.util.logging.Logger.getLogger(Juego.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Juego.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Juego.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Juego.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Juego().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton abajo;
    private javax.swing.JButton arriba;
    private javax.swing.JLabel dado;
    private javax.swing.JButton derecha;
    private javax.swing.JButton izquierda;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jfondo;
    public javax.swing.JLabel jper1;
    public javax.swing.JLabel jper2;
    public javax.swing.JLabel jper3;
    public javax.swing.JLabel jper4;
    public javax.swing.JLabel jper5;
    public javax.swing.JLabel jper6;
    public javax.swing.JLabel ljugador1;
    public javax.swing.JLabel ljugador2;
    public javax.swing.JPanel panel;
    // End of variables declaration//GEN-END:variables
}
