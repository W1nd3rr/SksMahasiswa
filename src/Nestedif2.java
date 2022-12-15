
import java.util.Scanner;


public class Nestedif2 {

    public static void main(String[] args) {
        String kuliah,fakultas;
        int angkatan,sks,hasil;
        Scanner input = new Scanner(System.in);
        System.out.println("angkatan anda ");
        angkatan = input.nextInt();
        if (angkatan <= 2018 && angkatan > 1000)
        {
            System.out.println("apa jenis mata kuliah anda? tatap-muka atau praktikum ");
            kuliah = input.next();
            if ("tatap-muka".equalsIgnoreCase(kuliah))
            {
                System.out.println("berapa sks anda inginkan");
                sks = input.nextInt();
                if (sks > 0 && sks <= 24)
                {
                    hasil = sks * 100000 + 5000000;
                    System.out.println(hasil);
                }
                else
                {
                    System.out.println("maaf inputan anda salah");
                }
            }
            else if ("praktikum".equalsIgnoreCase(kuliah))
            {
                System.out.println("berapa sks anda inginkan");
                sks = input.nextInt();
                if (sks > 0 && sks <= 24)
                {
                    hasil = sks * 150000 + 5000000;
                    System.out.println(hasil);
                }
                else
                {
                    System.out.println("maaf inputan anda salah");
                }
            }
            else
            {
                System.out.println("maaf inputan anda salah");
            }
        }
        else if (angkatan > 1000 && angkatan >= 2019)
        {
            System.out.println("apa fakultas anda");
            fakultas = input.next();
            if ("Fti".equalsIgnoreCase(fakultas))
            {
                System.out.println("apa jenis mata kuliah anda? tatap-muka atau praktikum ");
                kuliah = input.next();
                if ("tatap-muka".equalsIgnoreCase(kuliah))
                {
                    System.out.println("berapa sks anda inginkan");
                    sks = input.nextInt();
                    if (sks > 0 && sks <= 24)
                    {
                        hasil = sks * 100000 + 2500000;
                        System.out.println(hasil);
                    }
                    else
                    {
                        System.out.println("maaf inputan anda salah");
                    }
                }
                else if ("praktikum".equalsIgnoreCase(kuliah))
                {
                    System.out.println("berapa sks anda inginkan");
                    sks = input.nextInt();
                    if (sks > 0 && sks <= 24)
                    {
                        hasil = sks * 150000 + 2500000;
                        System.out.println(hasil);
                    }
                    else
                    {
                        System.out.println("maaf inputan anda salah");
                    }
                }
                else
                {
                    System.out.println("maaf inputan anda salah");
                }
            }
            else if ("Ft".equalsIgnoreCase(fakultas))
            {
                System.out.println("apa jenis mata kuliah anda? tatap-muka atau praktikum ");
                kuliah = input.next();
                if ("tatap-muka".equalsIgnoreCase(kuliah))
                {
                    System.out.println("berapa sks anda inginkan");
                    sks = input.nextInt();
                    if (sks > 0 && sks <= 24)
                    {
                        hasil = sks * 100000 + 2250000;
                        System.out.println(hasil);
                    }
                    else
                    {
                        System.out.println("maaf inputan anda salah");
                    }
                }
                else if ("praktikum".equalsIgnoreCase(kuliah))
                {
                    System.out.println("berapa sks anda inginkan");
                    sks = input.nextInt();
                    if (sks > 0 && sks <= 24)
                    {
                        hasil = sks * 150000 + 2250000;
                        System.out.println(hasil);
                    }
                    else
                    {
                        System.out.println("maaf inputan anda salah");
                    }
                }
                else
                {
                    System.out.println("maaf inputan anda salah");
                }
            }
            else if ("fh".equalsIgnoreCase(fakultas))
            {
                System.out.println();
            }
            else if ("fpsi".equalsIgnoreCase(fakultas))
            {
                System.out.println(2150000);
            }
            else
            {
                System.out.println("maaf inputan anda salah");
            }
        }
    }
    
}
