import java.io.InputStream;
import java.util.Scanner;

public class TesteJiuSimulator {
    public static void main(String[] args) {
        String jiuLogo = "   _ _       _ _ _             \n" +
                "  (_|_)     (_|_) |            \n" +
                "   _ _ _   _ _ _| |_ ___ _   _ \n" +
                "  | | | | | | | | __/ __| | | |\n" +
                "  | | | |_| | | | |_\\__ \\ |_| |\n" +
                "  | |_|\\__,_| |_|\\__|___/\\__,_|\n" +
                " _/ |      _/ |                \n" +
                "|__/      |__/  \n";

        String [] CONTAGEM = {"Um!","Dois!", "Tres!", "Quatro!", "Cinco!", "Seis!", "Sete!", "Oito!", "Nove!", "Dez!"};

        String opcoesAntesDeEntrar = "1 - Entrar correndo no tatame ainda com a faixa desamarrada. \n" +
                                     "2 - Amarrar a faixa, retirar o chinelo apenas quando próximo do tatame, cumprimentar o mestre e entrar no tatame.\n" +
                                     "3 - Chegar descalco do vestiario, amarrar a faixa, cumprimentar o mestre e entrar no tatame\n";

        String opcoesHoraDaLuta =    "1 - Chamar outro faixa branca para lutar. \n" +
                                     "2 - Chamar um faixa preta para lutar.\n" +
                                     "3 - Esperar alguem chamar voce para lutar.\n";
        String enter = "";
        boolean treino = true;
        boolean inicioTreino = true;
        boolean horaDaLuta = false;
        boolean dentroDoTatame = false;
        int escolha;
        Scanner sc = new Scanner(System.in);

        System.out.println(jiuLogo);
        System.out.println("Voce è um faixa branca chegando para o seu primeiro treino! Escolha corretamente!");

        while(treino){

            while(inicioTreino){
                System.out.println();
                System.out.println(opcoesAntesDeEntrar);
                System.out.print("Digite apenas o numero da opcao escolhida e aperte enter:");
                escolha = sc.nextInt();

                switch (escolha) {
                    case 1: {
                        System.out.println("\nMestre: Epaaaa! Pode ir voltando. Amarre a faixa, Cumprimente o mestre e depois entre.");
                        System.out.println("Mestre: Pra garantir que nao vai esquecer.. Paga 10 Burpes!\n");
                        for (String contagem : CONTAGEM) {
                            System.out.println(contagem);
                        }
                        break;
                    }
                    case 2: {
                        System.out.println("\nMestre: Bem vindo ao treino! Oss.\n");
                        dentroDoTatame = true;
                        break;
                    }
                    case 3: {
                        System.out.println("\nMestre: Voce pisaria com o pe sujo desse jeito na sua cama ? Lave o pe e depois retorne");
                        System.out.println("Aluno(voce): Pronto mestre!");
                        System.out.println("Mestre: Pra garantir que nao vai esquecer.. Paga 10 Burpes!\n");
                        for (int cont = 0; cont < CONTAGEM.length; cont++) {
                            System.out.println(CONTAGEM[cont]);
                        }
                        break;
                    }
                    default: {
                        System.out.println("Escolha invalida");
                        break;
                    }
                }

                if (dentroDoTatame) {
                    inicioTreino = false;
                    horaDaLuta = true;
                }
            }

            while(horaDaLuta){
                System.out.println(opcoesHoraDaLuta);
                System.out.print("Digite apenas o numero da opcao escolhida e aperte enter:");
                escolha = sc.nextInt();

                switch (escolha){
                    case 1: {
                        System.out.println("\n!#@$ tic pow!@#$ \n" +
                                           "A luta quase destroi o planeta.\n");
                        treino = false;
                        horaDaLuta = false;
                        break;
                    }
                    case 2: {
                        System.out.println("\n!#@$ tic pow!@#$ \n" +
                                "Apenas um osso no seu corpo nao esta doendo.");
                        System.out.println("Faixa-preta: amanha tem mais se me chamar de novo..\n");
                        treino = false;
                        horaDaLuta = false;
                        break;
                    }
                    case 3: {
                        System.out.println("\nUm faixa preta casca grossa chamou voce para lutar! It`s time!!" +
                                "\n!#@$ tic pow!@#$ \n" +
                                "O faixa preta lutou no seu ritmo e te ensinou diversas tecnicas de acordo com os seus erros durante a luta\n");
                        System.out.println("Faixa-preta: amanha voce sera melhor, padawan! \n");
                        treino = false;
                        horaDaLuta = false;
                        break;
                    }
                }
            }
        }

        System.out.println("Mestre: Bom treino, Equipe! Ateê amanha. Oss");

    }

}

