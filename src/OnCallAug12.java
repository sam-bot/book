import java.util.Calendar;

public class OnCallAug12 {
	Calendar c1 = Calendar.getInstance();
	private double cycleDay = ((c1.get(Calendar.DAY_OF_YEAR) - 2)) % 16;
	// number of days into current rotation
	private int cycleRotation = (int) (cycleDay / 4);
	// number of current rotation (4 per cycle)
	private int cycleOfYear = ((c1.get(Calendar.DAY_OF_YEAR) - 2) / 16);
	private int onCallCycle = cycleOfYear % 7;

	// A crew operators: S indicates senior, J indicates junior
	private int a1S = 0;
	private int a2S = 1;
	private int a3S = 2;
	private int a4S = 3;
	private int a5J = 0;
	private int a6J = 1;
	private int a7J = 2;

	// A crew pelletizer operators
	private int aP1;
	private int aP2;

	// Call status for each A Crew employee--set to 0,1, or 2
	private int a1SCallStat = -1;
	private int a2SCallStat = -1;
	private int a3SCallStat = -1;
	private int a4SCallStat = -1;
	private int a5JCallStat = -1;
	private int a6JCallStat = -1;
	private int a7JCallStat = -1;
	private int aP1CallStat = -1;
	private int aP2CallStat = -1;

	// B crew operators: S indicates senior, J indicates junior
	private int b1S = 0;
	private int b2S = 1;
	private int b3S = 2;
	private int b4S = 3;
	private int b5J = 0;
	private int b6J = 1;
	private int b7J = 2;

	// B crew pelletizer operators
	private int bP1;
	private int bP2;

	// Call status for each B Crew employee--set to 0,1, or 2
	private int b1SCallStat = -1;
	private int b2SCallStat = -1;
	private int b3SCallStat = -1;
	private int b4SCallStat = -1;
	private int b5JCallStat = -1;
	private int b6JCallStat = -1;
	private int b7JCallStat = -1;
	private int bP1CallStat = -1;
	private int bP2CallStat = -1;

	// C crew operators: S indicates senior, J indicates junior
	private int c1S = 0;
	private int c2S = 1;
	private int c3S = 2;
	private int c4S = 3;
	private int c5J = 0;
	private int c6J = 1;
	private int c7J = 2;

	// C crew pelletizer operators
	private int cP1;
	private int cP2;

	// Call status for each C Crew employee--set to 0,1, or 2
	private int c1SCallStat = -1;
	private int c2SCallStat = -1;
	private int c3SCallStat = -1;
	private int c4SCallStat = -1;
	private int c5JCallStat = -1;
	private int c6JCallStat = -1;
	private int c7JCallStat = -1;
	private int cP1CallStat = -1;
	private int cP2CallStat = -1;

	// D crew operators: S indicates senior, J indicates junior
	private int d1S = 0;
	private int d2S = 1;
	private int d3S = 2;
	private int d4S = 3;
	private int d5J = 0;
	private int d6J = 1;
	private int d7J = 2;

	// Call status for each D Crew employee--set to 0,1, or 2
	// 0 = on call day shift
	// 1 = on call night shift
	// 2 = off call
	private int d1SCallStat = -1;
	private int d2SCallStat = -1;
	private int d3SCallStat = -1;
	private int d4SCallStat = -1;
	private int d5JCallStat = -1;
	private int d6JCallStat = -1;
	private int d7JCallStat = -1;
	private int dP1CallStat = -1;
	private int dP2CallStat = -1;

	// D crew pelletizer operators
	private int dP1;
	private int dP2;

	public int determineCall(double onCallCycle, int crewNumber) {
		double aNumber = (crewNumber + onCallCycle) % 7;
		System.out.println(aNumber);
		if (aNumber <= 2) {
			return 0;
		} else if (aNumber >= 3 && aNumber < 6) {
			return 1;
		} else if (aNumber == 6) {
			return 2;
		} else
			return -1;

	}

