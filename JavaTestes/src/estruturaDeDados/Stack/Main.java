package estruturaDeDados.Stack;

public class Main {
    public static void main(String[] args) {
        int a = 2 ;
        int b = a;
        System.out.println(a + " " + b);
        a = 3;
        System.out.println(a + " " + b);

        No<String> no = new No<>("123");
        No noDois = no;

        System.out.println(no + "" + noDois);
        no.setConteudo("teste");

        System.out.println(no + "" + noDois);
    }
}
