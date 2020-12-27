package edu.dapeng.st.slidedemo;

public class FlightSeatFit {
	public Status fit(int passengers, boolean comfortFlag) {
		Status status = Status.SUCCESS;
		if (passengers <= 1)
			status = Status.ERROR;
		else if (passengers >= 121 || (passengers >= 81 && comfortFlag))
			status = Status.FAILURE;

		return status;

	}

}
