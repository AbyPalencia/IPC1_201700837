package practicavacasipc1;


public class ColaPasajero {
    public NodoPasajero primero;
    public static String datos;
    
     public boolean estaVacia(){
        return null == primero;
    }
     
    public void insertarFinal(NodoPasajero nuevo){
        if(primero==null){
        primero= nuevo;
        }else{
    NodoPasajero aux=primero;
    while(aux.sig!=null){
        aux=aux.sig;
    }
    aux.sig=nuevo;
  //  nuevo.anterior=aux;
        }
    }
    public String recorrer(){
        
        if(estaVacia()){
            System.out.println("No hay Aviones");
            
        }else{
            NodoPasajero aux= primero;
            String sangria="     ";
            datos="*******************PASAJEROS*******************\n";
            while(aux!=null){
                datos = datos
                        +"PASAJERO "+aux.getNoPasajero()+"\n"
                        +sangria+"No. de Maletas: "+aux.getMaletas()+"\n"
                        +sangria+"No. de Documentos: "+aux.getDocumentos()+"\n";

           aux=aux.sig;
            }
            System.out.println("");
        }
        return datos;
    }
}
