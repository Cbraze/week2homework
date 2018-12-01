package week2hw;

public class week2hw {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		boolean isHotOutside = true;
		boolean isWeekDay = true;
		boolean hasMoneyInPocket = true;
	
		double costOfMilk = 2.65;
		int moneyInWallet = 20;
		int thirstLevel = 7;
		
		
		boolean shouldBuyIcecream = isHotOutside && hasMoneyInPocket;
		System.out.println(shouldBuyIcecream);
		
		boolean willGoSwimming = isHotOutside && !isWeekDay;
		System.out.println(willGoSwimming);
		
		boolean isAGoodDay = isHotOutside && !isWeekDay && hasMoneyInPocket;
		System.out.println(isAGoodDay);
	 
		boolean willBuyMilk = isHotOutside && (thirstLevel >= 3) && (moneyInWallet >= 2 * costOfMilk);
		System.out.println(willBuyMilk);
		
		
		
		for(int i = 0; i <100; i++) {
			if (i % 2 == 0) {
				System.out.println(i);
			}
		}
		
		
		
		for(int i = 0; i <100; i++) {
			if (i % 3 == 0) {
				System.out.println(i);
			}
		}
		
		
		for(int i = 1; i <100; i++) {
			if (i % 2 != 0) {
				System.out.println(i);
			}
		}
		
		
		
		
		for(int i = 0; i <=100; i++) {
			if (i % 3 == 0 && i % 5 ==0) {
				System.out.println("hello");
			}
			else if(i % 3 == 0) {
				System.out.println("Hello");	
			}
			else if(i % 5 == 0) {
				System.out.println("World");
			}
			else {
				System.out.println(i);
			}
		}
	}

}
