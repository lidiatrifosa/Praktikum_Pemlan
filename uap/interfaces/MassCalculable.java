package uap.interfaces;

// Interface untuk objek yang bisa dihitung massanya (dalam gram)
public interface MassCalculable {
    int DENSITY = 8; 
    double THICKNESS = 0.5; 
    double getMass(); // Method untuk menghitung massa dalam gram
}
