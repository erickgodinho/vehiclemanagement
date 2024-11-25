package Gerenciamento;

public class Moto extends Veiculos{
    private int cilindradas;
    private Double potenciaMax;

    public Moto(String marca, String modelo, int ano, Double preço, int cilindradas, Double potenciaMax) {
        super(marca, modelo, ano, preço);
        this.cilindradas = cilindradas;
        this.potenciaMax = potenciaMax;
    }

    public int getCilindradas() {
        return cilindradas;
    }

    public void setCilindradas(int cilindradas) {
        this.cilindradas = cilindradas;
    }

    public Double getPotenciaMax() {
        return potenciaMax;
    }

    public void setPotenciaMax(Double potenciaMax) {
        this.potenciaMax = potenciaMax;
    }

    @Override
    public String toString() {
        return "Moto{" +
                "cilindradas=" + cilindradas +
                ", potenciaMax=" + potenciaMax +
                '}';
    }
}
