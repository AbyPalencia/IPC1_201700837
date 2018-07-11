package practicavacasipc1;

public class ListaAvion {
    int size;
    public NodoAvion primero;
    public static String datos;


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
            while(aux!=null){
                aux.setDesbordaje(aux.getDesbordaje()-1);
            if(aux.getDesbordaje()==0){ 
                new Inicio().colamante.insertarFinal(aux);
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
                      //  aux.anterior=auxant;//
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
    
    public String recorrer(){
        if(estaVacia()){
            datos="No hay Aviones\n";    
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
        return datos;
    }
}
/*public  void disminuirTurno(NodoListaMantenimiento ax){
NodoAvion aux = primero;
NodoListaMantenimiento uax= ax;
while(aux!=null){
aux.setDesbordaje(aux.getDesbordaje()-1);
if(aux.getDesbordaje()==0){
while(uax!=null){
if("LIBRE".equals(uax.getEstado())){
uax.setEstado("OCUPADO");
uax.setNoavion(aux.getNoavion());
uax.setPasajeros(aux.getPasajeros());
uax.setTamaño(aux.getTamaño());
uax.setDesbordaje(aux.getDesbordaje());
uax.setMatenimiento(aux.getMatenimiento());
return;
}else{
new Inicio().colamante.insertarFinal(aux);
}
uax= uax.siguiente;
}
eliminar(aux.getNoavion());
}
aux=aux.siguiente;
}
//subgrafos
}*/