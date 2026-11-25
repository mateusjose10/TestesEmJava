import java.util.Locale;

public class LinguagemDoSistema {

    public static void main(String[] args) {
        Locale linguagem = Locale.getDefault();
        System.out.print("Sua linguagem: ");
        System.out.println(linguagem.getDisplayLanguage());
    }
}