import java.io.File;
import java.io.PrintWriter;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Scanner;

public class OnCallAug812 {
	Calendar cal1 = Calendar.getInstance();
	private double cycleDay = ((cal1.get(Calendar.DAY_OF_YEAR) - 3)) % 16;
	private double dayOfCycle = cycleDay % 4;
	// number of days into current rotation ( 0 =4, 1=1, 2=2, 3=3)
	private int cycleRotation = (int) (cycleDay / 4);
	// number of current rotation (4 per cycle)
	private int cycleOfYear = ((cal1.get(Calendar.DAY_OF_YEAR) - 3) / 16);
	private int onCallCycle = cycleOfYear % 7;

	// A crew operators: 4 Senior
	private int a1S = 0;
	private int a2S = 1;
	private int a3S = 2;
	private int a4S = 3;

	// variables for A crew names
	private String a1;
	private String a2;
	private String a3;
	private String a4;

	// A Crew Junior Operators represented by one variable b/c
	// all are on call or not on call at same time

	private int aJr;

	// A crew junior operator names
	private String aJr1;
	private String aJr2;
	private String aJr3;

	// B crew operators: 4 Senior
	private int b1S = 0;
	private int b2S = 1;
	private int b3S = 2;
	private int b4S = 3;

	// B crew operator names
	private String b1;
	private String b2;
	private String b3;
	private String b4;

	// B Crew Junior Operators represented by one variable b/c
	// all are on call or not on call at same time

	private int bJr;

	// B crew operator junior names
	private String bJr1;
	private String bJr2;
	private String bJr3;

	// C crew operators: 4 Senior
	private int c1S = 0;
	private int c2S = 1;
	private int c3S = 2;
	private int c4S = 3;

	// C operator senior names
	private String c11;
	private String c2;
	private String c3;
	private String c4;

	// C Crew Junior Operators represented by one variable b/c
	// all are on call or not on call at same time

	private int cJr;

	// C crew junior operator names
	private String cJr1;
	private String cJr2;
	private String cJr3;

	// D crew operators: 4 Senior
	private int d1S = 0;
	private int d2S = 1;
	private int d3S = 2;
	private int d4S = 3;

	// d crew senior names
	private String d1;
	private String d2;
	private String d3;
	private String d4;

	// D Crew Junior Operators represented by one variable b/c
	// all are on call or not on call at same time

	private int dJr;

	// D crew junior operator names
	private String dJr1;
	private String dJr2;
	private String dJr3;

	// Call status for each A Crew employee--set to 0,1, or 2
	// 0 = on call day shift
	// 1 = on call night shift
	// 2 = off call
	private int a1SCallStat = -1;
	private int a2SCallStat = -1;
	private int a3SCallStat = -1;
	private int a4SCallStat = -1;
	private int aJrCallStat = -1;

	// Call status for each B Crew employee--set to 0,1, or 2
	private int b1SCallStat = -1;
	private int b2SCallStat = -1;
	private int b3SCallStat = -1;
	private int b4SCallStat = -1;
	private int bJrCallStat = -1;

	// Call status for each C Crew employee--set to 0,1, or 2
	private int c1SCallStat = -1;
	private int c2SCallStat = -1;
	private int c3SCallStat = -1;
	private int c4SCallStat = -1;
	private int cJrCallStat = -1;

	// Call status for each D Crew employee--set to 0,1, or 2
	private int d1SCallStat = -1;
	private int d2SCallStat = -1;
	private int d3SCallStat = -1;
	private int d4SCallStat = -1;
	private int dJrCallStat = -1;

	// Call status for each crew's pelletizer operators (both on or both off)

	private int aP;
	private int bP;
	private int cP;
	private int dP;

	private String aP1;
	private String aP2;
	private String bP1;
	private String bP2;
	private String cP1;
	private String cP2;
	private String dP1;
	private String dP2;

	private int aPCallStat = -1;
	private int bPCallStat = -1;
	private int cPCallStat = -1;
	private int dPCallStat = -1;

	public int determineCall(double onCallCycle, int crewNumber) {
		double aNumber = (crewNumber + onCallCycle) % 4;
		if (aNumber > 0 && aNumber <= 3) {
			return 0;
		} else if (aNumber >= 4 && aNumber <= 6) {
			return 1;
		} else
			return -1;
	}

	public int determineCallJr(double onCallCycle, int crewNumber) {
		double aNumber = (crewNumber + onCallCycle) % 4;
		if (aNumber <= 3) {
			return 0;
		} else if (aNumber >= 4 && aNumber <= 6) {
			return 1;
		} else
			return -1;
	}

	public int determineCallP(double onCallCycle, int crewNumber) {
		double aNumber = (crewNumber + onCallCycle) % 4;
		if (aNumber <= 3) {
			return 1;
		} else if (aNumber >= 4 && aNumber <= 6) {
			return 0;
		} else
			return -1;
	}

