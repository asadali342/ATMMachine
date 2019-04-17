import java.util.*;
class Atm{
	public static void main(String ar[]){
		Scanner input=new Scanner(System.in);
		int amount;
		int hun;
		int fifty;
		int twenty;
		int fifhun;
		int ten;

		System.out.println("Enter an amount");
		amount=input.nextInt();
		ten=amount/10;
		hun=amount/100;
		fifty=amount/50;
		twenty=amount/20;
		fifhun=amount/500;
		System.out.println("Total amount of ten \t"+ten);
		System.out.println("Total amount of twenty\t"+twenty);
		System.out.println("Total amount of hun\t"+hun);
		System.out.println("Total amount of fifty\t"+fifty);
		System.out.println("Total amount of fifhun\t"+fifhun);


	}

}