package reCap;

public class reCap {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// new double[4];
		double[] myList = { 1.2, 3.3, 5.5, 2.4 };
		double total = 0;
		double max = myList[0];
sdasd
		for (double number : myList) {
			if (max < number) {
				max = number;
			}
			total += number;
			System.out.println(number);
		}
		System.out.println("toplam : " + total);
		System.out.println("en büyük sayı : " + max);
		
		String line = "---------------------------------";
		System.out.println(line);
		
		String[][] sehirler = { { "istanbul", "bursa", "bilecik" }, { "ankara", "konya", "kayseri" },{ "diyarbakır", "şanlıurfa", "gaziantep" } };
		System.out.println(sehirler[0][2]);
		
		for (int i = 0; i <= 2; i++) {
			System.out.println(line);
			for (int j = 0; j <= 2; j++) {
				System.out.println(sehirler[i][j]);
			}
		}
	}

}
