
package proyecto1;
import java.util.logging.Level;
import java.util.logging.Logger;

public class MovPer1 extends Thread{
    public int cantidad=0;
    public static int op;
    public Tablero tab=null;
    public Juego jue;
    
    public MovPer1(int cantidad, Tablero tab,int op){
        this.cantidad= cantidad;
        this.tab= tab;
        this.op=op;      
    }
    public boolean comprobarFin(){
            if (tab.posperx[1]>=tab.tam-1||tab.pospery[1]>=tab.tam-1) {
            return true;
        }
        return false;    
    }
     
    public boolean comprobarInicio(){
        for (int i = 1; i <tab.tam; i++) {
             if (tab.per.posponerx<=0||tab.per.posponery<=0) {
            return true;
        }
        }
        return false;
    }
    public boolean comprobarBomba(){
            if (tab.vecL[tab.posperx[1]][tab.pospery[1]]==8) {
            return true;
        }
        return false;    
    }
    public void moverAbajo(int cantidad) throws InterruptedException{
        
        if (cantidad<=0) {
            return;
        }
        switch (op) {
            case 0:
                //derecha
                if (comprobarFin()) {
                cantidad=0;
                tab.vecL[tab.posperx[1]][tab.tam-1]=0;
                tab.vecG[tab.posperx[1]][tab.tam-1].setIcon(null);
                tab.repintar();
                tab.vecL[tab.tam/2][tab.tam/2]=1;
                tab.repintar();
                return;
                }else{
                    //mover una posicion
                    tab.vecL[tab.posperx[1]][tab.pospery[1]]=0;
                    tab.vecG[tab.posperx[1]][tab.pospery[1]].setIcon(null);
                    tab.repintar();
                    tab.pospery[1]+=1;
                    if(comprobarBomba()){
                        int a =Integer.parseInt(jue.v1.getText())-1;
                        jue.v1.setText(""+a);
                        tab.vecL[tab.posperx[1]][tab.pospery[1]]=8;
                        tab.repintar();
                        cantidad--;
                    Thread.sleep(500);
                    moverAbajo(cantidad);
                    }else{
                    tab.vecL[tab.posperx[1]][tab.pospery[1]]=1;
                    tab.repintar();
                    cantidad--;
                    Thread.sleep(500);
                    moverAbajo(cantidad);
                    }}
                    
                    /*}  */     break;
            case 1:
                //izquierda
                /*if (comprobarInicio()) {
                cantidad=0;
                tab.vecL[0][0]=0;
                tab.vecG[0][0].setIcon(null);
                tab.per.posponerx=tab.tam-1;
                tab.vecL[tab.tam-1][tab.tam-1]=1;
                tab.repintar();
                return;
                }else{*/
                    //mover una posicion
                    tab.vecL[tab.posperx[1]][tab.pospery[1]]=0;
                    tab.vecG[tab.posperx[1]][tab.pospery[1]].setIcon(null);
                    tab.repintar();
                    tab.pospery[1]-=1;
                    if(comprobarBomba()){
                        int a =Integer.parseInt(jue.v1.getText())-1;
                        jue.v1.setText(""+a);
                        tab.vecL[tab.posperx[1]][tab.pospery[1]]=8;
                        tab.repintar();
                    cantidad--;
                    Thread.sleep(500);
                    moverAbajo(cantidad);
                    }else{
                    tab.vecL[tab.posperx[1]][tab.pospery[1]]=1;
                    tab.repintar();
                    cantidad--;
                    Thread.sleep(500);
                    moverAbajo(cantidad);    
                    }
                    /* }*/       break;
            case 2:
                //abajo
                /*if (comprobarFin()) {
                cantidad=0;
                tab.vecL[tab.tam-1][tab.tam-1]=0;
                tab.vecG[tab.tam-1][tab.tam-1].setIcon(null);
                tab.per.posponery=0;
                tab.vecL[0][0]=1;
                tab.repintar();
                return;
                }else{*/
                    //mover una posicion
                    tab.vecL[tab.posperx[1]][tab.pospery[1]]=0;
                    tab.vecG[tab.posperx[1]][tab.pospery[1]].setIcon(null);
                    tab.repintar();
                    tab.posperx[1]+=1;
                    if(comprobarBomba()){
                        int a =Integer.parseInt(jue.v1.getText())-1;
                        jue.v1.setText(""+a);
                        tab.vecL[tab.posperx[1]][tab.pospery[1]]=8;
                        tab.repintar();
                    cantidad--;
                    Thread.sleep(500);
                    moverAbajo(cantidad);
                    }else{
                    tab.vecL[tab.posperx[1]][tab.pospery[1]]=1;
                    tab.repintar();
                    cantidad--;
                    Thread.sleep(500);//solo hace que se detenga la vista del movimiento
                    moverAbajo(cantidad);    
                    }
                    /* }  */     break;
            case 3:
                //arriba
                /* if (comprobarFin()) {
                cantidad=0;
                tab.vecL[tab.tam-1][tab.tam-1]=0;
                tab.vecG[tab.tam-1][tab.tam-1].setIcon(null);
                tab.per.posponery=0;
                tab.vecL[0][0]=1;
                tab.repintar();
                return;
                }else{*/
                    //mover una posicion
                    tab.vecL[tab.posperx[1]][tab.pospery[1]]=0;
                    tab.vecG[tab.posperx[1]][tab.pospery[1]].setIcon(null);
                    tab.repintar();
                    tab.posperx[1]-=1;
                    if(comprobarBomba()){
                        int a =Integer.parseInt(jue.v1.getText())-1;
                        jue.v1.setText(""+a);
                        tab.vecL[tab.posperx[1]][tab.pospery[1]]=8;
                        tab.repintar();
                    cantidad--;
                    Thread.sleep(500);
                    moverAbajo(cantidad);
                    }else{
                    tab.vecL[tab.posperx[1]][tab.pospery[1]]=1;
                    tab.repintar();
                    cantidad--;
                    Thread.sleep(500);//solo hace que se detenga la vista del movimiento
                    moverAbajo(cantidad);    
                    }
                    /* }*/
            default:
                break;
        }
        
    }

    public void run(){
        try {
                moverAbajo(cantidad);
         
        } catch (InterruptedException ex) {
            Logger.getLogger(MovPer1.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
}