	public void calcCall(OnCallAug812 c1) {
		// Senior employees on call checks
		if ((c1.cycleRotation == 0)
				&& ((c1.dayOfCycle == 1) || (c1.dayOfCycle == 0))) {
			if (c1.determineCall(c1.getOnCallCycle(), c1.getC1S()) == 0) {
				c1.setC1SCallStat(1);
			} else if (c1.determineCall(c1.getOnCallCycle(), c1.getC1S()) == 1) {
				c1.setC1SCallStat(0);
			} else if (c1.determineCall(c1.getOnCallCycle(), c1.getC1S()) == 2) {
				c1.setC1SCallStat(2);
			}
			if (c1.determineCall(c1.getOnCallCycle(), c1.getC2S()) == 0) {
				c1.setC2SCallStat(1);
			} else if (c1.determineCall(c1.getOnCallCycle(), c1.getC2S()) == 1) {
				c1.setC2SCallStat(0);
			} else if (c1.determineCall(c1.getOnCallCycle(), c1.getC2S()) == 2) {
				c1.setC2SCallStat(2);
			}

			if (c1.determineCall(c1.getOnCallCycle(), c1.getC3S()) == 0) {
				c1.setC3SCallStat(1);
			} else if (c1.determineCall(c1.getOnCallCycle(), c1.getC3S()) == 1) {
				c1.setC3SCallStat(0);
			} else if (c1.determineCall(c1.getOnCallCycle(), c1.getC3S()) == 2) {
				c1.setC3SCallStat(2);
			}

			if (c1.determineCall(c1.getOnCallCycle(), c1.getC4S()) == 0) {
				c1.setC4SCallStat(1);
			} else if (c1.determineCall(c1.getOnCallCycle(), c1.getC4S()) == 1) {
				c1.setC4SCallStat(0);
			} else if (c1.determineCall(c1.getOnCallCycle(), c1.getC4S()) == 2) {
				c1.setC4SCallStat(2);
			}
			if (c1.determineCall(c1.getOnCallCycle(), c1.getD1S()) == 0) {
				c1.setD1SCallStat(0);
			} else if (c1.determineCall(c1.getOnCallCycle(), c1.getD1S()) == 1) {
				c1.setD1SCallStat(1);
			} else if (c1.determineCall(c1.getOnCallCycle(), c1.getD1S()) == 2) {
				c1.setD1SCallStat(2);
			}
			if (c1.determineCall(c1.getOnCallCycle(), c1.getD2S()) == 0) {
				c1.setD2SCallStat(0);
			} else if (c1.determineCall(c1.getOnCallCycle(), c1.getD2S()) == 1) {
				c1.setD2SCallStat(1);
			} else if (c1.determineCall(c1.getOnCallCycle(), c1.getD2S()) == 2) {
				c1.setD2SCallStat(2);
			}

			if (c1.determineCall(c1.getOnCallCycle(), c1.getD3S()) == 0) {
				c1.setD3SCallStat(0);
			} else if (c1.determineCall(c1.getOnCallCycle(), c1.getD3S()) == 1) {
				c1.setD3SCallStat(1);
			} else if (c1.determineCall(c1.getOnCallCycle(), c1.getD3S()) == 2) {
				c1.setD3SCallStat(2);
			}

			if (c1.determineCall(c1.getOnCallCycle(), c1.getD4S()) == 0) {
				c1.setD4SCallStat(0);
			} else if (c1.determineCall(c1.getOnCallCycle(), c1.getD4S()) == 1) {
				c1.setD4SCallStat(1);
			} else if (c1.determineCall(c1.getOnCallCycle(), c1.getD4S()) == 2) {
				c1.setD4SCallStat(2);
			}
		}

		if ((c1.cycleRotation == 1)
				&& ((c1.dayOfCycle == 1) || (c1.dayOfCycle == 0))) {
			if (c1.determineCall(c1.getOnCallCycle(), c1.getA1S()) == 0) {
				c1.setA1SCallStat(0);
			} else if (c1.determineCall(c1.getOnCallCycle(), c1.getA1S()) == 1) {
				c1.setA1SCallStat(1);
			} else if (c1.determineCall(c1.getOnCallCycle(), c1.getA1S()) == 2) {
				c1.setA1SCallStat(2);
			}
			if (c1.determineCall(c1.getOnCallCycle(), c1.getA2S()) == 0) {
				c1.setA2SCallStat(0);
			} else if (c1.determineCall(c1.getOnCallCycle(), c1.getA2S()) == 1) {
				c1.setA2SCallStat(1);
			} else if (c1.determineCall(c1.getOnCallCycle(), c1.getA2S()) == 2) {
				c1.setA2SCallStat(2);
			}

			if (c1.determineCall(c1.getOnCallCycle(), c1.getA3S()) == 0) {
				c1.setA3SCallStat(0);
			} else if (c1.determineCall(c1.getOnCallCycle(), c1.getA3S()) == 1) {
				c1.setA3SCallStat(1);
			} else if (c1.determineCall(c1.getOnCallCycle(), c1.getA3S()) == 2) {
				c1.setA3SCallStat(2);
			}

			if (c1.determineCall(c1.getOnCallCycle(), c1.getA4S()) == 0) {
				c1.setA4SCallStat(0);
			} else if (c1.determineCall(c1.getOnCallCycle(), c1.getA4S()) == 1) {
				c1.setA4SCallStat(1);
			} else if (c1.determineCall(c1.getOnCallCycle(), c1.getA4S()) == 2) {
				c1.setA4SCallStat(2);
			}

			// b crew second rotation
			if (c1.determineCall(c1.getOnCallCycle(), c1.getB1S()) == 0) {
				c1.setB1SCallStat(1);
			} else if (c1.determineCall(c1.getOnCallCycle(), c1.getB1S()) == 1) {
				c1.setB1SCallStat(0);
			} else if (c1.determineCall(c1.getOnCallCycle(), c1.getB1S()) == 2) {
				c1.setB1SCallStat(2);
			}
			if (c1.determineCall(c1.getOnCallCycle(), c1.getB2S()) == 0) {
				c1.setB2SCallStat(1);
			} else if (c1.determineCall(c1.getOnCallCycle(), c1.getB2S()) == 1) {
				c1.setB2SCallStat(0);
			} else if (c1.determineCall(c1.getOnCallCycle(), c1.getB2S()) == 2) {
				c1.setB2SCallStat(2);
			}

			if (c1.determineCall(c1.getOnCallCycle(), c1.getB3S()) == 0) {
				c1.setB3SCallStat(1);
			} else if (c1.determineCall(c1.getOnCallCycle(), c1.getB3S()) == 1) {
				c1.setB3SCallStat(0);
			} else if (c1.determineCall(c1.getOnCallCycle(), c1.getB3S()) == 2) {
				c1.setB3SCallStat(2);
			}

			if (c1.determineCall(c1.getOnCallCycle(), c1.getB4S()) == 0) {
				c1.setB4SCallStat(1);
			} else if (c1.determineCall(c1.getOnCallCycle(), c1.getB4S()) == 1) {
				c1.setB4SCallStat(0);
			} else if (c1.determineCall(c1.getOnCallCycle(), c1.getB4S()) == 2) {
				c1.setB4SCallStat(2);
			}
		}

		if ((c1.cycleRotation == 2)
				&& ((c1.dayOfCycle == 1) || (c1.dayOfCycle == 0))) {
			if (c1.determineCall(c1.getOnCallCycle(), c1.getC1S()) == 0) {
				c1.setC1SCallStat(0);
			} else if (c1.determineCall(c1.getOnCallCycle(), c1.getC1S()) == 1) {
				c1.setC1SCallStat(1);
			} else if (c1.determineCall(c1.getOnCallCycle(), c1.getC1S()) == 2) {
				c1.setC1SCallStat(2);
			}
			if (c1.determineCall(c1.getOnCallCycle(), c1.getC2S()) == 0) {
				c1.setC2SCallStat(0);
			} else if (c1.determineCall(c1.getOnCallCycle(), c1.getC2S()) == 1) {
				c1.setC2SCallStat(1);
			} else if (c1.determineCall(c1.getOnCallCycle(), c1.getC2S()) == 2) {
				c1.setC2SCallStat(2);
			}

			if (c1.determineCall(c1.getOnCallCycle(), c1.getC3S()) == 0) {
				c1.setC3SCallStat(0);
			} else if (c1.determineCall(c1.getOnCallCycle(), c1.getC3S()) == 1) {
				c1.setC3SCallStat(1);
			} else if (c1.determineCall(c1.getOnCallCycle(), c1.getC3S()) == 2) {
				c1.setC3SCallStat(2);
			}

			if (c1.determineCall(c1.getOnCallCycle(), c1.getC4S()) == 0) {
				c1.setC4SCallStat(0);
			} else if (c1.determineCall(c1.getOnCallCycle(), c1.getC4S()) == 1) {
				c1.setC4SCallStat(1);
			} else if (c1.determineCall(c1.getOnCallCycle(), c1.getC4S()) == 2) {
				c1.setC4SCallStat(2);
			}
			if (c1.determineCall(c1.getOnCallCycle(), c1.getD1S()) == 0) {
				c1.setD1SCallStat(1);
			} else if (c1.determineCall(c1.getOnCallCycle(), c1.getD1S()) == 1) {
				c1.setD1SCallStat(0);
			} else if (c1.determineCall(c1.getOnCallCycle(), c1.getD1S()) == 2) {
				c1.setD1SCallStat(2);
			}
			if (c1.determineCall(c1.getOnCallCycle(), c1.getD2S()) == 0) {
				c1.setD2SCallStat(1);
			} else if (c1.determineCall(c1.getOnCallCycle(), c1.getD2S()) == 1) {
				c1.setD2SCallStat(0);
			} else if (c1.determineCall(c1.getOnCallCycle(), c1.getD2S()) == 2) {
				c1.setD2SCallStat(2);
			}

			if (c1.determineCall(c1.getOnCallCycle(), c1.getD3S()) == 0) {
				c1.setD3SCallStat(1);
			} else if (c1.determineCall(c1.getOnCallCycle(), c1.getD3S()) == 1) {
				c1.setD3SCallStat(0);
			} else if (c1.determineCall(c1.getOnCallCycle(), c1.getD3S()) == 2) {
				c1.setD3SCallStat(2);
			}

			if (c1.determineCall(c1.getOnCallCycle(), c1.getD4S()) == 0) {
				c1.setD4SCallStat(1);
			} else if (c1.determineCall(c1.getOnCallCycle(), c1.getD4S()) == 1) {
				c1.setD4SCallStat(0);
			} else if (c1.determineCall(c1.getOnCallCycle(), c1.getD4S()) == 2) {
				c1.setD4SCallStat(2);
			}
		}

		if ((c1.cycleRotation == 3)
				&& ((c1.dayOfCycle == 1) || (c1.dayOfCycle == 0))) {
			if (c1.determineCall(c1.getOnCallCycle(), c1.getA1S()) == 0) {
				c1.setA1SCallStat(1);
			} else if (c1.determineCall(c1.getOnCallCycle(), c1.getA1S()) == 1) {
				c1.setA1SCallStat(0);
			} else if (c1.determineCall(c1.getOnCallCycle(), c1.getA1S()) == 2) {
				c1.setA1SCallStat(2);
			}
			if (c1.determineCall(c1.getOnCallCycle(), c1.getA2S()) == 0) {
				c1.setA2SCallStat(1);
			} else if (c1.determineCall(c1.getOnCallCycle(), c1.getA2S()) == 1) {
				c1.setA2SCallStat(0);
			} else if (c1.determineCall(c1.getOnCallCycle(), c1.getA2S()) == 2) {
				c1.setA2SCallStat(2);
			}

			if (c1.determineCall(c1.getOnCallCycle(), c1.getA3S()) == 0) {
				c1.setA3SCallStat(1);
			} else if (c1.determineCall(c1.getOnCallCycle(), c1.getA3S()) == 1) {
				c1.setA3SCallStat(0);
			} else if (c1.determineCall(c1.getOnCallCycle(), c1.getA3S()) == 2) {
				c1.setA3SCallStat(2);
			}

			if (c1.determineCall(c1.getOnCallCycle(), c1.getA4S()) == 0) {
				c1.setA4SCallStat(1);
			} else if (c1.determineCall(c1.getOnCallCycle(), c1.getA4S()) == 1) {
				c1.setA4SCallStat(0);
			} else if (c1.determineCall(c1.getOnCallCycle(), c1.getA4S()) == 2) {
				c1.setA4SCallStat(2);
			}
			if (c1.determineCall(c1.getOnCallCycle(), c1.getB1S()) == 0) {
				c1.setB1SCallStat(0);
			} else if (c1.determineCall(c1.getOnCallCycle(), c1.getB1S()) == 1) {
				c1.setB1SCallStat(1);
			} else if (c1.determineCall(c1.getOnCallCycle(), c1.getB1S()) == 2) {
				c1.setB1SCallStat(2);
			}
			if (c1.determineCall(c1.getOnCallCycle(), c1.getB2S()) == 0) {
				c1.setB2SCallStat(0);
			} else if (c1.determineCall(c1.getOnCallCycle(), c1.getB2S()) == 1) {
				c1.setB2SCallStat(1);
			} else if (c1.determineCall(c1.getOnCallCycle(), c1.getB2S()) == 2) {
				c1.setB2SCallStat(2);
			}

			if (c1.determineCall(c1.getOnCallCycle(), c1.getB3S()) == 0) {
				c1.setB3SCallStat(0);
			} else if (c1.determineCall(c1.getOnCallCycle(), c1.getB3S()) == 1) {
				c1.setB3SCallStat(1);
			} else if (c1.determineCall(c1.getOnCallCycle(), c1.getB3S()) == 2) {
				c1.setB3SCallStat(2);
			}

			if (c1.determineCall(c1.getOnCallCycle(), c1.getB4S()) == 0) {
				c1.setB4SCallStat(0);
			} else if (c1.determineCall(c1.getOnCallCycle(), c1.getB4S()) == 1) {
				c1.setB4SCallStat(1);
			} else if (c1.determineCall(c1.getOnCallCycle(), c1.getB4S()) == 2) {
				c1.setB4SCallStat(2);
			}
		}

		// Junior Extruder Operators
		/*if ((c1.cycleRotation == 0)
				&& ((c1.dayOfCycle == 3) || (c1.dayOfCycle == 2))) {
			if (c1.determineCallJr(c1.getOnCallCycle(), c1.getcJr()) == 0) {
				c1.setcJrCallStat(1);
			} else if (c1.determineCallJr(c1.getOnCallCycle(),
					c1.getcJr()) == 1) {
				c1.setcJrCallStat(0);
			} else if (c1.determineCallJr(c1.getOnCallCycle(),
					c1.getcJr()) == 2) {
				c1.setcJrCallStat(2);
			}
			if (c1.determineCallJr(c1.getOnCallCycle(), c1.getdJr()) == 0) {
				c1.setDjrCallStat(0);
			} else if (c1.determineCallJr(c1.getOnCallCycle(),
					c1.getdJr()) == 1) {
				c1.setDjrCallStat(1);
			} else if (c1.determineCallJr(c1.getOnCallCycle(),
					c1.getdJr()) == 2) {
				c1.setDjrCallStat(2);
			}
		}

		if ((c1.cycleRotation == 1)
				&& ((c1.dayOfCycle == 3) || (c1.dayOfCycle == 2))) {
			if (c1.determineCallJr(c1.getOnCallCycle(), c1.getaJr()) == 0) {
				c1.setaJrCallStat(0);
			} else if (c1.determineCallJr(c1.getOnCallCycle(),
					c1.getaJr()) == 1) {
				c1.setaJrCallStat(1);
			} else if (c1.determineCallJr(c1.getOnCallCycle(),
					c1.getaJr()) == 2) {
				c1.setaJrCallStat(2);
			}
			if (c1.determineCallJr(c1.getOnCallCycle(), c1.getbJr()) == 0) {
				c1.setbJrCallStat(1);
			} else if (c1.determineCallJr(c1.getOnCallCycle(),
					c1.getbJr()) == 1) {
				c1.setbJrCallStat(0);
			} else if (c1.determineCallJr(c1.getOnCallCycle(),
					c1.getbJr()) == 2) {
				c1.setbJrCallStat(2);
			}
		}

		if ((c1.cycleRotation == 2)
				&& ((c1.dayOfCycle == 3) || (c1.dayOfCycle == 2))) {
			if (c1.determineCallJr(c1.getOnCallCycle(), c1.getcJr()) == 0) {
				c1.setcJrCallStat(1);
			} else if (c1.determineCallJr(c1.getOnCallCycle(),
					c1.getcJr()) == 1) {
				c1.setcJrCallStat(0);
			} else if (c1.determineCallJr(c1.getOnCallCycle(),
					c1.getcJr()) == 2) {
				c1.setcJrCallStat(2);
			}
			if (c1.determineCallJr(c1.getOnCallCycle(), c1.getdJr()) == 0) {
				c1.setDjrCallStat(0);
			} else if (c1.determineCallJr(c1.getOnCallCycle(),
					c1.getdJr()) == 1) {
				c1.setDjrCallStat(1);
			} else if (c1.determineCallJr(c1.getOnCallCycle(),
					c1.getdJr()) == 2) {
				c1.setDjrCallStat(2);
			}
		}

		if ((c1.cycleRotation == 3)
				&& ((c1.dayOfCycle == 3) || (c1.dayOfCycle == 2))) {
			if (c1.determineCallJr(c1.getOnCallCycle(), c1.getaJr()) == 0) {
				c1.setaJrCallStat(0);
			} else if (c1.determineCallJr(c1.getOnCallCycle(),
					c1.getaJr()) == 1) {
				c1.setaJrCallStat(1);
			} else if (c1.determineCallJr(c1.getOnCallCycle(),
					c1.getaJr()) == 2) {
				c1.setaJrCallStat(2);
			}
			if (c1.determineCallJr(c1.getOnCallCycle(), c1.getbJr()) == 0) {
				c1.setbJrCallStat(1);
			} else if (c1.determineCallJr(c1.getOnCallCycle(),
					c1.getbJr()) == 1) {
				c1.setbJrCallStat(0);
			} else if (c1.determineCallJr(c1.getOnCallCycle(),
					c1.getbJr()) == 2) {
				c1.setbJrCallStat(2);
			}
		}

		if ((c1.cycleRotation == 0)
				&& ((c1.dayOfCycle == 3) || (c1.dayOfCycle == 0))) {
			if (c1.determineCallP(c1.getOnCallCycle(), c1.getcP()) == 0) {
				c1.setcPCallStat(1);
			} else if (c1.determineCallP(c1.getOnCallCycle(), c1.getcP()) == 1) {
				c1.setcPCallStat(0);
			} else if (c1.determineCallP(c1.getOnCallCycle(), c1.getcP()) == 2) {
				c1.setcPCallStat(2);
			}
			if (c1.determineCallP(c1.getOnCallCycle(), c1.getdP()) == 0) {
				c1.setdPCallStat(0);
			} else if (c1.determineCallP(c1.getOnCallCycle(), c1.getdP()) == 1) {
				c1.setdPCallStat(1);
			} else if (c1.determineCallP(c1.getOnCallCycle(), c1.getdP()) == 2) {
				c1.setdPCallStat(2);
			}
		}

		if ((c1.cycleRotation == 1)
				&& ((c1.dayOfCycle == 3) || (c1.dayOfCycle == 0))) {
			if (c1.determineCallP(c1.getOnCallCycle(), c1.getaP()) == 0) {
				c1.setaPCallStat(1);
			} else if (c1.determineCallP(c1.getOnCallCycle(), c1.getaP()) == 1) {
				c1.setaPCallStat(0);
			} else if (c1.determineCallP(c1.getOnCallCycle(), c1.getaP()) == 2) {
				c1.setaPCallStat(2);
			}

			if (c1.determineCallP(c1.getOnCallCycle(), c1.getbP()) == 0) {
				c1.setbPCallStat(0);
			} else if (c1.determineCallP(c1.getOnCallCycle(), c1.getbP()) == 1) {
				c1.setbPCallStat(1);
			} else if (c1.determineCallP(c1.getOnCallCycle(), c1.getbP()) == 2) {
				c1.setbPCallStat(2);
			}
		}

		if ((c1.cycleRotation == 2)
				&& ((c1.dayOfCycle == 3) || (c1.dayOfCycle == 0))) {
			if (c1.determineCallP(c1.getOnCallCycle(), c1.getcP()) == 0) {
				c1.setcPCallStat(0);
			} else if (c1.determineCallP(c1.getOnCallCycle(), c1.getcP()) == 1) {
				c1.setcPCallStat(1);
			} else if (c1.determineCallP(c1.getOnCallCycle(), c1.getcP()) == 2) {
				c1.setcPCallStat(2);
			}
			if (c1.determineCallP(c1.getOnCallCycle(), c1.getdP()) == 0) {
				c1.setdPCallStat(1);
			} else if (c1.determineCallP(c1.getOnCallCycle(), c1.getdP()) == 1) {
				c1.setdPCallStat(0);
			} else if (c1.determineCallP(c1.getOnCallCycle(), c1.getdP()) == 2) {
				c1.setdPCallStat(2);
			}
		}

		if ((c1.cycleRotation == 3)
				&& ((c1.dayOfCycle == 3) || (c1.dayOfCycle == 0))) {
			if (c1.determineCallP(c1.getOnCallCycle(), c1.getaP()) == 0) {
				c1.setaPCallStat(0);
			} else if (c1.determineCallP(c1.getOnCallCycle(), c1.getaP()) == 1) {
				c1.setaPCallStat(1);
			} else if (c1.determineCallP(c1.getOnCallCycle(), c1.getaP()) == 2) {
				c1.setaPCallStat(2);
			}
			if (c1.determineCallP(c1.getOnCallCycle(), c1.getbP()) == 0) {
				c1.setbPCallStat(1);
			} else if (c1.determineCallP(c1.getOnCallCycle(), c1.getbP()) == 1) {
				c1.setbPCallStat(0);
			} else if (c1.determineCallP(c1.getOnCallCycle(), c1.getbP()) == 2) {
				c1.setbPCallStat(2);
			}
		}*/
	}

