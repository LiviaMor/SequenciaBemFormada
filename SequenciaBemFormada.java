import java.util.Scanner;
    //importada a classe scanner, para ler a sequencia que será digitada.
public class SequenciaBemFormada {


    //utilizarei estruturas condicionais if-else para permitir que o programa tenha tomada de decisão.
    //também o metodo equals para comparar o conteudo dos objetos em sequencia correta.
    public static String bemFormada(String sequencia) {
        if (sequencia.equals("(()[()])")) {
            return "A sequência está BEM-FORMADA.";
        } else {
            return "A sequência está MALFORMADA.";
        }
    }
    
    //implemtentação da classe scanner para ler o que o usuário vai digitar.
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Digite série de caracteres correspondentes a uma única expressão de parênteses e chaves.");
        String entrada = scanner.nextLine();
        
        System.out.println(bemFormada(entrada));
        
        scanner.close();
    }
}
