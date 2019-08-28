package model;

/*
 * @author Ester, Maria Isabel e Ryan
 * @date 14/08/2019
 * @version 1.0
 */

/*
 * Objetivo geral da classe é ser um modelo com as funcionalidades exclusivas
 * e as características que somente os carros possuem
 */
public class Carro {
    public String qtdRodas;
    public String qtdPassageiros;
    public String arCondicionado;
    
     /*
     * @param estado: serve para indicar o estado atual do carro
     * @return estado do porta malas
    */
    public static String estadoPortaMalas(String estado){
        return "Porta Malas " + estado;
    }
    //@return colacar cinto
    public static String colocarCinto(){
        return "Cinto Colocado";
    }
    //@return remove o cinto
    public static String removerCinto(){
        return "Cinto Removido";
    }
}
