package practicavacasipc1;
public class ColaPasajero {
    public NodoPasajero primero;
    public static String datos;
    public static int a, size;
    
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
    //5->6
    public void eliminar5(){
        if(primero!=null){
            if(size()<5){
        int contador=1;
            while(contador<=size()){
               // new Inicio().pila.insertarInicio(new NodoDocumento(primero.getMaletas()));
             //   new Inicio().colaescritorio.insertarFinal(primero);
                primero=primero.sig; 
                contador++;
            }
            size=0;
    }else{
            int contador=1;
            while(contador<=5){
                 a=primero.getMaletas();
                 System.out.println("maleta del pasajero "+ a);
                 new Inicio().listamaleta.eliminar(a);
                // new Inicio().colaescritorio.insertarFinal(primero);
                primero=primero.sig; 
                contador++;
            }
            size=size-5;
        } }
    }
    public int size(){
        return size;
    }
    
    public String recorrer(){
        
        if(estaVacia()){
            datos="No hay Pasajero\n";
        }else{
            NodoPasajero aux= primero;
            String sangria="     ";
            datos="*******************PASAJEROS*******************\n";
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
