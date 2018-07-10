package practicavacasipc1;
public class ColaEscritorio {
    public NodoPasajero primero;
    public static String datos,letra;
    public static int a, size;
    public ColaEscritorio(String letra){
        this.letra=letra;
    }
    
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
        size++;
    }
    public int size(){
        return size;
    }
    
    public String recorrer(){
        
        if(estaVacia()){
            datos="No hay Pasajeros en la cola de escritorio\n";
        }else{
            NodoPasajero aux= primero;
            String sangria="     ";
            datos="******COLA DEL ESCRITORIO "+letra+"******\n";
            while(aux!=null){
                datos = datos
                        +"PASAJERO "+aux.getNoPasajero()+"\n"
                        +sangria+"No. de Maletas: "+aux.getMaletas()+"\n"
                        +sangria+"No. de Documentos: "+aux.getDocumentos()+"\n"
                        +sangria+"Turnos en el escritorio de registro: "+aux.getTurnoregistro()+"\n";

           aux=aux.sig;
            }
            System.out.println("");
        }
       
        return datos;
    }
}
