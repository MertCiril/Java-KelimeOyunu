//191141023 Mert �iril Vize S�nav�
package proje;
import java.util.Scanner;
public class player {
	private String kullaniciAdi;
	private int puan;
	public static Scanner scan;
	public void setKullaniciadi(String kullaniciadi)	//private olarak tan�mlad�k bu de�erleri kullanabilmek i�in set get atad�k
	{
		this.kullaniciAdi=kullaniciadi;
	}
	public String getKullaniciadi()
	{
		return kullaniciAdi;
	}
	public void setPuan(int puan)
	{
		this.puan=puan;
	}
	public int getPuan()
	{
		return puan;
	}
	public void giris()	//oyuncu odunu al�p ho� geldiniz gibi giri� ekran�n� yazd�ran fonksiyon.
	{		
		scan = new Scanner(System.in);	
		int secenek=0;
		System.out.println("\t\t|KEL�ME BULMACASI|\n\t\t------------------\n   *Kelime Bulmacas� Oyunu'na Ho�geldiniz..*\n");
		System.out.print("L�tfen kullan�c� ad�n�z� giriniz:\n=>");		
		setKullaniciadi(scan.nextLine());
		System.out.println("\nKaydediliyor...");
		try{ 
		       Thread.sleep(3000); 
		       }catch(InterruptedException ee){} 
		proje.ekrantemizle();	//proje class�ndaki ekrantemizle fonksiyonunu �a��r�yor
		while(secenek!=1)
		{
			System.out.println("\t\t|KEL�ME BULMACASI|\n\t\t------------------\n   *Kelime Bulmacas� Oyunu'na Ho�geldiniz..*\n");
			System.out.print("1-BA�LA\n2-B�LG�\n=>");
			secenek=scan.nextInt();
			if(secenek==2)
			{
				System.out.println("-Kelime Bulmacas� Oyunumuz toplamda 7 a�amal�d�r.\n-7 a�amay� da buldu�unuz takdirde oyun"
						+ " bitmektedir.\n-Puan�n�z her a�amadaki harf �e�itlili�ine g�re,a�ama bitiminde harf ba��na 200 puan olarak artacakt�r.\n"
						+ "-Oyun esnas�nda ��kmak i�in '��k��' yazman�z yeterlidir.\nL�tfen bekleyin...");
				try{ 
		               Thread.sleep(11000); 
		               }catch(InterruptedException ee){}
				proje.ekrantemizle();
			}
		}
		
	}
}
