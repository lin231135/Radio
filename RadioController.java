import java.util.ArrayList;

public class RadioController implements RadioInterface {

	// Atributo
	
    private RadioModel radioModel;

    // Constructor
    
    public RadioController() {
        this.radioModel = new RadioModel();
    }

    // Métodos
    
    @Override
    public void setEncendido(boolean estado) {
        if(estado == true){
            radioModel.setEncendido(false);
            System.out.println("ON");
        }else{
            radioModel.setEncendido(true);
            System.out.println("OFF");
        }
    }

    @Override
    public void setVolumen(int volumen) {
        radioModel.setVolumen(volumen);
    }

    @Override
    public void setEstacionBanda(float emisora, int banda) {
        
    }

    @Override
    public void getEncendido() {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'getEncendido'");
    }

    @Override
    public float getEstacion() {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'getEstacion'");
    }

    @Override
    public void getBanda() {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'getBanda'");
    }

    @Override
    public int getVolumen() {
        return radioModel.getVolumen();
    }

    @Override
    public void guardarEstacion(float emisora, int banda, int indice) {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'guardarEstacion'");
    }

    @Override
    public void recuperarEstacion(int indice) {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'recuperarEstacion'");
    }

    
}