by José Júnior

Atividade de Estrutura de Dados.

#Descrição da atividade:

* O quê você irá fazer
Implemente uma estrutura de dados Árvore binária em sua linguagem de programação de escolha (Java, C#, GoLang, Python, Javascript, PHP, C++, C, Swift, Portugol). Em seguida, demonstre como percorrê-la em ordem, adicionar elementos e encontrar elementos seguindo as regras de ordenação da árvore. Para a demonstração, crie uma árvore binária com pelo menos cinco elementos e execute as operações de percurso em ordem, adição e pesquisa de elementos. Certifique-se de que a árvore permaneça válida e organizada após cada operação realizada com pequenos testes.

* Detalhamento
Escolha uma linguagem de programação e crie a definição da Classe que representa uma Árvore Binária, com os atributos e construtor. Faça um pequeno teste para ver se é possível criar uma Árvore com alguns elementos pré-definidos (insira valores de acordo com as regras de ordenação da árvore). Crie uma função que percorra escrevendo na tela os valores da Árvore em ordem, que deverá visitar primeiro o filho esquerdo, percorrer o nó atual e, por fim, o filho direito. Teste a função para garantir que ela percorre todos os elementos da árvore em ordem crescente para diferentes valores iniciais.

Criar uma função para adicionar elementos na Árvore um a um, porém ainda mantendo a propriedade de que dado um nó da árvore, descendentes à esquerda são sempre menores que descendentes à direita. Teste a função escrevendo na tela seu conteúdo após as inserções, utilizando a função de percorrer a árvore, para verificar que realmente está em ordem.

Crie uma função para encontrar um elemento da Árvore. Teste se as operações de pesquisa realmente funcionam, por procurar valores e verificar se eles são ou não encontrados comparado com o conteúdo da árvore.

* Dicas
Utilize duas classes, Uma classe para representar cada elemento da árvore, contendo informações como o seu valor e as referências para seus filhos esquerdo e direito, Porém outra classe para representar a Árvore em si, possuindo apenas uma referência para a raiz.
Para adicionar um novo elemento na árvore, comece pela raiz e desça pelos filhos recursivamente até encontrar o lugar correto de inserção, seguindo as regras de ordenação.
Para encontrar um elemento da árvore, a lógica é parecida com adicionar um novo elemento na árvore.
Utilize a recursão para percorrer a árvore em ordem, criando uma função que receba um nó e chame a si mesma para o filho esquerdo, o próprio nó e o filho direito, nessa ordem.
Se você está tendo dificuldades em implementar uma Árvore Binária, aqui estão cinco pontos importantes que podem ajudá-lo a avançar:

Entenda como funciona uma Árvore Binária: é importante que você tenha uma boa compreensão do conceito e das regras de ordenação de uma Árvore Binária. Isso inclui entender como os nós são organizados, a importância da ordem dos elementos e como inserir e remover elementos de maneira adequada.
Escolha a linguagem certa: certifique-se de escolher uma linguagem de programação que você esteja confortável com e que seja adequada para a tarefa. Algumas linguagens podem ser mais fáceis de usar para trabalhar com árvores do que outras.
Planeje a implementação: é importante planejar sua implementação antes de começar a escrever código. Faça um esboço da estrutura da árvore e das funções que você precisará criar. Considere quais operações precisará realizar na árvore e como implementá-las.
Comece com pequenos passos: tente implementar a Árvore Binária em etapas pequenas e gerenciáveis. Comece criando um nó e adicionando elementos simples manualmente, antes de avançar para a implementação completa da árvore.
Sobre o envio

Deve enviar preferencialmente como arquivos fonte do código em Java, não é necessário comprimir em .zip para enviar vários arquivos, apenas arraste os aquivos. Não copie e colo o código, utilize a seção "Texto Online" apenas para comunicar alguma observação.

Não será aceito se for enviado como PDF, nem Print da Tela ou Foto do monitor.