package day11;

public class Customer {

	private String name;
	private String dateOfPlay;
	private String timeOfPlay;
	
	public Customer() {}
	public Customer(String name, String dateOfPlay, String timeOfPlay) {
		super();
		this.name = name;
		this.dateOfPlay = dateOfPlay;
		this.timeOfPlay = timeOfPlay;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getDateOfPlay() {
		return dateOfPlay;
	}
	public void setDateOfPlay(String dateOfPlay) {
		this.dateOfPlay = dateOfPlay;
	}
	public String getTimeOfPlay() {
		return timeOfPlay;
	}
	public void setTimeOfPlay(String timeOfPlay) {
		this.timeOfPlay = timeOfPlay;
	}
	@Override
	public String toString() {
		return "Customer [name=" + name + ", dateOfPlay=" + dateOfPlay + ", timeOfPlay=" + timeOfPlay + "]";
	}
	
	
}
