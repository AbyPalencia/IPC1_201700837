package practicavacasipc1;

public class ListaMantenimiento {
    public NodoListaMantenimiento primero;
    public static String datos;
    
    public void insertarInicio(NodoListaMantenimiento nuevo){
         if(primero==null){
             primero=nuevo;
         }else{
            nuevo.siguiente=primero;
            primero=nuevo;
         }
       }
    
    public void insertarFinal(NodoListaMantenimiento nuevo){
         NodoListaMantenimiento aux=primero;
         if(primero==null){
             primero=nuevo;
         }else{
                   while(aux.siguiente!=null){
                            aux=aux.siguiente;
                   }
                   aux.siguiente=nuevo;
         }
       }
        public  void disminuirTurno(){
            NodoListaMantenimiento aux = primero;
            if("OCUPADO".equals(aux.getEstado())){
                while(aux!=null){
                aux.setMatenimiento(aux.getMatenimiento()-1);
            if(aux.getMatenimiento()<=0){ 
                aux.setEstado("LIBRE");
                aux.setDesbordaje(0);
                aux.setMatenimiento(0);
                aux.setNoavion(0);
                aux.setNoestacion(aux.getNoestacion());
                aux.setPasajeros(0);
                aux.setTamaño("--");
            }
           aux=aux.siguiente;
            }
            }  
//subgrafos
    }
    
    public String recorrer(){
        if(primero==null){
            datos="No hay Aviones";  
        }else{
            NodoListaMantenimiento aux=primero;
            String sangria="     ";
            datos="*******************ESTACIONES*******************\n";
            while (aux!=null){
                datos = datos
                        +"ESTACIÓN "+aux.getNoestacion()+"\n"
                        +sangria+"Estado: "+aux.getEstado()+"\n"
                        +sangria+"Avión No. "+aux.getNoavion()+"\n"
                        +sangria+"Tipo: "+aux.getTamaño()+"\n"
                        +sangria+"Pasajeros: "+aux.getPasajeros()+"\n"
                        +sangria+"Desabordaje: "+aux.getDesbordaje()+"\n"
                        +sangria+"Mantenimiento: "+aux.getMatenimiento()+"\n";
                aux=aux.siguiente;
            }
            System.out.println(" NULL");
        }
        return datos;
       }
}
