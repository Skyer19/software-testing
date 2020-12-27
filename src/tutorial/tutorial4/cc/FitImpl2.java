package tutorial.tutorial4.cc;

import tutorial.tutorial4.common.Status;

public class FitImpl2 {
	public Status fit(int passengers, boolean comfortFlag) {
		Status status = Status.SUCCESS;
		if (passengers <= 0)
			status = Status.ERROR;
		else if (passengers >= 121 || (passengers >= 81 && comfortFlag))
			status = Status.FAILURE;

		return status;

	}
}
