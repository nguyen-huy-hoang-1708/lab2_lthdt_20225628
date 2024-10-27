
package lab2;

public class DigitalVideoDisc {
     
	public DigitalVideoDisc(String title, String categolory, String director, int length, float cost) {
		super();
		this.title = title;
		this.categolory = categolory;
		this.director = director;
		this.length = length;
		this.cost = cost;
	}
	private String title;
	private String categolory;
	private String director;
	private int length;
	private float cost;
	
	public String getTitle() {
		return title;
	}
	public String getCategolory() {
		return categolory;
	}
	public String getDirector() {
		return director;
	}
	public int getLength() {
		return length;
	}
	public float getCost() {
		return cost;
	}

}
