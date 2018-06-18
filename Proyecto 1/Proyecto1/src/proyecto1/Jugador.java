package proyecto1;

public class Jugador {
    private int  vida1, vida2;
    private String nombre1, nombre2, per1, per2, per3, per4, per5, per6, ganador,tiempo;

    public Jugador(String nombre1, String nombre2, String tiempo, int vida1, int vida2, String per1, String per2, String per3, String per4, String per5, String per6, String ganador) {
        this.tiempo = tiempo;
        this.vida1 = vida1;
        this.vida2 = vida2;
        this.nombre1 = nombre1;
        this.nombre2 = nombre2;
        this.per1 = per1;
        this.per2 = per2;
        this.per3 = per3;
        this.per4 = per4;
        this.per5 = per5;
        this.per6 = per6;
        this.ganador = ganador;
    }

    public String getTiempo() {
        return tiempo;
    }

    public void setTiempo(String tiempo) {
        this.tiempo = tiempo;
    }

    public int getVida1() {
        return vida1;
    }

    public int getVida2() {
        return vida2;
    }

    public void setVida2(int vida2) {
        this.vida2 = vida2;
    }
    

    public void setVida1(int vida1) {
        this.vida1 = vida1;
    }

    public String getNombre1() {
        return nombre1;
    }

    public void setNombre1(String nombre1) {
        this.nombre1 = nombre1;
    }

    public String getNombre2() {
        return nombre2;
    }

    public void setNombre2(String nombre2) {
        this.nombre2 = nombre2;
    }

    public String getPer1() {
        return per1;
    }

    public void setPer1(String per1) {
        this.per1 = per1;
    }

    public String getPer2() {
        return per2;
    }

    public void setPer2(String per2) {
        this.per2 = per2;
    }

    public String getPer3() {
        return per3;
    }

    public void setPer3(String per3) {
        this.per3 = per3;
    }

    public String getPer4() {
        return per4;
    }

    public void setPer4(String per4) {
        this.per4 = per4;
    }

    public String getPer5() {
        return per5;
    }

    public void setPer5(String per5) {
        this.per5 = per5;
    }

    public String getPer6() {
        return per6;
    }

    public void setPer6(String per6) {
        this.per6 = per6;
    }

    public String getGanador() {
        return ganador;
    }

    public void setGanador(String ganador) {
        this.ganador = ganador;
    }
    
}