	private String readFile(String pathname) throws Exception {

		File file = new File(pathname);
		StringBuilder fileContents = new StringBuilder((int) file.length());
		Scanner scanner = new Scanner(file);
		String lineSeparator = System.getProperty("line.separator");

		try {
			while (scanner.hasNextLine()) {
				fileContents.append(scanner.nextLine() + lineSeparator);
			}
			return fileContents.toString();
		} finally {
			scanner.close();
		}
	}

	public void printOutput(OnCallAug812 c1, PrintWriter output2, File file) {
		SimpleDateFormat df = new SimpleDateFormat();
		df.applyPattern("MM/dd/yyyy");
		output2.println(df.format(cal1.getTime()));
		output2.println();
		output2.println("Day Coverage");
		output2.println("----------");

		c1.check0(output2, c1.getA1SCallStat(), a1);
		c1.check0(output2, c1.getA2SCallStat(), a2);
		c1.check0(output2, c1.getA3SCallStat(), a3);
		c1.check0(output2, c1.getA4SCallStat(), a4);

		if (c1.getaJrCallStat() == 0) {
			output2.print(c1.aJr1);
			output2.println();
			output2.print(c1.aJr2);
			output2.println();
			output2.print(c1.aJr3);
			output2.println();
		} else if (c1.getaPCallStat() == 0) {
			output2.print(c1.aP1);
			output2.println();
			output2.print(c1.aP2);
			output2.println();
		}
		c1.check0(output2, c1.getB1SCallStat(), b1);
		c1.check0(output2, c1.getB2SCallStat(), b2);
		c1.check0(output2, c1.getB3SCallStat(), b3);
		c1.check0(output2, c1.getB4SCallStat(), b4);

		if (c1.getbJrCallStat() == 0) {
			output2.print(c1.bJr1);
			output2.println();
			output2.print(c1.bJr2);
			output2.println();
			output2.print(c1.bJr3);
			output2.println();
		} else if (c1.getbPCallStat() == 0) {
			output2.print(c1.bP1);
			output2.println();
			output2.print(c1.bP2);
			output2.println();
		}
		c1.check0(output2, c1.getC1SCallStat(), c11);
		c1.check0(output2, c1.getC2SCallStat(), c2);
		c1.check0(output2, c1.getC3SCallStat(), c3);
		c1.check0(output2, c1.getC4SCallStat(), c4);

		if (c1.getcJrCallStat() == 0) {
			output2.print(c1.cJr1);
			output2.println();
			output2.print(c1.cJr2);
			output2.println();
			output2.print(c1.cJr3);
			output2.println();
		} else if (c1.getcPCallStat() == 0) {
			output2.print(c1.cP1);
			output2.println();
			output2.print(c1.cP2);
			output2.println();
		}
		c1.check0(output2, c1.getD1SCallStat(), d1);
		c1.check0(output2, c1.getD2SCallStat(), d2);
		c1.check0(output2, c1.getD3SCallStat(), d3);
		c1.check0(output2, c1.getD4SCallStat(), d4);

		if (c1.getdJrCallStat() == 0) {
			output2.print(c1.dJr1);
			output2.println();
			output2.print(c1.dJr2);
			output2.println();
			output2.print(c1.dJr3);
			output2.println();
		} else if (c1.getdPCallStat() == 0) {
			output2.print(c1.dP1);
			output2.println();
			output2.print(c1.dP2);
			output2.println();
		}
		output2.println();
		output2.println("Night Coverage");
		output2.println("----------");

		c1.check1(output2, c1.getA1SCallStat(), a1);
		c1.check1(output2, c1.getA2SCallStat(), a2);
		c1.check1(output2, c1.getA3SCallStat(), a3);
		c1.check1(output2, c1.getA4SCallStat(), a4);

		if (c1.getaJrCallStat() == 1) {
			output2.print(c1.aJr1);
			output2.println();
			output2.print(c1.aJr2);
			output2.println();
			output2.print(c1.aJr3);
			output2.println();
		} else if (c1.getaPCallStat() == 1) {
			output2.print(c1.aP1);
			output2.println();
			output2.print(c1.aP2);
			output2.println();
		}
		c1.check1(output2, c1.getB1SCallStat(), b1);
		c1.check1(output2, c1.getB2SCallStat(), b2);
		c1.check1(output2, c1.getB3SCallStat(), b3);
		c1.check1(output2, c1.getB4SCallStat(), b4);

		if (c1.getbJrCallStat() == 1) {
			output2.print(c1.bJr1);
			output2.println();
			output2.print(c1.bJr2);
			output2.println();
			output2.print(c1.bJr3);
			output2.println();
		} else if (c1.getbPCallStat() == 1) {
			output2.print(c1.bP1);
			output2.println();
			output2.print(c1.bP2);
			output2.println();
		}
		c1.check1(output2, c1.getC1SCallStat(), c11);
		c1.check1(output2, c1.getC2SCallStat(), c2);
		c1.check1(output2, c1.getC3SCallStat(), c3);
		c1.check1(output2, c1.getC4SCallStat(), c4);

		if (c1.getcJrCallStat() == 1) {
			output2.print(c1.cJr1);
			output2.println();
			output2.print(c1.cJr2);
			output2.println();
			output2.print(c1.cJr3);
			output2.println();
		} else if (c1.getcPCallStat() == 1) {
			output2.print(c1.cP1);
			output2.println();
			output2.print(c1.cP2);
			output2.println();
		}
		c1.check1(output2, c1.getD1SCallStat(), d1);
		c1.check1(output2, c1.getD2SCallStat(), d2);
		c1.check1(output2, c1.getD3SCallStat(), d3);
		c1.check1(output2, c1.getD4SCallStat(), d4);

		if (c1.getdJrCallStat() == 1) {
			output2.print(c1.dJr1);
			output2.println();
			output2.print(c1.dJr2);
			output2.println();
			output2.print(c1.dJr3);
			output2.println();
		} else if (c1.getdPCallStat() == 1) {
			output2.print(c1.dP1);
			output2.println();
			output2.print(c1.dP2);
			output2.println();
		}
		output2.println();
	}

