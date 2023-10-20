public class Main {
    public static void main (String[] args){
        Arvore arvore = new Arvore();

        //Adição de elementos
        arvore.adicionar(10);
        arvore.adicionar(8);
        arvore.adicionar(5);
        arvore.adicionar(9);
        arvore.adicionar(7);
        arvore.adicionar(18);
        arvore.adicionar(13);
        arvore.adicionar(20);

        //Percurso em Ordem
        System.out.println("\nListagem:");
        arvore.OrdemCrescente(arvore.getRaiz());

        //Deletar elementos
        arvore.deletar(20);

        System.out.println("\nListagem:");
        arvore.OrdemCrescente(arvore.getRaiz());

        //Deletar elementos
        arvore.deletar(10);

        System.out.println("\nListagem:");
        arvore.OrdemCrescente(arvore.getRaiz());

        //Buscar elemento
        System.out.println("\nBusca de elemento:");
        arvore.buscar(8);
    }
}
