package uap.interfaces;

// Interface untuk menghitung biaya kirim dan mengubah ke format rupiah
public interface ShippingCostCalculator {
     int PRICE_PER_KG = 2000; // Harga pengiriman per kg dalam rupiah
     double calculateCost(); // Method untuk menghitung biaya pengiriman
}


