
package practicavacasipc1;

public class ListaEscritorio {
    int size;
    public NodoEscritorio primero;
    public static String datos;
    public ColaEscritorio cola;
    
    public ListaEscritorio(){
        primero = null;
        size = 0;
    }
    public boolean estaVacia(){
        return null == primero;
    }
    public void crearCola(String letra){
        cola = new ColaEscritorio(letra);
        for(int i=1;i<=7;i++){
               cola.insertarFinal(new NodoPasajero(2,3,2,12));
               }
    }
    
    public void insertarFinal(NodoEscritorio nuevo){
        if(primero==null){
        primero= nuevo;
        }else{
        NodoEscritorio aux=primero;
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
    public String recorrer(){
        if(estaVacia()){
            datos="No hay Aviones";    
        }else{
            NodoEscritorio aux= primero;
            String sangria="     ";
            datos="*******************ESCRITORIOS*******************\n";
            while(aux!=null){
                datos = datos
                        +"Escritorio "+aux.getLetra()+"\n"
                        +sangria+"Estado: "+aux.getEstado()+"\n"
                        +sangria+"No. de Pasajero: "+aux.getNoCliente()+"\n"
                        +sangria+"No. de Documentos: "+aux.getNoDocumentos()+"\n"
                        +sangria+"No. de Turnos restantes: "+aux.getTurnos()+"\n";
           aux=aux.siguiente;
            }
            System.out.println("");
        }
        datos=datos+cola.recorrer();
        return datos;
    }
}
