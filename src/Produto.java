public abstract class Produto {

    private String nome;
    private int quantidade = 0;
    private String statusAtual;

    Produto(String nome, int quantidade, String statusAtual) {
        if (nome == null || nome.isBlank()) {
            System.out.println("Nome incorreto");
            return;
        }
        this.nome = nome;

        if (quantidade <= 0) {
            System.out.println("Quantidade invalido");
            return;
        }
        this.quantidade = quantidade;

        if (statusAtual == null || statusAtual.isBlank()) {
            System.out.println("Status invalido, digite novamente");
            return;
        }
        this.statusAtual = statusAtual;
    }

    public String getNome() {
        return nome;
    }

    public int getQuantidade() {
        return quantidade;
    }

    public String getStatusAtual() {
        return statusAtual;
    }

    public abstract String detalhes();


    public abstract String tipo();
}
