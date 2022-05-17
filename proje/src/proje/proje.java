
package proje;
import java.util.Scanner;
public class proje {
	static int a=0,b=0,c=0,cc=0,d=0,e=0,f=0,g=0,gg=0,h=0,ý=0,i=0,j=0,k=0,l=0,m=0,n=0,	
			o=0,oo=0,p=0,r=0,s=0,ss=0,t=0,u=0,uu=0,v=0,y=0,z=0;							//Bütün metodlarda kullanabilmek için
	static int asama=1,gecicipuan=0;													//deðiþkenleri burada global olarak tanýmladýk.
	static boolean bitti=false;
	public static Scanner scan;
	static player p1=new player();		//yine global olarak player classýndan p1 isimli bir player oluþturduk.
	public static void main(String[] args) {
		scan = new Scanner(System.in);
		char[] harfler={' ','A', 'B','C','Ç','D','E','F','G','Ð', 'H','I','Ý' ,'J','K','L','M',
				'N','O','Ö','P','R','S','Þ','T','U','Ü','V','Y','Z'};	
		String cevap;
		p1.giris(); //player classýndaki giriþ fonksiyonunu çaðýrdýk.
		
		while(!bitti)	//bitti deðeri false iken çalýþmasý için baþýna ! koyduk.
	{
			ekrantemizle();		
		if(asama==1)			//hangi aþamada olduðuna göre gelecek fonksiyona baktýk
		{
			asama1(harfler);
			cevap=scan.nextLine();	//girilecek harfi okuduk
			kontrol( cevap);
			ekrantemizle();
			asama1(harfler);
		}
		
		else if(asama==2)	
		{		
			asama2(harfler);
			cevap=scan.nextLine();
			kontrol( cevap);
			ekrantemizle();
			asama2(harfler);	
		}		
		else if(asama==3)
		{
			asama3(harfler);
			cevap=scan.nextLine();
			kontrol( cevap);
			ekrantemizle();
			asama3(harfler);	
		}	
		else if(asama==4)
		{	
			asama4(harfler);
			cevap=scan.nextLine();
			kontrol( cevap);
			ekrantemizle();
			asama4(harfler);
		}
		 if(asama==5)
		{
			 asama5(harfler);
			 cevap=scan.nextLine();
			 kontrol( cevap);
			 ekrantemizle();
			 asama5(harfler);
		}
		 if(asama==6)
		{
			 asama6(harfler);
			cevap=scan.nextLine();
			kontrol( cevap);
			ekrantemizle();
			asama6(harfler);
		}
		 if(asama==7)
		{
			 asama7(harfler);
			 cevap=scan.nextLine();
			 kontrol( cevap);
			 ekrantemizle();
			 asama7(harfler);
		}
		 if(asama>7)
			 bitti=true;		//while döngüsünden çýkmasý için aþama sayýsý 7 yi aþýnca bitti deðerini true yapýyoruz.
	}
		if(bitti)//oyunun sonunda gelecek ekran 
		{
			ekrantemizle();
			System.out.print("\t|KELÝME BULMACASI|\n\t------------------\n");
			System.out.println("Tebrikler "+p1.getKullaniciadi()+"\n-Oyunu "+p1.getPuan()+" puanla bitirdiniz.\n");
			try{ 
			       Thread.sleep(3000); //ekraný 3 saniye boyunca uyuttuk
			       }catch(InterruptedException ee){} 
			System.out.println("Oyun Kapatýldý...");	
		}	
}	
	public static void asama1(char[] harfler)	//gelecek görüntü için kullanýlan fonksiyonlar
	{
		System.out.print("\t|KELÝME BULMACASI|\n\t------------------\n");
		System.out.print("AÞAMA:"+asama+"\n-------\n\n");
		System.out.print("      ["+harfler[e]+"]\n["+harfler[e]+"]["+harfler[m]+"]"
				+ "["+harfler[l]+"]["+harfler[a]+"]["+harfler[k]+"]\n["+harfler[l]+"] "
				+ "  ["+harfler[m]+"]   ["+harfler[a]+"]\n      ["+harfler[a]+"]   ["+harfler[l]+"]");
		System.out.print("\n\n\t\t\t"+p1.getKullaniciadi()+"\n");
		System.out.print("\t\t\t---------\n\t\t\tPUAN:"+p1.getPuan()+"\n\t\t\t---------\n=>");
		if(e==6&&m==16&&l==15&&a==1&&k==14)
		{	
			p1.setPuan(p1.getPuan()+1000);
			System.out.print("\nTebrikler ilk aþamayý geçtiniz.");		
			asama++;		
			sýfýrlama();
			scan.nextLine();		
		}
		
	
	}
	public static void asama2(char[]harfler)
	{
		System.out.print("\t|KELÝME BULMACASI|\n\t------------------\n");
		System.out.print("AÞAMA:"+asama+"\n-------\n\n");
		System.out.print("["+harfler[b]+"]["+harfler[i]+"]["+harfler[l]+"]["+harfler[g]+"]"
				+ "["+harfler[i]+"]["+harfler[s]+"]["+harfler[a]+"]["+harfler[y]+"]["+harfler[a]+"]["
				+harfler[r]+"]\n                  ["+harfler[y]+"]["+harfler[a]+"]["+harfler[s]+"]\n "
				+ "                 ["+harfler[a]+"]\n                  ["+harfler[y]+"]["+harfler[a]+"]["+harfler[r]+"]["+harfler[a]+"]");
		System.out.print("\n\n\t\t\t"+p1.getKullaniciadi()+"\n");
		System.out.print("\t\t\t---------\n\t\t\tPUAN:"+p1.getPuan()+"\n\t\t\t---------\n=>");
		if(b==2&&i==12&&l==15&&g==8&&s==22&&a==1&&y==28&&r==21)
		{	
		p1.setPuan(p1.getPuan()+1600);
		System.out.print("\nTebrikler ikinci aþamayý geçtiniz.");
		asama++;
		sýfýrlama();
		scan.nextLine();
		}	
	}
	public static void asama3(char[]harfler)
	{
		System.out.print("\t|KELÝME BULMACASI|\n\t------------------\n");
		System.out.print("AÞAMA:"+asama+"\n-------\n\n");
		System.out.print("      ["+harfler[k]+"]\n   ["+harfler[k]+"]["+harfler[u]+"]["+harfler[k]+"]"
				+ "["+harfler[l]+"]["+harfler[a]+"]\n      ["+harfler[l]+"]\n      ["+harfler[a]+"]\n     "
				+ " ["+harfler[k]+"]["+harfler[u]+"]["+harfler[l]+"]["+harfler[a]+"]["+harfler[k]+"]\n    "
				+ "  ["+harfler[l]+"]\n["+harfler[a]+"]["+harfler[k]+"]["+harfler[ý]+"]["+harfler[l]+"]\n      ["+harfler[k]+"]");
		System.out.print("\n\n\t\t\t"+p1.getKullaniciadi()+"\n");
		System.out.print("\t\t\t---------\n\t\t\tPUAN:"+p1.getPuan()+"\n\t\t\t---------\n=>");
		if(k==14&&u==25&&l==15&&a==1&&ý==11)
		{	
		p1.setPuan(p1.getPuan()+1000);
		System.out.print("\nTebrikler üçüncü aþamayý geçtiniz.");
		asama++;
		sýfýrlama();	
		scan.nextLine();
		}
	}
	public static void asama4(char[]harfler)
	{
		System.out.print("\t|KELÝME BULMACASI|\n\t------------------\n");
		System.out.print("AÞAMA:"+asama+"\n-------\n\n");
		System.out.print("   ["+harfler[k]+"]\n   ["+harfler[l]+"]   ["+harfler[f]+"]\n["+harfler[k]+"]"
				+ "["+harfler[a]+"]["+harfler[s]+"]["+harfler[a]+"]\n   ["+harfler[v]+"]   ["+harfler[r]+"]\n"
				+ "   ["+harfler[y]+"]   ["+harfler[e]+"]\n   ["+harfler[e]+"]");
		System.out.print("\n\n\t\t\t"+p1.getKullaniciadi()+"\n");
		System.out.print("\t\t\t---------\n\t\t\tPUAN:"+p1.getPuan()+"\n\t\t\t---------\n=>");
		if(k==14&&l==15&&a==1&&v==27&&y==28&&e==6&&s==22&&r==21&&f==7)
		{	
			p1.setPuan(p1.getPuan()+1800);
			System.out.print("\nTebrikler dördüncü aþamayý geçtiniz.");
			asama++;
			sýfýrlama();	
			scan.nextLine();
			ekrantemizle();
		}
	}
	public static void asama5(char[]harfler)
	{
		System.out.print("\t|KELÝME BULMACASI|\n\t------------------\n");
		System.out.print("AÞAMA:"+asama+"\n-------\n\n");
		System.out.print("["+harfler[e]+"]["+harfler[l]+"]["+harfler[m]+"]["+harfler[a]+"]["+harfler[s]+"]\n   "
				+ "         ["+harfler[e]+"]\n         ["+harfler[a]+"]["+harfler[l]+"]["+harfler[e]+"]["+harfler[m]+"]\n"
				+ "            ["+harfler[a]+"]\n            ["+harfler[m]+"]");
		System.out.print("\n\n\t\t\t"+p1.getKullaniciadi()+"\n");
		System.out.print("\t\t\t---------\n\t\t\tPUAN:"+p1.getPuan()+"\n\t\t\t---------\n=>");
		if(e==6&&l==15&&m==16&&a==1&&s==22)
		{	
			p1.setPuan(p1.getPuan()+1000);
			System.out.print("\nTebrikler beþinci aþamayý geçtiniz.");
			asama++;
			sýfýrlama();	
			scan.nextLine();
			ekrantemizle();
		}
	}
	public static void asama6(char[]harfler)
	{
		System.out.print("\t|KELÝME BULMACASI|\n\t------------------\n");
		System.out.print("AÞAMA:"+asama+"\n-------\n\n");
		System.out.print("            ["+harfler[k]+"]\n["+harfler[k]+"]["+harfler[e]+"]["+harfler[m]+"]["
				+harfler[e]+"]["+harfler[r]+"]\n            ["+harfler[e]+"]["+harfler[m]+"]["+harfler[e]+"]["+harfler[k]+
				"]\n            ["+harfler[m]+"]");
		System.out.print("\n\n\t\t\t"+p1.getKullaniciadi()+"\n");
		System.out.print("\t\t\t---------\n\t\t\tPUAN:"+p1.getPuan()+"\n\t\t\t---------\n=>");
		if(k==14&&r==21&&e==6&&m==16)
		{	
			p1.setPuan(p1.getPuan()+800);
			System.out.print("\nTebrikler altýncý aþamayý geçtiniz.");
			asama++;
			sýfýrlama();	
			scan.nextLine();
			ekrantemizle();
		}
	}
	public static void asama7(char[]harfler)
	{
		System.out.print("\t|KELÝME BULMACASI|\n\t------------------\n");
		System.out.print("AÞAMA:"+asama+"\n-------\n\n");
		System.out.print("            ["+harfler[k]+"]\n            ["+harfler[i]+"]\n            ["+harfler[t]+
				"]\n   ["+harfler[t]+"]      ["+harfler[a]+"]\n["+harfler[k]+"]["+harfler[a]+"]["+harfler[t]+"]["
				+harfler[i]+"]["+harfler[p]+"]\n   ["+harfler[k]+"]\n   ["+harfler[i]+"]\n   ["+harfler[p]+"]");
		System.out.print("\n\n\t\t\t"+p1.getKullaniciadi()+"\n");
		System.out.print("\t\t\t---------\n\t\t\tPUAN:"+p1.getPuan()+"\n\t\t\t---------\n=>");
		if(k==14&&i==12&&t==24&&a==1&&p==20)
		{	
			p1.setPuan(p1.getPuan()+1000);
			System.out.print("\nTebrikler yedinci aþamayý geçtiniz.");
			asama++;
			sýfýrlama();	
			scan.nextLine();
			ekrantemizle();
		}
	}
	public static void kontrol(String cevap)	//burada girilen cevaba karþýlýk gelen int in deðerini deðiþtiriyoruz.
	{	
		if(cevap.equalsIgnoreCase("a"))
			a=1;
		else if(cevap.equalsIgnoreCase("b"))
			b=2;
		else if(cevap.equalsIgnoreCase("c"))
			c=3;
		else if(cevap.equalsIgnoreCase("ç"))
		    cc=4;
		else if(cevap.equalsIgnoreCase("d"))
			d=5;
		else if(cevap.equalsIgnoreCase("e"))
			{e=6;}
		else if(cevap.equalsIgnoreCase("f"))
			f=7;
		else if(cevap.equalsIgnoreCase("g"))
			g=8;
		else if(cevap.equalsIgnoreCase("ð"))
			gg=9;
		else if(cevap.equalsIgnoreCase("h"))
			h=10;
		else if(cevap.equals("ý")||cevap.equals("I"))	//program ý ve i leri karýþtýrdýðý için bu kýsýmda
			ý=11;
		else if(cevap.equals("i")||cevap.equals("Ý"))	//equalsIgnorecase kullanamadým
			i=12;
		else if(cevap.equalsIgnoreCase("j"))
			j=13;
		else if(cevap.equalsIgnoreCase("k"))
			k=14;
		else if(cevap.equalsIgnoreCase("l"))
			l=15;
		else if(cevap.equalsIgnoreCase("m"))
			m=16;
		else if(cevap.equalsIgnoreCase("n"))
			n=17;
		else if(cevap.equalsIgnoreCase("o"))
			o=18;
		else if(cevap.equalsIgnoreCase("ö"))
			oo=19;
		else if(cevap.equalsIgnoreCase("p"))
			p=20;
		else if(cevap.equalsIgnoreCase("r"))
			r=21;
		else if(cevap.equalsIgnoreCase("s"))
			s=22;
		else if(cevap.equalsIgnoreCase("þ"))
			ss=23;
		else if(cevap.equalsIgnoreCase("t"))
			t=24;
		else if(cevap.equalsIgnoreCase("u"))
			u=25;
		else if(cevap.equalsIgnoreCase("ü"))
			uu=26;
		else if(cevap.equalsIgnoreCase("v"))
			v=27;
		else if(cevap.equalsIgnoreCase("y"))
			y=28;
		else if(cevap.equalsIgnoreCase("z"))
			z=29;
		else if(cevap.equalsIgnoreCase("çýkýþ"))
		{
			asama=9;	
		}
		else 
		{
			System.out.println("Yanlýþ harf girdiniz.Lütfen bekleyiniz.");
			 try{ 
			       Thread.sleep(2000); //2 saniye bekletiyor
			       }catch(InterruptedException ee){} 
		}
		
	}
	public static void sýfýrlama()//her aþama deðiþiminde intlerin deðerlerini sýfýrlýyoruz
	{
		a=0;b=0;c=0;cc=0;d=0;e=0;f=0;g=0;gg=0;h=0;ý=0;i=0;j=0;k=0;
		l=0;m=0;n=0;o=0;oo=0;p=0;r=0;s=0;ss=0;t=0;u=0;uu=0;v=0;y=0;z=0;	
	}
	public static void ekrantemizle()	//ekraný temizleme kodu olmadýðý için alt satýra geçip duruyor
	{
		for(int i=0;i<20;i++)
			System.out.println("\n");
	}
}
