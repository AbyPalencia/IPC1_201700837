package practicavacasipc1;


public class NodoAvion {
    private String tamaño;
    private int pasajeros, desbordaje,matenimiento,noavion;
    public NodoAvion siguiente, anterior;

    public NodoAvion(int noavion,String tamaño, int pasajeros, int desbordaje, int matenimiento, NodoAvion siguiente, NodoAvion anterior) {
        this.noavion=noavion;
        this.tamaño = tamaño;
        this.pasajeros = pasajeros;
        this.desbordaje = desbordaje;
        this.matenimiento = matenimiento;
        this.siguiente = siguiente;
        this.anterior = anterior;
    }

    public NodoAvion(int noavion,String tamaño, int pasajeros, int desbordaje, int matenimiento) {
        this.noavion=noavion;
        this.tamaño = tamaño;
        this.pasajeros = pasajeros;
        this.desbordaje = desbordaje;
        this.matenimiento = matenimiento;
        this.siguiente = null;
        this.anterior = null;
    }

    public int getNoavion() {
        return noavion;
    }

    public void setNoavion(int noavion) {
        this.noavion = noavion;
    }

    public String getTamaño() {
        return tamaño;
    }

    public void setTamaño(String tamaño) {
        this.tamaño = tamaño;
    }

    public int getPasajeros() {
        return pasajeros;
    }

    public void setPasajeros(int pasajeros) {
        this.pasajeros = pasajeros;
    }

    public int getDesbordaje() {
        return desbordaje;
    }

    public void setDesbordaje(int desbordaje) {
        this.desbordaje = desbordaje;
    }

    public int getMatenimiento() {
        return matenimiento;
    }

    public void setMatenimiento(int matenimiento) {
        this.matenimiento = matenimiento;
    }
}
