package Gerenciamento;

public class Carro extends Veiculos{
    private String combustivel;
    private Double quilometragem;

    public Carro(String marca, String modelo, int ano, Double preço, Double quilometragem, String combustivel) {
        super(marca, modelo, ano, preço);
        this.quilometragem = quilometragem;
        this.combustivel = combustivel;
    }

    public String getCombustivel() {
        return combustivel;
    }

    public void setCombustivel(String combustivel) {
        this.combustivel = combustivel;
    }

    public Double getQuilometragem() {
        return quilometragem;
    }

    public void setQuilometragem(Double quilometragem) {
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
