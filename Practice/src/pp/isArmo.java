package pp;

public class isArmo {
	static int getCount(int num) {
		int count = 0; // get count of digit means 153 so there is 3 count
		while (num != 0) {
			num /= 10; // get last digit by dividing by 10 and get the remainder
			count++;// increase the count when each last digit is got

			// remove the last digit by dividing by 10
		}
		return count;
	}

	static int getSum(int num, int power) {
		int original = num;
		int sum = 0;
		while (num != 0) {
			int ld = num % 10;
			int drp = (int) Math.pow(ld, power);
			sum += drp;
			num /= 10;
		}
		return sum;
	}
}
