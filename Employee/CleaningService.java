package Employee;
public class CleaningService extends Employee
{
     String jabat = "Cleaning Service";
    int gaji = 5_000_000;
    
    @Override
    int hitung(int gaji, int jamkerja)
    {
        int potongan =(int) ((super.jamkerja - jamkerja) * super.pot);
        int hasil = gaji - potongan;
        return hasil;
    }
}
