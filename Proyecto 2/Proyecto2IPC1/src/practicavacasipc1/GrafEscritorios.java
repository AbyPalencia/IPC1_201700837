package practicavacasipc1;
import java.io.*;

public class GrafEscritorios {
    public void crearDot(NodoEscritorio primero, String nombre){
        FileWriter fw=null;
        PrintWriter pw=null;
        
        try {
        fw=new FileWriter(nombre+".dot"); 
        pw = new PrintWriter(fw);
        pw.println("digraph listadoble {");
        pw.println("rankdir=LR; \n");
        pw.println("node [shape = box];\n");
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
    public String generarDot(NodoEscritorio primero){
        String cadena="";
        if(primero==null){
            return cadena;
        }
        cadena+="nodo"+reemplazar(primero.hashCode())+"[label=\""+"Escritorio "
                +primero.getLetra()+" : \n"+"Estado: "+primero.getEstado()+" Pasajero No. "+primero.getNoCliente()+"\n"
                +" Cantidad Documentos "+primero.getNoDocumentos()+" No. turnos "+primero.getTurnos()+"\"];\n";
        if(primero.siguiente!=null){
            cadena+="nodo"+reemplazar(primero.hashCode())+"->"+"nodo"+reemplazar(primero.siguiente.hashCode())+";\n";
            cadena+="nodo"+reemplazar(primero.siguiente.hashCode())+"->"+"nodo"+reemplazar(primero.siguiente.anterior.hashCode())+";\n";
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
