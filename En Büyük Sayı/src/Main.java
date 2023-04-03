
public class Main {
    public static void main(String[] args) {

        int sayi1 = 20, sayi2 =20, sayi3= 20;

        if(sayi1 > sayi2 && sayi1>sayi3){
            System.out.println("En büyük sayi :" + sayi1);
        } else if (sayi2>sayi1 && sayi2>sayi3) {
            System.out.println("En büyük sayi :" + sayi2);
        } else if (sayi3>sayi1 && sayi3>sayi2){
            System.out.println("En büyük sayi :" + sayi3);
        }
        else {
        	System.out.println("Tüm Sayılar Birbirine eşittir.");
        }
    }
}
