package practicavacasipc1;

import java.awt.Color;
import java.awt.Image;
import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.JOptionPane;

public class Inicio extends javax.swing.JFrame {
    public static int turnoDesabordaje=0,noPasajeros,noMantenimiento, contador, maletas,documentos;
    public static int contPasajeros, nomaleta, numeroestacion=1,turnoregistro;
    public static String tamañoAvion, letraescritorio;
    
    public ListaAvion listadoble= new ListaAvion();
    public static ListaMaleta listamaleta = new ListaMaleta();
    public static ListaMantenimiento mante = new ListaMantenimiento();
    public ListaEscritorio listaescritorio = new ListaEscritorio();
    
    public ColaPasajero cola= new ColaPasajero();
    public static ColaMantenimiento colamante = new ColaMantenimiento();
   // public static ColaEscritorio colaescritorio;
    
    public GrafAviones g = new GrafAviones();
    public GrafPasajero gpasajero = new GrafPasajero();
    public GrafMaleta gmaleta = new GrafMaleta();
    public GrafMantenimiento gmantenimiento = new GrafMantenimiento();
    public GrafTodo gtodo = new GrafTodo();
    
    public MostrarAviones ma = new MostrarAviones();
    public MostrarPasajero mp = new MostrarPasajero();
    public MostrarMaletas mm = new MostrarMaletas();
    public MostrarMantenimiento mt = new  MostrarMantenimiento();
    public MostrarTodo mto = new MostrarTodo();
    
    public Inicio() {
        initComponents();
        this.setLocationRelativeTo(null);
    }
   
    public void DatosPasajeros(){
        maletas = (int)(Math.random()*4)+1;
        documentos = (int)(Math.random()*10)+1;
        turnoregistro = (int)(Math.random()*3)+1;
    }
    
