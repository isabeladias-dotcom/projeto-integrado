public class Thermoguard extends Produto {

    private int quantidadeSensores;

    Thermoguard(String nome, int quantidade, String statusAtual, int quantidadeSensores) {
        super(nome, quantidade, statusAtual);

        if (quantidadeSensores <= 0) {
            System.out.println("Quantidade de sensores invalido");
            return;
        }
        this.quantidadeSensores = quantidadeSensores;

    }

    public int getQuantidadeSensores() {
        return quantidadeSensores;
    }

    @Override
    public String tipo() {
        return "Thermoguard";
    }

    @Override
    public String detalhes() {
        return "Caracteristicas - Quantidade de Sensores:" + quantidadeSensores;
    }
}