	public static void main(String[] args) {
		OnCallAug12 aug1 = new OnCallAug12();

		if (aug1.cycleRotation == 0) {
			if (aug1.determineCall(aug1.getOnCallCycle(), aug1.getC1S()) == 0) {
				aug1.setC1SCallStat(0);
			} else if (aug1.determineCall(aug1.getOnCallCycle(), aug1.getC1S()) == 1) {
				aug1.setC1SCallStat(1);
			} else if (aug1.determineCall(aug1.getOnCallCycle(), aug1.getC1S()) == 2) {
				aug1.setC1SCallStat(2);
			}
			if (aug1.determineCall(aug1.getOnCallCycle(), aug1.getC2S()) == 0) {
				aug1.setC2SCallStat(0);
			} else if (aug1.determineCall(aug1.getOnCallCycle(), aug1.getC2S()) == 1) {
				aug1.setC2SCallStat(1);
			} else if (aug1.determineCall(aug1.getOnCallCycle(), aug1.getC2S()) == 2) {
				aug1.setC2SCallStat(2);
			}

			if (aug1.determineCall(aug1.getOnCallCycle(), aug1.getC3S()) == 0) {
				aug1.setC3SCallStat(0);
			} else if (aug1.determineCall(aug1.getOnCallCycle(), aug1.getC3S()) == 1) {
				aug1.setC3SCallStat(1);
			} else if (aug1.determineCall(aug1.getOnCallCycle(), aug1.getC3S()) == 2) {
				aug1.setC3SCallStat(2);
			}

			if (aug1.determineCall(aug1.getOnCallCycle(), aug1.getC4S()) == 0) {
				aug1.setC4SCallStat(0);
			} else if (aug1.determineCall(aug1.getOnCallCycle(), aug1.getC4S()) == 1) {
				aug1.setC4SCallStat(1);
			} else if (aug1.determineCall(aug1.getOnCallCycle(), aug1.getC4S()) == 2) {
				aug1.setC4SCallStat(2);
			}

			if (aug1.determineCall(aug1.getOnCallCycle(), aug1.getC5J()) == 0) {
				aug1.setC5JCallStat(0);
			} else if (aug1.determineCall(aug1.getOnCallCycle(), aug1.getC5J()) == 1) {
				aug1.setC5JCallStat(1);
			} else if (aug1.determineCall(aug1.getOnCallCycle(), aug1.getC5J()) == 2) {
				aug1.setC5JCallStat(2);
			}

			if (aug1.determineCall(aug1.getOnCallCycle(), aug1.getC6J()) == 0) {
				aug1.setC6JCallStat(0);
			} else if (aug1.determineCall(aug1.getOnCallCycle(), aug1.getC6J()) == 1) {
				aug1.setC6JCallStat(1);
			} else if (aug1.determineCall(aug1.getOnCallCycle(), aug1.getC6J()) == 2) {
				aug1.setC6JCallStat(2);
			}

			if (aug1.determineCall(aug1.getOnCallCycle(), aug1.getC7J()) == 0) {
				aug1.setC7JCallStat(0);
			} else if (aug1.determineCall(aug1.getOnCallCycle(), aug1.getC7J()) == 1) {
				aug1.setC7JCallStat(1);
			} else if (aug1.determineCall(aug1.getOnCallCycle(), aug1.getC7J()) == 2) {
				aug1.setC7JCallStat(2);
			}
			// b crew second rotation
			if (aug1.determineCall(aug1.getOnCallCycle(), aug1.getD1S()) == 0) {
				aug1.setD1SCallStat(1);
			} else if (aug1.determineCall(aug1.getOnCallCycle(), aug1.getD1S()) == 1) {
				aug1.setD1SCallStat(0);
			} else if (aug1.determineCall(aug1.getOnCallCycle(), aug1.getD1S()) == 2) {
				aug1.setD1SCallStat(2);
			}
			if (aug1.determineCall(aug1.getOnCallCycle(), aug1.getD2S()) == 0) {
				aug1.setD2SCallStat(1);
			} else if (aug1.determineCall(aug1.getOnCallCycle(), aug1.getD2S()) == 1) {
				aug1.setD2SCallStat(0);
			} else if (aug1.determineCall(aug1.getOnCallCycle(), aug1.getD2S()) == 2) {
				aug1.setD2SCallStat(2);
			}

			if (aug1.determineCall(aug1.getOnCallCycle(), aug1.getD3S()) == 0) {
				aug1.setD3SCallStat(1);
			} else if (aug1.determineCall(aug1.getOnCallCycle(), aug1.getD3S()) == 1) {
				aug1.setD3SCallStat(0);
			} else if (aug1.determineCall(aug1.getOnCallCycle(), aug1.getD3S()) == 2) {
				aug1.setD3SCallStat(2);
			}

			if (aug1.determineCall(aug1.getOnCallCycle(), aug1.getD4S()) == 0) {
				aug1.setD4SCallStat(1);
			} else if (aug1.determineCall(aug1.getOnCallCycle(), aug1.getD4S()) == 1) {
				aug1.setD4SCallStat(0);
			} else if (aug1.determineCall(aug1.getOnCallCycle(), aug1.getD4S()) == 2) {
				aug1.setD4SCallStat(2);
			}

			if (aug1.determineCall(aug1.getOnCallCycle(), aug1.getD5J()) == 0) {
				aug1.setD5JCallStat(1);
			} else if (aug1.determineCall(aug1.getOnCallCycle(), aug1.getD5J()) == 1) {
				aug1.setD5JCallStat(0);
			} else if (aug1.determineCall(aug1.getOnCallCycle(), aug1.getD5J()) == 2) {
				aug1.setD5JCallStat(2);
			}

			if (aug1.determineCall(aug1.getOnCallCycle(), aug1.getD6J()) == 0) {
				aug1.setD6JCallStat(1);
			} else if (aug1.determineCall(aug1.getOnCallCycle(), aug1.getD6J()) == 1) {
				aug1.setD6JCallStat(0);
			} else if (aug1.determineCall(aug1.getOnCallCycle(), aug1.getD6J()) == 2) {
				aug1.setD6JCallStat(2);
			}

			if (aug1.determineCall(aug1.getOnCallCycle(), aug1.getD7J()) == 0) {
				aug1.setD7JCallStat(1);
			} else if (aug1.determineCall(aug1.getOnCallCycle(), aug1.getD7J()) == 1) {
				aug1.setD7JCallStat(0);
			} else if (aug1.determineCall(aug1.getOnCallCycle(), aug1.getD7J()) == 2) {
				aug1.setD7JCallStat(2);
			}
		}

		if (aug1.cycleRotation == 1) {
			// a crew second rotation
			if (aug1.determineCall(aug1.getOnCallCycle(), aug1.getA1S()) == 0) {
				aug1.setA1SCallStat(0);
			} else if (aug1.determineCall(aug1.getOnCallCycle(), aug1.getA1S()) == 1) {
				aug1.setA1SCallStat(1);
			} else if (aug1.determineCall(aug1.getOnCallCycle(), aug1.getA1S()) == 2) {
				aug1.setA1SCallStat(2);
			}
			if (aug1.determineCall(aug1.getOnCallCycle(), aug1.getA2S()) == 0) {
				aug1.setA2SCallStat(0);
			} else if (aug1.determineCall(aug1.getOnCallCycle(), aug1.getA2S()) == 1) {
				aug1.setA2SCallStat(1);
			} else if (aug1.determineCall(aug1.getOnCallCycle(), aug1.getA2S()) == 2) {
				aug1.setA2SCallStat(2);
			}

			if (aug1.determineCall(aug1.getOnCallCycle(), aug1.getA3S()) == 0) {
				aug1.setA3SCallStat(0);
			} else if (aug1.determineCall(aug1.getOnCallCycle(), aug1.getA3S()) == 1) {
				aug1.setA3SCallStat(1);
			} else if (aug1.determineCall(aug1.getOnCallCycle(), aug1.getA3S()) == 2) {
				aug1.setA3SCallStat(2);
			}

			if (aug1.determineCall(aug1.getOnCallCycle(), aug1.getA4S()) == 0) {
				aug1.setA4SCallStat(0);
			} else if (aug1.determineCall(aug1.getOnCallCycle(), aug1.getA4S()) == 1) {
				aug1.setA4SCallStat(1);
			} else if (aug1.determineCall(aug1.getOnCallCycle(), aug1.getA4S()) == 2) {
				aug1.setA4SCallStat(2);
			}

			if (aug1.determineCall(aug1.getOnCallCycle(), aug1.getA5J()) == 0) {
				aug1.setA5JCallStat(0);
			} else if (aug1.determineCall(aug1.getOnCallCycle(), aug1.getA5J()) == 1) {
				aug1.setA5JCallStat(1);
			} else if (aug1.determineCall(aug1.getOnCallCycle(), aug1.getA5J()) == 2) {
				aug1.setA5JCallStat(2);
			}

			if (aug1.determineCall(aug1.getOnCallCycle(), aug1.getA6J()) == 0) {
				aug1.setA6JCallStat(0);
			} else if (aug1.determineCall(aug1.getOnCallCycle(), aug1.getA6J()) == 1) {
				aug1.setA6JCallStat(1);
			} else if (aug1.determineCall(aug1.getOnCallCycle(), aug1.getA6J()) == 2) {
				aug1.setA6JCallStat(2);
			}

			if (aug1.determineCall(aug1.getOnCallCycle(), aug1.getA7J()) == 0) {
				aug1.setA7JCallStat(0);
			} else if (aug1.determineCall(aug1.getOnCallCycle(), aug1.getA7J()) == 1) {
				aug1.setA7JCallStat(1);
			} else if (aug1.determineCall(aug1.getOnCallCycle(), aug1.getA7J()) == 2) {
				aug1.setA7JCallStat(2);
			}
			// b crew second rotation
			if (aug1.determineCall(aug1.getOnCallCycle(), aug1.getB1S()) == 0) {
				aug1.setB1SCallStat(1);
			} else if (aug1.determineCall(aug1.getOnCallCycle(), aug1.getB1S()) == 1) {
				aug1.setB1SCallStat(0);
			} else if (aug1.determineCall(aug1.getOnCallCycle(), aug1.getB1S()) == 2) {
				aug1.setB1SCallStat(2);
			}
			if (aug1.determineCall(aug1.getOnCallCycle(), aug1.getB2S()) == 0) {
				aug1.setB2SCallStat(1);
			} else if (aug1.determineCall(aug1.getOnCallCycle(), aug1.getB2S()) == 1) {
				aug1.setB2SCallStat(0);
			} else if (aug1.determineCall(aug1.getOnCallCycle(), aug1.getB2S()) == 2) {
				aug1.setB2SCallStat(2);
			}

			if (aug1.determineCall(aug1.getOnCallCycle(), aug1.getB3S()) == 0) {
				aug1.setB3SCallStat(1);
			} else if (aug1.determineCall(aug1.getOnCallCycle(), aug1.getB3S()) == 1) {
				aug1.setB3SCallStat(0);
			} else if (aug1.determineCall(aug1.getOnCallCycle(), aug1.getB3S()) == 2) {
				aug1.setB3SCallStat(2);
			}

			if (aug1.determineCall(aug1.getOnCallCycle(), aug1.getB4S()) == 0) {
				aug1.setB4SCallStat(1);
			} else if (aug1.determineCall(aug1.getOnCallCycle(), aug1.getB4S()) == 1) {
				aug1.setB4SCallStat(0);
			} else if (aug1.determineCall(aug1.getOnCallCycle(), aug1.getB4S()) == 2) {
				aug1.setB4SCallStat(2);
			}

			if (aug1.determineCall(aug1.getOnCallCycle(), aug1.getB5J()) == 0) {
				aug1.setB5JCallStat(1);
			} else if (aug1.determineCall(aug1.getOnCallCycle(), aug1.getB5J()) == 1) {
				aug1.setB5JCallStat(0);
			} else if (aug1.determineCall(aug1.getOnCallCycle(), aug1.getB5J()) == 2) {
				aug1.setB5JCallStat(2);
			}

			if (aug1.determineCall(aug1.getOnCallCycle(), aug1.getB6J()) == 0) {
				aug1.setB6JCallStat(1);
			} else if (aug1.determineCall(aug1.getOnCallCycle(), aug1.getB6J()) == 1) {
				aug1.setB6JCallStat(0);
			} else if (aug1.determineCall(aug1.getOnCallCycle(), aug1.getB6J()) == 2) {
				aug1.setB6JCallStat(2);
			}

			if (aug1.determineCall(aug1.getOnCallCycle(), aug1.getB7J()) == 0) {
				aug1.setB7JCallStat(1);
			} else if (aug1.determineCall(aug1.getOnCallCycle(), aug1.getB7J()) == 1) {
				aug1.setB7JCallStat(0);
			} else if (aug1.determineCall(aug1.getOnCallCycle(), aug1.getB7J()) == 2) {
				aug1.setB7JCallStat(2);
			}
		}

		if (aug1.cycleRotation == 2) {
			if (aug1.determineCall(aug1.getOnCallCycle(), aug1.getC1S()) == 0) {
				aug1.setC1SCallStat(1);
			} else if (aug1.determineCall(aug1.getOnCallCycle(), aug1.getC1S()) == 1) {
				aug1.setC1SCallStat(0);
			} else if (aug1.determineCall(aug1.getOnCallCycle(), aug1.getC1S()) == 2) {
				aug1.setC1SCallStat(2);
			}
			if (aug1.determineCall(aug1.getOnCallCycle(), aug1.getC2S()) == 0) {
				aug1.setC2SCallStat(1);
			} else if (aug1.determineCall(aug1.getOnCallCycle(), aug1.getC2S()) == 1) {
				aug1.setC2SCallStat(0);
			} else if (aug1.determineCall(aug1.getOnCallCycle(), aug1.getC2S()) == 2) {
				aug1.setC2SCallStat(2);
			}

			if (aug1.determineCall(aug1.getOnCallCycle(), aug1.getC3S()) == 0) {
				aug1.setC3SCallStat(1);
			} else if (aug1.determineCall(aug1.getOnCallCycle(), aug1.getC3S()) == 1) {
				aug1.setC3SCallStat(0);
			} else if (aug1.determineCall(aug1.getOnCallCycle(), aug1.getC3S()) == 2) {
				aug1.setC3SCallStat(2);
			}

			if (aug1.determineCall(aug1.getOnCallCycle(), aug1.getC4S()) == 0) {
				aug1.setC4SCallStat(1);
			} else if (aug1.determineCall(aug1.getOnCallCycle(), aug1.getC4S()) == 1) {
				aug1.setC4SCallStat(0);
			} else if (aug1.determineCall(aug1.getOnCallCycle(), aug1.getC4S()) == 2) {
				aug1.setC4SCallStat(2);
			}

			if (aug1.determineCall(aug1.getOnCallCycle(), aug1.getC5J()) == 0) {
				aug1.setC5JCallStat(1);
			} else if (aug1.determineCall(aug1.getOnCallCycle(), aug1.getC5J()) == 1) {
				aug1.setC5JCallStat(0);
			} else if (aug1.determineCall(aug1.getOnCallCycle(), aug1.getC5J()) == 2) {
				aug1.setC5JCallStat(2);
			}

			if (aug1.determineCall(aug1.getOnCallCycle(), aug1.getC6J()) == 0) {
				aug1.setC6JCallStat(1);
			} else if (aug1.determineCall(aug1.getOnCallCycle(), aug1.getC6J()) == 1) {
				aug1.setC6JCallStat(0);
			} else if (aug1.determineCall(aug1.getOnCallCycle(), aug1.getC6J()) == 2) {
				aug1.setC6JCallStat(2);
			}

			if (aug1.determineCall(aug1.getOnCallCycle(), aug1.getC7J()) == 0) {
				aug1.setC7JCallStat(1);
			} else if (aug1.determineCall(aug1.getOnCallCycle(), aug1.getC7J()) == 1) {
				aug1.setC7JCallStat(0);
			} else if (aug1.determineCall(aug1.getOnCallCycle(), aug1.getC7J()) == 2) {
				aug1.setC7JCallStat(2);
			}
			if (aug1.determineCall(aug1.getOnCallCycle(), aug1.getD1S()) == 0) {
				aug1.setD1SCallStat(0);
			} else if (aug1.determineCall(aug1.getOnCallCycle(), aug1.getD1S()) == 1) {
				aug1.setD1SCallStat(1);
			} else if (aug1.determineCall(aug1.getOnCallCycle(), aug1.getD1S()) == 2) {
				aug1.setD1SCallStat(2);
			}
			if (aug1.determineCall(aug1.getOnCallCycle(), aug1.getD2S()) == 0) {
				aug1.setD2SCallStat(0);
			} else if (aug1.determineCall(aug1.getOnCallCycle(), aug1.getD2S()) == 1) {
				aug1.setD2SCallStat(1);
			} else if (aug1.determineCall(aug1.getOnCallCycle(), aug1.getD2S()) == 2) {
				aug1.setD2SCallStat(2);
			}

			if (aug1.determineCall(aug1.getOnCallCycle(), aug1.getD3S()) == 0) {
				aug1.setD3SCallStat(0);
			} else if (aug1.determineCall(aug1.getOnCallCycle(), aug1.getD3S()) == 1) {
				aug1.setD3SCallStat(1);
			} else if (aug1.determineCall(aug1.getOnCallCycle(), aug1.getD3S()) == 2) {
				aug1.setD3SCallStat(2);
			}

			if (aug1.determineCall(aug1.getOnCallCycle(), aug1.getD4S()) == 0) {
				aug1.setD4SCallStat(0);
			} else if (aug1.determineCall(aug1.getOnCallCycle(), aug1.getD4S()) == 1) {
				aug1.setD4SCallStat(1);
			} else if (aug1.determineCall(aug1.getOnCallCycle(), aug1.getD4S()) == 2) {
				aug1.setD4SCallStat(2);
			}

			if (aug1.determineCall(aug1.getOnCallCycle(), aug1.getD5J()) == 0) {
				aug1.setD5JCallStat(0);
			} else if (aug1.determineCall(aug1.getOnCallCycle(), aug1.getD5J()) == 1) {
				aug1.setD5JCallStat(1);
			} else if (aug1.determineCall(aug1.getOnCallCycle(), aug1.getD5J()) == 2) {
				aug1.setD5JCallStat(2);
			}

			if (aug1.determineCall(aug1.getOnCallCycle(), aug1.getD6J()) == 0) {
				aug1.setD6JCallStat(0);
			} else if (aug1.determineCall(aug1.getOnCallCycle(), aug1.getD6J()) == 1) {
				aug1.setD6JCallStat(1);
			} else if (aug1.determineCall(aug1.getOnCallCycle(), aug1.getD6J()) == 2) {
				aug1.setD6JCallStat(2);
			}

			if (aug1.determineCall(aug1.getOnCallCycle(), aug1.getD7J()) == 0) {
				aug1.setD7JCallStat(0);
			} else if (aug1.determineCall(aug1.getOnCallCycle(), aug1.getD7J()) == 1) {
				aug1.setD7JCallStat(1);
			} else if (aug1.determineCall(aug1.getOnCallCycle(), aug1.getD7J()) == 2) {
				aug1.setD7JCallStat(2);
			}
		}

		if (aug1.cycleRotation == 3) {
			if (aug1.determineCall(aug1.getOnCallCycle(), aug1.getA1S()) == 0) {
				aug1.setA1SCallStat(1);
			} else if (aug1.determineCall(aug1.getOnCallCycle(), aug1.getA1S()) == 1) {
				aug1.setA1SCallStat(0);
			} else if (aug1.determineCall(aug1.getOnCallCycle(), aug1.getA1S()) == 2) {
				aug1.setA1SCallStat(2);
			}
			if (aug1.determineCall(aug1.getOnCallCycle(), aug1.getA2S()) == 0) {
				aug1.setA2SCallStat(1);
			} else if (aug1.determineCall(aug1.getOnCallCycle(), aug1.getA2S()) == 1) {
				aug1.setA2SCallStat(0);
			} else if (aug1.determineCall(aug1.getOnCallCycle(), aug1.getA2S()) == 2) {
				aug1.setA2SCallStat(2);
			}

			if (aug1.determineCall(aug1.getOnCallCycle(), aug1.getA3S()) == 0) {
				aug1.setA3SCallStat(1);
			} else if (aug1.determineCall(aug1.getOnCallCycle(), aug1.getA3S()) == 1) {
				aug1.setA3SCallStat(0);
			} else if (aug1.determineCall(aug1.getOnCallCycle(), aug1.getA3S()) == 2) {
				aug1.setA3SCallStat(2);
			}

			if (aug1.determineCall(aug1.getOnCallCycle(), aug1.getA4S()) == 0) {
				aug1.setA4SCallStat(1);
			} else if (aug1.determineCall(aug1.getOnCallCycle(), aug1.getA4S()) == 1) {
				aug1.setA4SCallStat(0);
			} else if (aug1.determineCall(aug1.getOnCallCycle(), aug1.getA4S()) == 2) {
				aug1.setA4SCallStat(2);
			}

			if (aug1.determineCall(aug1.getOnCallCycle(), aug1.getA5J()) == 0) {
				aug1.setA5JCallStat(1);
			} else if (aug1.determineCall(aug1.getOnCallCycle(), aug1.getA5J()) == 1) {
				aug1.setA5JCallStat(0);
			} else if (aug1.determineCall(aug1.getOnCallCycle(), aug1.getA5J()) == 2) {
				aug1.setA5JCallStat(2);
			}

			if (aug1.determineCall(aug1.getOnCallCycle(), aug1.getA6J()) == 0) {
				aug1.setA6JCallStat(1);
			} else if (aug1.determineCall(aug1.getOnCallCycle(), aug1.getA6J()) == 1) {
				aug1.setA6JCallStat(0);
			} else if (aug1.determineCall(aug1.getOnCallCycle(), aug1.getA6J()) == 2) {
				aug1.setA6JCallStat(2);
			}

			if (aug1.determineCall(aug1.getOnCallCycle(), aug1.getA7J()) == 0) {
				aug1.setA7JCallStat(1);
			} else if (aug1.determineCall(aug1.getOnCallCycle(), aug1.getA7J()) == 1) {
				aug1.setA7JCallStat(0);
			} else if (aug1.determineCall(aug1.getOnCallCycle(), aug1.getA7J()) == 2) {
				aug1.setA7JCallStat(2);
			}
			if (aug1.determineCall(aug1.getOnCallCycle(), aug1.getB1S()) == 0) {
				aug1.setB1SCallStat(0);
			} else if (aug1.determineCall(aug1.getOnCallCycle(), aug1.getB1S()) == 1) {
				aug1.setB1SCallStat(1);
			} else if (aug1.determineCall(aug1.getOnCallCycle(), aug1.getB1S()) == 2) {
				aug1.setB1SCallStat(2);
			}
			if (aug1.determineCall(aug1.getOnCallCycle(), aug1.getB2S()) == 0) {
				aug1.setB2SCallStat(0);
			} else if (aug1.determineCall(aug1.getOnCallCycle(), aug1.getB2S()) == 1) {
				aug1.setB2SCallStat(1);
			} else if (aug1.determineCall(aug1.getOnCallCycle(), aug1.getB2S()) == 2) {
				aug1.setB2SCallStat(2);
			}

			if (aug1.determineCall(aug1.getOnCallCycle(), aug1.getB3S()) == 0) {
				aug1.setB3SCallStat(0);
			} else if (aug1.determineCall(aug1.getOnCallCycle(), aug1.getB3S()) == 1) {
				aug1.setB3SCallStat(1);
			} else if (aug1.determineCall(aug1.getOnCallCycle(), aug1.getB3S()) == 2) {
				aug1.setB3SCallStat(2);
			}

			if (aug1.determineCall(aug1.getOnCallCycle(), aug1.getB4S()) == 0) {
				aug1.setB4SCallStat(0);
			} else if (aug1.determineCall(aug1.getOnCallCycle(), aug1.getB4S()) == 1) {
				aug1.setB4SCallStat(1);
			} else if (aug1.determineCall(aug1.getOnCallCycle(), aug1.getB4S()) == 2) {
				aug1.setB4SCallStat(2);
			}

			if (aug1.determineCall(aug1.getOnCallCycle(), aug1.getB5J()) == 0) {
				aug1.setB5JCallStat(0);
			} else if (aug1.determineCall(aug1.getOnCallCycle(), aug1.getB5J()) == 1) {
				aug1.setB5JCallStat(1);
			} else if (aug1.determineCall(aug1.getOnCallCycle(), aug1.getB5J()) == 2) {
				aug1.setB5JCallStat(2);
			}

			if (aug1.determineCall(aug1.getOnCallCycle(), aug1.getB6J()) == 0) {
				aug1.setB6JCallStat(0);
			} else if (aug1.determineCall(aug1.getOnCallCycle(), aug1.getB6J()) == 1) {
				aug1.setB6JCallStat(1);
			} else if (aug1.determineCall(aug1.getOnCallCycle(), aug1.getB6J()) == 2) {
				aug1.setB6JCallStat(2);
			}

			if (aug1.determineCall(aug1.getOnCallCycle(), aug1.getB7J()) == 0) {
				aug1.setB7JCallStat(0);
			} else if (aug1.determineCall(aug1.getOnCallCycle(), aug1.getB7J()) == 1) {
				aug1.setB7JCallStat(1);
			} else if (aug1.determineCall(aug1.getOnCallCycle(), aug1.getB7J()) == 2) {
				aug1.setB7JCallStat(2);
			}
		}
		System.out.println("A Crew");
		System.out.print(aug1.a1S);
		System.out.println(aug1.a1SCallStat);
		System.out.print(aug1.a2S);
		System.out.println(aug1.a2SCallStat);
		System.out.print(aug1.a3S);
		System.out.println(aug1.a3SCallStat);
		System.out.print(aug1.a4S);
		System.out.println(aug1.a4SCallStat);
		System.out.print(aug1.a5J);
		System.out.println(aug1.a5JCallStat);
		System.out.print(aug1.a6J);
		System.out.println(aug1.a6JCallStat);
		System.out.print(aug1.a7J);
		System.out.println(aug1.a7JCallStat);
		System.out.println("B Crew");
		System.out.print(aug1.b1S);
		System.out.println(aug1.b1SCallStat);
		System.out.print(aug1.b2S);
		System.out.println(aug1.b2SCallStat);
		System.out.print(aug1.b3S);
		System.out.println(aug1.b3SCallStat);
		System.out.print(aug1.b4S);
		System.out.println(aug1.b4SCallStat);
		System.out.print(aug1.b5J);
		System.out.println(aug1.b5JCallStat);
		System.out.print(aug1.b6J);
		System.out.println(aug1.b6JCallStat);
		System.out.print(aug1.b7J);
		System.out.println(aug1.b7JCallStat);
		System.out.println("C Crew");
		System.out.print(aug1.c1S);
		System.out.println(aug1.c1SCallStat);
		System.out.print(aug1.c2S);
		System.out.println(aug1.c2SCallStat);
		System.out.print(aug1.c3S);
		System.out.println(aug1.c3SCallStat);
		System.out.print(aug1.c4S);
		System.out.println(aug1.c4SCallStat);
		System.out.print(aug1.c5J);
		System.out.println(aug1.c5JCallStat);
		System.out.print(aug1.c6J);
		System.out.println(aug1.c6JCallStat);
		System.out.print(aug1.c7J);
		System.out.println(aug1.c7JCallStat);
		System.out.println("D Crew");
		System.out.print(aug1.d1S);
		System.out.println(aug1.d1SCallStat);
		System.out.print(aug1.d2S);
		System.out.println(aug1.d2SCallStat);
		System.out.print(aug1.d3S);
		System.out.println(aug1.d3SCallStat);
		System.out.print(aug1.d4S);
		System.out.println(aug1.d4SCallStat);
		System.out.print(aug1.d5J);
		System.out.println(aug1.d5JCallStat);
		System.out.print(aug1.d6J);
		System.out.println(aug1.d6JCallStat);
		System.out.print(aug1.d7J);
		System.out.println(aug1.d7JCallStat);
	}

