public class Elemento {

    //Declarando Atributos
    public long valor;
    public Elemento esquerda;
    public Elemento direita;

    //Construtor
    public Elemento (long novoValor){
        this.valor = novoValor;
        this.esquerda = null;
        this.direita = null;
    }

    //Métodos Get e Set para valor
    public long getValor() {
        return valor;
    }

    public void setValor(long novoValor) {
        this.valor = novoValor;
    }

    //Métodos Get e Set para esquerda
    public Elemento getEsquerda() {
        return esquerda;
    }

    public void setEsquerda(Elemento novaEsquerda) {
        this.esquerda = novaEsquerda;
    }

    //Métodos Get e Set para direita
    public Elemento getDireita() {
        return direita;
    }

    public void setDireita(Elemento novaDireita) {
        this.direita = novaDireita;
    }
    
}
