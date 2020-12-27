package tutorial.tutorial3;
public class FlightSeatFit2 {
	public Status fit(int passengers, boolean comfortFlag) {
		Status status;

		if (passengers > 120 || (passengers > 80 && comfortFlag))
			status = Status.FAILURE;
		else if (passengers > 0 && passengers < 81 || (passengers >= 81 && !comfortFlag))
			status = Status.SUCCESS;
		else
			status = Status.ERROR;

		return status;

	}

	public static void main(String[] args) {
		FlightSeatFit2 fsf = new FlightSeatFit2();

		System.out.println("Test: T1.1");
		if (fsf.fit(40, false) == Status.SUCCESS)
			System.out.println("Passed!");
		else
			System.out.println("Failed!");

		System.out.println("Test: T1.2");
		if (fsf.fit(101, true) == Status.FAILURE)
			System.out.println("Passed!");
		else
			System.out.println("Failed!");

		System.out.println("Test: T1.3");
		if (fsf.fit(200, false) == Status.FAILURE)
			System.out.println("Passed!");
		else
			System.out.println("Failed!");

		System.out.println("Test: T1.4");
		if (fsf.fit(-100, false) == Status.ERROR)
			System.out.println("Passed!");
		else
			System.out.println("Failed!");

	}

}