	public OnCallAug12() {
		super();

	}

	public double getCycleDay() {
		return cycleDay;
	}

	public void setCycleDay(int cycleDay) {
		this.cycleDay = cycleDay;
	}

	public int getA1S() {
		return a1S;
	}

	public void setA1S(int a1s) {
		a1S = a1s;
	}

	public double getOnCallCycle() {
		return onCallCycle;
	}

	public void setOnCallCycle(int onCallCycle) {
		this.onCallCycle = onCallCycle;
	}

	public double getCycleRotation() {
		return cycleRotation;
	}

	public void setCycleRotation(int cycleRotation) {
		this.cycleRotation = cycleRotation;
	}

	public double getCycleOfYear() {
		return cycleOfYear;
	}

	public void setCycleOfYear(int cycleOfYear) {
		this.cycleOfYear = cycleOfYear;
	}

	public int getA2S() {
		return a2S;
	}

	public void setA2S(int a2s) {
		a2S = a2s;
	}

	public int getA3S() {
		return a3S;
	}

	public void setA3S(int a3s) {
		a3S = a3s;
	}

	public int getA4S() {
		return a4S;
	}

	public void setA4S(int a4s) {
		a4S = a4s;
	}

	public int getA5J() {
		return a5J;
	}

	public void setA5J(int a5j) {
		a5J = a5j;
	}

