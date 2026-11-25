import java.awt.Dimension;
import java.awt.Toolkit;

public class ResulucaoDoSistema {

    public static void main(String[] args) {
    Toolkit kit = Toolkit.getDefaultToolkit();
    Dimension dimensao = kit.getScreenSize();
    System.out.print("Eis aqui sua dimensao: ");
    System.out.println(dimensao.width + "x" +dimensao.height);

    }

}
