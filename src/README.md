## 1. SRP (Princípio da Responsabilidade Única)

Cada classe do projeto possui uma responsabilidade única e bem definida:
- **Aluno**: Responsável apenas por armazenar os dados do aluno.
- **ServicoVerificacaoAluno**: Responsável por verificar a existência do aluno.
- **ServicoVerificacaoDebito**: Responsável por verificar se o aluno possui débitos.
- **Emprestimo**: Responsável por registrar o empréstimo e calcular a data de devolução.
- **ServicoEmprestimo**: Responsável por orquestrar o processo de empréstimo, delegando as responsabilidades para as classes apropriadas.

## 2. OCP (Princípio do Aberto/Fechado)

As classes estão abertas para extensão e fechadas para modificação:
- **VerificadorExemplarLivro** é uma interface, permitindo criar novas regras de verificação de exemplares sem modificar as classes existentes.
- Novas regras de cálculo de devolução podem ser implementadas criando novas classes que implementam a interface **CalculadoraDataDevolucao**.

## 3. LSP (Princípio da Substituição de Liskov)

As subclasses e implementações podem ser utilizadas no lugar de suas superclasses/interfaces sem alterar o funcionamento do sistema:
- Qualquer classe que implemente **VerificadorExemplarLivro** ou **CalculadoraDataDevolucao** pode ser utilizada normalmente pelo sistema.

## 4. ISP (Princípio da Segregação de Interface)

As interfaces do projeto são específicas e não forçam a implementação de métodos desnecessários:
- **VerificadorExemplarLivro** e **CalculadoraDataDevolucao** possuem apenas os métodos essenciais para suas funções.

## 5. DIP (Princípio da Inversão de Dependência)

As classes de alto nível dependem de abstrações, não de implementações concretas:
- **ServicoEmprestimo** recebe as dependências por meio do construtor, utilizando interfaces ao invés de classes concretas, facilitando a extensão e a manutenção do código.