	public int getA6J() {
		return a6J;
	}

	public void setA6J(int a6j) {
		a6J = a6j;
	}

	public int getA7J() {
		return a7J;
	}

	public void setA7J(int a7j) {
		a7J = a7j;
	}

	public int getaP1() {
		return aP1;
	}

	public void setaP1(int aP1) {
		this.aP1 = aP1;
	}

	public int getaP2() {
		return aP2;
	}

	public void setaP2(int aP2) {
		this.aP2 = aP2;
	}

	public int getB1S() {
		return b1S;
	}

	public void setB1S(int b1s) {
		b1S = b1s;
	}

	public int getB2S() {
		return b2S;
	}

	public void setB2S(int b2s) {
		b2S = b2s;
	}

	public int getB3S() {
		return b3S;
	}

	public void setB3S(int b3s) {
		b3S = b3s;
	}

	public int getB4S() {
		return b4S;
	}

	public void setB4S(int b4s) {
		b4S = b4s;
	}

	public int getB5J() {
		return b5J;
	}

	public void setB5J(int b5j) {
		b5J = b5j;
	}

	public int getB6J() {
		return b6J;
	}

	public void setB6J(int b6j) {
		b6J = b6j;
	}

	public int getB7J() {
		return b7J;
	}

	public void setB7J(int b7j) {
		b7J = b7j;
	}

