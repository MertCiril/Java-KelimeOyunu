//191141023 Mert Çiril Vize Sýnavý
package proje;
import java.util.Scanner;
public class player {
	private String kullaniciAdi;
	private int puan;
	public static Scanner scan;
	public void setKullaniciadi(String kullaniciadi)	//private olarak tanýmladýk bu deðerleri kullanabilmek için set get atadýk
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
	public void giris()	//oyuncu odunu alýp hoþ geldiniz gibi giriþ ekranýný yazdýran fonksiyon.
	{		
		scan = new Scanner(System.in);	
		int secenek=0;
		System.out.println("\t\t|KELÝME BULMACASI|\n\t\t------------------\n   *Kelime Bulmacasý Oyunu'na Hoþgeldiniz..*\n");
		System.out.print("Lütfen kullanýcý adýnýzý giriniz:\n=>");		
		setKullaniciadi(scan.nextLine());
		System.out.println("\nKaydediliyor...");
		try{ 
		       Thread.sleep(3000); 
		       }catch(InterruptedException ee){} 
		proje.ekrantemizle();	//proje classýndaki ekrantemizle fonksiyonunu çaðýrýyor
		while(secenek!=1)
		{
			System.out.println("\t\t|KELÝME BULMACASI|\n\t\t------------------\n   *Kelime Bulmacasý Oyunu'na Hoþgeldiniz..*\n");
			System.out.print("1-BAÞLA\n2-BÝLGÝ\n=>");
			secenek=scan.nextInt();
			if(secenek==2)
			{
				System.out.println("-Kelime Bulmacasý Oyunumuz toplamda 7 aþamalýdýr.\n-7 aþamayý da bulduðunuz takdirde oyun"
						+ " bitmektedir.\n-Puanýnýz her aþamadaki harf çeþitliliðine göre,aþama bitiminde harf baþýna 200 puan olarak artacaktýr.\n"
						+ "-Oyun esnasýnda çýkmak için 'çýkýþ' yazmanýz yeterlidir.\nLütfen bekleyin...");
				try{ 
		               Thread.sleep(11000); 
		               }catch(InterruptedException ee){}
				proje.ekrantemizle();
			}
		}
		
	}
}
