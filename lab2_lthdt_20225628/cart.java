
package lab2;

public class cart {
	private static final int MAX_NUMBERS_ORDERED = 20; // Số lượng tối đa các đĩa có trong giỏ hàng
	private DigitalVideoDisc[] itemsOrdered = new DigitalVideoDisc[MAX_NUMBERS_ORDERED]; // mảng chứa các DVD
	private int qtyOrdered = 0; // Số lượng hiện tại các đĩa trong giỏ

	public void addDigitalVideoDisc(DigitalVideoDisc disc) {
		if (qtyOrdered < MAX_NUMBERS_ORDERED) {
			itemsOrdered[qtyOrdered] = disc;
			qtyOrdered ++;
			System.out.println("The disc " + disc.getTitle() + " has been added.")	;	
		} else {
			System.out.println("The cart is almost full.");
		}
		// TODO Auto-generated method stub

	}
	public void removeDigitalVideoDisc(DigitalVideoDisc disc) {
		boolean found = false;
		for(int i = 0; i < qtyOrdered; i++) {
			if(itemsOrdered[i].equals(disc)) {
				for (int j = i; j < qtyOrdered - 1; j++) {
					itemsOrdered[j] = itemsOrdered[j+1];
				}
				itemsOrdered[qtyOrdered - 1] = null;
				qtyOrdered--;
	            found = true;
				System.out.println("The disc " + disc.getTitle()+ " has been removed.");
				break;
			}
		}
		if(!found) {
			System.out.println("The disc was not found in the cart.");
		}
	}
	
	// Phương thức tính tổng chi phí của giỏ hàng
	public float totalCost() {
		float total = 0;
		for(int i = 0; i < qtyOrdered; i++) {
			total += itemsOrdered[i].getCost();
		}
		return total;
	}

}
