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

    public void AgregaraLista(NodoListaMantenimiento ax){
NodoAvion aux = primero;
NodoListaMantenimiento uax= ax;
while(aux!=null){
while(uax!=null){
if("LIBRE".equals(uax.getEstado())){
uax.setEstado("OCUPADO");
uax.setNoavion(aux.getNoavion());
uax.setPasajeros(aux.getPasajeros());
uax.setTamaño(aux.getTamaño());
uax.setDesbordaje(aux.getDesbordaje());
uax.setMatenimiento(aux.getMatenimiento());
primero=primero.siguiente;
return;
}
uax= uax.siguiente;
}
aux=aux.siguiente;
}
    }
    
    
    public String recorrer(){
        System.out.println("imprimiento cola mantenimiento");
       if(estaVacia()){
            datos="No hay Aviones en la cola\n";    
        }else{
            NodoAvion aux= primero;
            String sangria="     ";
            datos="************COLA MANTENIMIENTO************\n";
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
