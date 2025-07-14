// Classe principal para teste
public class Main {
    public static void main(String[] args) {
        iPhone meuIphone = new iPhone("iPhone 15", "Preto", 256);
        
        // Testando funcionalidades
        meuIphone.ligar("123456789");
        meuIphone.tocar();
        meuIphone.exibirPagina();
    }
}