	public int getbP1() {
		return bP1;
	}

	public void setbP1(int bP1) {
		this.bP1 = bP1;
	}

	public int getbP2() {
		return bP2;
	}

	public void setbP2(int bP2) {
		this.bP2 = bP2;
	}

	public int getC1S() {
		return c1S;
	}

	public void setC1S(int c1s) {
		c1S = c1s;
	}

	public int getC2S() {
		return c2S;
	}

	public void setC2S(int c2s) {
		c2S = c2s;
	}

	public int getC3S() {
		return c3S;
	}

	public void setC3S(int c3s) {
		c3S = c3s;
	}

	public int getC4S() {
		return c4S;
	}

	public void setC4S(int c4s) {
		c4S = c4s;
	}

	public int getC5J() {
		return c5J;
	}

	public void setC5J(int c5j) {
		c5J = c5j;
	}

	public int getC6J() {
		return c6J;
	}

	public void setC6J(int c6j) {
		c6J = c6j;
	}

	public int getC7J() {
		return c7J;
	}

	public void setC7J(int c7j) {
		c7J = c7j;
	}

	public int getcP1() {
		return cP1;
	}

	public void setcP1(int cP1) {
		this.cP1 = cP1;
	}

	public int getcP2() {
		return cP2;
	}

	public void setcP2(int cP2) {
		this.cP2 = cP2;
	}

