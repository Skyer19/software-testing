package tutorial.tutorial4.randomtesting;

import tutorial.tutorial4.common.Status;

public class FlightSeatFit {

	public Status fit(int passengers, boolean comfortFlag) {
		Status status = Status.FAILURE;
		int allSeats = 120;
		if (comfortFlag)
			allSeats -= 40;
		if ((passengers > 0) && (passengers <= allSeats))
			status = Status.SUCCESS;
		else if (passengers <= 0)
			status = Status.ERROR;

		return status;
	}

}
