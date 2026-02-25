package day11;

public class Tennis implements Turf
{
	@Override
	public double getTurfPrice() {
		return 1500.0;
	}
	
	@Override
	public String getTurfType() {
		return "Tennis Turf";
	}
}
