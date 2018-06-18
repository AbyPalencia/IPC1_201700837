package proyecto1;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.ImageIcon;
import javax.swing.JOptionPane;
import javax.swing.Timer;

public class Juego extends javax.swing.JFrame {
public static int op,contador=0,turnog,turnoe,x,y;
public Tablero tab;
public Personaje per = new Personaje();
public boolean tablerocreado=false,turnogeneral=true;
public Inicio in = new Inicio();
public static String datos,ganador;
public Final fn = new Final();


    public Juego() {
        t= new Timer(10, acciones);
        t.start();
        initComponents();
        this.panel.setOpaque(false);
        this.panel.removeAll();
        this.panel.repaint();
        int tam=tamMatriz();
        this.tab= new Tablero(tam,panel);
        tablerocreado=true;
        
        this.jfondo.setIcon(new ImageIcon("C:\\Users\\abypa\\Desktop\\Git\\IPC1_201700837\\Proyecto 1\\Proyecto1\\src\\imagenes\\fondo.jpg"));
    }
    public void Desabilitar(){
        this.setVisible(false);
    }
    public int tamMatriz(){
        int tam=Integer.parseInt(JOptionPane.showInputDialog(null, "Ingrese tamaño del tablero:", JOptionPane.QUESTION_MESSAGE));
        return tam;
    }
    public void sinVidad(){
        if(Integer.parseInt(this.v1.getText())==0||Integer.parseInt(this.v2.getText())==0){
            t.stop();
        fn.setVisible(true);
        fn.setLocationRelativeTo(null);
        fn.setResizable(false);
        Desabilitar();
        if(Integer.parseInt(v1.getText())==Integer.parseInt(v2.getText())){
            ganador="Empate";
        }else if(Integer.parseInt(v1.getText())>Integer.parseInt(v2.getText())){
            ganador=in.nombre1;
        }else if(Integer.parseInt(v1.getText())<Integer.parseInt(v2.getText())){
            ganador=in.nombre2;
        }
        datos=in.nombre1+","+in.nombre2+","+tiempo.getText()+","+Integer.parseInt(v1.getText())+","+Integer.parseInt(v2.getText())+","+in.ju1+","+in.ju2+","+in.ju3+","+in.ju4+","+in.ju5+","+in.ju6+","+ganador;
        fn.datos.setText(datos);
        System.out.println(datos);
        }
    }
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        tiempo = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        ljugador1 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        v1 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jper1 = new javax.swing.JLabel();
        jper2 = new javax.swing.JLabel();
        jper3 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        ljugador2 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        v2 = new javax.swing.JLabel();
        jLabel13 = new javax.swing.JLabel();
        jper4 = new javax.swing.JLabel();
        jper5 = new javax.swing.JLabel();
        jper6 = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();
        arriba = new javax.swing.JButton();
        abajo = new javax.swing.JButton();
        izquierda = new javax.swing.JButton();
        panel = new javax.swing.JPanel();
        derecha = new javax.swing.JButton();
        jfondo = new javax.swing.JLabel();
        jButton2 = new javax.swing.JButton();
        Salir = new javax.swing.JButton();
        dado = new javax.swing.JTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setText("Tiempo:");

        tiempo.setFont(new java.awt.Font("Gill Sans Ultra Bold", 0, 18)); // NOI18N
        tiempo.setText("Timer");

        jLabel3.setText("Jugador 1:");

        ljugador1.setFont(new java.awt.Font("Lucida Fax", 0, 11)); // NOI18N
        ljugador1.setForeground(new java.awt.Color(0, 51, 255));
        ljugador1.setText("---------------------------");

        jLabel4.setText("Vida:");

        v1.setText("5");

        jLabel6.setText("Orden de los Personajes:");

        jper1.setFont(new java.awt.Font("Lucida Fax", 0, 11)); // NOI18N
        jper1.setForeground(new java.awt.Color(0, 51, 255));
        jper1.setText("1..........................");

        jper2.setFont(new java.awt.Font("Lucida Fax", 0, 11)); // NOI18N
        jper2.setForeground(new java.awt.Color(0, 51, 255));
        jper2.setText("1..........................");

