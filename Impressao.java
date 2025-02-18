import java.util.Scanner;

public class Impressao {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Aluno a = new Aluno();


        System.out.print("Digite o nome do aluno - ");
        a.nome = sc.nextLine();
        System.out.print("Qual o seu RM - ");
        a.rm = sc.nextInt();
        System.out.print("informe a primeira nota deste aluno - ");
        a.nota1 = sc.nextDouble();
        System.out.print("informe a segunda nota deste aluno - ");
        a.nota2 = sc.nextDouble();

        System.out.println();

        System.out.println("Aluno - " + a.nome +" ( "+ a.rm +" ) " +" com média: " + a.media() + " status - " + a.status());


    }
}