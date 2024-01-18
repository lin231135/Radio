interface RadioInterface {

    void setEncendido(boolean estado);
    void setVolumen(int volumen);
    void setEstacionBanda(float emisora, int banda);
    void getEncendido();
    float getEstacion();
    void getBanda();
    int getVolumen();
    void guardarEstacion(float emisora, int banda, int indice);
    void recuperarEstacion(int indice);
}