public class Main {
  public static void main(String[] args) {
    System.out.println("Hello");
  }
}

class Mahasiswa {

  String nama, kelas;
  int[] nilai;

  public Mahasiswa(String nama, String kelas, int[] daftarNilai) {
    this.nama = nama;
    this.kelas = kelas;
    this.nilai = daftarNilai;
  }
}