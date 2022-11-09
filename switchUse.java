
public class switchUse {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		char grade = 'A';
		switch (grade) {
		case 'A':
			System.out.println("mükemmel : geçtiniz");
			break;

		case 'B':
			System.out.println("çok iyi : geçtiniz");
			break;

		case 'C':
			System.out.println("iyi : geçtiniz");
			break;

		case 'D':
			System.out.println("fena değil : geçtiniz");
			break;

		case 'F':
			System.out.println("Kaldınız");
			break;

		default:
			System.out.println("geçersiz not girdiniz");
		}

	}

}
