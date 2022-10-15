// Define a class named Mahasiswa
public class Mahasiswa {
    // Class attributes
    String nama;
    String kelas;
    int NPM;

    // Constructor - get executed when a class is instantiated
    public Mahasiswa(String nama, String kelas, int NPM) {
        this.nama = nama;
        this.kelas = kelas;
        this.NPM = NPM;
        System.out.println("Constructor executed.");
    }

    // Method - get executed only if it is called

    // Method 1
    public String ikutiKuliah(String mataKuliah) {
        return nama + " mengikuti kuliah " + mataKuliah;
    }

    // Method 2
    public int tunjukanNPM() {
        return NPM;
    }

    public static void main(String[] args) {
        // Instantiate a class
        Mahasiswa redi = new Mahasiswa("Redi Ahmad", "2KB05", 21121086);

        // Calling method of an object
        System.out.println(redi.ikutiKuliah("Matematika"));
        System.out.println(redi.tunjukanNPM());
    }
}
