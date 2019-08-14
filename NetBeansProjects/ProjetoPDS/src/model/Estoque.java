package model;

/*
 * @author Ester, Maria Isabel e Ryan
 * @date 14/08/2019
 * @version 1.0
 */

/*
 * Objetivo geral da classe é ser um modelo com as funcionalidades de um estoque
 * para gerenciamento e controle de produtos
 */
public class Estoque {
    
    //@return quantidade total de veiculos
    public static String qtdProdutos(){
        return "Temos " + Veiculo.qtd + " produtos";
    }
    //@returm quais os produtos disponiveis
    public static String produtos(){
        return "Carros e Motos";
    }
    /*
     * @param veiculo que mostra qual o valor de determinado veiculo
     * @return o preço da moto ou do carro
    */
    public static String getPreco(String veiculo){
        if(String.class.getName().equals("Moto")){
            return "O preço é 30.000";
        }
        if(String.class.getName().equals("Carro")){
            return "O preço é 10.000";
        }
        return "";
    }
    
}
