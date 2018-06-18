
package proyecto1;

import java.io.*;
import javax.swing.DefaultListModel;

public class Final extends javax.swing.JFrame {
public Jugador[] vecJugador;
public boolean vectorcreado=false;
    public Final() {
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jButton2 = new javax.swing.JButton();
        jButton1 = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        Lista = new javax.swing.JList<>();
        datos = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setFont(new java.awt.Font("Lucida Console", 1, 24)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(204, 0, 0));
        jLabel1.setText("Juego Finalizado!");
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 20, -1, -1));

        jButton2.setText("Mostrar records");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton2, new org.netbeans.lib.awtextra.AbsoluteConstraints(340, 100, -1, -1));

        jButton1.setText("Guardar");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 100, -1, -1));

        jScrollPane1.setViewportView(Lista);

        getContentPane().add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 130, 490, 170));

        datos.setText("jugador1, jugador2,1:00:00, 1, 5,per1, per2, per3, pre4, per5, per6, ganador");
        datos.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        getContentPane().add(datos, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 60, 480, 20));

        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/fondo3.jpg"))); // NOI18N
        jLabel2.setOpaque(true);
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 600, 330));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        Crear();
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
       try {
            vecJugador=obtenerPeronas("Archivo.txt");
        } catch (IOException ex) {
        }
        
        DefaultListModel modelo = new DefaultListModel();
        int tam = vecJugador.length;
        for(int i=0; i<tam; i++){
            modelo.add(i,vecJugador[i].getNombre1()+"->"+vecJugador[i].getNombre2());
        }
        Lista.setModel(modelo);
        vectorcreado=true;
    }//GEN-LAST:event_jButton2ActionPerformed

    public void Crear(){
        File archivo = new File("Archivo.txt");
        PrintWriter pw;
        try {
          pw=new PrintWriter(new FileWriter("Archivo.txt",true));
          pw.println(datos.getText());
          pw.close();
        } catch (IOException ex) {
        }
    }
     public Jugador[] obtenerPeronas(String archivo) throws FileNotFoundException, IOException{
        String cadena="";
        Jugador[] per = new Jugador[]{new Jugador("d","d","d",0,0,"p1","p2","p3","p4","p5","p6","g"),new Jugador("d","d","d",0,0,"p1","p2","p3","p4","p5","p6","g"),new Jugador("d","d","d",0,0,"p1","p2","p3","p4","p5","p6","g"),new Jugador("d","d","d",0,0,"p1","p2","p3","p4","p5","p6","g"),new Jugador("d","d","d",0,0,"p1","p2","p3","p4","p5","p6","g"),new Jugador("d","d","d",0,0,"p1","p2","p3","p4","p5","p6","g"),new Jugador("d","d","d",0,0,"p1","p2","p3","p4","p5","p6","g"),new Jugador("d","d","d",0,0,"p1","p2","p3","p4","p5","p6","g"),new Jugador("d","d","d",0,0,"p1","p2","p3","p4","p5","p6","g"),new Jugador("d","d","d",0,0,"p1","p2","p3","p4","p5","p6","g")};
        
        FileReader fr = new FileReader(archivo);
        BufferedReader br = new BufferedReader(fr);
        int linea=0;
        
        while((cadena=br.readLine())!=null && linea<10){
            String[] cadenasplit= cadena.split(",");
            per[linea]=new Jugador(cadenasplit[0],cadenasplit[1],cadenasplit[2],Integer.parseInt(cadenasplit[3].trim()),Integer.parseInt(cadenasplit[4].trim()),cadenasplit[5],cadenasplit[6],cadenasplit[7],cadenasplit[8],cadenasplit[9],cadenasplit[10],cadenasplit[11]);
            linea++;
        }
        br.close();
        return per;     
                }
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
            java.util.logging.Logger.getLogger(Final.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Final.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Final.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Final.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Final().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JList<String> Lista;
    public javax.swing.JLabel datos;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JScrollPane jScrollPane1;
    // End of variables declaration//GEN-END:variables
}
