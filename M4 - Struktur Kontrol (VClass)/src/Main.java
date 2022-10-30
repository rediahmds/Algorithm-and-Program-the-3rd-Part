
public class Main {
  public static void main(String[] args) {
    // Membuat instance dan menggunakan method-methodya
    BeasiswaMahasiswa redi = new BeasiswaMahasiswa("Redi Ahmad", "2KB05", 90, 92);
    System.out.println("Rerata nilai: " + redi.hitungRerataNilai());
    System.out.println("Predikat nilai: " + redi.predikatNilai());
    redi.statusBeasiswa();

    System.out.println();

    BeasiswaMahasiswa ucup = new BeasiswaMahasiswa("Yusuf Hamdani", "2KB05", 91, 89);
    System.out.println("Rerata nilai: " + ucup.hitungRerataNilai());
    System.out.println("Predikat nilai: " + ucup.predikatNilai());
    ucup.statusBeasiswa();

    System.out.println();

    BeasiswaMahasiswa palde = new BeasiswaMahasiswa("Naufal Azi", "2KB05", 90, 92);
    System.out.println("Rerata nilai: " + palde.hitungRerataNilai());
    System.out.println("Predikat nilai: " + palde.predikatNilai());
    palde.statusBeasiswa();

    System.out.println();

    BeasiswaMahasiswa orangLain = new BeasiswaMahasiswa("Orang lain", "2KB05", 80, 23);
    System.out.println("Rerata nilai: " + orangLain.hitungRerataNilai());
    System.out.println("Predikat nilai: " + orangLain.predikatNilai());
    orangLain.statusBeasiswa();
  }
}

// Membuat Base class
class Mahasiswa {
  // Atribut
  String nama, kelas;
  final double[] nilaiMahasiswa;

  // Constructor
  public Mahasiswa(String nama, String kelas, double UTS, double UAS) {
    this.nama = nama;
    this.kelas = kelas;

    final double[] nilai = { UTS, UAS };
    this.nilaiMahasiswa = nilai;
  }

  // Method 1
  public double hitungRerataNilai() {
    double jumlah = 0;

    for (double n : nilaiMahasiswa) {
      jumlah += n;
    }

    return jumlah / nilaiMahasiswa.length;
  }

  // Method 2
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
    else if ((rerataNilai < 40))
      predikat = 'E';

    return predikat;
  }
}

// Sub class yang diturunkan dari class Mahasiswa
class BeasiswaMahasiswa extends Mahasiswa {

  // Atribut
  boolean isBeasiswa;

  // Constructor
  public BeasiswaMahasiswa(String nama, String kelas, double UTS, double UAS) {

    // Memanggil constructor dari base class
    super(nama, kelas, UTS, UAS);
  }

  // Method
  public boolean statusBeasiswa() {
    if (predikatNilai() == 'A') {
      isBeasiswa = true;
      System.out.println(this.nama + " mendapatkan beasiswa untuk semester depan.");
    } else {
      isBeasiswa = false;
      System.out.println(this.nama + " belum bisa mendapatkan beasiswa untuk semester depan.");
    }

    return isBeasiswa;
  }
}