	public int getD1S() {
		return d1S;
	}

	public void setD1S(int d1s) {
		d1S = d1s;
	}

	public int getD2S() {
		return d2S;
	}

	public void setD2S(int d2s) {
		d2S = d2s;
	}

	public int getD3S() {
		return d3S;
	}

	public void setD3S(int d3s) {
		d3S = d3s;
	}

	public int getD4S() {
		return d4S;
	}

	public void setD4S(int d4s) {
		d4S = d4s;
	}

	public int getD5J() {
		return d5J;
	}

	public void setD5J(int d5j) {
		d5J = d5j;
	}

	public int getD6J() {
		return d6J;
	}

	public void setD6J(int d6j) {
		d6J = d6j;
	}

	public int getD7J() {
		return d7J;
	}

	public void setD7J(int d7j) {
		d7J = d7j;
	}

	public int getdP1() {
		return dP1;
	}

	public void setdP1(int dP1) {
		this.dP1 = dP1;
	}

	public int getdP2() {
		return dP2;
	}

	public void setdP2(int dP2) {
		this.dP2 = dP2;
	}

	public Calendar getC1() {
		return c1;
	}

	public void setC1(Calendar c1) {
		this.c1 = c1;
	}

	public void setCycleDay(double cycleDay) {
		this.cycleDay = cycleDay;
	}

