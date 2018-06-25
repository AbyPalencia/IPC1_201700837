package practicavacasipc1;

import java.awt.Color;
import javax.swing.JOptionPane;

public class Inicio extends javax.swing.JFrame {
    public static int turnoDesabordaje=0,noPasajeros,noMantenimiento, contador, maletas,documentos;
    public static int contPasajeros, nomaleta=1;
    public static String tamañoAvion;
    public ListaAvion listadoble= new ListaAvion();
    public ColaPasajero cola= new ColaPasajero();
    public ListaMaleta listamaleta = new ListaMaleta();
    
    public Inicio() {
        initComponents();
        this.setLocationRelativeTo(null);
    }
    public void DatosPasajeros(){
        maletas = (int)(Math.random()*4)+1;
        documentos = (int)(Math.random()*10)+1;
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
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, 430));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void generarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_generarActionPerformed
       if("".equals(avion.getText())||"".equals(estaciones.getText())){
           JOptionPane.showMessageDialog(null, "Ingrese los datos");
       }else{
           try{
           contador=contPasajeros=1;//todo inicia con el primer turno
           TamañoAvion();
           listadoble.insertarFinal(new NodoAvion(contador,tamañoAvion, noPasajeros, turnoDesabordaje, noMantenimiento));
           listadoble.recorrer();
           
           
           while(noPasajeros!=0){
               DatosPasajeros();
               cola.insertarFinal(new NodoPasajero(contPasajeros, maletas, documentos));
               while(maletas!=0){
                   listamaleta.insertar(new NodoMaleta(nomaleta));
                   nomaleta++;
                   maletas--;
               }
               contPasajeros++;
               noPasajeros--;    
           }
           // mostrar en el JTextArea
           area.setForeground(Color.BLUE);
           area.append("++++++++++++++TURNO "+contador+"++++++++++++++\n");
           area.append(listadoble.datos+cola.recorrer());
          area.append(listamaleta.recorrer());
           area.append("++++++++++TURNO "+contador+" FINALIZADO++++++++++\n");
           
           System.out.println(listadoble.datos);
           generar.setEnabled(false);//deshabilita el boton de generar
           
           }catch(NumberFormatException n){
          JOptionPane.showMessageDialog(null,"Error "+n.getMessage());
          generar.setEnabled(true);
          }
       }
    }//GEN-LAST:event_generarActionPerformed

    private void cambiarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cambiarActionPerformed
      try{
          int noavion=Integer.parseInt(avion.getText());//obtengo el numero de aviones que me piden
         contador++;//el turno 
        System.out.println(contador);
       if(contador<=noavion){//que imprima solo el numero de aviones que me pidieron
           
           cola.eliminar5();//elimina 5 pasajeros
           TamañoAvion();//genera datos del avion
           listadoble.disminuirTurno();//disminuye el numero de turno de desbordaje
           listadoble.insertarFinal(new NodoAvion(contador,tamañoAvion, noPasajeros, turnoDesabordaje, noMantenimiento));
           listadoble.disminuirTurno();//disminuye el numero de turno de desbordaje
           listadoble.recorrer();
           
           while(noPasajeros!=0){//imprime el numero de pasajeros generado anteriormente
               DatosPasajeros();
               cola.insertarFinal(new NodoPasajero(contPasajeros, maletas, documentos));
               contPasajeros++;//aumete el numero que identifica a cada pasajero
               noPasajeros--;    
           }
           
           //mostrar en el JtextArea
           area.setForeground(Color.BLUE);
           area.append("++++++++++++++TURNO "+contador+"++++++++++++++\n");
           area.append(listadoble.datos+cola.recorrer());
           area.append("++++++++++TURNO "+contador+" FINALIZADO++++++++++\n");
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