	public void check0(PrintWriter output2, int callStat, String name) {
		if (callStat == 0) {
			output2.print(name);
			output2.println();
		}
	}

	public void check1(PrintWriter output2, int callStat, String name) {
		if (callStat == 1) {
			output2.print(name);
			output2.println();
		}
	}

	public void addDate(OnCallAug812 c1) {
		cal1.add(Calendar.DATE, -1);
		c1.setCycleDay(((cal1.get(Calendar.DAY_OF_YEAR) - 3)) % 16);
		c1.setDayOfCycle(cycleDay % 4);
		// number of days into current rotation ( 0 =4, 1=1, 2=2, 3=3)
		c1.setCycleRotation((int) (cycleDay / 4));
		// number of current rotation (4 per cycle)
		c1.setCycleOfYear(((cal1.get(Calendar.DAY_OF_YEAR) - 2) / 16));
		c1.setOnCallCycle(cycleOfYear % 4);
	}

	public void resetVars(OnCallAug812 c1) {
		c1.setA1SCallStat(-1);
		c1.setA2SCallStat(-1);
		c1.setA3SCallStat(-1);
		c1.setA4SCallStat(-1);
		c1.setaJrCallStat(-1);
		c1.setaPCallStat(-1);

		c1.setB1SCallStat(-1);
		c1.setB2SCallStat(-1);
		c1.setB3SCallStat(-1);
		c1.setB4SCallStat(-1);
		c1.setbJrCallStat(-1);
		c1.setbPCallStat(-1);

		c1.setC1SCallStat(-1);
		c1.setC2SCallStat(-1);
		c1.setC3SCallStat(-1);
		c1.setC4SCallStat(-1);
		c1.setcJrCallStat(-1);
		c1.setcPCallStat(-1);

		c1.setD1SCallStat(-1);
		c1.setD2SCallStat(-1);
		c1.setD3SCallStat(-1);
		c1.setD4SCallStat(-1);
		c1.setdJrCallStat(-1);
		c1.setdPCallStat(-1);
	}

