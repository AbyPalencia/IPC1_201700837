package practicavacasipc1;


public class ColaPasajero {
    public NodoPasajero primero;
    public static String datos;
    public static int a;
    public ListaMaleta listamaleta = new ListaMaleta();
    
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
        }
    }
    //5->6
    public void eliminar5(){
        if(primero!=null){
            int contador=1;
            while(contador<=5){
                /* a=primero.getMaletas();
                listamaleta.eliminar(a);
                System.out.println("maletassss "+a);*/
                primero=primero.sig; 
                contador++;
            }     
        }
    }
    
    public String recorrer(){
        
        if(estaVacia()){
            datos="No hay Aviones";
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
