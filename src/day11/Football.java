package day11;

public class Football implements Turf
{
	@Override
	public double getTurfPrice() {
		return 1000.0;
	}
	
	@Override
	public String getTurfType() {
		return "Football Turf";
	}
}
