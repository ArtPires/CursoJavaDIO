import java.util.Scanner;

public class Contador {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Digite o primeiro parâmetro");
		int parametroUm = scanner.nextInt();
		System.out.println("Digite o segundo parâmetro");
		int parametroDois = scanner.nextInt();
		try {
			contar(parametroUm, parametroDois);
		
		}catch (ParametrosInvalidosException exception) {
			System.out.println("O parâmetro 1 deve menor que o parâmetro 2");
		}
        scanner.close();
	}
	static void contar(int parametroUm, int parametroDois ) throws ParametrosInvalidosException {
		if (parametroUm > parametroDois){
            throw new ParametrosInvalidosException();
        }
		int contagem = parametroDois - parametroUm;
        System.out.println("A diferença entre os parãmetros é: " + contagem);
        System.out.println("Imprimindo valores de 1 a " + contagem);
        for (int i = 1; i <= contagem; i++){
            System.out.println("Numero: " + i);
        }
	}
}