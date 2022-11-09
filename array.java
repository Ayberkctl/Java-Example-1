
public class array {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String[] ogrenciler = new String[3];
		ogrenciler[0] = "ayberk";
		ogrenciler[1] = "ali";
		ogrenciler[2] = "ahmet";
		for (int i = 0; i < ogrenciler.length; i++) {

			System.out.println(ogrenciler[i]);
		}
		System.out.println("-------------------");
		for (String ogrenci : ogrenciler) {
			System.out.println(ogrenci);
		}

	}

}
