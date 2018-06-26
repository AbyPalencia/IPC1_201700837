package practicavacasipc1;

public class ColaMantenimiento {
    public NodoAvion primero;
    public static String datos;
    
    public boolean estaVacia(){
        return null == primero;
    }
    public void insertarFinal(NodoAvion nuevo){
        if(primero==null){
        primero= nuevo;
        }else{
    NodoAvion aux=primero;
    while(aux.siguiente!=null){
        aux=aux.siguiente;
    }
    aux.siguiente=nuevo;
        }
    }
    
    public String recorrer(){
        
       if(estaVacia()){
            datos="No hay Aviones en la cola\n";    
        }else{
            NodoAvion aux= primero;
            String sangria="     ";
            datos="*******************COLA MANTENIMIENTO*******************\n";
            while(aux!=null){
                datos = datos
                        +"AVION "+aux.getNoavion()+"\n"
                        +sangria+"Tipo: "+aux.getTamaño()+"\n"
                        +sangria+"No. de Pasajeros: "+aux.getPasajeros()+"\n"
                        +sangria+"No. de Turnos de Desabordaje: "+aux.getDesbordaje()+"\n"
                        +sangria+"No. de Turnos de Matenimiento: "+aux.getMatenimiento()+"\n";

           aux=aux.siguiente;
            }
            System.out.println("");
        }
        return datos;
    }
}
