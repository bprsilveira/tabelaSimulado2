Implemente as classes necessárias para que o teste abaixo, assumindo ausência de erros de sintaxe, exiba na tela os resultados: "É um livro", "É uma caneta" e "É um caderno".


Teste.java:

public class Teste{
public static void main(String[] args){
ArrayList es = new ArrayList();
es.add(new Livro());
es.add(new Caneta());
es.add(new Caderno());

for(Escritorio e: es){

e.mostrar();

}

}

}