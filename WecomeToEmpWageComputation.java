public class WecomeToEmpWageComputation {
	public static void main(String[] ags) {

		System.out.println("WecomeToEmpWageComputation");
		WecomeToEmpWageComputation m1 = new WecomeToEmpWageComputation();
		m1.emp();
	}

	private void emp() {

		int IS_Full_Time = 1;

		double empcheck = (int) (Math.floor(Math.random() * 10) % 2);
		if (empcheck == IS_Full_Time) {
			System.out.println("Employee is present: " + empcheck);
		} else {
			System.out.println("Employee is absent: " + empcheck);
		}
	}
}

