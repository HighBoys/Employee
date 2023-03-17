package Employee;
public class Boss extends Employee
{
    String jabat = "boss";
    int gaji = 25_000_000;
    
    @Override
    int hitung(int gaji, int jamkerja)
    {
        int potongan =(int) ((super.jamkerja - jamkerja) * super.pot);
        int hasil = gaji - potongan;
        return hasil;
    }
}
