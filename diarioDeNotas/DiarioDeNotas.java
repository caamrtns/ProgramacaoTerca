import java.util.Scanner;

public class DiarioDeNotas{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Digite 'Aluno' se você for um aluno e 'Professor' se for um professor");
        String usuario = sc.nextLine();

        if(usuario.equalsIgnoreCase("Professor")){
            System.out.println("Digite o seu nome");
            String nome = sc.nextLine();
            System.out.println("Ola Professor(a) " + nome + " seja bem-vindo");
            System.out.println("Digite a primeira nota");
            double n1 = sc.nextDouble();
            System.out.println("Digite a segunda nota");
            double n2 = sc.nextDouble();
            System.out.println("Digite a terceira nota");
            double n3 = sc.nextDouble();
            double somaNotas = n1 + n2 + n3;
            double media = somaNotas/3;
            System.out.println("A soma das notas é: " + somaNotas + " e a média é: " + media);
            if(media>=5 && media<7){
                System.out.println("Aluno tirou R, R passa");
            }
            else if(media>=7 && media<8.5){
                System.out.println("Aluno tirou B, que é uma boa nota");
            }
            else if(media>=8.5){
                System.out.println("Parabéns! Aluno tirou MB e é muito inteligente!!!");
            }
            else{
                System.out.println("Aluno é muito burro tirou I");
            }
        }
        else if(usuario.equalsIgnoreCase("Aluno")){
            System.out.println("Digite seu nome");
            String nome = sc.nextLine();
            System.out.println("Ola Aluno(a) " + nome + " seja bem-vindo");
        }
        else{
            System.out.println("Opção inválida");
        }
        sc.close();
    }
}