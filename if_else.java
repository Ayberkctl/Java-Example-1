package firstExample;

public class test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("hello word1");
		String isim="ayberk";
		System.out.println(isim);
		int numara = 12;
		double dolar = 123.122;
		double dolarNow =23.22;
		System.out.println("------------------------------------------");
		boolean dolarDüştüMü = true;
		if (dolar > dolarNow) {//false 
			System.out.print("düştü");
			
		} else {
			System.out.println("çıktı");
		}
		//array
		String[] kredi={"kredi1","maaş","vade"};
		
		System.out.println(kredi[0]);
		System.out.println(kredi[1]);

		System.out.println(kredi[2]);
		System.out.println(kredi.length);

		for (int i = 0; i < kredi.length; i++) {
			System.out.println(kredi[i]);
		}
	}

}