	public static void main(String[] args) throws Exception {
		OnCallAug812 c1 = new OnCallAug812();
		c1.calcCall(c1);
		System.out.print("Day of 16 day rotation(0 to 15): ");
		System.out.println(c1.cycleDay);
		System.out.print("Day of 4 day cycle (0 to 3): ");
		System.out.println(c1.dayOfCycle);
		System.out.print("Cycle of 16 day rotation (0 to 3): ");
		System.out.println(c1.cycleRotation);
		System.out.print("16 day cycle number (0 to 22): ");
		System.out.println(c1.cycleOfYear);
		System.out.print("On Call Cycle Number(0 to 6 then repeat): ");
		System.out.println(c1.onCallCycle);

		System.out.println();
		System.out.println("Call status for "
				+ "each A Crew employee--set to 0,1, or 2");
		System.out.println("0 = on call day shift");
		System.out.println("1 = on call night shift");
		System.out.println("2 = off call");

		System.out.println("Senior Employees");
		System.out.println("A Crew");
		System.out.print(c1.a1S);
		System.out.println(c1.a1SCallStat);
		System.out.print(c1.a2S);
		System.out.println(c1.a2SCallStat);
		System.out.print(c1.a3S);
		System.out.println(c1.a3SCallStat);
		System.out.print(c1.a4S);
		System.out.println(c1.a4SCallStat);
		System.out.println("B Crew");
		System.out.print(c1.b1S);
		System.out.println(c1.b1SCallStat);
		System.out.print(c1.b2S);
		System.out.println(c1.b2SCallStat);
		System.out.print(c1.b3S);
		System.out.println(c1.b3SCallStat);
		System.out.print(c1.b4S);
		System.out.println(c1.b4SCallStat);
		System.out.println("C Crew");
		System.out.print(c1.c1S);
		System.out.println(c1.c1SCallStat);
		System.out.print(c1.c2S);
		System.out.println(c1.c2SCallStat);
		System.out.print(c1.c3S);
		System.out.println(c1.c3SCallStat);
		System.out.print(c1.c4S);
		System.out.println(c1.c4SCallStat);
		System.out.println("D Crew");
		System.out.print(c1.d1S);
		System.out.println(c1.d1SCallStat);
		System.out.print(c1.d2S);
		System.out.println(c1.d2SCallStat);
		System.out.print(c1.d3S);
		System.out.println(c1.d3SCallStat);
		System.out.print(c1.d4S);
		System.out.println(c1.d4SCallStat);

		System.out.println("Junior Employees");
		System.out.print("A Crew: ");
		System.out.println(c1.aJrCallStat);
		System.out.print("B Crew: ");
		System.out.println(c1.bJrCallStat);
		System.out.print("C Crew: ");
		System.out.println(c1.cJrCallStat);
		System.out.print("D Crew: ");
		System.out.println(c1.dJrCallStat);

		System.out.println("Pelletizer Operators");
		System.out.print("A Crew: ");
		System.out.println(c1.aPCallStat);
		System.out.print("B Crew: ");
		System.out.println(c1.bPCallStat);
		System.out.print("C Crew: ");
		System.out.println(c1.cPCallStat);
		System.out.print("D Crew: ");
		System.out.println(c1.dPCallStat);

		c1.a1 = c1.readFile("a1.txt");
		c1.a2 = c1.readFile("a2.txt");
		c1.a3 = c1.readFile("a3.txt");
		c1.a4 = c1.readFile("a4.txt");
		c1.aJr1 = c1.readFile("aJr1.txt");
		c1.aJr2 = c1.readFile("aJr2.txt");
		c1.aJr3 = c1.readFile("aJr3.txt");
		c1.aP1 = c1.readFile("aP1.txt");
		c1.aP2 = c1.readFile("aP2.txt");

		c1.b1 = c1.readFile("b1.txt");
		c1.b2 = c1.readFile("b2.txt");
		c1.b3 = c1.readFile("b3.txt");
		c1.b4 = c1.readFile("b4.txt");
		c1.bJr1 = c1.readFile("bJr1.txt");
		c1.bJr2 = c1.readFile("bJr2.txt");
		c1.bJr3 = c1.readFile("bJr3.txt");
		c1.bP1 = c1.readFile("bP1.txt");
		c1.bP2 = c1.readFile("bP2.txt");

		c1.c11 = c1.readFile("c1.txt");
		c1.c2 = c1.readFile("c2.txt");
		c1.c3 = c1.readFile("c3.txt");
		c1.c4 = c1.readFile("c4.txt");
		c1.cJr1 = c1.readFile("cJr1.txt");
		c1.cJr2 = c1.readFile("cJr2.txt");
		c1.cJr3 = c1.readFile("cJr3.txt");
		c1.cP1 = c1.readFile("cP1.txt");
		c1.cP2 = c1.readFile("cP2.txt");

		c1.d1 = c1.readFile("d1.txt");
		c1.d2 = c1.readFile("d2.txt");
		c1.d3 = c1.readFile("d3.txt");
		c1.d4 = c1.readFile("d4.txt");
		c1.dJr1 = c1.readFile("dJr1.txt");
		c1.dJr2 = c1.readFile("dJr2.txt");
		c1.dJr3 = c1.readFile("dJr3.txt");
		c1.dP1 = c1.readFile("dP1.txt");
		c1.dP2 = c1.readFile("dP2.txt");

		File file = new File("oncall.txt");
		PrintWriter output = new PrintWriter(file);
		output.print("Berry Plastics");
		output.println();
		output.println("Calhoun, GA Film Plant Off Shift Coverage");
		c1.printOutput(c1, output, file);
		for (int i = 0; i < 6; i++) {
			c1.resetVars(c1);
			c1.addDate(c1);
			c1.calcCall(c1);
			c1.printOutput(c1, output, file);
			output.println();
		}
		output.close();
	}

