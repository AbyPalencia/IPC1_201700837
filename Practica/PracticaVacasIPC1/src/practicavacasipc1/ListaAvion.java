package practicavacasipc1;

public class ListaAvion {
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
    nuevo.anterior=aux;
        }
    }  
    
    public void disminuirTurno(){
            NodoAvion aux = primero;
            NodoAvion antaux=null;
            while(aux!=null){
                int desabordaje=aux.getDesbordaje()-1;
                aux.setDesbordaje(desabordaje);
                //aux=aux.siguiente;
                if(aux.getDesbordaje()==0){
                    if(antaux==null){
                        primero=primero.siguiente;
                        aux.siguiente=null;
                        aux=primero;
                    }else{
                        antaux.siguiente=aux.siguiente;
                        aux.siguiente=null;
                        aux=antaux.siguiente;
                        aux.anterior=antaux;
                    }
                }else{
                    antaux=aux;
                    aux=aux.siguiente;
                }
            }
    }
    
    public void recorrer(){
        
        if(estaVacia()){
            System.out.println("No hay Aviones");
            
        }else{
            NodoAvion aux= primero;
            String sangria="     ";
            datos="*******************AVIONES*******************\n";
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
    }
    
    
    //mostrar la lista de inicio a fin
    /*    public void mostrarInicioFin(){
    if(!estaVacia()){
    String sangria="     ";
    NodoAvion auxiliar= cabeza;
    while(auxiliar!=null){
    
    auxiliar= auxiliar.siguiente;
    }
    in.area.append(datos);
    // in.area.setText(datos);
    }
    }
    */
    
}
