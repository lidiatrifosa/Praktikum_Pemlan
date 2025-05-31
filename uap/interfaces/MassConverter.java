package uap.interfaces;

// Interface untuk mengonversi satuan massa dari gram ke kilogram
public interface MassConverter {
    int DENOMINATOR = 1000; // Pembagi untuk konversi gram ke kg
    double gramToKilogram(); // Method untuk konversi gram ke kg
}