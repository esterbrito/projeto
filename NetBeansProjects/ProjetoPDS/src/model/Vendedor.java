package model;

/*
 * @author Ester, Maria Isabel e Ryan
 * @date 14/08/2019
 * @version 1.0
 */

/*
 * Objetivo geral da classe é ser um modelo com as funcionalidades básicas
 * e as características de um vendedor
 */
public class Vendedor {
    public static String nome;
    public static int idade;
    public static String cpf;
    
    //@return o nome do vendedor
    public static String getNome(){
        return "Seu nome é " + nome;
    }
    //@return a idade do vendedor
    public static String getIdade(){
        return "Sua idade é " + idade;
    }
    //@return o cpf do vendedor
    public static String getCpf(){
        return "Seu CPF é " + cpf;
    }
}
