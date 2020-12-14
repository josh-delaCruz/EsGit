
public class Camera {
    private int numCamera; //numero della camera
    private String tipologia; //tipologia camera (singola,matrimoniale con bagno,doppia senza bagno)
    private boolean occupata; //true=occupata false=libera
    
    public Camera(){
      numCamera=1;
      tipologia="";
      occupata=false;
      
    }
    
    //per creare solo camere libere
    public Camera(int numCamera, String tipologia){
        this.numCamera=numCamera;
        this.tipologia=tipologia;
        occupata=false; //libera
    }
    

    public Camera(int numCamera, String tipologia, boolean occupata){
        this.numCamera=numCamera;
        this.tipologia=tipologia;
        this.occupata=occupata; 
    }
    
    public int getNumCamera() {
        return numCamera;
    }

    public String getTipologia() {
        return tipologia;
    }

    public boolean getOccupata() {
        return occupata;
    }
    
    //cambiare stato della stanza a occupata
    public void setOccupata() {
        this.occupata = true;
    }
    
    
    
    
}