	public OnCallAug812() {
		super();
	}

	public Calendar getC1() {
		return cal1;
	}

	public void setC1(Calendar cal1) {
		this.cal1 = cal1;
	}

	public double getCycleDay() {
		return cycleDay;
	}

	public void setCycleDay(double cycleDay) {
		this.cycleDay = cycleDay;
	}

	public int getCycleRotation() {
		return cycleRotation;
	}

	public void setCycleRotation(int cycleRotation) {
		this.cycleRotation = cycleRotation;
	}

	public int getCycleOfYear() {
		return cycleOfYear;
	}

	public void setCycleOfYear(int cycleOfYear) {
		this.cycleOfYear = cycleOfYear;
	}

	public int getOnCallCycle() {
		return onCallCycle;
	}

	public void setOnCallCycle(int onCallCycle) {
		this.onCallCycle = onCallCycle;
	}

	public int getA1S() {
		return a1S;
	}

	public void setA1S(int a1s) {
		a1S = a1s;
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

	public int getaJr() {
		return aJr;
	}

	public void setaJr(int aJr) {
		this.aJr = aJr;
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

	public int getbJr() {
		return bJr;
	}

	public void setbJr(int bJr) {
		this.bJr = bJr;
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

	public int getcJr() {
		return cJr;
	}

	public void setcJr(int cJr) {
		this.cJr = cJr;
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

	public int getdJr() {
		return dJr;
	}

	public void setdJr(int dJr) {
		this.dJr = dJr;
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

	public int getaJrCallStat() {
		return aJrCallStat;
	}

	public void setaJrCallStat(int aJrCallStat) {
		this.aJrCallStat = aJrCallStat;
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

	public int getbJrCallStat() {
		return bJrCallStat;
	}

	public void setbJrCallStat(int bJrCallStat) {
		this.bJrCallStat = bJrCallStat;
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

	public int getcJrCallStat() {
		return cJrCallStat;
	}

	public void setcJrCallStat(int cJrCallStat) {
		this.cJrCallStat = cJrCallStat;
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

	public int getDjrCallStat() {
		return dJrCallStat;
	}

	public void setDjrCallStat(int djrCallStat) {
		this.dJrCallStat = djrCallStat;
	}

	public int getaP() {
		return aP;
	}

	public void setaP(int aP) {
		this.aP = aP;
	}

	public int getbP() {
		return bP;
	}

	public void setbP(int bP) {
		this.bP = bP;
	}

	public int getcP() {
		return cP;
	}

	public void setcP(int cP) {
		this.cP = cP;
	}

	public int getdP() {
		return dP;
	}

	public void setdP(int dP) {
		this.dP = dP;
	}

	public double getDayOfCycle() {
		return dayOfCycle;
	}

	public void setDayOfCycle(double dayOfCycle) {
		this.dayOfCycle = dayOfCycle;
	}

	public int getaPCallStat() {
		return aPCallStat;
	}

	public void setaPCallStat(int aPCallStat) {
		this.aPCallStat = aPCallStat;
	}

	public int getbPCallStat() {
		return bPCallStat;
	}

	public void setbPCallStat(int bPCallStat) {
		this.bPCallStat = bPCallStat;
	}

	public int getcPCallStat() {
		return cPCallStat;
	}

	public void setcPCallStat(int cPCallStat) {
		this.cPCallStat = cPCallStat;
	}

	public int getdPCallStat() {
		return dPCallStat;
	}

	public void setdPCallStat(int dPCallStat) {
		this.dPCallStat = dPCallStat;
	}

	public Calendar getCal1() {
		return cal1;
	}

	public void setCal1(Calendar cal1) {
		this.cal1 = cal1;
	}

	public String getA1() {
		return a1;
	}

	public void setA1(String a1) {
		this.a1 = a1;
	}

	public String getA2() {
		return a2;
	}

	public void setA2(String a2) {
		this.a2 = a2;
	}

	public String getA3() {
		return a3;
	}

	public void setA3(String a3) {
		this.a3 = a3;
	}

	public String getA4() {
		return a4;
	}

	public void setA4(String a4) {
		this.a4 = a4;
	}

	public String getaJr1() {
		return aJr1;
	}

	public void setaJr1(String aJr1) {
		this.aJr1 = aJr1;
	}

	public String getaJr2() {
		return aJr2;
	}

	public void setaJr2(String aJr2) {
		this.aJr2 = aJr2;
	}

	public String getaJr3() {
		return aJr3;
	}

	public void setaJr3(String aJr3) {
		this.aJr3 = aJr3;
	}

	public String getB1() {
		return b1;
	}

	public void setB1(String b1) {
		this.b1 = b1;
	}

	public String getB2() {
		return b2;
	}

	public void setB2(String b2) {
		this.b2 = b2;
	}

	public String getB3() {
		return b3;
	}

	public void setB3(String b3) {
		this.b3 = b3;
	}

	public String getB4() {
		return b4;
	}

	public void setB4(String b4) {
		this.b4 = b4;
	}

	public String getbJr1() {
		return bJr1;
	}

	public void setbJr1(String bJr1) {
		this.bJr1 = bJr1;
	}

	public String getbJr2() {
		return bJr2;
	}

	public void setbJr2(String bJr2) {
		this.bJr2 = bJr2;
	}

	public String getbJr3() {
		return bJr3;
	}

	public void setbJr3(String bJr3) {
		this.bJr3 = bJr3;
	}

	public String getC2() {
		return c2;
	}

	public void setC2(String c2) {
		this.c2 = c2;
	}

	public String getC3() {
		return c3;
	}

	public void setC3(String c3) {
		this.c3 = c3;
	}

	public String getC4() {
		return c4;
	}

	public void setC4(String c4) {
		this.c4 = c4;
	}

	public String getcJr1() {
		return cJr1;
	}

	public void setcJr1(String cJr1) {
		this.cJr1 = cJr1;
	}

	public String getcJr2() {
		return cJr2;
	}

	public void setcJr2(String cJr2) {
		this.cJr2 = cJr2;
	}

	public String getcJr3() {
		return cJr3;
	}

	public void setcJr3(String cJr3) {
		this.cJr3 = cJr3;
	}

	public String getD1() {
		return d1;
	}

	public void setD1(String d1) {
		this.d1 = d1;
	}

	public String getD2() {
		return d2;
	}

	public void setD2(String d2) {
		this.d2 = d2;
	}

	public String getD3() {
		return d3;
	}

	public void setD3(String d3) {
		this.d3 = d3;
	}

	public String getD4() {
		return d4;
	}

	public void setD4(String d4) {
		this.d4 = d4;
	}

	public String getdJr1() {
		return dJr1;
	}

	public void setdJr1(String dJr1) {
		this.dJr1 = dJr1;
	}

	public String getdJr2() {
		return dJr2;
	}

	public void setdJr2(String dJr2) {
		this.dJr2 = dJr2;
	}

	public String getdJr3() {
		return dJr3;
	}

	public void setdJr3(String dJr3) {
		this.dJr3 = dJr3;
	}

	public int getdJrCallStat() {
		return dJrCallStat;
	}

	public void setdJrCallStat(int dJrCallStat) {
		this.dJrCallStat = dJrCallStat;
	}

	public String getaP1() {
		return aP1;
	}

	public void setaP1(String aP1) {
		this.aP1 = aP1;
	}

	public String getaP2() {
		return aP2;
	}

	public void setaP2(String aP2) {
		this.aP2 = aP2;
	}

	public String getbP1() {
		return bP1;
	}

	public void setbP1(String bP1) {
		this.bP1 = bP1;
	}

	public String getbP2() {
		return bP2;
	}

	public void setbP2(String bP2) {
		this.bP2 = bP2;
	}

	public String getcP1() {
		return cP1;
	}

	public void setcP1(String cP1) {
		this.cP1 = cP1;
	}

	public String getcP2() {
		return cP2;
	}

	public void setcP2(String cP2) {
		this.cP2 = cP2;
	}

	public String getdP1() {
		return dP1;
	}

	public void setdP1(String dP1) {
		this.dP1 = dP1;
	}

	public String getdP2() {
		return dP2;
	}

	public void setdP2(String dP2) {
		this.dP2 = dP2;
	}

	public void setC1(String c11) {
		this.c11 = c11;
	}
}
