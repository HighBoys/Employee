package Employee;

import java.util.Scanner;

public class Main 
{
static Scanner scan = new Scanner(System.in);
    
    public static void main(String[] args) 
    {
        System.out.print("Masukan Nama : ");
        String nama = scan.nextLine();
        System.out.print("Masukan NIP : ");
        int nip = scan.nextInt();
        scan.nextLine();
        System.out.print("Masukan Jabatan : ");
        String jabat = scan.nextLine();
        Boss bos = new Boss();
        Manager menejer = new Manager();
        CleaningService kliningserfis = new CleaningService();
        Internship intersip = new Internship();
        int gA = 0;
        
        if(jabat.equalsIgnoreCase(bos.jabat))
        {
            System.out.print("berapa lama waktu bekerja anda : ");
            int lamakerja = scan.nextInt();
            gA = bos.hitung(bos.gaji, lamakerja);
            System.out.println("Gaji MAX : "+bos.gaji);
        }
        else if(jabat.equalsIgnoreCase(menejer.jabat))
        {
            System.out.print("berapa lama waktu bekerja anda : ");
            int lamakerja = scan.nextInt();
            gA = menejer.hitung(menejer.gaji, lamakerja);
            System.out.print("Gaji MAX : "+menejer.gaji);
        }
        else if(jabat.equalsIgnoreCase(kliningserfis.jabat))
        {
            System.out.print("berapa lama waktu bekerja anda : ");
            int lamakerja = scan.nextInt();
            gA = kliningserfis.hitung(kliningserfis.gaji, lamakerja);
            System.out.print("Gaji MAX : "+kliningserfis.gaji);
        }
        else if(jabat.equalsIgnoreCase(intersip.jabat))
        {
            System.out.print("berapa lama waktu bekerja anda : ");
            int lamakerja = scan.nextInt();
            gA = intersip.hitung(intersip.gaji, lamakerja);
            System.out.print("Gaji MAX : "+intersip.gaji);
        }
        System.out.print("Status (Menikah / Belum Menikah) : ");
        scan.nextLine();
        String status= scan.nextLine();
        boolean st = true;
        if (status.equalsIgnoreCase("Menikah")) 
        {
         gA += 2_500_000;   
        }
        
        System.out.println("Gaji Akhir : "+gA);
    }
}
