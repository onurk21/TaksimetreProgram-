import java.util.Scanner;
public class taksimetre {
    
    public static void main(String[] args) {
        
        int km1;
        double km =2.20;
        int acilis=10;
        int dusuktutar=20;
    
    
        
        Scanner girdi = new Scanner(System.in);
        System.out.print("KM giriniz:");
        km1 =girdi.nextInt();

        double kmhesap= (km1*km)+acilis;
        double hesap= kmhesap<dusuktutar ? dusuktutar:(km1*km)+acilis;
        System.out.println("Ödemeniz gereken ücret: "+hesap);





}
}