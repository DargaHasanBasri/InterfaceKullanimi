public interface IBanka {
    // Interface de yazılan metotlrın içeriği boş olmalıdır

    // Interface de değişken tanımlayabilmek şöyle mümkündür
    // String str = 'sjkghdasd'  (varsayılan değeri olmalı)

    // String str; HATA
    // Interface de varsayılan değeri olmadan değişken tanımlanamaz

    // genelde final değişkenler tanımlanır
    final String hostIpAddress = "127.0.0.1";

    boolean connet(String ipAddress);

    boolean payment(double price, String cardNumber, String date, String cvc);
}
