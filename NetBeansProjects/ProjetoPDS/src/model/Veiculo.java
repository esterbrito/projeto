package model;

/*
 * @author Ester, Maria Isabel e Ryan
 * @date 14/08/2019
 * @version 1.0
 */

/*
 * Objetivo geral da classe é ser um modelo com as funcionalidades básicas
 * e as características que todos os veiculos possuem
 */

public class Veiculo {
    public static String modelo;
    public static String placa;
    public static String cor;
    public static int qtd;
    
    // o construtor da classe faz a contagem automatica da quantidade de veiculo
    public Veiculo(){
        qtd++;
    }
    
    /*
     * @param direcao: serve para indicar a direção atual do veiculo
     * @return direção em que o veiculo está se movimentando
    */
    public static String movimentar(String direcao){
        String nomeDaClasse = String.class.getName();
        return nomeDaClasse + " andando para " + direcao;
    }
    // @return para o carro
    public static String parar(){
        String nomeDaClasse = String.class.getName();
        return nomeDaClasse + " parado";
    }
    /*
     * @param direcao: serve para indicar a direção atual do veiculo
     * @return direção em que o veiculo está enrolando
    */
    public static String enrolar(String direcao){
        String nomeDaClasse = String.class.getName();
        return nomeDaClasse + " enrolando para " + direcao;
    }
}
