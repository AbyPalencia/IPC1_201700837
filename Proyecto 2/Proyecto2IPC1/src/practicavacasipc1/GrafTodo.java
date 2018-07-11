package practicavacasipc1;
import java.io.*;

public class GrafTodo {
    public void crearDot(NodoAvion colamante, NodoPasajero pasajero, NodoMaleta maleta, NodoListaMantenimiento mantenimiento, NodoAvion avion, String nombre){
        FileWriter fw=null;
        PrintWriter pw=null;
        //pw.println("rankdir=LR; \n");
        //pw.println("node [shape = box] \n");
        //pw.println(generarDot(primero));
        try {
        fw=new FileWriter(nombre+".dot"); 
        pw = new PrintWriter(fw);
        pw.println("digraph listamatenimiento {");
        
        pw.println("subgraph cluster_0 {");
        pw.println("label=\"LLegada de aviones\";");
        pw.println(generarDot(avion));
        pw.println("}\n");
        
        pw.println("subgraph cluster_1 {");
        pw.println("label=\"Pasajeros\";");
        pw.println(generarDotpasajero(pasajero));
        pw.println("}\n");
        
        pw.println("subgraph cluster_2 {");
        pw.println("label=\"Maletas\";");
        pw.println(generarDotmaleta(maleta));
        pw.println("}\n");
        
        pw.println("subgraph cluster_3 {");
        pw.println("label=\"Estaciones de Mantenimiento\";");
        pw.println(generarDotmantenimiento(mantenimiento));
        pw.println("}\n");
        
        pw.println("subgraph cluster_3 {");
        pw.println("label=\"Estaciones de Mantenimiento\";");
        pw.println(generarDotcolamante(colamante));
        pw.println("}\n");
        
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
    public String generarDot(NodoAvion primero){
        String cadena="";
        if(primero==null){
            return cadena;
        }
        cadena+="nodo"+reemplazar(primero.hashCode())+"[label=\""+"Avion No. "
                +primero.getNoavion()+" : \n"+primero.getTamaño()+" Pasajeros "+primero.getPasajeros()+"\n"
                +" No. desabordaje "+primero.getDesbordaje()+" No. mantenimiento "+primero.getMatenimiento()+"\"];\n";
        if(primero.siguiente!=null){
            cadena+="nodo"+reemplazar(primero.hashCode())+"->"+"nodo"+reemplazar(primero.siguiente.hashCode())+";\n";
            cadena+="nodo"+reemplazar(primero.siguiente.hashCode())+"->"+"nodo"+reemplazar(primero.siguiente.anterior.hashCode())+";\n";
            cadena+=generarDot(primero.siguiente);
        }
        return cadena;
    }
    public String generarDotpasajero(NodoPasajero primero){
        String cadena="";
        if(primero==null){
            return cadena;
        }
        cadena+="nodo"+reemplazar(primero.hashCode())+"[label=\""+"Pasajero No. "
                +primero.getNoPasajero()+" : \n"+"Maletas "+primero.getMaletas()
                +" Documentos "+primero.getDocumentos()+"\n"+" Turnos en registro "+primero.getTurnoregistro()+"\"];\n";
        if(primero.sig!=null){
            cadena+="nodo"+reemplazar(primero.hashCode())+"->"+"nodo"+reemplazar(primero.sig.hashCode())+";\n";
           // cadena+="nodo"+reemplazar(primero.siguiente.hashCode())+"->"+"nodo"+reemplazar(primero.siguiente.anterior.hashCode())+";\n";
            cadena+=generarDotpasajero(primero.sig);
        }
        return cadena;
    }
    public String generarDotmaleta(NodoMaleta primero){
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
    public String generarDotmantenimiento(NodoListaMantenimiento primero){
        String cadena="";
        if(primero==null){
            return cadena;
        }
        cadena+="nodo"+reemplazar(primero.hashCode())+"[label=\""+"Estación No. "
                +primero.getNoestacion()+" : \n"+"Estado: "+primero.getEstado()
                +" Avion No. "+primero.getNoavion()+"\n"+" Tipo: "+primero.getTamaño()+" Turnos de matenimiento: "+primero.getMatenimiento()+"\"];\n";
        if(primero.siguiente!=null){
            cadena+="nodo"+reemplazar(primero.hashCode())+"->"+"nodo"+reemplazar(primero.siguiente.hashCode())+";\n";
            cadena+=generarDotmantenimiento(primero.siguiente);
        }
        return cadena;
    }
    public String generarDotcolamante(NodoAvion primero){
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
