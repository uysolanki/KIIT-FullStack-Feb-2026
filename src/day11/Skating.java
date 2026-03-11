package day11;

public class Skating implements Turf
{

	@Override
	public double getTurfPrice() {
		return 2500.0;
	}

	@Override
	public String getTurfType() {
		return "Skating Turf";
	}

	@Override
	String getCompanyName() {
		//return Turf.super.getCompanyName();
		return "New Champion Turf";
	}
}
