
package proyecto1;

public class Turno{
    boolean turnogeneral=true;
    Juego per = new Juego();
    Tablero tab = null;
    int turnog,turnoe,x,y;
    public void turnos(){
       turnog=(int)(Math.random()*1);
       if(turnog==0){
           System.out.println("Le toca la jugador 1");
           if(per.jper1.equals("Princesa")){
               x=tab.posperx[0];
               y=tab.pospery[0];
           }else if(per.jper1.equals("Mago")){
               x=tab.posperx[1];
               y=tab.pospery[1];
           }else if(per.jper1.equals("Guerrero")){
               x=tab.posperx[2];
               y=tab.pospery[2];
           }
    }else{
           System.out.println("le toca la jugador 2");
       }  
    }


    
}
