package Employee;

public class Manager extends Employee 
{

    String jabat = "Manager";
    int gaji = 19_000_000;

    @Override
    int hitung(int gaji, int jamkerja) 
    {
        int potongan = (int) ((super.jamkerja - jamkerja) * super.pot);
        int hasil = gaji - potongan;
        return hasil;
    }
}
