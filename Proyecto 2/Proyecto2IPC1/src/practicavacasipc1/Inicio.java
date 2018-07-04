package practicavacasipc1;

import java.awt.Color;
import java.awt.Image;
import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.JOptionPane;

public class Inicio extends javax.swing.JFrame {
    public static int turnoDesabordaje=0,noPasajeros,noMantenimiento, contador, maletas,documentos;
    public static int contPasajeros, nomaleta=1, numeroestacion=1,turnoregistro;
    public static String tamañoAvion;
    public ListaAvion listadoble= new ListaAvion();
    public ColaPasajero cola= new ColaPasajero();
    public ListaMaleta listamaleta = new ListaMaleta();
    public ListaMantenimiento mante = new ListaMantenimiento();
    public ColaMantenimiento colamante = new ColaMantenimiento();
    public GrafAviones g = new GrafAviones();
    public MostrarAviones ma = new MostrarAviones();
    
    public Inicio() {
        initComponents();
        this.setLocationRelativeTo(null);
    }
    public void DatosPasajeros(){
        maletas = (int)(Math.random()*4)+1;
        documentos = (int)(Math.random()*10)+1;
        turnoregistro = (int)(Math.random()*3)+1;
        
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

        jLabel5 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        avion = new javax.swing.JTextField();
        jScrollPane1 = new javax.swing.JScrollPane();
        area = new javax.swing.JTextArea();
        estaciones = new javax.swing.JTextField();
        escritorios = new javax.swing.JTextField();
        cambiar = new javax.swing.JButton();
        generar = new javax.swing.JButton();
        equipaje = new javax.swing.JButton();
        mantenimiento = new javax.swing.JButton();
        btnescritorios = new javax.swing.JButton();
        desabordaje = new javax.swing.JButton();
        llegadaaviones = new javax.swing.JButton();
        jLabel4 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel5.setBackground(new java.awt.Color(255, 255, 255));
        jLabel5.setFont(new java.awt.Font("Eras Demi ITC", 1, 18)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(0, 0, 0));
        jLabel5.setText("No. Escritorios:");
        getContentPane().add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 150, -1, 20));

        jLabel2.setBackground(new java.awt.Color(255, 255, 255));
        jLabel2.setFont(new java.awt.Font("Eras Demi ITC", 1, 18)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(0, 0, 0));
        jLabel2.setText("No. Aviones:");
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 40, -1, 20));
        getContentPane().add(avion, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 40, 50, 30));

        area.setColumns(20);
        area.setRows(5);
        jScrollPane1.setViewportView(area);

        getContentPane().add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(290, 0, 300, 450));
        getContentPane().add(estaciones, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 100, 50, 30));
        getContentPane().add(escritorios, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 150, 50, 30));

        cambiar.setBackground(new java.awt.Color(102, 255, 102));
        cambiar.setFont(new java.awt.Font("Myanmar Text", 1, 18)); // NOI18N
        cambiar.setText("Cambiar Turno");
        cambiar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cambiarActionPerformed(evt);
            }
        });
        getContentPane().add(cambiar, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 340, 180, 50));

        generar.setBackground(new java.awt.Color(255, 204, 102));
        generar.setFont(new java.awt.Font("Myanmar Text", 1, 18)); // NOI18N
        generar.setText("Generar");
        generar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                generarActionPerformed(evt);
            }
        });
        getContentPane().add(generar, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 230, 130, 60));

        equipaje.setBackground(new java.awt.Color(51, 51, 255));
        equipaje.setFont(new java.awt.Font("Myanmar Text", 1, 18)); // NOI18N
        equipaje.setText("Equipaje");
        equipaje.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                equipajeActionPerformed(evt);
            }
        });
        getContentPane().add(equipaje, new org.netbeans.lib.awtextra.AbsoluteConstraints(650, 290, 200, 50));

        mantenimiento.setBackground(new java.awt.Color(51, 51, 255));
        mantenimiento.setFont(new java.awt.Font("Myanmar Text", 1, 18)); // NOI18N
        mantenimiento.setText("Mantenimiento");
        mantenimiento.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mantenimientoActionPerformed(evt);
            }
        });
        getContentPane().add(mantenimiento, new org.netbeans.lib.awtextra.AbsoluteConstraints(650, 370, 200, 50));

        btnescritorios.setBackground(new java.awt.Color(51, 51, 255));
        btnescritorios.setFont(new java.awt.Font("Myanmar Text", 1, 18)); // NOI18N
        btnescritorios.setText("Escritorios");
        btnescritorios.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnescritoriosActionPerformed(evt);
            }
        });
        getContentPane().add(btnescritorios, new org.netbeans.lib.awtextra.AbsoluteConstraints(650, 200, 200, 50));

        desabordaje.setBackground(new java.awt.Color(51, 51, 255));
        desabordaje.setFont(new java.awt.Font("Myanmar Text", 1, 18)); // NOI18N
        desabordaje.setText("Desabordaje");
        desabordaje.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                desabordajeActionPerformed(evt);
            }
        });
        getContentPane().add(desabordaje, new org.netbeans.lib.awtextra.AbsoluteConstraints(650, 110, 200, 50));

        llegadaaviones.setBackground(new java.awt.Color(51, 51, 255));
        llegadaaviones.setFont(new java.awt.Font("Myanmar Text", 1, 18)); // NOI18N
        llegadaaviones.setText("Llegada de Aviones");
        llegadaaviones.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                llegadaavionesActionPerformed(evt);
            }
        });
        getContentPane().add(llegadaaviones, new org.netbeans.lib.awtextra.AbsoluteConstraints(650, 30, 200, 50));

        jLabel4.setBackground(new java.awt.Color(255, 255, 255));
        jLabel4.setFont(new java.awt.Font("Eras Demi ITC", 1, 18)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(0, 0, 0));
        jLabel4.setText("No. Estaciones:");
        getContentPane().add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 100, -1, 20));

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/jet.jpg"))); // NOI18N
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 890, 460));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void generarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_generarActionPerformed
       if("".equals(avion.getText())||"".equals(estaciones.getText())||"".equals(escritorios.getText())){
           JOptionPane.showMessageDialog(null, "Ingrese los datos");
       }else{
           try{
           contador=contPasajeros=1;//todo inicia con el primer turno
           TamañoAvion();
           listadoble.insertarFinal(new NodoAvion(contador,tamañoAvion, noPasajeros, turnoDesabordaje, noMantenimiento));
           listadoble.recorrer();
           
           //----------------------PASAJEROS------------------------------------
           while(noPasajeros!=0){
               DatosPasajeros();
               cola.insertarFinal(new NodoPasajero(contPasajeros, maletas, documentos,turnoregistro));
               while(maletas!=0){
                   listamaleta.insertar(new NodoMaleta(nomaleta));
                   nomaleta++;
                   maletas--;
               }
               contPasajeros++;
               noPasajeros--;    
           }
           //--------------------ESTACIONES-------------------------------------
           int noestacion = Integer.parseInt(estaciones.getText());
           while(noestacion!=0){
               mante.insertarFinal(new NodoListaMantenimiento(numeroestacion,"LIBRE"));
               numeroestacion++;
               noestacion--;
           }
           
           // mostrar en el JTextArea
           area.setForeground(Color.BLUE);
           area.append("++++++++++++++TURNO "+contador+"++++++++++++++\n");
           area.append(listadoble.datos);
           area.append(cola.recorrer());
           area.append(listamaleta.recorrer());
           area.append(colamante.recorrer());
           area.append(mante.recorrer());

           area.append("++++++++++TURNO "+contador+" FINALIZADO++++++++++\n");
           generar.setEnabled(false);//deshabilita el boton de generar
           
           }catch(NumberFormatException n){
          JOptionPane.showMessageDialog(null,"Error "+n.getMessage());
          generar.setEnabled(true);
          }
       }
       //-----------------------GRAFICO----------------------------------------
       g.crearDot(listadoble.primero, "listaDoble");
       g.generarImagen("listaDoble.dot", "listaDoble.png");
       ImageIcon fot = new ImageIcon("listaDoble.png");
       Icon icono = new ImageIcon(fot.getImage().getScaledInstance(ma.imagen.getWidth(),ma.imagen.getHeight(), Image.SCALE_DEFAULT));
       ma.imagen.setIcon(icono);
       ma.repaint();

    }//GEN-LAST:event_generarActionPerformed

    private void cambiarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cambiarActionPerformed
      try{
          int noavion=Integer.parseInt(avion.getText());//obtengo el numero de aviones que me piden
         contador++;//el turno 
         
        if(contador<=noavion){//que imprima solo el numero de aviones que me pidieron
            
           cola.eliminar5();//elimina 5 pasajeros
           TamañoAvion();//genera datos del avion
           listadoble.disminuirTurno();//disminuye el numero de turno de desbordaje
           listadoble.insertarFinal(new NodoAvion(contador,tamañoAvion, noPasajeros, turnoDesabordaje, noMantenimiento));
           listadoble.recorrer();
           
           if(listadoble.noavion==0&&listadoble.tamaño==null&&listadoble.pasajero==0&&listadoble.desabordaje==0&&listadoble.mantenimiento==0){
               System.out.println("La cola de mantenimiento esta vacia");
           }else{
             colamante.insertarFinal(new NodoAvion(listadoble.noavion,listadoble.tamaño,listadoble.pasajero,listadoble.desabordaje,listadoble.mantenimiento));             
           }
           
           
           
           while(noPasajeros!=0){//imprime el numero de pasajeros generado anteriormente
               DatosPasajeros();
               cola.insertarFinal(new NodoPasajero(contPasajeros, maletas, documentos,turnoregistro));
               //-------------------------maletas----------------------------
               while(maletas!=0){
                   listamaleta.insertar(new NodoMaleta(nomaleta));
                   nomaleta++;
                   maletas--;
               }
               contPasajeros++;//aumete el numero que identifica a cada pasajero
               noPasajeros--;    
           }
         //  
           listadoble.probando();
           
           //--------------------mostrar en el JtextArea------------------------
           area.setForeground(Color.BLUE);
           area.append("++++++++++++++TURNO "+contador+"++++++++++++++\n");
           area.append(listadoble.datos);
           area.append(cola.recorrer());
           area.append(listamaleta.recorrer());
           area.append(colamante.recorrer());
           area.append(mante.recorrer());
           area.append("++++++++++TURNO "+contador+" FINALIZADO++++++++++\n");
           area.append("\n");
       }
      }catch(NumberFormatException n){
          JOptionPane.showMessageDialog(null,"Error "+n.getMessage());
          generar.setEnabled(true);
          }    
      //-----------------------GRAFICO----------------------------------------
       g.crearDot(listadoble.primero, "listaDoble");
       g.generarImagen("listaDoble.dot", "listaDoble.png");
       ImageIcon fot = new ImageIcon("listaDoble.png");
       Icon icono = new ImageIcon(fot.getImage().getScaledInstance(ma.imagen.getWidth(),ma.imagen.getHeight(), Image.SCALE_DEFAULT));
       ma.imagen.setIcon(icono);
       ma.repaint();
    }//GEN-LAST:event_cambiarActionPerformed

    private void llegadaavionesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_llegadaavionesActionPerformed
        //-----------------------GRAFICO----------------------------------------
       g.crearDot(listadoble.primero, "listaDoble");
       g.generarImagen("listaDoble.dot", "listaDoble.png");
       ImageIcon fot = new ImageIcon("listaDoble.png");
       Icon icono = new ImageIcon(fot.getImage().getScaledInstance(ma.imagen.getWidth(),ma.imagen.getHeight(), Image.SCALE_DEFAULT));
       ma.imagen.setIcon(icono);
       ma.repaint();
       
       // this.setVisible(false);
        ma.setVisible(true);
        ma.setLocationRelativeTo(null);
    }//GEN-LAST:event_llegadaavionesActionPerformed

    private void desabordajeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_desabordajeActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_desabordajeActionPerformed

    private void btnescritoriosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnescritoriosActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnescritoriosActionPerformed

    private void equipajeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_equipajeActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_equipajeActionPerformed

    private void mantenimientoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mantenimientoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_mantenimientoActionPerformed

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
    private javax.swing.JButton btnescritorios;
    private javax.swing.JButton cambiar;
    private javax.swing.JButton desabordaje;
    private javax.swing.JButton equipaje;
    private javax.swing.JTextField escritorios;
    private javax.swing.JTextField estaciones;
    private javax.swing.JButton generar;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JButton llegadaaviones;
    private javax.swing.JButton mantenimiento;
    // End of variables declaration//GEN-END:variables
}