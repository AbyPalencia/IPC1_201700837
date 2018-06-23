package practicavacasipc1;

public class NodoPasajero {
    private int noPasajero, maletas,documentos;
    public NodoPasajero sig;

    public NodoPasajero(int noPasajero, int maletas, int documentos, NodoPasajero sig) {
        this.noPasajero = noPasajero;
        this.maletas = maletas;
        this.documentos = documentos;
        this.sig = null;
    }

    public NodoPasajero(int noPasajero, int maletas, int documentos) {
        this.noPasajero = noPasajero;
        this.maletas = maletas;
        this.documentos = documentos;
    }

    public int getNoPasajero() {
        return noPasajero;
    }

    public void setNoPasajero(int noPasajero) {
        this.noPasajero = noPasajero;
    }

    public int getMaletas() {
        return maletas;
    }

    public void setMaletas(int maletas) {
        this.maletas = maletas;
    }

    public int getDocumentos() {
        return documentos;
    }

    public void setDocumentos(int documentos) {
        this.documentos = documentos;
    }
    
    
}
