public class TesteDeModificadores {

    public String atributo;

    public String lancarFoguete() {
        ligarIgnicao();
        desencadearCombustao();
        return "lançado";
    }

    private String ligarIgnicao() {
        return "Ligado";
    }

    private String desencadearCombustao() {
        return "bla";
    }


}
