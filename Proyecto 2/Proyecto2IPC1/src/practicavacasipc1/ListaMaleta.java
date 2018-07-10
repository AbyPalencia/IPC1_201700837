package practicavacasipc1;

public class ListaMaleta {
    public NodoMaleta primero,ultimo;
    public static String datos;
    
    public boolean estaVacia(){
        return null == primero;
    }
    
   public void insertar(NodoMaleta nuevo){
         if(primero==null){
                   primero=nuevo;
                   primero.siguiente=nuevo;
                   primero.anterior=primero;
        } else{
                   NodoMaleta aux=primero;
                   while(aux.siguiente!=primero)
                            aux=aux.siguiente;
                            aux.siguiente=nuevo;
                            nuevo.anterior=aux;
                            nuevo.siguiente=primero;
                            primero.anterior=nuevo;
         }
       }

   public void eliminar(int a){
       int contador=1;
       NodoMaleta aux= primero;
       NodoMaleta ant = null;
       for(int i=contador; i<=a; i++){
           ant= aux.anterior;
           ant.siguiente=aux.siguiente;
           aux=aux.siguiente;
           aux.anterior=ant;
           primero=aux;
           ant=null;
           contador++;
       }
       
    }
   
    public String recorrer(){
    if(estaVacia()){
    datos="No hay Aviones";
    }else{
    NodoMaleta aux= primero;
    datos="*******************MALETAS*******************\n"
            +"Inicio: "+aux.getNoMaleta()+"\n"
            +"Fin: "+aux.anterior.getNoMaleta()+"\n";
    do{
        datos = datos+"Maleta: "+aux.getNoMaleta()+"\n";
        aux=aux.siguiente; 
    }while(aux!=primero);
    System.out.println("");
    }
    return datos;
    }
}
