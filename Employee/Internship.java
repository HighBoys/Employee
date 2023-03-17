package Employee;
public class Internship extends Employee
{
     String jabat = "Intership";
    int gaji = 3_500_000;
    
    @Override
    int hitung(int gaji, int jamkerja)
    {
        int potongan =(int) ((super.jamkerja - jamkerja) * super.pot);
        int hasil = gaji - potongan;
        return hasil;
    }
}
