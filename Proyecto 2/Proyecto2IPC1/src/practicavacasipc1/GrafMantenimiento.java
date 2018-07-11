package practicavacasipc1;
import java.io.*;

public class GrafMantenimiento {
    public void crearDot(NodoListaMantenimiento primero, NodoAvion primeroo, String nombre){
        FileWriter fw=null;
        PrintWriter pw=null;
        
        try {
        fw=new FileWriter(nombre+".dot"); 
        pw = new PrintWriter(fw);
        pw.println("digraph listamatenimiento {");
        pw.println(generarDot(primeroo));
        pw.println("rankdir=LR; \n");
        pw.println("node [shape = box] \n");
        pw.println(generarDot(primero));
        pw.println("}");
        pw.close();
       } catch (IOException ex) {
            System.out.println("");
        } finally{
            pw.close();
        }
    }
    
    public String reemplazar(int posmemoria){
        String cadena=String.valueOf(posmemoria);
        return cadena.replace("-", "_");
    }
    public String generarDot(NodoListaMantenimiento primero){
        String cadena="";
        if(primero==null){
            return cadena;
        }
        cadena+="nodo"+reemplazar(primero.hashCode())+"[label=\""+"Estación No. "
                +primero.getNoestacion()+" : \n"+"Estado: "+primero.getEstado()
                +" Avion No. "+primero.getNoavion()+"\n"+" Tipo: "+primero.getTamaño()+" Turnos de matenimiento: "+primero.getMatenimiento()+"\"];\n";
        if(primero.siguiente!=null){
            cadena+="nodo"+reemplazar(primero.hashCode())+"->"+"nodo"+reemplazar(primero.siguiente.hashCode())+";\n";
            cadena+=generarDot(primero.siguiente);
        }
        return cadena;
    }
    public String generarDot(NodoAvion primero){
        String cadena="";
        if(primero==null){
            return cadena;
        }
        cadena+="nodo"+reemplazar(primero.hashCode())+"[label=\""
                +" Avion No. "+primero.getNoavion()+"\n"+" Tipo: "+primero.getTamaño()+" Turnos de matenimiento: "+primero.getMatenimiento()+"\"];\n";
        if(primero.siguiente!=null){
            cadena+="nodo"+reemplazar(primero.hashCode())+"->"+"nodo"+reemplazar(primero.siguiente.hashCode())+";\n";
            cadena+=generarDot(primero.siguiente);
        }
        return cadena;
    }
    public void generarImagen(String direccionDot, String direccionImagen){
        String doPath="C:\\Program Files (x86)\\Graphviz2.38\\bin\\dot.exe";
        String cmd=doPath+" -Tjpg "+direccionDot+" -o "+direccionImagen;
        try {
            Runtime.getRuntime().exec(cmd);
        } catch (IOException ex) {
        }
    }
}
