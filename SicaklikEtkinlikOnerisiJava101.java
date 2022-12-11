import java.util.Scanner;

public class SicaklikEtkinlikOnerisiJava101 {
    public static void main(String[] args) {
        int heat;
        Scanner input =new Scanner(System.in);
        System.out.print("Lütfen sıcaklığı giriniz");
        heat = input.nextInt();
        if (heat<5){
            System.out.println("Kayak Yapabilirsiniz");

        }
        if ( heat >=5 && heat<=15) {
            System.out.println("Sinemaya gidebilirsiniz");

        }
        if (heat>= 10 && heat <=25) {
            System.out.println("Pikniğe Gidebilirsiniz");

        }
        if (heat>25){
            System.out.println("Yüzmeye Gidebilirsiniz");
        }
    }
}
