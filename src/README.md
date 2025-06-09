## 1. SRP (Princípio da Responsabilidade Única)

Cada classe possui uma responsabilidade única e bem definida:
- **Aluno**: Armazena os dados do aluno.
- **Livro**: Armazena os dados do livro.
- **Item**: Representa um item de empréstimo, associando um livro ao empréstimo.
- **ServicoVerificacaoAluno**: Verifica a existência do aluno.
- **ServicoVerificacaoDebito**: Verifica se o aluno possui débitos.
- **VerificadorExemplarLivro**: Define a regra para identificar se um livro é exemplar da biblioteca.
- **CalculadoraDataDevolucao**: Calcula a data prevista de devolução dos livros.
- **Emprestimo**: Registra o empréstimo e calcula a data de devolução.
- **ServicoEmprestimo**: Orquestra o processo de empréstimo, delegando as responsabilidades para as classes apropriadas.

## 2. OCP (Princípio do Aberto/Fechado)

As classes estão abertas para extensão e fechadas para modificação:
- **VerificadorExemplarLivro** é uma interface, permitindo criar novas regras de verificação de exemplares sem modificar as classes existentes.
- **CalculadoraDataDevolucao** é uma interface, permitindo novas estratégias de cálculo de devolução.
- **ServicoVerificacaoAluno** e **ServicoVerificacaoDebito** podem ser estendidos para novas formas de verificação sem alterar o código existente.

## 3. LSP (Princípio da Substituição de Liskov)

As subclasses e implementações podem ser utilizadas no lugar de suas superclasses/interfaces sem alterar o funcionamento do sistema:
- Qualquer classe que implemente **VerificadorExemplarLivro** ou **CalculadoraDataDevolucao** pode ser utilizada normalmente pelo sistema.
- Novas implementações de **ServicoVerificacaoAluno** ou **ServicoVerificacaoDebito** podem ser usadas sem impactar o funcionamento do empréstimo.

## 4. ISP (Princípio da Segregação de Interface)

As interfaces do projeto são específicas e não forçam a implementação de métodos desnecessários:
- **VerificadorExemplarLivro** e **CalculadoraDataDevolucao** possuem apenas os métodos essenciais para suas funções.
- Cada serviço implementa apenas as interfaces necessárias para sua responsabilidade.

## 5. DIP (Princípio da Inversão de Dependência)

As classes de alto nível dependem de abstrações, não de implementações concretas:
- **ServicoEmprestimo** recebe as dependências por meio do construtor, utilizando interfaces ao invés de classes concretas, facilitando a extensão e a manutenção do código.
- Os serviços de verificação e cálculo podem ser facilmente substituídos por outras implementações, promovendo flexibilidade e desacoplamento.
