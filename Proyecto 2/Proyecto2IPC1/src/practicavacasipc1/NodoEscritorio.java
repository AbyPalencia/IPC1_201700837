
package practicavacasipc1;

public class NodoEscritorio {
    private String letra,estado;
    private int noCliente,noDocumentos,turnos;
    public NodoEscritorio siguiente, anterior;

    public NodoEscritorio(String letra, String estado, int noCliente, int noDocumentos, int turnos) {
        this.letra = letra;
        this.estado = estado;
        this.noCliente = noCliente;
        this.noDocumentos = noDocumentos;
        this.turnos = turnos;
        this.siguiente= null;
        this.anterior= null;
    }

    public NodoEscritorio(String letra, String estado) {
        this.letra = letra;
        this.estado = estado;
        this.noCliente = 0;
        this.noDocumentos = 0;
        this.turnos = 0;
        this.siguiente= null;
        this.anterior= null;
    }

    public String getLetra() {
        return letra;
    }

    public void setLetra(String letra) {
        this.letra = letra;
    }

    public String getEstado() {
        return estado;
    }

    public void setEstado(String estado) {
        this.estado = estado;
    }

    public int getNoCliente() {
        return noCliente;
    }

    public void setNoCliente(int noCliente) {
        this.noCliente = noCliente;
    }

    public int getNoDocumentos() {
        return noDocumentos;
    }

    public void setNoDocumentos(int noDocumentos) {
        this.noDocumentos = noDocumentos;
    }

    public int getTurnos() {
        return turnos;
    }

    public void setTurnos(int turnos) {
        this.turnos = turnos;
    }
    
    
}
