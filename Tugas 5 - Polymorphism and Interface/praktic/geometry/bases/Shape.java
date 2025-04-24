//deklarasi package
package praktic.geometry.bases;

//Kelas abstrak Shape sebagai superclass untuk semua bentuk geometry
public abstract class Shape {
    //Fields
    private String name;
    
    // Konstruktor default
    public Shape(){
    }
    
     // Method setter untuk mengatur nama bentuk
    public void setName (String inputName){
       this.name = inputName;
    }
    
    // Method getter untuk mengambil nama bentuk
    public String getName (){
        return this.name;
    }
    
     // Method abstrak untuk mencetak informasi bentuk, akan dioverride oleh subclassl
    public abstract void printInfo();
    
}