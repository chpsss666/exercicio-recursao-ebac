import java.util.Scanner;
import SubindoEscadas.contarManeirasSubDegraus;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("----------FURG, O MATEMATICO COMPULSIVO-----------");
        System.out.println("Furg eh um matematico que passou 13 anos da sua vida dentro de uma faculdade \n" +
                "dedicando seus estudos ao amor de sua vida, a matematica. Apos tanto se aprofundar em todas\n" +
                "as vertentes matematicas e calculos mais absurdos que existem a sua mente nao eh mais a mesma\n" +
                "e qualquer situacao comum do seu cotidiano se torna um desafio matematico complexo, como subir escadas\n" +
                "e quantas maneiras diferentes da para se subir uma escada subindo um ou dois degraus...\n");
        System.out.println("Digite quantos degraus Furg ve a sua frente: ");
        int degraus = sc.nextInt();
        System.out.print("Furg: ");
        new contarManeirasSubDegraus(degraus);

    }
}