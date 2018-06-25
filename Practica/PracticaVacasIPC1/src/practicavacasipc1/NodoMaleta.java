
package practicavacasipc1;

public class NodoMaleta {
    public NodoMaleta siguiente, anterior;
    private int noMaleta;

    public NodoMaleta(int noMaleta, NodoMaleta siguiente, NodoMaleta anterior) {
        this.siguiente = siguiente;
        this.anterior = anterior;
        this.noMaleta = noMaleta;
    }
    
    public NodoMaleta(int noMaleta) {
        this.noMaleta = noMaleta;
        this.siguiente = null;
    }

    public int getNoMaleta() {
        return noMaleta;
    }

    public void setNoMaleta(int noMaleta) {
        this.noMaleta = noMaleta;
    }
    
    
}
