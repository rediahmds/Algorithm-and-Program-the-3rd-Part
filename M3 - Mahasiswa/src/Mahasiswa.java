import java.util.Arrays;

// Define a class named Mahasiswa
public class Mahasiswa {
    // Class attributes
    String nama;
    String kelas;
    String NPM;

    // Constructor - get executed when a class is instantiated
    public Mahasiswa(String nama, String kelas, String NPM) {
        this.nama = nama;
        this.kelas = kelas;
        this.NPM = NPM;
    }

    // Method - get executed only if it is called

    // Method 1
    public String ikutiKuliah(String mataKuliah) {
        return nama + " mengikuti kuliah " + mataKuliah;
    }

    // Method 2
    public String tunjukanID() {
        String ID[] = {
                nama, kelas, NPM
        };
        return Arrays.toString(ID);
    }

    // Method 3
    public String kerjakanTugas(String tugas) {
        return nama + " sedang mengerjakan tugas " + tugas;
    };

    public static void main(String[] args) {
        // Instantiate a class
        Mahasiswa redi = new Mahasiswa("Redi Ahmad", "2KB05", "21121086");
        Mahasiswa ucup = new Mahasiswa("Yusuf Hamdani", "2KB05", "20121943");
        Mahasiswa alda = new Mahasiswa("Alda Emly", "2KB05", "20121103");

        // Calling methods
        System.out.println(redi.tunjukanID());
        System.out.println(redi.ikutiKuliah("Matematika Lanjut"));
        System.out.println(redi.kerjakanTugas("Matematika Lanjut"));

        System.out.print("\n");

        System.out.println(ucup.tunjukanID());
        System.out.println(ucup.ikutiKuliah("Algoritma dan Pemrograman 3"));
        System.out.println(ucup.kerjakanTugas("Algoritma dan Pemrograman 3"));

        System.out.print("\n");

        System.out.println(alda.tunjukanID());
        System.out.println(alda.ikutiKuliah("Sistem Operasi"));
        System.out.println(alda.kerjakanTugas("Sistem Operasi"));
    }
}
