import java.util.Scanner;
public class ArkadasSayilar {
	public static void main(String[] args) {
		Scanner sc =new Scanner(System.in);
		System.out.println("Arkadaş sayı olup olmadığını kontrol etmek istediğiniz sayıları giriniz");
		System.out.print("İlk sayıyı giriniz: ");
		int num1= sc.nextInt(),total1=0,total2=0;
		System.out.print("İkinci sayıyı giriniz: ");
		int num2= sc.nextInt();
		for(int i=1; i<num1-2; ++i)
		{
			if(num1%i==0)
			{
				total1+=i;
			}
		}
		for(int i=1; i<num2-2; ++i)
		{
			if(num2%i==0)
			{
				total2+=i;
			}
		}
		if(total1==num2 && total2==num1)
		{
			System.out.printf("%d ve %d arkadaş sayılardır",num1,num2);
		}
		else
		{
			System.out.printf("%d ve %d arkadaş sayı değildir",num1,num2);
		}
	}
}