package Question3;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Demo {
	
	void doTransactions(List<? extends Payment> es) {
		
		if(es instanceof CashPayment) {
			System.out.println(es);
		}
		else {
			System.out.println(es);

		}
	}

	
	public static void main(String[] args) {
		
		Demo demo = new Demo();
		List<? extends CashPayment> list1 = new ArrayList<>();
		list1.add(8000);
		list1.add(7000);
		
		List<? extends CardPayment> list2 = new ArrayList<>();
		list2.add(6000);
		list2.add(9000);

		
		
		
		
	}
}
