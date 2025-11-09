public class SimpleCalculator {
    static final long PRICE_PER_ITEM = 20000L;

    public static void main(String[] args) {
        int qtyBudi = 35;
        long totalBefore = qtyBudi * PRICE_PER_ITEM;
        int discountPercent = Math.min((qtyBudi / 10) * 5, 50);
        long discountAmount = totalBefore * discountPercent / 100;
        long totalAfter = totalBefore - discountAmount;

        System.out.println("=== NOMOR 5 : KALKULATOR HARGA ===");
        System.out.println("Jumlah barang       : " + qtyBudi);
        System.out.println("Harga per item      : " + PRICE_PER_ITEM);
        System.out.println("Total sebelum diskon: " + totalBefore);
        System.out.println("Diskon              : " + discountPercent + "%");
        System.out.println("Jumlah diskon       : " + discountAmount);
        System.out.println("Total setelah diskon: " + totalAfter);
        System.out.println();
    }
}