	public int getA1SCallStat() {
		return a1SCallStat;
	}

	public void setA1SCallStat(int a1sCallStat) {
		a1SCallStat = a1sCallStat;
	}

	public int getA2SCallStat() {
		return a2SCallStat;
	}

	public void setA2SCallStat(int a2sCallStat) {
		a2SCallStat = a2sCallStat;
	}

	public int getA3SCallStat() {
		return a3SCallStat;
	}

	public void setA3SCallStat(int a3sCallStat) {
		a3SCallStat = a3sCallStat;
	}

	public int getA4SCallStat() {
		return a4SCallStat;
	}

	public void setA4SCallStat(int a4sCallStat) {
		a4SCallStat = a4sCallStat;
	}

	public int getA5JCallStat() {
		return a5JCallStat;
	}

	public void setA5JCallStat(int a5jCallStat) {
		a5JCallStat = a5jCallStat;
	}

	public int getA6JCallStat() {
		return a6JCallStat;
	}

	public void setA6JCallStat(int a6jCallStat) {
		a6JCallStat = a6jCallStat;
	}

	public int getA7JCallStat() {
		return a7JCallStat;
	}

	public void setA7JCallStat(int a7jCallStat) {
		a7JCallStat = a7jCallStat;
	}

	public int getaP1CallStat() {
		return aP1CallStat;
	}

