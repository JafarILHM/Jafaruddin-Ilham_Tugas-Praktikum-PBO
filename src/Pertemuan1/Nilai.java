package Pertemuan1;


class Nilai {
    String NIM;
    String Nama;
    double NilaiAbsen;
    double NilaiTugas;
    double NilaiUTS;
    double NilaiUAS;


    Nilai(String NIM, String Nama, double NilaiAbsen, double NilaiTugas, double NilaiUTS, double NilaiUAS) {
        this.NIM = NIM;
        this.Nama = Nama;
        this.NilaiAbsen = NilaiAbsen;
        this.NilaiTugas = NilaiTugas;
        this.NilaiUTS = NilaiUTS;
        this.NilaiUAS = NilaiUAS;
    }


    void CetakNilai() {
        double NilaiAkhir = (NilaiAbsen * 0.1) + (NilaiTugas * 0.2) + (NilaiUTS * 0.3) + (NilaiUAS * 0.4);
        System.out.println("NIM               : " + NIM);
        System.out.println("Nama              : " + Nama);
        System.out.println("Nilai Absen [10%] : " + NilaiAbsen);
        System.out.println("Nilai Tugas [20%] : " + NilaiTugas);
        System.out.println("Nilai UTS   [30%] : " + NilaiUTS);
        System.out.println("Nilai UAS   [40%] : " + NilaiUAS);
        System.out.println("Nilai Akhir       : " + NilaiAkhir);
    }
}