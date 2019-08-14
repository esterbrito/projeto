package model;

/*
 * @author Ester, Maria Isabel e Ryan
 * @date 14/08/2019
 * @version 1.0
 */

/*
 * Objetivo geral da classe é ser um modelo com as funcionalidades exclusivas
 * e as características que somente as motos possuem
 */
public class Moto {
    public String qtdRodas;
    public String portaMalas;
    public String qtdPassageiros;
    
    //@return empina moto
    public static String empinar(){
        return "Moto empinando";
    }
    //@return usa o capacete
    public static String colocarCapacete(){
        return "Usando capacete";
    }
    //@return remove o capacete
    public static String removerCapacete(){
        return "Capacete removido";
    }
}
