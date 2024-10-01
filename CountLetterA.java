import java.util.Scanner;

public class CountLetterA {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);       // Cria um objeto Scanner para ler a entrada do usuário
        System.out.print("Informe uma string: ");       // Exibe uma mensagem solicitando a entrada de uma string
        String input = scanner.nextLine();              // Lê a string digitada pelo usuário
        int count = countLetterA(input);                // Chama a função countLetterA para contar quantas vezes a letra 'a' aparece
        System.out.println("A letra 'a' aparece " + count + " vezes.");
    }

    static int countLetterA(String str) {
        int count = 0;                                  // Inicializa a variável que vai contar as ocorrências da letra 'a'
        for (char c : str.toCharArray()) {              // Itera por cada caractere da string
            if (c == 'a' || c == 'A') {                 // Verifica se o caractere é 'a' ou 'A'
                count++;                                // Se for, incrementa o contador
            }
        }
        return count;                                   // Retorna o total de ocorrências
    }
}
