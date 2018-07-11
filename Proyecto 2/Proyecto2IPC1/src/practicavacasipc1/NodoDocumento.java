
package practicavacasipc1;

public class NodoDocumento {
    private int doc;
    public NodoDocumento siguiente;

    public NodoDocumento(int doc) {
        this.doc = doc;
        this.siguiente = null;
    }

    public int getDoc() {
        return doc;
    }

    public void setDoc(int doc) {
        this.doc = doc;
    }
    
}
