import java.util.*;
class Atm{
	public static void main(String ar[]){
		Scanner input=new Scanner(System.in);
		int amount;
		int fivethousand;
		int fifhun;
		int hun;
		int fifty;
		int twenty;
		int ten;

		System.out.println("Enter an amount");
		amount=input.nextInt();
		fivethousand=amount/5000;
		fifhun=amount/500;
		hun=amount/100;
		fifty=amount/50;
		twenty=amount/20;
		ten=amount/10;
		
		public void drawmainmenu() {
		int selection;
		System.out.println("/nATM main menu:");
		System.out.println("1 - View accont balance");
		System.out.println("2 - Withdraw funds");
		System.out.println("3 - Add funds");
		System.out.println("4 - Terminate transaction");
		System.out.println("Choice:");
		Selection = input.next();
		Swtich (Selection) {
		Case 1:
		View Account info();
			Break;
		Case 2:
		Withdraw();
			Break;
		Case 3:
		Add Funds();
			Break;
		Case 4:
		System.out.println(" Thank you for using this ATM!! GOODBYE");
		}
			
		System.out.println("Total amount of fivethousand\t"+fivethousand);
		System.out.println("Total amount of fifhun\t"+fifhun);
		System.out.println("Total amount of hun\t"+hun);
		System.out.println("Total amount of fifty\t"+fifty);
		System.out.println("Total amount of twenty\t"+twenty);
		System.out.println("Total amount of ten \t"+ten);
		
		
		
		

	}

}
