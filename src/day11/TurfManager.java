package day11;

public class TurfManager {
	
	static Turf turf;		// interface refernce -->Upcasting
	
	public static Turf getTurf(int turfChoice)
	{
		switch(turfChoice)
		{
		case 1: turf=new Cricket(); break;
		case 2: turf=new Football(); break;
		case 3: turf=new Tennis(); break;
		case 4: turf=new Skating(); break;
		}
		return turf;
	}

}
