import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    
    public static void main(String[] args) {

        Scanner leitor = new Scanner(System.in);
        List<Produto> estoque = new ArrayList<>();
        boolean programaRodando = true;
        while (programaRodando) {


            System.out.println("O que deseja fazer ?");
            System.out.println("1 - Cadastrar produto");
            System.out.println("2 - Ver produtos cadastrados");
            System.out.println("3 - Consultar estoque");
            System.out.println("4 - Encerrar programa");
            String opcao = leitor.nextLine();

            switch (opcao) {
                case "1":
                    System.out.println("Qual o tipo do produto?");
                    System.out.println("1 - Thermoguard");
                    System.out.println("2 - Oxflow");

                    String t = leitor.nextLine();

                    String nome;
                    int quantidade;
                    String status;

                    switch (t) {
                        case "1":

                            System.out.println("Digite o nome do produto a ser cadastrado: ");
                            nome = leitor.nextLine();

                            System.out.println("Digite a quantidade do produto a ser cadastrado: ");
                            quantidade = leitor.nextInt();
                            leitor.nextLine();

                            System.out.println("Qual o status: ");
                            status = leitor.nextLine();

                            System.out.println("Digite a quantidade de sensores: ");
                            int quantidadeSensores = leitor.nextInt();
                            leitor.nextLine();

                            Thermoguard thermoguard = new Thermoguard(nome, quantidade, status, quantidadeSensores);

                            estoque.add(thermoguard);

                            break;
                        case "2":

                            System.out.println("Digite o nome do produto a ser cadastrado: ");
                            nome = leitor.nextLine();

                            System.out.println("Digite a quantidade do produto a ser cadastrado: ");
                            quantidade = leitor.nextInt();
                            leitor.nextLine();

                            System.out.println("Qual o status: (em produção, em estoque ou alugado) ");
                            status = leitor.nextLine();

                            System.out.println("Digite qual o uso do equipamento: (hospitalar ou domiciliar) ");
                            String usoDoEquipamento = leitor.nextLine();

                            Oxflow oxflow = new Oxflow(nome, quantidade, status, usoDoEquipamento);

                            estoque.add(oxflow);

                            break;
                        default:
                            System.out.println("Tipo escolhido inválido");
                            break;
                    }

                    break;

                case "2":

                    if (estoque.isEmpty()) {
                        System.out.println("Nenhum produto em estoque");
                        break;
                    }

                    System.out.println("Produtos cadastrados:");
                    for (Produto p : estoque) {
                        System.out.println("____________________");
                        System.out.println("Produto: " + p.getNome());
                        System.out.println("____________________");
                    }
                    break;

                case "3":

                    if (estoque.isEmpty()) {
                        System.out.println("Nenhum produto em estoque");
                        break;
                    }

                    System.out.println("Produtos cadastrados:");
                    for (Produto p : estoque) {
                        System.out.println("____________________");
                        System.out.println("Produto: " + p.getNome());
                        System.out.println("Tipo: " + p.tipo());
                        System.out.println("Quantidade: " + p.getQuantidade());
                        System.out.println(p.detalhes());
                        System.out.println("____________________");
                    }

                    break;
                case "4":
                    System.out.println("Até mais!");
                    programaRodando = false;
                    break;
                default:
                    System.out.println("Opção inválida, digite novamente.");
            }
        }
        leitor.close();
    }
}

