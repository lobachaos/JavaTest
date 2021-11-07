package estruturaDeDados.Stack;

public class Pilha {
    private No refNo;

    public Pilha() {
        this.refNo = null;
    }

    public No getRefNo() {
        return refNo;
    }

    public void setRefNo(No refNo) {
        this.refNo = refNo;
    }

    public boolean isEmpty() {
        return refNo == null;
    }

    public No top(No no){
        return refNo;
    }

    public void push(No NovoNo){
        No noAux = refNo;
        refNo = NovoNo;
        refNo.setProximoNo(noAux);
    }

    public void pop(){
        if(!isEmpty())
        refNo = refNo.getProximoNo();
    }

    @Override
    public String toString() {
        No noPrint = refNo;
      String stringRetorno = "";
        while(true){
            if(noPrint != null){
                stringRetorno += noPrint.getConteudo() + " ";
                noPrint = noPrint.getProximoNo();
            }
            else{
                break;
            }
        }
        return stringRetorno;
    }
}
