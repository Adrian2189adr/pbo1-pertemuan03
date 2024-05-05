package Switch;

public class Percabangan_Char {
    public static void main(String[] args) {
        char nilai='C';
        switch (nilai){
            case 'A':
                System.out.println("Me       :\"こんにちは\"");
                System.out.println("Evlyn    :\"はい\"");
                break;
            case 'B':
                System.out.println("Me       :\"Привет\"");
                System.out.println("Evlyn    :\"Да\"");
                break;
            case 'C':
                System.out.println("Me       :\"你好\"");
                System.out.println("Evlyn    :\"是的\"");
                break;
            case 'D':
                System.out.println("Me       :\"안녕하세요\"");
                System.out.println("Evlyn    :\"예\"");
                break;
            default:
                System.out.println("Me       :\"Halo\"");
                System.out.println("Evlyn    :\"iya\"");
                break;
        }
    }
}
