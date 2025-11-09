import java.util.Scanner;

public class StatsFromLine {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Masukkan angka dipisah spasi (contoh: 12 5 7 20 3):");
        String line = sc.nextLine().trim();

        if (line.isEmpty()) {
            System.out.println("Tidak ada angka yang dimasukkan.");
            return;
        }

        String[] tokens = line.split("\\s+");
        double sum = 0;
        double max = Double.NEGATIVE_INFINITY;
        double min = Double.POSITIVE_INFINITY;
        int count = 0;

        for (String t : tokens) {
            try {
                double v = Double.parseDouble(t);
                sum += v;
                if (v > max) max = v;
                if (v < min) min = v;
                count++;
            } catch (NumberFormatException e) {
                System.out.println("Mengabaikan token bukan angka: \"" + t + "\"");
            }
        }

        if (count == 0) {
            System.out.println("Tidak ada angka valid.");
        } else {
            double avg = sum / count;
            System.out.println("Jumlah (sum)        : " + sum);
            System.out.println("Rata-rata (average) : " + avg);
            System.out.println("Nilai terbesar      : " + max);
            System.out.println("Nilai terkecil      : " + min);
        }

        sc.close();
    }
}