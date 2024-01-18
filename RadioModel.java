import java.util.ArrayList;

public class RadioModel{

    private boolean encendido;
    private String marca;
    private float estacion;
    private int volumen;
    private ArrayList estaciones;

    public RadioModel(){
        this.encendido = encendido;
        this.marca = marca;
        this.estacion = estacion;
        this.volumen = volumen;
        this.estaciones = estaciones;
    }

    public RadioModel(boolean encendido, String marca, float estacion, int volumen, ArrayList estaciones) {
        this.encendido = encendido;
        this.marca = marca;
        this.estacion = estacion;
        this.volumen = volumen;
        this.estaciones = estaciones;
    }

    public boolean isEncendido() {
        return encendido;
    }

    public void setEncendido(boolean encendido) {
        this.encendido = encendido;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public float getEstacion() {
        return estacion;
    }

    public void setEstacion(float estacion) {
        this.estacion = estacion;
    }

    public int getVolumen() {
        return volumen;
    }

    public void setVolumen(int volumen) {
        this.volumen = volumen;
    }

    public ArrayList getEstaciones() {
        return estaciones;
    }

    public void setEstaciones(ArrayList estaciones) {
        this.estaciones = estaciones;
    }
}