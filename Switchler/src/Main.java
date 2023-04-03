
public class Main {

	public static void main(String[] args) {
		char grade = 'F';

		switch (grade) {
		case 'A':
			System.out.println("Mükemmel Geçtiniz.");

			break;
		case 'B':
			System.out.println("Mükemmel Geçtiniz");
		case 'C':
			System.out.println("Geçtiniz");
			break;
		case 'D':
			System.out.println("Şartlı Geçtiniz");
			break;
		case 'F':
			System.out.println("Kaldınız");
			break;
		default:
			System.out.println("Geçersiz harf kodu girdiniz");
		}

	}

}
