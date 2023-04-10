
public class Main {

	public static void main(String[] args) {
		sayiBulma();
		sayiBulma();
		
	}


    public static void sayiBulma() {
    	int[]  sayilar =new int[] {1,2,4,5,7,10} ;
        int aranacak=0;    
		boolean varMi = false	 ; 
		
		for(int sayi:sayilar) {
		if(sayi==aranacak) {
			varMi=true ;
			break;	
			
		}
	
		}
	if(varMi) {
		mesajVer("Sayı Mevcuttur: "+aranacak);
		
	}else {
		mesajVer("Sayı Mevcut Değildir: "+aranacak);
	}

	}
		
    public static void mesajVer(String mesaj) {
    	System.out.println(mesaj);
    	
    }
	}


