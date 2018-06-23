package practicavacasipc1;

import javax.swing.JOptionPane;

public class Inicio extends javax.swing.JFrame {
    public static int turnoDesabordaje=0,noPasajeros,noMantenimiento, contador, maletas,documentos;
    public static String tamañoAvion;
    public ListaAvion listadoble= new ListaAvion();
    public ColaPasajero cola= new ColaPasajero();
    
    public Inicio() {
        initComponents();
        this.setLocationRelativeTo(null);
    }
    
    public void TamañoAvion(){
       int tamaño = (int)(Math.random()*3);
        switch (tamaño) {
            case 0:
                {
                    //Avion pequeño
                    noPasajeros = (int)(Math.random()*6)+5;
                    noMantenimiento = (int)(Math.random()*2)+1;
                    turnoDesabordaje=1;
                    tamañoAvion="Pequeño";
                    
                    break;
                }
            case 1:
                {
                    //Avion Mediano
                    noPasajeros = (int)(Math.random()*11)+15;
                    noMantenimiento = (int)(Math.random()*3)+2;
                    turnoDesabordaje=2;
                    tamañoAvion="Mediano";
                    break;
                }
            case 2:
                    //Avion Grande
                    noPasajeros = (int)(Math.random()*11)+30;
                    noMantenimiento = (int)(Math.random()*4)+3;
                    turnoDesabordaje=3;
                    tamañoAvion="Grande";
                break;
            default:
                break;
        }
        maletas = (int)(Math.random()*4)+1;
        documentos = (int)(Math.random()*10)+1;
     System.out.println(tamañoAvion+"  "+noPasajeros+"  "+turnoDesabordaje+"  "+noMantenimiento);
      
    }
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel2 = new javax.swing.JLabel();
        avion = new javax.swing.JTextField();
        jScrollPane1 = new javax.swing.JScrollPane();
        area = new javax.swing.JTextArea();
        estaciones = new javax.swing.JTextField();
        cambiar = new javax.swing.JButton();
        generar = new javax.swing.JButton();
        jLabel4 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel2.setBackground(new java.awt.Color(255, 255, 255));
        jLabel2.setFont(new java.awt.Font("Eras Demi ITC", 1, 18)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(0, 0, 0));
        jLabel2.setText("No. Aviones:");
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 40, -1, 20));
        getContentPane().add(avion, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 40, 50, 30));

        area.setColumns(20);
        area.setRows(5);
        jScrollPane1.setViewportView(area);

        getContentPane().add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(310, 40, 300, 370));
        getContentPane().add(estaciones, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 110, 50, 30));

        cambiar.setBackground(new java.awt.Color(102, 255, 102));
        cambiar.setFont(new java.awt.Font("Myanmar Text", 1, 18)); // NOI18N
        cambiar.setText("Cambiar Turno");
        cambiar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cambiarActionPerformed(evt);
            }
        });
        getContentPane().add(cambiar, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 320, -1, 30));

        generar.setBackground(new java.awt.Color(255, 204, 102));
        generar.setFont(new java.awt.Font("Myanmar Text", 1, 18)); // NOI18N
        generar.setText("Generar");
        generar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                generarActionPerformed(evt);
            }
        });
        getContentPane().add(generar, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 220, -1, 30));

        jLabel4.setBackground(new java.awt.Color(255, 255, 255));
        jLabel4.setFont(new java.awt.Font("Eras Demi ITC", 1, 18)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(0, 0, 0));
        jLabel4.setText("No. Estaciones:");
        getContentPane().add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 110, -1, 20));

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/fondo.jpg"))); // NOI18N
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, -4, -1, 440));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void generarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_generarActionPerformed
       if("".equals(avion.getText())||"".equals(estaciones.getText())){
           JOptionPane.showMessageDialog(null, "Ingrese los datos");
       }else{
           contador=1;
           TamañoAvion();
           listadoble.insertarFinal(new NodoAvion(contador,tamañoAvion, noPasajeros, turnoDesabordaje, noMantenimiento));
           listadoble.recorrer();
           cola.insertarFinal(new NodoPasajero(contador, maletas, documentos));
           area.append("++++++++++Turno "+contador+"++++++++++\n"+listadoble.datos+cola.recorrer());
           System.out.println(listadoble.datos);
           generar.setEnabled(false);
       }
        
        //listadoble.insertarFinal(new NodoAvion("hola", 2, 3, 1));
        /*  int noavion=Integer.parseInt(avion.getText());
        do{
        
        if(listadoble.primero!=null){
        }else{
        JOptionPane.showMessageDialog(null, "No hay Aviones");
        }
        noavion--;
        }while(noavion!=0);*/
        
          /*        do{
          try{
          TamañoAvion();
          listadoble.agregarInicio(tamañoAvion, noPasajeros, turnoDesabordaje, noMantenimiento);
          if(!listadoble.estaVacia()){
          listadoble.mostrarInicioFin();
          }else{
          JOptionPane.showMessageDialog(null, "No hay Aviones");
          }
          area.setText(listadoble.datos);
          noavion--;
          }catch(NumberFormatException n){
          JOptionPane.showMessageDialog(null,"Error "+n.getMessage());
          }
          }while(noavion!=0);*/
    }//GEN-LAST:event_generarActionPerformed

    private void cambiarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cambiarActionPerformed
      try{
          int noavion=Integer.parseInt(avion.getText());
       contador++;
        System.out.println(contador);
       if(contador<=noavion){
           listadoble.disminuirTurno();
           TamañoAvion();
           listadoble.insertarFinal(new NodoAvion(contador,tamañoAvion, noPasajeros, turnoDesabordaje, noMantenimiento));
           listadoble.recorrer();
           cola.insertarFinal(new NodoPasajero(contador, maletas, documentos));  
           area.append("++++++++++Turno "+contador+"++++++++++\n"+listadoble.datos+cola.recorrer());  
       }
      }catch(NumberFormatException n){
          JOptionPane.showMessageDialog(null,"Error "+n.getMessage());
          generar.setEnabled(true);
          }
        
    }//GEN-LAST:event_cambiarActionPerformed

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

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Inicio().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    public javax.swing.JTextArea area;
    private javax.swing.JTextField avion;
    private javax.swing.JButton cambiar;
    private javax.swing.JTextField estaciones;
    private javax.swing.JButton generar;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JScrollPane jScrollPane1;
    // End of variables declaration//GEN-END:variables
}
