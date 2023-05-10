import java.util.Scanner; // Matheus Fellipe Dos Santos Lacerda RA: 4231925554
public class provaAUmMatheusLacerda {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.println("Por favor, informe o seu nome: ");
        String nomeFuncionario = scanner.next();
        System.out.println("Agora, por favor informe o seu peso atual (em Kg): ");
        Double pesoAtual = scanner.nextDouble();
        System.out.println("Agora, nos informe a quantidade de água ingerida durante o dia (em litros):  ");
        Double aguaIngerida = scanner.nextDouble();
        
        Double quantidadeIdealDeAgua = Math.ceil((pesoAtual * 35)/1000);
        Double quantidadeAIngerir = quantidadeIdealDeAgua - aguaIngerida;
        
        System.out.println("\nNome: " + (nomeFuncionario));
        System.out.printf("Seu peso atual é: %.0f Kg", pesoAtual);
        System.out.println("\nA quantidade de água ingerida no dia foi de: " + (aguaIngerida) + " Litros");
        System.out.println("A quantidade ideal de água que você deve ingerir é: " + (quantidadeIdealDeAgua) + " Litros");
        
        if (quantidadeAIngerir <= 0)
        System.out.println("Parabéns! Você atingiu a meta de hidratação diária.");
        else
        System.out.println("Continue focado em se hidratar por hoje! Ainda faltam " + quantidadeAIngerir + " Litros");
        scanner.close();
    }
}