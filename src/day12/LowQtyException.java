package day12;

public class LowQtyException extends Exception  //RuntimeException
{
	public LowQtyException(String message)
	{
		super(message);
	}
}

// new LowQtyException("Please enter qty greater than zero")  --only option we have

// new LowQtyException()  --option available
