package uap.bases;

//Kelas abstrak Shape sebagai base class untuk semua bentuk geometri
public abstract class Shape {
    private String name; 

    // Konstruktor
    public Shape() {
        this.name = "Shape";
    }

    // Setter untuk nama
    public void setName(String inputName) {
        this.name = inputName;
    }

    // Getter untuk nama
    public String getName() {
        return this.name;
    }

    // Method abstrak yang harus diimplementasikan oleh subclass
    public abstract void printInfo();
}