# M4 - Create a program to determine student score

## Mahasiswa class

- Consist three properties, `nama`, `kelas`, `nilaiMahasiswa`
  - `nama` to store student name.
  - `kelas` to store student class(grade).
  - `nilaiMahasiswa` to store student scores (Midterm Exam and End-semester Exam).
- The constructor needed four arguments, `nama`, `kelas`, `UTS`, and `UAS`

  - `UTS` and `UAS` represent both Midterm Exam and End-semester Exam. Those two argument will be passed to an array.

- Create two methods, `hitungRerataNilai` and `predikatNilai`
  - `hitungRerataNilai` is a function to calculate the average score of a student.
  - `predikatNilai` is a method to determine a student assesment based on the `hitungRerataNilai` value.

## Main class

Create 3 instances of Mahasiswa class and pass the values into the constructor.
