# 1. SR

- Classe Aluno -> 
Violação: a classe está se responsabilizando por gerenciar dados dos alunos e por verificar
débitos

- Classe Controle -> 
Violação: a classe realiza múltiplas funções, como entrada de dados do aluno, verificação de
aluno e débito, e gerenciamento de livros.

- Classe Empréstimo -> 
Violação: responsável por registrar o empréstimo e calcular a data de devolução.

# 2. OCP

- Classe Livro -> 
Violação: qualquer mudança na regra de verificação de livro exigirá edição direta da classe.

# 5. DIP

- Classes Aluno e Controle -> 
Violação: As classes dependem de instâncias concretas em vez de abstrações.