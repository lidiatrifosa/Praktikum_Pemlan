package praktic.geometry.bases;

// Kelas abstrak CircularShape yang merupakan turunan dari Shape,dasar untuk bentuk melingkar yaitu Circle dan Sphere
public abstract class CircularShape extends Shape{
     
     // Fields
    private double radius;
    protected int PI_NUMERATOR = 22;  // Konstanta pembilang dari π (22/7) 
    protected int PI_DENOMINATOR = 7;  // Konstanta penyebut dari π (22/7) 
    
     // Konstruktor default (kosong)
    public CircularShape(){
    }
    
    // Method setter untuk mengatur nilai jari-jari
    public void setRadius (double inputRadius){
     this.radius = inputRadius;
    }
    
    // Method getter untuk mengambil nilai jari-jari
    public double getRadius(){
     return radius;
    }
   
}
