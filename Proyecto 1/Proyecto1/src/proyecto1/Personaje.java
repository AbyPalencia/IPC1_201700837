
package proyecto1;

import java.awt.Image;
import javax.swing.ImageIcon;


public class Personaje {
    private Inicio in = new Inicio();
    public int posponerx=0,posponery=0;
    private String nombre="";
    public void ElegirPersonaje(){
        
    }
    public ImageIcon princesa1(int tamy, int tamx){
        /*if(in.jper1.getSelectedIndex()==0||in.jper2.getSelectedIndex()==0||in.jper3.getSelectedIndex()==0){
            nombre ="/imagenes/princesa1.png";
        }else if(in.jper1.getSelectedIndex()==1||in.jper2.getSelectedIndex()==1||in.jper3.getSelectedIndex()==1){
            nombre ="/imagenes/mago1.png";
        }else if(in.jper1.getSelectedIndex()==2||in.jper2.getSelectedIndex()==2||in.jper3.getSelectedIndex()==2){
            nombre ="/imagenes/guerrero1.png";
        }*/
       ImageIcon per =new ImageIcon(getClass().getResource("/imagenes/princesa1.png"));
       Image imagen= per.getImage();
       Image tamimagen=imagen.getScaledInstance(tamx, tamy, Image.SCALE_SMOOTH);
       per= new ImageIcon(tamimagen);
       return per;
    }
    public ImageIcon princesa2(int tamy, int tamx){
        
       ImageIcon per =new ImageIcon(getClass().getResource("/imagenes/princesa2.png"));
       Image imagen= per.getImage();
       Image tamimagen=imagen.getScaledInstance(tamx, tamy, Image.SCALE_SMOOTH);
       per= new ImageIcon(tamimagen);
       return per;
    }
    public ImageIcon mago1(int tamy, int tamx){
       ImageIcon per =new ImageIcon(getClass().getResource("/imagenes/mago1.png"));
       Image imagen= per.getImage();
       Image tamimagen=imagen.getScaledInstance(tamx, tamy, Image.SCALE_SMOOTH);
       per= new ImageIcon(tamimagen);
       return per;
    }
    public ImageIcon mago2(int tamy, int tamx){
       ImageIcon per =new ImageIcon(getClass().getResource("/imagenes/mago2.png"));
       Image imagen= per.getImage();
       Image tamimagen=imagen.getScaledInstance(tamx, tamy, Image.SCALE_SMOOTH);
       per= new ImageIcon(tamimagen);
       return per;
    }
    public ImageIcon guerrero1(int tamy, int tamx){
       ImageIcon per =new ImageIcon(getClass().getResource("/imagenes/guerrero1.png"));
       Image imagen= per.getImage();
       Image tamimagen=imagen.getScaledInstance(tamx, tamy, Image.SCALE_SMOOTH);
       per= new ImageIcon(tamimagen);
       return per;
    }
    public ImageIcon guerrero2(int tamy, int tamx){
       ImageIcon per =new ImageIcon(getClass().getResource("/imagenes/guerrero2.png"));
       Image imagen= per.getImage();
       Image tamimagen=imagen.getScaledInstance(tamx, tamy, Image.SCALE_SMOOTH);
       per= new ImageIcon(tamimagen);
       return per;
    }
    public ImageIcon bomba(int tamy, int tamx){
       ImageIcon per =new ImageIcon(getClass().getResource("/imagenes/bomba.png"));
       Image imagen= per.getImage();
       Image tamimagen=imagen.getScaledInstance(tamx, tamy, Image.SCALE_SMOOTH);
       per= new ImageIcon(tamimagen);
       return per;
    }
    public ImageIcon vida(int tamy, int tamx){
       ImageIcon per =new ImageIcon(getClass().getResource("/imagenes/vida.png"));
       Image imagen= per.getImage();
       Image tamimagen=imagen.getScaledInstance(tamx, tamy, Image.SCALE_SMOOTH);
       per= new ImageIcon(tamimagen);
       return per;
    }
    
}
