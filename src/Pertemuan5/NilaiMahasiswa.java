package Pertemuan5;

public class NilaiMahasiswa {
    public static void main(String[] args) {
        if (args.length != 6) {
            System.out.println("Masukkan input sebagai argumen: NPM, Nama Mahasiswa, Nilai Kehadiran, Nilai Tugas, Nilai UTS, Nilai UAS");
            return;
        }

        String npm = args[0];
        String nama = args[1];
        double nilaiKehadiran = Double.parseDouble(args[2]);
        double nilaiTugas = Double.parseDouble(args[3]);
        double nilaiUTS = Double.parseDouble(args[4]);
        double nilaiUAS = Double.parseDouble(args[5]);

        double nilaiAkhir = (0.1 * nilaiKehadiran) + (0.2 * nilaiTugas) + (0.3 * nilaiUTS) + (0.4 * nilaiUAS);

        String grade, keterangan;
        if (nilaiAkhir >= 76 && nilaiAkhir <= 100) {
            grade = "A";
            keterangan = "ISTIMEWA";
        } else if (nilaiAkhir >= 66 && nilaiAkhir <= 75) {
            grade = "B";
            keterangan = "BAIK";
        } else if (nilaiAkhir >= 56 && nilaiAkhir <= 65) {
            grade = "C";
            keterangan = "CUKUP";
        } else if (nilaiAkhir >= 46 && nilaiAkhir <= 55) {
            grade = "D";
            keterangan = "KURANG";
        } else {
            grade = "E";
            keterangan = "KURANG SEKALI";
        }

        System.out.println("\nTampilan Output:");
        System.out.println("NPM Mahasiswa: " + npm);
        System.out.println("Nama Mahasiswa: " + nama);
        System.out.println("Nilai Rata-rata: " + nilaiAkhir);
        System.out.println("Grade: " + grade);
        System.out.println("Keterangan: " + keterangan);
    }
}
