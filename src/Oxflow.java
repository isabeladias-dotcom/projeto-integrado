public class Oxflow extends Produto {

    private String usoDoEquipamento; // domiciliar ou hospitalar


    Oxflow(String nome, int quantidade, String statusAtual, String usoDoEquipamento) {
        super(nome, quantidade, statusAtual);

        if (nome == null || nome.isBlank()) {
            System.out.println("Uso do equipamento invalida");
            return;
        }
        this.usoDoEquipamento = usoDoEquipamento;
    }

    public String getUsoDoEquipamento() {
        return usoDoEquipamento;
    }

    @Override
    public String tipo() {
        return "Oxflow";
    }

    @Override
    public String detalhes() {
        return "Caracteristicas - Uso do equipamento:" + usoDoEquipamento;
    }
}
