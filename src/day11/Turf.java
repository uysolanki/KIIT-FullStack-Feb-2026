package day11;

public interface Turf {
	public abstract double getTurfPrice();
	public abstract String getTurfType();
	public default String getCompanyName()
	{
		return "Champion turf";
	}
	
	public static String getOwnerName()
	{
		return "Virat Kohli";
	}
	
	
}
