
public class Main {
  public static void main(String[] args) {
    Mahasiswa edi = new Mahasiswa("Juned", "1IA69", 80.788, 69.98);
    System.out.println("Rerata nilai " + edi.nama + " = " + edi.hitungRerataNilai());
    System.out.println("Predikat nilai " + edi.nama + ": " + edi.predikatNilai());
  }
}

class Mahasiswa {

  String nama, kelas;
  final double[] nilaiMahasiswa;

  public Mahasiswa(String nama, String kelas, double UTS, double UAS) {
    this.nama = nama;
    this.kelas = kelas;

    final double[] nilai = { UTS, UAS };
    this.nilaiMahasiswa = nilai;
  }

  public double hitungRerataNilai() {
    double jumlah = 0;

    for (double n : nilaiMahasiswa) {
      jumlah += n;
    }

    return jumlah / nilaiMahasiswa.length;
  }

  public char predikatNilai() {
    double rerataNilai = hitungRerataNilai();
    char predikat = ' ';

    if ((rerataNilai >= 90) && (rerataNilai <= 100))
      predikat = 'A';
    else if ((rerataNilai >= 75) && (rerataNilai < 90))
      predikat = 'B';
    else if ((rerataNilai >= 60) && (rerataNilai < 75))
      predikat = 'C';
    else if ((rerataNilai >= 40) && (rerataNilai < 60))
      predikat = 'D';

    // TODO: Add a new condition that handle value < 40.
    // TODO: Also, use try and catch block.

    return predikat;
  }

}