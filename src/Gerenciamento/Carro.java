package Gerenciamento;

public class Carro extends Veiculos{
    private Double combustivel;
    private String quilometragem;

    public Carro(String marca, String modelo, int ano, Double preço, String quilometragem, Double combustivel) {
        super(marca, modelo, ano, preço);
        this.quilometragem = quilometragem;
        this.combustivel = combustivel;
    }

    public Double getCombustivel() {
        return combustivel;
    }

    public void setCombustivel(Double combustivel) {
        this.combustivel = combustivel;
    }

    public String getQuilometragem() {
        return quilometragem;
    }

    public void setQuilometragem(String quilometragem) {
        this.quilometragem = quilometragem;
    }

    @Override
    public String toString() {
        return "Carro{" +
                "combustivel='" + combustivel + '\'' +
                ", quilometragem=" + quilometragem +
                '}';
    }
}
