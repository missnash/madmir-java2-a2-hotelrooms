import javax.swing.JOptionPane;


public class HotelBilling {
	
// Declare variables and constants 	
	final static float SALES_TAX = 0.13f;
	

	public static void main(String[] args) {
		double roomRate = 95.00;
		double coupon = 0.10;
		int numRooms = 2;
		double totalBill;
		
		totalBill = computeBill(roomRate);
		JOptionPane.showMessageDialog(null, "Your total is with tax for one room is $" + totalBill);
		
		totalBill = computeBill(roomRate, numRooms);
		JOptionPane.showMessageDialog(null, "Your total is with tax for" + numRooms + " room(s) is $"
		+ totalBill);
		
		totalBill = computeBill(roomRate, numRooms, coupon);
		JOptionPane.showMessageDialog(null, "Your total is with tax for" + numRooms + " room(s) is $"
		+ totalBill + ".\nThis includes a discount of " + coupon*100 + "%");
		
	}
	
//Calculate Room rate and sales tax
	public static double computeBill(double rate) {
		double tax = rate * SALES_TAX;
		double finalRate = rate + tax;
		finalRate = twoDecimalRounding(finalRate);
		return finalRate;
	}
	
//Calculate the price of the room and quantity reserved
	public static double computeBill(double rate, int numRooms) {
		double tax= rate * SALES_TAX;
		double finalRate = rate + tax;
		finalRate = finalRate * numRooms;
		finalRate = twoDecimalRounding(finalRate);
		return finalRate;
	}
	
//Calculate the price of the room including quantity of rooms reserved and coupon value
	public static double computeBill(double rate, int qty, double coup) {
		double tax = rate * SALES_TAX;
		double finalRate = rate + tax;
		finalRate = finalRate * qty * (1-coup);
		finalRate = twoDecimalRounding(finalRate);
		return finalRate;
	}
	
//Change double values to two decimal places after the decimal 		
	public static double twoDecimalRounding (double decimal) {
		decimal = decimal*100;
		decimal = decimal + 0.5;
		decimal = (int) decimal;
		decimal =decimal/100;
		return decimal;
		}
}


		
		
	
	
	
		
	
