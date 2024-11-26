package Gerenciamento;
import javax.swing.JOptionPane;
import java.util.ArrayList;



public class Gerenciamento {
    public static void main(String[] args) {
        ArrayList<Veiculos> veiculos = new ArrayList<>();
        boolean cod = true;

        while (cod){

            String opcao = JOptionPane.showInputDialog(null,"Escolha uma opção:\n " +
                    "  1. Adicionar Carro\n" +
                    "  2. Adicionar Moto\n" +
                    "  3. Adicionar Caminhão\n" +
                    "  4. Listar Veículos\n" +
                    "  5. Sair");



        switch (opcao){

            case "1" ->{

                String marca = JOptionPane.showInputDialog(null,"Digite a marca do carro:");
                String modelo = JOptionPane.showInputDialog(null,"Digite o modelo do carro:");
                int ano = Integer.parseInt(JOptionPane.showInputDialog(null,"Digite o ano do carro:"));
                Double preco = Double.parseDouble(JOptionPane.showInputDialog(null,"Digite o preço do carro:"));
                String combustivel = JOptionPane.showInputDialog(null,"Qual o tipo de combustivel do carro ? ");
                Double quilometragem = Double.parseDouble(JOptionPane.showInputDialog(null,"Quantos quilometros rodados ?"));


                Carro carro = new Carro(marca,modelo,ano,preco,combustivel,quilometragem);
                veiculos.add(carro);
                JOptionPane.showMessageDialog(null,"Carro adicionado");
            }

            case "2" ->{

                String marca = JOptionPane.showInputDialog(null,"Digite a marca da moto:");
                String modelo = JOptionPane.showInputDialog(null,"Digite o modelo da moto:");
                int ano = Integer.parseInt(JOptionPane.showInputDialog(null,"Digite o ano da moto:"));
                Double preco = Double.parseDouble(JOptionPane.showInputDialog(null,"Digite o preço da moto:"));
                int cilindradas = Integer.parseInt(JOptionPane.showInputDialog(null,"Quantas cilindradas tem a moto ?"));
                Double potenciaMax = Double.parseDouble(JOptionPane.showInputDialog(null,"Qual a potencia maxima da moto ? "));



                Moto moto = new Moto(marca, modelo, ano, preco,cilindradas,potenciaMax);
                veiculos.add(moto);
                JOptionPane.showMessageDialog(null,"Moto adicionada");
            }

            case "3" ->{

                String marca = JOptionPane.showInputDialog(null,"Digite a marca do caminhão:");
                String modelo = JOptionPane.showInputDialog(null,"Digite o modelo do caminhão:");
                int ano = Integer.parseInt(JOptionPane.showInputDialog(null,"Digite o ano do caminhão"));
                Double preco = Double.parseDouble(JOptionPane.showInputDialog(null,"Digite o preço do caminhão:"));
                Double capacidade = Double.parseDouble(JOptionPane.showInputDialog(null,"Digite a capacidade de carga (em toneladas)"));
                int numEixos = Integer.parseInt(JOptionPane.showInputDialog(null,"Quantos eixos tem o caminhão "));



                Caminhao caminhao = new Caminhao(marca, modelo, ano, preco, capacidade, numEixos);
                veiculos.add(caminhao);
                JOptionPane.showMessageDialog(null,"Caminhão adicionado");
            }

            case "4" ->{
                if (veiculos.isEmpty()){
                    JOptionPane.showMessageDialog(null,"Nenhum veiculo cadastrado");

            }else{

                StringBuilder listaVeiculos = new StringBuilder("Veiculos cadastrados:\n");
                for(Veiculos v: veiculos){
                    listaVeiculos.append(v.toString()).append("\n");

                }
                JOptionPane.showMessageDialog(null,listaVeiculos.toString());

            }
        }

            case "5" ->{
                cod = false;
                JOptionPane.showMessageDialog(null,"Saindo...");
            }
            default -> JOptionPane.showMessageDialog(null,"Opção invalida");
        }
        }
    }
}
