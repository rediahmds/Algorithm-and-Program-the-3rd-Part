import java.util.Arrays;
import java.util.Scanner;

public class App {
    public static void main(String[] args) {
        NilaiMahasiswa redi = new NilaiMahasiswa("Redi Ahmad", "2KB05", 2);
        redi.inputNilai();
        System.out.printf("Daftar nilai %s: %s", redi.nama, Arrays.toString(redi.daftarNilai));
    }
}

class NilaiMahasiswa {
    double[] daftarNilai;
    String nama, kelas;

    NilaiMahasiswa(String nama, String kelas, int banyakNilai) {
        this.nama = nama;
        this.kelas = kelas;

        daftarNilai = new double[banyakNilai];
        System.out.printf("=== Nilai Mahasiswa %s ===\n", this.nama);
    }

    public void inputNilai() {
        double temporaryValue;
        try (Scanner input = new Scanner(System.in)) {
            for (int i = 0; i < daftarNilai.length; i++) {
                System.out.print("Masukkan nilai: ");
                temporaryValue = input.nextDouble();
                daftarNilai[i] = temporaryValue;
            }
        } catch (Exception err) {
            System.err.println("Error saat menambahkan nilai :( " + err);
        }
    }
}