    public void LetraEscritorio(){
        try{
    String [] abecedario =new String[] {"A", "B", "C", "D", "E", "F", "G", "H", "I", "J",
    "K", "L", "M","N","O","P","Q","R","S","T","U","V","W", "X","Y","Z" };
    int numRandon = (int) Math.round(Math.random()*25) ;
    letraescritorio = abecedario[numRandon];
        }catch(NumberFormatException n){
          JOptionPane.showMessageDialog(null,"Error "+n.getMessage());
          generar.setEnabled(true);
          }
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
        llegadaaviones1 = new javax.swing.JButton();
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
        getContentPane().add(equipaje, new org.netbeans.lib.awtextra.AbsoluteConstraints(650, 250, 200, 50));

        mantenimiento.setBackground(new java.awt.Color(51, 51, 255));
        mantenimiento.setFont(new java.awt.Font("Myanmar Text", 1, 18)); // NOI18N
        mantenimiento.setText("Mantenimiento");
        mantenimiento.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mantenimientoActionPerformed(evt);
            }
        });
        getContentPane().add(mantenimiento, new org.netbeans.lib.awtextra.AbsoluteConstraints(650, 320, 200, 50));

        btnescritorios.setBackground(new java.awt.Color(51, 51, 255));
        btnescritorios.setFont(new java.awt.Font("Myanmar Text", 1, 18)); // NOI18N
        btnescritorios.setText("Escritorios");
        btnescritorios.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnescritoriosActionPerformed(evt);
            }
        });
        getContentPane().add(btnescritorios, new org.netbeans.lib.awtextra.AbsoluteConstraints(650, 170, 200, 50));

        llegadaaviones1.setBackground(new java.awt.Color(51, 51, 255));
        llegadaaviones1.setFont(new java.awt.Font("Myanmar Text", 1, 18)); // NOI18N
        llegadaaviones1.setText("Todo");
        llegadaaviones1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                llegadaaviones1ActionPerformed(evt);
            }
        });
        getContentPane().add(llegadaaviones1, new org.netbeans.lib.awtextra.AbsoluteConstraints(650, 390, 200, 50));

        desabordaje.setBackground(new java.awt.Color(51, 51, 255));
        desabordaje.setFont(new java.awt.Font("Myanmar Text", 1, 18)); // NOI18N
        desabordaje.setText("Desabordaje");
        desabordaje.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                desabordajeActionPerformed(evt);
            }
        });
        getContentPane().add(desabordaje, new org.netbeans.lib.awtextra.AbsoluteConstraints(650, 90, 200, 50));

        llegadaaviones.setBackground(new java.awt.Color(51, 51, 255));
        llegadaaviones.setFont(new java.awt.Font("Myanmar Text", 1, 18)); // NOI18N
        llegadaaviones.setText("Llegada de Aviones");
        llegadaaviones.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                llegadaavionesActionPerformed(evt);
            }
        });
        getContentPane().add(llegadaaviones, new org.netbeans.lib.awtextra.AbsoluteConstraints(650, 20, 200, 50));

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
           
           //----------------------PASAJEROS------------------------------------
           while(noPasajeros!=0){
               DatosPasajeros();
               cola.insertarFinal(new NodoPasajero(contPasajeros, maletas, documentos,turnoregistro));
               while(maletas!=0){
                   nomaleta++;
                   listamaleta.insertar(new NodoMaleta(nomaleta));
                   maletas--;
               }
               contPasajeros++;
               noPasajeros--;    
           }
           //------------------------ESCRITORIOS--------------------------------
           int noescritorios = Integer.parseInt(escritorios.getText());
           /*for(int j=1; j<=noescritorios; j++){
           LetraEscritorio();
           listaescritorio.insertarFinal(new NodoEscritorio(letraescritorio,"libre"));
           colaescritorio = new ColaEscritorio(letraescritorio);
           for(int i=1;i<=7;i++){
           colaescritorio.insertarFinal(new NodoPasajero(2,3,2,12));
           }
           }*/
           while(noescritorios!=0){
               LetraEscritorio();
               listaescritorio.insertarFinal(new NodoEscritorio(letraescritorio,"libre"));
               listaescritorio.crearCola(letraescritorio);
               /* colaescritorio = new ColaEscritorio(letraescritorio);
               for(int i=1;i<=7;i++){
               colaescritorio.insertarFinal(new NodoPasajero(2,3,2,12));
               }*/
               noescritorios--;
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
           area.append(listadoble.recorrer());      //Aviones
           //area.append(cola.recorrer());            //pasajeros
           //area.append(listamaleta.recorrer());     //Maletas
           //area.append(listaescritorio.recorrer()); //Lista escritorio
         //  area.append(colaescritorio.recorrer());  //Cola escritorio
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
       ma.imagen.setIcon(new ImageIcon("listaDoble.png"));
       ma.repaint();
       
       gpasajero.crearDot(cola.primero, "mostrarPasajero");
       g.generarImagen("mostrarPasajero.dot", "mostrarPasajero.png");
       ImageIcon fotpas = new ImageIcon("mostrarPasajero.png");
       Icon iconopas = new ImageIcon(fotpas.getImage().getScaledInstance(mp.imagen.getWidth(),mp.imagen.getHeight(), Image.SCALE_DEFAULT));
       mp.imagen.setIcon(iconopas);
       mp.repaint();
       
       gmaleta.crearDot(listamaleta.primero, "mostrarMaleta");
       gmaleta.generarImagen("mostrarMaleta.dot", "mostrarMaleta.png");
       ImageIcon fotmaleta = new ImageIcon("mostrarMaleta.png");
       Icon iconomaleta = new ImageIcon(fotmaleta.getImage().getScaledInstance(mm.imagen.getWidth(),mm.imagen.getHeight(), Image.SCALE_DEFAULT));
       mm.imagen.setIcon(iconomaleta);
       mm.repaint();
       
       gmantenimiento.crearDot(mante.primero,colamante.primero, "mostrarMantenimiento");
       gmantenimiento.generarImagen("mostrarMantenimiento.dot", "mostrarMantenimiento.png");
       ImageIcon fotmante = new ImageIcon("mostrarMantenimiento.png");
       Icon iconomante = new ImageIcon(fotmante.getImage().getScaledInstance(mt.imagen.getWidth(),mt.imagen.getHeight(), Image.SCALE_DEFAULT));
       mt.imagen.setIcon(iconomante);
       mt.repaint();
       
       gtodo.crearDot(cola.primero,listamaleta.primero,mante.primero,listadoble.primero, "mostrarTodo");
       gtodo.generarImagen("mostrarTodo.dot", "mostrarTodo.png");
       ImageIcon fottodo = new ImageIcon("mostrarTodo.png");
       Icon iconotodo = new ImageIcon(fottodo.getImage().getScaledInstance(mto.imagen.getWidth(),mto.imagen.getHeight(), Image.SCALE_DEFAULT));
       mto.imagen.setIcon(iconotodo);
       mto.repaint();
    }//GEN-LAST:event_generarActionPerformed

    private void cambiarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cambiarActionPerformed
      try{
          int noavion=Integer.parseInt(avion.getText());//obtengo el numero de aviones que me piden
          contador++;//el turno 
          cola.eliminar5();//elimina 5 pasajeros
           TamañoAvion();//genera datos del avion
           listadoble.disminuirTurno();//disminuye el numero de turno de desbordaje
           colamante.AgregaraLista(mante.primero);
        if(contador<=noavion){//que imprima solo el numero de aviones que me pidieron
           listadoble.insertarFinal(new NodoAvion(contador,tamañoAvion, noPasajeros, turnoDesabordaje, noMantenimiento));
        while(noPasajeros!=0){//imprime el numero de pasajeros generado anteriormente
            DatosPasajeros();
            cola.insertarFinal(new NodoPasajero(contPasajeros, maletas, documentos,turnoregistro));
               
               //-------------------------maletas----------------------------
               while(maletas!=0){
                   nomaleta++;
                   listamaleta.insertar(new NodoMaleta(nomaleta));
                   maletas--;
               }
               contPasajeros++;//aumete el numero que identifica a cada pasajero
               noPasajeros--;    
           }
        }
           //--------------------mostrar en el JtextArea------------------------
           area.setForeground(Color.BLUE);
           area.append("++++++++++++++TURNO "+contador+"++++++++++++++\n");
           area.append(listadoble.recorrer());    //Aviones
          // area.append(cola.recorrer());          //Pasajeros
          //area.append(listamaleta.recorrer());   //Maletas
          // area.append(colaescritorio.recorrer());
           area.append(colamante.recorrer());
           area.append(mante.recorrer());
           area.append("++++++++++TURNO "+contador+" FINALIZADO++++++++++\n");
           area.append("\n");
           
           
 mante.disminuirTurno();
      }catch(NumberFormatException n){
          JOptionPane.showMessageDialog(null,"Error "+n.getMessage());
          generar.setEnabled(true);
          }    
      //-----------------------GRAFICO----------------------------------------
       g.crearDot(listadoble.primero, "listaDoble");
       g.generarImagen("listaDoble.dot", "listaDoble.png");
       ImageIcon fot = new ImageIcon("listaDoble.png");
       Icon icono = new ImageIcon(fot.getImage().getScaledInstance(ma.imagen.getWidth(),ma.imagen.getHeight(), Image.SCALE_DEFAULT));
       ma.imagen.setIcon(new ImageIcon("listaDoble.png"));
       ma.repaint();
       
       gpasajero.crearDot(cola.primero, "mostrarPasajero");
       g.generarImagen("mostrarPasajero.dot", "mostrarPasajero.png");
       ImageIcon fotpas = new ImageIcon("mostrarPasajero.png");
       Icon iconopas = new ImageIcon(fotpas.getImage().getScaledInstance(mp.imagen.getWidth(),mp.imagen.getHeight(), Image.SCALE_DEFAULT));
       mp.imagen.setIcon(iconopas);
       mp.repaint();
       
       gmaleta.crearDot(listamaleta.primero, "mostrarMaleta");
       gmaleta.generarImagen("mostrarMaleta.dot", "mostrarMaleta.png");
       ImageIcon fotmaleta = new ImageIcon("mostrarMaleta.png");
       Icon iconomaleta = new ImageIcon(fotmaleta.getImage().getScaledInstance(mm.imagen.getWidth(),mm.imagen.getHeight(), Image.SCALE_DEFAULT));
       mm.imagen.setIcon(iconomaleta);
       mm.repaint();
       
       gmantenimiento.crearDot(mante.primero, colamante.primero,"mostrarMantenimiento");
       gmantenimiento.generarImagen("mostrarMantenimiento.dot", "mostrarMantenimiento.png");
       ImageIcon fotmante = new ImageIcon("mostrarMantenimiento.png");
       Icon iconomante = new ImageIcon(fotmante.getImage().getScaledInstance(mt.imagen.getWidth(),mt.imagen.getHeight(), Image.SCALE_DEFAULT));
       mt.imagen.setIcon(iconomante);
       mt.repaint();
       
       gtodo.crearDot(cola.primero,listamaleta.primero,mante.primero,listadoble.primero, "mostrarTodo");
       gtodo.generarImagen("mostrarTodo.dot", "mostrarTodo.png");
       ImageIcon fottodo = new ImageIcon("mostrarTodo.png");
       Icon iconotodo = new ImageIcon(fottodo.getImage().getScaledInstance(mto.imagen.getWidth(),mto.imagen.getHeight(), Image.SCALE_DEFAULT));
       mto.imagen.setIcon(iconotodo);
       mto.repaint();
    }//GEN-LAST:event_cambiarActionPerformed

    private void llegadaavionesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_llegadaavionesActionPerformed
        //-----------------------GRAFICO----------------------------------------
       g.crearDot(listadoble.primero, "listaDoble");
       g.generarImagen("listaDoble.dot", "listaDoble.png");
       ImageIcon fot = new ImageIcon("listaDoble.png");
       Icon icono = new ImageIcon(fot.getImage().getScaledInstance(ma.imagen.getWidth(),ma.imagen.getHeight(), Image.SCALE_DEFAULT));
       ma.imagen.setIcon(icono);
       ma.repaint();
       
        ma.setVisible(true);
        ma.setLocationRelativeTo(null);
    }//GEN-LAST:event_llegadaavionesActionPerformed

    private void desabordajeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_desabordajeActionPerformed
       gpasajero.crearDot(cola.primero, "mostrarPasajero");
       g.generarImagen("mostrarPasajero.dot", "mostrarPasajero.png");
       ImageIcon fotpas = new ImageIcon("mostrarPasajero.png");
       Icon iconopas = new ImageIcon(fotpas.getImage().getScaledInstance(mp.imagen.getWidth(),mp.imagen.getHeight(), Image.SCALE_DEFAULT));
       mp.imagen.setIcon(iconopas);
       mp.repaint();
       
       mp.setVisible(true);
       mp.setLocationRelativeTo(null);
    }//GEN-LAST:event_desabordajeActionPerformed

    private void btnescritoriosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnescritoriosActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnescritoriosActionPerformed

    private void equipajeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_equipajeActionPerformed
       gmaleta.crearDot(listamaleta.primero, "mostrarMaleta");
       gmaleta.generarImagen("mostrarMaleta.dot", "mostrarMaleta.png");
       ImageIcon fotmaleta = new ImageIcon("mostrarMaleta.png");
       Icon iconomaleta = new ImageIcon(fotmaleta.getImage().getScaledInstance(mm.imagen.getWidth(),mm.imagen.getHeight(), Image.SCALE_DEFAULT));
       mm.imagen.setIcon(iconomaleta);
       mm.repaint();
       
       mm.setVisible(true);
       mm.setLocationRelativeTo(null);
    }//GEN-LAST:event_equipajeActionPerformed

    private void mantenimientoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mantenimientoActionPerformed
       gmantenimiento.crearDot(mante.primero, colamante.primero,"mostrarMantenimiento");
       gmantenimiento.generarImagen("mostrarMantenimiento.dot", "mostrarMantenimiento.png");
       ImageIcon fotmante = new ImageIcon("mostrarMantenimiento.png");
       Icon iconomante = new ImageIcon(fotmante.getImage().getScaledInstance(mt.imagen.getWidth(),mt.imagen.getHeight(), Image.SCALE_DEFAULT));
       mt.imagen.setIcon(iconomante);
       mt.repaint();
       
       mt.setVisible(true);
       mt.setLocationRelativeTo(null);
    }//GEN-LAST:event_mantenimientoActionPerformed

    private void llegadaaviones1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_llegadaaviones1ActionPerformed
       gtodo.crearDot(cola.primero,listamaleta.primero,mante.primero,listadoble.primero, "mostrarTodo");
       gtodo.generarImagen("mostrarTodo.dot", "mostrarTodo.png");
       ImageIcon fottodo = new ImageIcon("mostrarTodo.png");
       Icon iconotodo = new ImageIcon(fottodo.getImage().getScaledInstance(mto.imagen.getWidth(),mto.imagen.getHeight(), Image.SCALE_DEFAULT));
       mto.imagen.setIcon(iconotodo);
       mto.repaint();
       
       mto.setVisible(true);
       mto.setLocationRelativeTo(null);
    }//GEN-LAST:event_llegadaaviones1ActionPerformed

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
    private javax.swing.JButton llegadaaviones1;
    private javax.swing.JButton mantenimiento;
    // End of variables declaration//GEN-END:variables
}