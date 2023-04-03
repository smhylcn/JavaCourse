
public class Main {

	public static void main(String[] args) {
		String mesaj = "Bugün Hava Çok Güzel";
		System.out.println(mesaj);

		/*System.out.println("Eleman Sayısı: " + mesaj.length());
		System.out.println("5. Eleman : " + mesaj.charAt(4));
		System.out.println(mesaj.concat("Yaşasın!"));
		System.out.print(mesaj.endsWith("l"));
		char[] karakterler = new char[5];
		mesaj.getChars(0, 5, karakterler, 0);
		System.out.println(karakterler);
		System.out.println(mesaj.indexOf("av"));
		System.out.println(mesaj.lastIndexOf("el"));*/
	
	String yeniMesaj = mesaj.replace(' ', '-');
	System.out.println(yeniMesaj);
	System.out.println(mesaj.substring(2,5));
	
	}

}
