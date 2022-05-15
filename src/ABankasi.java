public class ABankasi implements IBanka {
    // interface yi bir sınıfta kullanırken implements anahtar sözcüğü kullanılır
    // interface içerisindeki metotlar implements edilmiş sınıfta da tanımlanmalı

    private String bankaAdi;
    private String terminalId;
    private String parola;

    public ABankasi(String bankaAdi, String terminalId, String parola) {
        this.bankaAdi = bankaAdi;
        this.terminalId = terminalId;
        this.parola = parola;
    }

    @Override
    public boolean connet(String ipAddress) {
        System.out.println("Kullanıcı ip : " + ipAddress);
        System.out.println("Makine ip : " + this.hostIpAddress);
        System.out.println(this.bankaAdi + " Bağlanıldı!");
        return true;
    }

    public boolean payment(double price, String cardNumber, String date, String cvc) {
        // Banka ödeme işlemleri
        System.out.println("Bankadan cevap bekleniyor!");
        System.out.println("İşlem başarılı oldu!");
        return true;
    }

    public String getBankaAdi() {
        return this.bankaAdi;
    }
    public void setBankaAdi(String bankaAdi) {
        this.bankaAdi = bankaAdi;
    }

    public String getTerminalId() {
        return this.terminalId;
    }
    public void setTerminalId(String terminalId) {
        this.terminalId = terminalId;
    }

    public String getParola() {
        return this.parola;
    }
    public void setParola(String parola) {
        this.parola = parola;
    }

}
