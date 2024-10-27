
package lab2;

public class Aims {

	public static void main(String[] args) {
		// Tạo đối tượng cart
		cart anOrder = new cart();
		
		// Tạo một số DVD
		DigitalVideoDisc dvd1 = new DigitalVideoDisc("The Lion King","Animation", "Roger Allers", 87, 19.95f);
		anOrder.addDigitalVideoDisc(dvd1);
		DigitalVideoDisc dvd2 = new DigitalVideoDisc("Star Wars", "Science Fiction", "Geogre Lucas", 87, 24.95f);
		anOrder.addDigitalVideoDisc(dvd2);
		DigitalVideoDisc dvd3 = new DigitalVideoDisc("Aladin", "Animation", "ABC", 87, 18.99f);
		anOrder.addDigitalVideoDisc(dvd3);
		
		// In tổng số tiền
		System.out.println("Tổng số tiền là: " + anOrder.totalCost());
		
		// Thử xóa 1 DVD ra khỏi giỏ hàng
		anOrder.removeDigitalVideoDisc(dvd1);
		// Kiểm tra xóa DVD vào giỏ hàng
		anOrder.removeDigitalVideoDisc(dvd1);
		//In tổng số tiền sau khi xóa DVD
		System.out.println("Tổng số tiền sau khi thêm (xóa) DVD là: " + anOrder.totalCost());
		


	}

}
