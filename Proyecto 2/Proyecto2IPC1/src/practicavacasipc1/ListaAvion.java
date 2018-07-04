package practicavacasipc1;

public class ListaAvion {
    int size;
    public NodoAvion primero;
    public static String datos;
    public static int noavion,pasajero,desabordaje, mantenimiento;
    public static String tamaño;
    public ColaMantenimiento mante = new ColaMantenimiento();

    public ListaAvion(){
        primero = null;
        size = 0;
    }
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
        nuevo.anterior=aux;//aux-><-nuevo
        }
        size++;
    }  
    
    public int size(){
        return size;
    }
    
    public  void disminuirTurno(){
            NodoAvion aux = primero;
            NodoAvion antaux=null;
            while(aux!=null){
                aux.setDesbordaje(aux.getDesbordaje()-1);
            if(aux.getDesbordaje()==0){
                noavion=aux.getNoavion();
                tamaño=aux.getTamaño();
                pasajero=aux.getPasajeros();
                desabordaje=aux.getDesbordaje();
                mantenimiento=aux.getMatenimiento();
                
                eliminar(aux.getNoavion());
            }
           aux=aux.siguiente;
            }
//subgrafos
    }
    
public void eliminar(int no){
        if(primero!=null){
            NodoAvion aux=primero;
            NodoAvion auxant=null;
            while(aux!=null){
                if(aux.getNoavion()==no){
                    if(auxant==null){
                        primero=primero.siguiente;
                        aux.siguiente=null;
                        aux=primero;
                        return;
                    }else{
                        auxant.siguiente=aux.siguiente;
                        aux.siguiente=null;
                        aux=auxant.siguiente;
                        return;
                    }
                }else{
                    auxant=aux;
                    aux=aux.siguiente;
                }
            }
            //eliminamos el último quitando la referencia del anterior
             if(aux.getNoavion()==no){
            auxant.siguiente=null;
            aux=null;
            }
            
        }
    }
    public void probando(){
        
     //   mante.insertarFinal(new NodoAvion(4,"dfsf",5,3,2));
                }
    
    
    public void recorrer(){
        if(estaVacia()){
            datos="No hay Aviones";    
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
}
     /*  if(aux.getDesbordaje()==0){
                if(antaux==null){
                mante.insertarFinal(aux);
                primero=primero.siguiente;
                aux.siguiente=null;
                aux=primero;
                return;
                }else{
                antaux.siguiente=aux.siguiente;
                aux.siguiente=null;
                aux=antaux.siguiente;
                aux.anterior=antaux;
                return;
                }
                }else{
                antaux=aux;
                aux=aux.siguiente;
                }
                }
                if(aux.getDesbordaje()==0){
                antaux.siguiente=null;
                aux=null;
                }*/