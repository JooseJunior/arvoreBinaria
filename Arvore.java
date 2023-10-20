public class Arvore {
    public Elemento raiz;

    public Arvore(){
        this.raiz = null;
    }

    //Métodos Get e Set para valor
    public Elemento getRaiz() {
        return raiz;
    }

    public void setRaiz(Elemento novaRaiz) {
        this.raiz = novaRaiz;
    }

    public void adicionar (long valor){
        
        Elemento novoElemento = new Elemento(valor);
        if (raiz == null) { //Se for o primeiro item, somente adiciona na raiz
            this.raiz = novoElemento;

        } else{ // A partir do 2 item, preciso organizar tb direita e esquerda
            Elemento valorAtual = this.raiz;
            
            while (true) {
                //Adicionar elemetno a esquerda [menor]
                if (valor < valorAtual.getValor()) {
                    if (valorAtual.getEsquerda() == null) {
                        valorAtual.setEsquerda(novoElemento);
                        break; 
                    } else {
                        valorAtual = valorAtual.getEsquerda();
                    }
                
                //Adicionar elemetno a direita [maior ou igual]
                } else if (valor >= valorAtual.getValor()) {
                    if (valorAtual.getDireita() == null) {
                        valorAtual.setDireita(novoElemento);
                        break;
                    } else {
                        valorAtual = valorAtual.getDireita();
                    }
                }
            }
        }
    }

    public void OrdemCrescente(Elemento valorAtual){
        
        if (valorAtual != null) {
            OrdemCrescente(valorAtual.getEsquerda());
            System.out.println(valorAtual.getValor()); //Após pegar da esquerda já imprime
            OrdemCrescente(valorAtual.getDireita()); 
        }
    }

    public Elemento buscar (long valorProcurado){
       
        //Se não tiver nada na raiz, retorna vazio
        if(raiz == null){
            return null;
        }

        //Se tiver, faz a busca
        Elemento valorAtual = raiz;

        //Só continua pesquisando se ainda não encontrou
        while (valorAtual.valor != valorProcurado) {
            // Se for menor, vai pra esquerda
            if (valorProcurado < valorAtual.valor ) {
                valorAtual = valorAtual.esquerda; 
        
            // Se for maior, vai pra direita
            }else {
                valorAtual = valorAtual.direita;
            }

            //Localizou, sair do while
            if(valorAtual == null){
                return null;
            }
        }

        //valorProcurado localizado com sucesso!
        System.out.println(valorAtual.getValor());
        return valorAtual;
    }
    
    public boolean deletar (long valor) {
        // Buscar elemento na arvore
        Elemento valorAtual = this.raiz;
        Elemento paiAtual = null;

        while (valorAtual != null) {
            if (valor == valorAtual.getValor()) {
                //remover elemento da arvore
                break;
            } else if(valor < valorAtual.getValor()){
                paiAtual = valorAtual;
                valorAtual = valorAtual.getEsquerda();

            } else if(valor >= valorAtual.getValor()){
                paiAtual = valorAtual;
                valorAtual = valorAtual.getDireita();
            }
        }

        // Verifica se existe elemento
        if (valorAtual != null) {

            //Tem filho só a direita: 1 direita e esquerda até o fim
            if (valorAtual.getDireita() != null) {
                //Uma para a direita
                Elemento substituto = valorAtual.getDireita();
                Elemento paiSubstituto = valorAtual;
                
                //Até o fim a esquerda
                while(substituto.getEsquerda() != null){
                    paiSubstituto = substituto;
                    substituto = substituto.getEsquerda();
                }
                
                substituto.setEsquerda(valorAtual.getEsquerda());

                //Remoção do elemento com realocação
                if (paiAtual != null){
                    if(valorAtual.getValor() < paiAtual.getValor()){
                        paiAtual.setEsquerda(substituto);
                    }else{
                        paiAtual.setDireita(substituto);
                    }
                }else{ //Se não tem pai atual, então é a raiz
                    this.raiz = substituto;
                }

            //Tem filho só a esquerda: 1 esquerda e direita até o fim
            }else if (valorAtual.getEsquerda() != null) {
                //Uma para a esquerda
                Elemento substituto = valorAtual.getEsquerda();
                Elemento paiSubstituto = valorAtual;
                
                //Até o fim a direita
                while(substituto.getDireita() != null){
                    paiSubstituto = substituto;
                    substituto = substituto.getDireita();
                }
                
                //Remoção do elemento com realocação
                if (paiAtual != null){
                    
                    if(valorAtual.getValor() < paiAtual.getValor()){
                        paiAtual.setEsquerda(substituto);
                    }else{
                        paiAtual.setDireita(substituto);
                    }
                }else{ //Se não tem pai atual, então é a raiz
                    this.raiz = substituto;
                }

            //Não tem filho
            }else{
                if(valorAtual.getValor() < paiAtual.getValor()){ //Menor
                    paiAtual.setEsquerda(null);
                }else{ //Maior ou Igual
                    paiAtual.setDireita(null);
                }
            }

            return true;
        } else{
            return false;
        }
    }
}
