import java.util.*;
public class LabTest1 {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		
		System.out.println("Enter amount of sales:");
		double sale = in.nextInt();
		System.out.println("Enter hours of work:");
		int hours = in.nextInt();
		
		if(sale < 150) {
			double commission = 0;
			System.out.println("Commission:" + commission);
			System.out.println("Daily wages:" + (commission + (5*hours)));
		}
		else if (sale <= 300) {
			double commission = (sale*5/100);
			System.out.println("Commission:" + commission);
			System.out.println("Daily wages:" + (commission + (5*hours)));
		}
		else if (sale <= 500) {	
			double commission = (sale*10/100);
			System.out.println("Commission:" + commission);
			System.out.println("Daily wages:" + (commission + (5*hours)));
		}
		else if (sale >500) {
			double commission = (sale*15/100);
			System.out.println("Commission:" + commission);
			System.out.println("Daily wages:" + (commission + (5*hours)));
		}
		
		Question1();
	
		
in.close();
	}
	
	private static void Question1() {
		Scanner in = new Scanner(System.in);
		
		System.out.println("Enter the number of items:");
		int items = in.nextInt();
		
		switch(items) {
		case 1:
			System.out.println("Enter the price of first item:");
			int price1= in.nextInt();
			System.out.println("Enter the quantity:");
			int quantity1 = in.nextInt();
			
			int total = price1*quantity1;
		System.out.println("Total price:" + total);
		if(total<100) {
			int discount = total*10/100;
			System.out.println("Discount total:" + discount);
			System.out.println("Price to be paid:" + (total - discount));
		}
		else if(total>100) {
			int discount = total*20/100;
			System.out.println("Discount total:" + discount);
			System.out.println("Price to be paid:" + (total - discount));
		}
		case 2:
			System.out.println("Enter the price of first item:");
			int price1x= in.nextInt();
			System.out.println("Enter the quantity:");
			int quantity1x = in.nextInt();
			System.out.println("Enter the price of second item:");
			int price2= in.nextInt();
			System.out.println("Enter the quantity:");
			int quantity2 = in.nextInt();
			
			int total1 = (price1x*quantity1x) + (price2*quantity2);
			System.out.println("Total price:" + total1);
			if(total1<100) {
				int discount = total1*10/100;
				System.out.println("Discount total:" + discount);
				System.out.println("Price to be paid:" + (total1 - discount));
			}
			else if(total1>100) {
				int discount = total1*20/100;
				System.out.println("Discount total:" + discount);
				System.out.println("Price to be paid:" + (total1 - discount));
			}
		case 3: 
			System.out.println("Enter the price of first item:");
			int price1y= in.nextInt();
			System.out.println("Enter the quantity:");
			int quantity1y = in.nextInt();
			System.out.println("Enter the price of second item:");
			int price2y= in.nextInt();
			System.out.println("Enter the quantity:");
			int quantity2y = in.nextInt();
			System.out.println("Enter the price of third item:");
			int price3= in.nextInt();
			System.out.println("Enter the quantity:");
			int quantity3 = in.nextInt();
			
			int total2 = (price1y*quantity1y) + (price2y*quantity2y) + (price3*quantity3);
			System.out.println("Total price:" + total2);
			if(total2<100) {
				int discount = total2*10/100;
				System.out.println("Discount total:" + discount);
				System.out.println("Price to be paid:" + (total2 - discount));
			}
			else if(total2>100) {
				int discount = total2*20/100;
				System.out.println("Discount total:" + discount);
				System.out.println("Price to be paid:" + (total2 - discount));
			}
			
		}
		in.close();
	}

}