        jper3.setFont(new java.awt.Font("Lucida Fax", 0, 11)); // NOI18N
        jper3.setForeground(new java.awt.Color(0, 51, 255));
        jper3.setText("1..........................");

        jLabel10.setText("Jugador 2:");

        ljugador2.setFont(new java.awt.Font("Lucida Fax", 0, 11)); // NOI18N
        ljugador2.setForeground(new java.awt.Color(0, 51, 255));
        ljugador2.setText("---------------------------");

        jLabel11.setText("Vida:");

        v2.setText("5");

        jLabel13.setText("Orden de los Personajes:");

        jper4.setFont(new java.awt.Font("Lucida Fax", 0, 11)); // NOI18N
        jper4.setForeground(new java.awt.Color(0, 51, 255));
        jper4.setText("1..........................");

        jper5.setFont(new java.awt.Font("Lucida Fax", 0, 11)); // NOI18N
        jper5.setForeground(new java.awt.Color(0, 51, 255));
        jper5.setText("1..........................");

        jper6.setFont(new java.awt.Font("Lucida Fax", 0, 11)); // NOI18N
        jper6.setForeground(new java.awt.Color(0, 51, 255));
        jper6.setText("1..........................");

        jButton1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/dado.png"))); // NOI18N
        jButton1.setText("Tirar");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        arriba.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/arriba.png"))); // NOI18N
        arriba.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                arribaActionPerformed(evt);
            }
        });

        abajo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/abajo.png"))); // NOI18N
        abajo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                abajoActionPerformed(evt);
            }
        });

        izquierda.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/derecha.png"))); // NOI18N
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
            .addGap(0, 465, Short.MAX_VALUE)
        );

        derecha.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/derecha (2).png"))); // NOI18N
        derecha.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                derechaActionPerformed(evt);
            }
        });

        jButton2.setText("Atacar");

        Salir.setText("Salir");
        Salir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                SalirActionPerformed(evt);
            }
        });

        dado.setText("dado");

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
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jButton1)
                            .addComponent(izquierda, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(arriba, javax.swing.GroupLayout.PREFERRED_SIZE, 44, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(abajo, javax.swing.GroupLayout.PREFERRED_SIZE, 44, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(5, 5, 5)
                                .addComponent(derecha, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(dado, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jButton2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addGap(12, 12, 12))))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel3)
                                    .addComponent(jLabel1))
                                .addGap(18, 18, 18)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(tiempo)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 63, Short.MAX_VALUE)
                                        .addComponent(Salir, javax.swing.GroupLayout.PREFERRED_SIZE, 64, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addComponent(ljugador1, javax.swing.GroupLayout.PREFERRED_SIZE, 162, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel4)
                                .addGap(18, 18, 18)
                                .addComponent(v1)
                                .addGap(42, 42, 42)
                                .addComponent(jLabel6))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel10)
                                .addGap(18, 18, 18)
                                .addComponent(ljugador2, javax.swing.GroupLayout.PREFERRED_SIZE, 162, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel11)
                                .addGap(18, 18, 18)
                                .addComponent(v2)
                                .addGap(42, 42, 42)
                                .addComponent(jLabel13))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(95, 95, 95)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jper1)
                                    .addComponent(jper2)
                                    .addComponent(jper3)
                                    .addComponent(jper4)
                                    .addComponent(jper6)
                                    .addComponent(jper5))))
                        .addContainerGap())))
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
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(tiempo)
                                    .addComponent(Salir)))
                            .addGap(19, 19, 19)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(jLabel3)
                                .addComponent(ljugador1))
                            .addGap(18, 18, 18)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(jLabel4)
                                .addComponent(v1)
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
                                .addComponent(v2)
                                .addComponent(jLabel13))
                            .addGap(6, 6, 6)
                            .addComponent(jper4)
                            .addGap(12, 12, 12)
                            .addComponent(jper5)
                            .addGap(12, 12, 12)
                            .addComponent(jper6)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(jButton2, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(jButton1)
                                    .addComponent(dado, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addGroup(layout.createSequentialGroup()
                                    .addGap(18, 18, 18)
                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                        .addComponent(izquierda, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(derecha, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                .addGroup(layout.createSequentialGroup()
                                    .addGap(6, 6, 6)
                                    .addComponent(arriba, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                    .addComponent(abajo, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE))))))
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents
    private Timer t;
    private int m,s,cs;
    private ActionListener acciones = new ActionListener(){
    @Override
    public void actionPerformed(ActionEvent ae) {
        cs++;
        if(cs==100){
            cs=0;
            ++s;
        }if(s==60){
            s=0;
            ++m;
        }
        if(m==in.time){
        t.stop();
        fn.setVisible(true);
        fn.setLocationRelativeTo(null);
        fn.setResizable(false);
        Desabilitar();
        if(Integer.parseInt(v1.getText())==Integer.parseInt(v2.getText())){
            ganador="Empate";
        }else if(Integer.parseInt(v1.getText())>Integer.parseInt(v2.getText())){
            ganador=in.nombre1;
        }else if(Integer.parseInt(v1.getText())<Integer.parseInt(v2.getText())){
            ganador=in.nombre2;
        }
        datos=in.nombre1+","+in.nombre2+","+tiempo.getText()+","+Integer.parseInt(v1.getText())+","+Integer.parseInt(v2.getText())+","+in.ju1+","+in.ju2+","+in.ju3+","+in.ju4+","+in.ju5+","+in.ju6+","+ganador;
        fn.datos.setText(datos);
        System.out.println(datos);
        }
        actualizarLabel();
    }    
    };
    private void actualizarLabel(){
        String tiempo = (m<=9?"0":"")+m+":"+(s<=9?"0":"")+s+":"+(cs<=9?"0":"")+cs;
        this.tiempo.setText(tiempo);
    }
    private void arribaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_arribaActionPerformed
         
        if (!tablerocreado) {
            System.out.println("Tablero no creado");
            return;
        }else{
        if(dado.getText().equals("dado")){
          JOptionPane.showConfirmDialog(null, "Primero debe lanzar el dado");
        }else{
        op=3;
            switch (contador) {
                case 1:
                    //Movimiento mov1= new Movimiento(Integer.parseInt(dado.getText()),tab,op);
                    //mov1.start();
                    this.panel.removeAll();
                    this.panel.repaint();
                    sinVidad();
                    MovPer1 mov = new MovPer1(Integer.parseInt(dado.getText()),tab,op);
                    mov.start();
                    break;
                case 2:
                    {
                        System.out.println("el contador es 2");
                        this.panel.removeAll();
                        this.panel.repaint();
                        sinVidad();
                        MovPer2 mov2 = new MovPer2(Integer.parseInt(dado.getText()),tab,op);
                        mov2.start();
                        break;
                    }
                case 3:
                    {
                        this.panel.removeAll();
                        this.panel.repaint();
                        sinVidad();
                        System.out.println("el contador es 3");
                        MovPer3 mov2 = new MovPer3(Integer.parseInt(dado.getText()),tab,op);
                        mov2.start();
                        break;
                    }
                case 4:
                    {
                        this.panel.removeAll();
                        this.panel.repaint();
                        sinVidad();
                        MovPer4 mov2 = new MovPer4(Integer.parseInt(dado.getText()),tab,op);
                        mov2.start();
                        break;
                    }
                case 5:
                    {
                        this.panel.removeAll();
                        this.panel.repaint();
                        sinVidad();
                        MovPer5 mov2 = new MovPer5(Integer.parseInt(dado.getText()),tab,op);
                        mov2.start();
                        break;
                    }
                case 6:
                    {
                        this.panel.removeAll();
                        this.panel.repaint();
                        sinVidad();
                        MovPer6 mov2 = new MovPer6(Integer.parseInt(dado.getText()),tab,op);
                        mov2.start();
                        break;
                    }
                default:
                    break;
            }
      }}
     
      
    }//GEN-LAST:event_arribaActionPerformed

    private void abajoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_abajoActionPerformed
      
        if (!tablerocreado) {
            System.out.println("Tablero no creado");
            return;
        }else{
          if(dado.getText().equals("dado")){
          JOptionPane.showConfirmDialog(null, "Primero debe lanzar el dado");
      }else{
        op=2;
              switch (contador) {
                  case 1:
                      //Movimiento mov1= new Movimiento(Integer.parseInt(dado.getText()),tab,op);
                      //mov1.start();
                      this.panel.removeAll();
                      this.panel.repaint();
                      sinVidad();
                      MovPer1 mov = new MovPer1(Integer.parseInt(dado.getText()),tab,op);
                      mov.start();
                      break;
                  case 2:
                      {
                          System.out.println("el contador es 2");
                          this.panel.removeAll();
                          this.panel.repaint();
                          sinVidad();
                          MovPer2 mov2 = new MovPer2(Integer.parseInt(dado.getText()),tab,op);
                          mov2.start();
                          break;
                      }
                  case 3:
                      {
                          this.panel.removeAll();
                          this.panel.repaint();
                          sinVidad();
                          System.out.println("el contador es 3");
                          MovPer3 mov2 = new MovPer3(Integer.parseInt(dado.getText()),tab,op);
                          mov2.start();
                          break;
                      }
                   case 4:
                    {
                        this.panel.removeAll();
                        this.panel.repaint();
                        sinVidad();
                        MovPer4 mov2 = new MovPer4(Integer.parseInt(dado.getText()),tab,op);
                        mov2.start();
                        break;
                    }
                case 5:
                    {
                        this.panel.removeAll();
                        this.panel.repaint();
                        sinVidad();
                        MovPer5 mov2 = new MovPer5(Integer.parseInt(dado.getText()),tab,op);
                        mov2.start();
                        break;
                    }
                case 6:
                    {
                        this.panel.removeAll();
                        this.panel.repaint();
                        sinVidad();
                        MovPer6 mov2 = new MovPer6(Integer.parseInt(dado.getText()),tab,op);
                        mov2.start();
                        break;
                    }
                  default:
                      break;
              }
      }}
          
          
      
      
    }//GEN-LAST:event_abajoActionPerformed

    private void derechaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_derechaActionPerformed
        
          if (!tablerocreado) {
            System.out.println("Tablero no creado");
            return;
        }else{
       if(dado.getText().equals("dado")){
          JOptionPane.showConfirmDialog(null, "Primero debe lanzar el dado");
      }else{
        op=0;
           switch (contador) {
               case 1:
                   //Movimiento mov1= new Movimiento(Integer.parseInt(dado.getText()),tab,op);
                   //mov1.start();
                   this.panel.removeAll();
                   this.panel.repaint();
                   sinVidad();
                   MovPer1 mov = new MovPer1(Integer.parseInt(dado.getText()),tab,op);
                   mov.start();
                   break;
               case 2:
                   {
                       System.out.println("el contador es 2");
                       this.panel.removeAll();
                       this.panel.repaint();
                       sinVidad();
                       MovPer2 mov2 = new MovPer2(Integer.parseInt(dado.getText()),tab,op);
                       mov2.start();
                       break;
                   }
               case 3:
                   {
                       System.out.println("el contador es 3");
                       this.panel.removeAll();
                       this.panel.repaint();
                       sinVidad();
                       MovPer3 mov2 = new MovPer3(Integer.parseInt(dado.getText()),tab,op);
                       mov2.start();
                       break;
                   }
               case 4:
                    {
                        this.panel.removeAll();
                        this.panel.repaint();
                        sinVidad();
                        MovPer4 mov2 = new MovPer4(Integer.parseInt(dado.getText()),tab,op);
                        mov2.start();
                        break;
                    }
                case 5:
                    {
                        this.panel.removeAll();
                        this.panel.repaint();
                        sinVidad();
                        MovPer5 mov2 = new MovPer5(Integer.parseInt(dado.getText()),tab,op);
                        mov2.start();
                        break;
                    }
                case 6:
                    {
                        this.panel.removeAll();
                        this.panel.repaint();
                        sinVidad();
                        MovPer6 mov2 = new MovPer6(Integer.parseInt(dado.getText()),tab,op);
                        mov2.start();
                        break;
                    }
               default:
                   break;
           }
} }
     
         
    }//GEN-LAST:event_derechaActionPerformed

    private void izquierdaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_izquierdaActionPerformed
       
         if (!tablerocreado) {
            System.out.println("Tablero no creado");
            return;
        }else{
            if(dado.getText().equals("dado")){
          JOptionPane.showMessageDialog(null, "Primero debe lanzar el dado");
          
      }else{
        op=1;
                switch (contador) {
                    case 1:
                        //Movimiento mov1= new Movimiento(Integer.parseInt(dado.getText()),tab,op);
                        //mov1.start();
                        this.panel.removeAll();
                        this.panel.repaint();
                        sinVidad();
                        MovPer1 mov = new MovPer1(Integer.parseInt(dado.getText()),tab,op);
                        mov.start();
                        break;
                    case 2:
                        {
                            System.out.println("el contador es 2");
                            this.panel.removeAll();
                            this.panel.repaint();
                            sinVidad();
                            MovPer2 mov2 = new MovPer2(Integer.parseInt(dado.getText()),tab,op);
                            mov2.start();
                            break;
                        }
                    case 3:
                        {
                            System.out.println("el contador es 3");
                            this.panel.removeAll();
                            this.panel.repaint();
                            sinVidad();
                            MovPer3 mov2 = new MovPer3(Integer.parseInt(dado.getText()),tab,op);
                            mov2.start();
                            break;
                        }
                    case 4:
                    {
                        this.panel.removeAll();
                        this.panel.repaint();
                        sinVidad();
                        MovPer4 mov2 = new MovPer4(Integer.parseInt(dado.getText()),tab,op);
                        mov2.start();
                        break;
                    }
                case 5:
                    {
                        this.panel.removeAll();
                        this.panel.repaint();
                        sinVidad();
                        MovPer5 mov2 = new MovPer5(Integer.parseInt(dado.getText()),tab,op);
                        mov2.start();
                        break;
                    }
                case 6:
                    {
                        this.panel.removeAll();
                        this.panel.repaint();
                        sinVidad();
                        MovPer6 mov2 = new MovPer6(Integer.parseInt(dado.getText()),tab,op);
                        mov2.start();
                        break;
                    }
                    default:
                        break;
                }
        }}
     
    }//GEN-LAST:event_izquierdaActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        int a = (int)(Math.random()*6)+1;
        this.dado.setText(Integer.toString(a));
        
        if(contador>=6){
            contador=0;
        }
        contador++;
       System.out.println(contador);
    }//GEN-LAST:event_jButton1ActionPerformed

    private void SalirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_SalirActionPerformed
        t.stop();
        fn.setVisible(true);
        fn.setLocationRelativeTo(null);
        fn.setResizable(false);
        Desabilitar();
        if(Integer.parseInt(v1.getText())==Integer.parseInt(v2.getText())){
            ganador="Empate";
        }else if(Integer.parseInt(v1.getText())>Integer.parseInt(v2.getText())){
            ganador=in.nombre1;
        }else if(Integer.parseInt(v1.getText())<Integer.parseInt(v2.getText())){
            ganador=in.nombre2;
        }
        datos=in.nombre1+","+in.nombre2+","+tiempo.getText()+","+Integer.parseInt(v1.getText())+","+Integer.parseInt(v2.getText())+","+in.ju1+","+in.ju2+","+in.ju3+","+in.ju4+","+in.ju5+","+in.ju6+","+ganador;
        fn.datos.setText(datos);
        System.out.println(datos);
    }//GEN-LAST:event_SalirActionPerformed

    public static void main(String args[]) {

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
    private javax.swing.JButton Salir;
    private javax.swing.JButton abajo;
    private javax.swing.JButton arriba;
    private javax.swing.JTextField dado;
    private javax.swing.JButton derecha;
    private javax.swing.JButton izquierda;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jfondo;
    public static javax.swing.JLabel jper1;
    public static javax.swing.JLabel jper2;
    public static javax.swing.JLabel jper3;
    public static javax.swing.JLabel jper4;
    public static javax.swing.JLabel jper5;
    public static javax.swing.JLabel jper6;
    public javax.swing.JLabel ljugador1;
    public static javax.swing.JLabel ljugador2;
    public javax.swing.JPanel panel;
    public static javax.swing.JLabel tiempo;
    public static javax.swing.JLabel v1;
    public static javax.swing.JLabel v2;
    // End of variables declaration//GEN-END:variables
}
