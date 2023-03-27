package ProvaDeConhecimento;
public class Questao5 {

    public static void main(String[] args) {
    	
//    	aqui eu declarei as variaveis vouEntrar passando o valor 
//    	inicial da String e a strInvertida recebendo o metodo statico e recebendo como parametro 
//    	ô valor inicial que é no caso ô "vouEntrar"
     
    	String vouEntrar = "odatartnoc uotsE";
        String strInvertida = inverteString(vouEntrar);
        System.out.println(strInvertida);
    }
// Criei um metodo static onde o mesmo recebe um paramêtro de entrada e criei uma condição para testar
// se o tamanho da variavel "vouEntrar" é vazia.
    public static String inverteString(String vouEntrar) {
        if (vouEntrar.length() == 0) { 
            return "";
//     se não for vazia ele vai entrar no else, onde declarei algumas variaveis. 
//     primeiroChar recebe o chart que pega o primeiro caracter da String
//     o restoDaString pega o resto da Strig
//     e a stringIvertida recebe o metodo inverterString vai pegando o resto da string.
//     e por ultimo o rerturn que vai retornar a string invertida mais o primeirochar
//            que no caso é o primeiro caracter
        } else {
            char primeiroChar = vouEntrar.charAt(0);
            String restoDaString = vouEntrar.substring(1);
            String stringInvertida = inverteString(restoDaString);
            return stringInvertida + primeiroChar;
        }
    }
}
