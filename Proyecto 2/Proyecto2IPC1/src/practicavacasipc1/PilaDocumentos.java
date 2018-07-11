package practicavacasipc1;

public class PilaDocumentos {
    public NodoDocumento primero;
    public static String datos;
    
    public void insertarInicio(NodoDocumento nuevo){
         if(primero==null){
             primero=nuevo;
         }else{
            nuevo.siguiente=primero;
            primero=nuevo;
         }
       }
    public String recorrer(){
        if(primero==null){
            datos="No hay documentos en la pila\n";
        }else{
            NodoDocumento aux= primero;
            datos="******PILA DE DOCUMENTOS******\n";
            while(aux!=null){
                datos = datos
                        +"Docuemnto No. "+aux.getDoc()+"\n";
           aux=aux.siguiente;
            }
            System.out.println("");
        }
       
        return datos;
    }
}