	public void setaP1CallStat(int aP1CallStat) {
		this.aP1CallStat = aP1CallStat;
	}

	public int getaP2CallStat() {
		return aP2CallStat;
	}

	public void setaP2CallStat(int aP2CallStat) {
		this.aP2CallStat = aP2CallStat;
	}

	public int getB1SCallStat() {
		return b1SCallStat;
	}

	public void setB1SCallStat(int b1sCallStat) {
		b1SCallStat = b1sCallStat;
	}

	public int getB2SCallStat() {
		return b2SCallStat;
	}

	public void setB2SCallStat(int b2sCallStat) {
		b2SCallStat = b2sCallStat;
	}

	public int getB3SCallStat() {
		return b3SCallStat;
	}

	public void setB3SCallStat(int b3sCallStat) {
		b3SCallStat = b3sCallStat;
	}

	public int getB4SCallStat() {
		return b4SCallStat;
	}

	public void setB4SCallStat(int b4sCallStat) {
		b4SCallStat = b4sCallStat;
	}

	public int getB5JCallStat() {
		return b5JCallStat;
	}

	public void setB5JCallStat(int b5jCallStat) {
		b5JCallStat = b5jCallStat;
	}

	public int getB6JCallStat() {
		return b6JCallStat;
	}

	public void setB6JCallStat(int b6jCallStat) {
		b6JCallStat = b6jCallStat;
	}

	public int getB7JCallStat() {
		return b7JCallStat;
	}

	public void setB7JCallStat(int b7jCallStat) {
		b7JCallStat = b7jCallStat;
	}

	public int getbP1CallStat() {
		return bP1CallStat;
	}

	public void setbP1CallStat(int bP1CallStat) {
		this.bP1CallStat = bP1CallStat;
	}

	public int getbP2CallStat() {
		return bP2CallStat;
	}

	public void setbP2CallStat(int bP2CallStat) {
		this.bP2CallStat = bP2CallStat;
	}

	public int getC1SCallStat() {
		return c1SCallStat;
	}

	public void setC1SCallStat(int c1sCallStat) {
		c1SCallStat = c1sCallStat;
	}

	public int getC2SCallStat() {
		return c2SCallStat;
	}

	public void setC2SCallStat(int c2sCallStat) {
		c2SCallStat = c2sCallStat;
	}

	public int getC3SCallStat() {
		return c3SCallStat;
	}

	public void setC3SCallStat(int c3sCallStat) {
		c3SCallStat = c3sCallStat;
	}

	public int getC4SCallStat() {
		return c4SCallStat;
	}

	public void setC4SCallStat(int c4sCallStat) {
		c4SCallStat = c4sCallStat;
	}

	public int getC5JCallStat() {
		return c5JCallStat;
	}

	public void setC5JCallStat(int c5jCallStat) {
		c5JCallStat = c5jCallStat;
	}

	public int getC6JCallStat() {
		return c6JCallStat;
	}

	public void setC6JCallStat(int c6jCallStat) {
		c6JCallStat = c6jCallStat;
	}

	public int getC7JCallStat() {
		return c7JCallStat;
	}

	public void setC7JCallStat(int c7jCallStat) {
		c7JCallStat = c7jCallStat;
	}

	public int getcP1CallStat() {
		return cP1CallStat;
	}

	public void setcP1CallStat(int cP1CallStat) {
		this.cP1CallStat = cP1CallStat;
	}

	public int getcP2CallStat() {
		return cP2CallStat;
	}

	public void setcP2CallStat(int cP2CallStat) {
		this.cP2CallStat = cP2CallStat;
	}

	public int getD1SCallStat() {
		return d1SCallStat;
	}

	public void setD1SCallStat(int d1sCallStat) {
		d1SCallStat = d1sCallStat;
	}

	public int getD2SCallStat() {
		return d2SCallStat;
	}

	public void setD2SCallStat(int d2sCallStat) {
		d2SCallStat = d2sCallStat;
	}

	public int getD3SCallStat() {
		return d3SCallStat;
	}

	public void setD3SCallStat(int d3sCallStat) {
		d3SCallStat = d3sCallStat;
	}

	public int getD4SCallStat() {
		return d4SCallStat;
	}

	public void setD4SCallStat(int d4sCallStat) {
		d4SCallStat = d4sCallStat;
	}

	public int getD5JCallStat() {
		return d5JCallStat;
	}

	public void setD5JCallStat(int d5jCallStat) {
		d5JCallStat = d5jCallStat;
	}

	public int getD6JCallStat() {
		return d6JCallStat;
	}

	public void setD6JCallStat(int d6jCallStat) {
		d6JCallStat = d6jCallStat;
	}

	public int getD7JCallStat() {
		return d7JCallStat;
	}

	public void setD7JCallStat(int d7jCallStat) {
		d7JCallStat = d7jCallStat;
	}

	public int getdP1CallStat() {
		return dP1CallStat;
	}

	public void setdP1CallStat(int dP1CallStat) {
		this.dP1CallStat = dP1CallStat;
	}

	public int getdP2CallStat() {
		return dP2CallStat;
	}

	public void setdP2CallStat(int dP2CallStat) {
		this.dP2CallStat = dP2CallStat;
	}

}
