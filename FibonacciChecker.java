import java.util.Scanner;

public class FibonacciChecker {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);  // Cria um objeto Scanner para receber entradas do usuário
        System.out.print("Informe um número: ");   // Exibe uma mensagem para o usuário
        int number = scanner.nextInt();            // Lê o número digitado pelo usuário
        boolean isFibonacci = isFibonacci(number); // Chama a função isFibonacci para verificar se o número pertence à sequência de Fibonacci
        System.out.println("O número " + number + (isFibonacci ? " pertence" : " não pertence") + " à sequência de Fibonacci.");
    }

    static boolean isFibonacci(int num) {
        int a = 0, b = 1;                          // Inicia os dois primeiros números da sequência de Fibonacci (0 e 1)
        while (b < num) {                          // Continua o loop até que b (um número de Fibonacci) seja igual ou maior que o número fornecido
            int temp = b;                          // Armazena temporariamente o valor de b
            b = a + b;                             // Calcula o próximo número da sequência somando os dois anteriores
            a = temp;                              // Atualiza o valor de a para o valor anterior de b
        }
        return b == num;                           // Retorna true se o número for igual a b (pertence à sequência), ou false se não for
    }
}
