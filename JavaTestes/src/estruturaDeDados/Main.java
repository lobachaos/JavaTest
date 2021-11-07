package estruturaDeDados;

public class Main {
    public static void main(String[] args) {
        No<String> noUm = new No<>("Conteudo01");
        System.out.println(noUm);
        No<Integer> noDois = new No<>(123);
        System.out.println(noDois);
        noUm.setProximoNo(noDois);
        System.out.println(noUm.getProximoNo());

        Pilha pilha = new Pilha();
        pilha.push(new No<>("124"));
        pilha.push(new No<>("567"));
        pilha.push(new No<>(89));
        System.out.println( "pilha --> " + pilha);
    }
}
