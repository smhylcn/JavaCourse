
public class Main {

	public static void main(String[] args) {
		String ogrenci1="Semih";
		String ogrenci2="Hazal";
		String ogrenci3="Seda";
		String ogrenci4="Fatma";
		String ogrenci5="Hasan";
		
	    System.out.println(ogrenci1);
	    System.out.println(ogrenci2);
	    System.out.println(ogrenci3);
	    System.out.println(ogrenci4);
	    System.out.println(ogrenci5);
	    
	    System.out.println("------------------------------------------------------");
	    
	    String[] ogrenciler = new String[5];
		ogrenciler[0]="Semih";
		ogrenciler[1]="Hazal";
		ogrenciler[2]="Seda";
		ogrenciler[3]="Fatma";
		ogrenciler[4]="Hasan";
		
		for(int i=0 ; i<ogrenciler.length; i++) {
			System.out.println(ogrenciler[i]);
		}
			
        //  ↓ yukarıdaki for döngüsüyle aynı işlevleri yapıyor.
		for (String ogrenci:ogrenciler) {
			System.out.println(ogrenci);
		}
	}

}
