package practicavacasipc1;

public class NodoListaMantenimiento {
    private String estado,tamaño;
    private int pasajeros, desbordaje,matenimiento,noavion,noestacion;
    public NodoListaMantenimiento siguiente;

    public NodoListaMantenimiento(int noestacion,String estado,int noavion, String tamaño, int pasajeros, int desbordaje, int matenimiento) {
        this.noestacion=noestacion;
        this.estado = estado;
        this.tamaño = tamaño;
        this.pasajeros = pasajeros;
        this.desbordaje = desbordaje;
        this.matenimiento = matenimiento;
        this.noavion = noavion;
        this.siguiente = null;
    }

    public NodoListaMantenimiento(int noestacion, String estado) {
        this.estado = estado;
        this.noestacion=noestacion;
        this.tamaño = "";
        this.pasajeros = 0;
        this.desbordaje = 0;
        this.matenimiento = 0;
        this.noavion = 0;
        this.siguiente = null;
    }

    public int getNoestacion() {
        return noestacion;
    }

    public void setNoestacion(int noestacion) {
        this.noestacion = noestacion;
    }

    public String getEstado() {
        return estado;
    }

    public void setEstado(String estado) {
        this.estado = estado;
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

    public int getNoavion() {
        return noavion;
    }

    public void setNoavion(int noavion) {
        this.noavion = noavion;
    }
    
}
