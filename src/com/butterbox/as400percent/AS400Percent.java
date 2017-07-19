package com.butterbox.as400percent;

import java.io.IOException;

import com.ibm.as400.access.*;

public class AS400Percent {
	public static void main(String args[]) throws AS400SecurityException, ErrorCompletingRequestException,
			InterruptedException, IOException, ObjectDoesNotExistException {
		AS400 connection = new AS400("", "", "");
		SystemStatus sts = new SystemStatus(connection);
		int Flag = 0;

		for (int i = 0; i < 4; i++) {
			System.out.println(sts.getPercentProcessingUnitUsed());
			if (sts.getPercentProcessingUnitUsed() > 98) {
				Flag = 1;
			} else {
				Flag = 0;
				break;
			}

			Thread.sleep(1000);
		}

		System.out.println(Flag);
	}

}
