package proyecto1;
import java.awt.BorderLayout;
import java.awt.Color;
import javax.swing.*;

public class Tablero {
    public int tam=0,a,b,tambloquey=0,tambloquex=0,diez=0, cinco=0;
    public JPanel fondo=null;
    public int[][] vecL;
    public int[][] posper;
    public int[] posperx;
    public int[] pospery;
    public Personaje per;
    public Inicio ini = new Inicio();
    public JLabel[][] vecG;
    
    public Tablero(int tam, JPanel panel){
        this.tam=tam;
        this.fondo= panel;
        llenar();
    }
    public void llenar(){
        tambloquey= 440/tam;
        tambloquex= 420/tam;
        vecL= new int[tam][tam];
        vecG= new JLabel[tam][tam];
        posper = new int[tam][tam];
        posperx= new int[tam];
        pospery= new int[tam];
        //1 persona 0 casillas vacias
       // vecL[0][0]=1;
        per= new Personaje();
        per.posponerx=a;
        per.posponery=b;
        for (int i = 1; i < tam; i++) {
            for(int j=1; j < tam; j++){
                vecL[i][j]=0;
            }
        }
        for(int p =0; p<=6; ++p){
            a = (int)(Math.random() *tam);
            b = (int)(Math.random() *tam);
                System.out.println(a+ "    "+b);
            if(vecL[a][b]!=0){
                --p;
            }else{
                vecL[a][b]=p;
            }
        }
        for (int i = 1; i < tam; i++) {
            for(int j=1; j < tam; j++){
                if(vecL[i][j]==1){//guardar posicion de la princesa 1
                    posper[1][1]=vecL[i][j];
                    posperx[1]=i;
                    pospery[1]=j;
                    System.out.println("el personaje 1 esta en la posicion "+posperx[0]+"  "+j);
                }
                if(vecL[i][j]==2){//guardar posicion del personaje 2
                    posper[2][2]=vecL[i][j];
                    posperx[2]=i;
                    pospery[2]=j;
                }
                if(vecL[i][j]==3){//guardar posicion del personaje 3
                    posper[3][3]=vecL[i][j];
                    posperx[3]=i;
                    pospery[3]=j;
                }
                if(vecL[i][j]==4){//guardar posicion del personaje 4
                    posper[4][4]=vecL[i][j];
                    posperx[4]=i;
                    pospery[4]=j;
                }
                if(vecL[i][j]==5){//guardar posicion del personaje 5
                    posper[5][5]=vecL[i][j];
                    posperx[5]=i;
                    pospery[5]=j;
                }
                if(vecL[i][j]==6){//guardar posicion del personaje 6
                    posper[6][6]=vecL[i][j];
                    posperx[6]=i;
                    pospery[6]=j;
                }
            }
        }
        
        cinco= (int) (tam*tam*0.05);
        diez=(int) (tam*tam*0.1);
        for(int p =0; p<cinco; ++p){
            a = (int)(Math.random() *tam);
            b = (int)(Math.random() *tam);
            if(vecL[a][b]!=0){
                --p;
            }else{
                vecL[a][b]=7;
            }
        }
        for(int p =0; p<diez; ++p){
            a = (int)(Math.random() *tam);
            b = (int)(Math.random() *tam);
            if(vecL[a][b]!=0){
                --p;
            }else{
                vecL[a][b]=8;
            }
        }
        repintar();
    }
    
    public void repintar(){
        JLabel casilla= null;
        for (int i = 0; i < tam; i++) {
            for(int j=0; j< tam; j++){
                if(vecL[i][j]==0){// 0 es casilla vacia
                    casilla= new JLabel();
                }if(vecL[i][j]==1){// 1 es el primer presonaje del primer jugador
                   if(ini.p1==0){
                    casilla= new JLabel(this.per.princesa1(tambloquex,tambloquey));
                   }else if(ini.p1==1){
                    casilla= new JLabel(this.per.mago1(tambloquex,tambloquey));  
                   }else if(ini.p1==2){
                    casilla= new JLabel(this.per.guerrero1(tambloquex,tambloquey)); 
                   }  
                }
                if(vecL[i][j]==2){// 2 es el primer personaje del segundo jugador
                    if(ini.p4==0){
                    casilla= new JLabel(this.per.princesa2(tambloquex,tambloquey));
                   }else if(ini.p4==1){
                    casilla= new JLabel(this.per.mago2(tambloquex,tambloquey));  
                   }else if(ini.p4==2){
                    casilla= new JLabel(this.per.guerrero2(tambloquex,tambloquey)); 
                   }
                }
                if(vecL[i][j]==3){// 3 es el segundo personaje del primer jugador
                    if(ini.p2==0){
                    casilla= new JLabel(this.per.princesa1(tambloquex,tambloquey));
                   }else if(ini.p2==1){
                    casilla= new JLabel(this.per.mago1(tambloquex,tambloquey));  
                   }else if(ini.p2==2){
                    casilla= new JLabel(this.per.guerrero1(tambloquex,tambloquey)); 
                   }
                }
                if(vecL[i][j]==4){// 4 es el segundo personaje del segundo jugador
                    if(ini.p5==0){
                    casilla= new JLabel(this.per.princesa2(tambloquex,tambloquey));
                   }else if(ini.p5==1){
                    casilla= new JLabel(this.per.mago2(tambloquex,tambloquey));  
                   }else if(ini.p5==2){
                    casilla= new JLabel(this.per.guerrero2(tambloquex,tambloquey)); 
                   }
                }
                if(vecL[i][j]==5){// 5 es el tercer personaje del primer jugador
                    if(ini.p3==0){
                    casilla= new JLabel(this.per.princesa1(tambloquex,tambloquey));
                   }else if(ini.p3==1){
                    casilla= new JLabel(this.per.mago1(tambloquex,tambloquey));  
                   }else if(ini.p3==2){
                    casilla= new JLabel(this.per.guerrero1(tambloquex,tambloquey)); 
                   }
                }
                if(vecL[i][j]==6){// 6 es el tercer personaje del segundo jugador
                    if(ini.p6==0){
                    casilla= new JLabel(this.per.princesa2(tambloquex,tambloquey));
                   }else if(ini.p6==1){
                    casilla= new JLabel(this.per.mago2(tambloquex,tambloquey));  
                   }else if(ini.p6==2){
                    casilla= new JLabel(this.per.guerrero2(tambloquex,tambloquey)); 
                   }
                }
                if(vecL[i][j]==7){// 7 son las vidas
                    casilla= new JLabel(this.per.vida(tambloquex,tambloquey));
                }
                if(vecL[i][j]==8){// 8 son las bombas
                    casilla= new JLabel(this.per.bomba(tambloquex,tambloquey));
                } 
            casilla.setOpaque(false);
            casilla.setBorder(BorderFactory.createLineBorder(new Color(0,0,0)));
            casilla.setBounds(j*tambloquex, i*tambloquey, tambloquex, tambloquey);
            vecG[i][j]= casilla;
            fondo.add(vecG[i][j],BorderLayout.CENTER);
            fondo.repaint();
        }
        }
        }
}
