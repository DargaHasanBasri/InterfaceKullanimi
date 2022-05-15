import java.util.Scanner;
public class InterfaceKullanimi {
    // ARAYÜZ
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        final String terminalId = "1290612897312";
        final String parola = "sagdjasgd89632173";

        System.out.print("Tutar giriniz : ");
        double price = input.nextDouble();

        System.out.print("Kart no giriniz : ");
        String cardNumber = input.next();

        System.out.print("Son kullanım tarihi giriniz : ");
        String date = input.next();

        System.out.print("Güvenlik kodunu giriniz : ");
        String cvc = input.next();

        System.out.println("1- A Bankası");
        System.out.println("2- B Bankası");
        System.out.println("3- C Bankası");

        System.out.print("Banka seçiniz : ");
        int selectBank = input.nextInt();

        switch (selectBank) {
            case 1:
                ABankasi aPos = new ABankasi("A Bankası", "12321413233", "gsahgd3268123");
                aPos.connet("127.1.1.1");
                aPos.payment(price,cardNumber,date,cvc);
                break;
            case 2:
                BBankasi bPos = new BBankasi("B Bankası", "2131287361982", "asjkhdasjk63192830");
                bPos.connet("127.1.1.2");
                bPos.payment(price,cardNumber,date,cvc);
                break;
            default:
                System.out.println("Geçerli banka giriniz !");
        }

    }
}
