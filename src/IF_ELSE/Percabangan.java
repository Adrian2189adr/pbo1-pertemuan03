package IF_ELSE;

public class Percabangan {
    public static void main(String[] args) {
        double totalBelanja = 53000;
        double uangDiDompet = 53000;

        if (uangDiDompet<totalBelanja){
            System.out.println("Uang kurang, kerja woi");
        }else if (uangDiDompet>totalBelanja){
            double angsul = uangDiDompet-totalBelanja;
            System.out.println("Uang cukup, kembalian :" +angsul);
        }else {
            System.out.println("Uang pas.. njaluk ceban , gua ganti entar...");
        }
    }
}
