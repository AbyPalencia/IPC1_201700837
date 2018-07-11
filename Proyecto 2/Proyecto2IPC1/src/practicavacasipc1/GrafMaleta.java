package practicavacasipc1;
import java.io.*;

public class GrafMaleta {
    public void crearDot(NodoMaleta primero, String nombre){
        FileWriter fw=null;
        PrintWriter pw=null;
        
        try {
        fw=new FileWriter(nombre+".dot"); 
        pw = new PrintWriter(fw);
        pw.println("digraph listadoble {");
      //  pw.println("layout=\"circo\"; \n");
        pw.println("node [shape = record] \n");
        pw.println(generarDot(primero));// layout="circo";
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
    public String generarDot(NodoMaleta primero){
        String cadena="";
        NodoMaleta aux = primero;
        do{
       cadena+="nodo"+reemplazar(aux.hashCode())+"[label=\""+"Maleta No. "+aux.getNoMaleta()+"\"];\n";
       if(aux.siguiente!=null){
        cadena+="nodo"+reemplazar(aux.hashCode())+"->"+"nodo"+reemplazar(aux.siguiente.hashCode())+";\n";
        cadena+="nodo"+reemplazar(aux.siguiente.hashCode())+"->"+"nodo"+reemplazar(aux.siguiente.anterior.hashCode())+";\n";
        }
       aux= aux.siguiente;
        }while(aux!=primero);
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
