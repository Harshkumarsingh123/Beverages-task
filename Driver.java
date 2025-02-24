import java.util.Scanner;
class Driver{
	
	public static void main(String[] args)
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Press 1 for Coffee and it costs 50R/Cups");
		System.out.println("Press 2 for Juice and it costs 70R/Cups");
		System.out.println("Press 3 for Soft drinks and it costs 60R/Cups");
		System.out.println("Press 4 for wine and it costs 200R/Cups");
		int choice=sc.nextInt();
		System.out.println("Enter the Number of Cups: ");
		int no=sc.nextInt();
		if(choice==1){
			System.out.println("You have selected Coffee");
			int totalCost=50*no;
			System.out.println("Total Cost is: "+totalCost+" Rupees");
			System.out.println("Enter the Amount: ");
			int amount=sc.nextInt();
			if(amount==totalCost){
				System.out.println("Collect "+no+" cups of Coffee at Counter");
				Coffee c1=new Coffee();
				c1.drink();
			}
			else if(amount>totalCost){
				System.out.println("Collect "+no+" cups of Coffee at Counter");
				System.out.println("And "+(amount-totalCost)+" Rupees from Counter");
				Coffee c1=new Coffee();
				c1.drink();
			}
			else{
				System.out.println("Insufficient Amount Entered");
			}
		}
		else if(choice==2){
			System.out.println("You have selected Juice");
			int totalCost=70*no;
			System.out.println("Total Cost is: "+totalCost+" Rupees");
			System.out.println("Enter the Amount: ");
			int amount=sc.nextInt();
			if(amount==totalCost){
				System.out.println("Collect "+no+" cups of Juice at Counter");
				Juice j1=new Juice();
				j1.drink();
			}
			else if(amount>totalCost){
				System.out.println("Collect "+no+" cups of Juice at Counter");
				System.out.println("And "+(amount-totalCost)+" Rupees from Counter");
				Juice j1=new Juice();
				j1.drink();
			}
			else{
				System.out.println("Insufficient Amount Entered");
			}
		}
		else if(choice==3){
			System.out.println("You have selected Soft Drinks");
			int totalCost=60*no;
			System.out.println("Total Cost is: "+totalCost+" Rupees");
			System.out.println("Enter the Amount: ");
			int amount=sc.nextInt();
			if(amount==totalCost){
				System.out.println("Collect "+no+" cups of Soft Drinks at Counter");
				SoftDrink s1=new SoftDrink();
				s1.drink();
			}
			else if(amount>totalCost){
				System.out.println("COllect "+no+" cups of Juice at Counter");
				System.out.println("And "+(amount-totalCost)+" Rupees from Counter");
				SoftDrink s1=new SoftDrink();
				s1.drink();
			}
			else{
				System.out.println("Insufficient Amount Entered");
			}
		}
		else if(choice==4){
			System.out.println("You have selected Wine");
			int totalCost=200*no;
			System.out.println("Total Cost is: "+totalCost+" Rupees");
			System.out.println("Enter the Amount: ");
			int amount=sc.nextInt();
			if(amount==totalCost){
				System.out.println("Collect "+no+" cups of Wines at Counter");
				Wine w=new Wine();
				w.drink();
			}
			else if(amount>totalCost){
				System.out.println("COllect "+no+" cups of Wine at Counter");
				System.out.println("And "+(amount-totalCost)+" Rupees from Counter");
				Wine w=new Wine();
				w.drink();
			}
			else{
				System.out.println("Insufficient Amount Entered");
			}
		}
		else{
			System.out.println("Invalid Choice!");
		}
	}
}




