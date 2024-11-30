Documentação do Sistema de Gerenciamento Estudantil
1. Descrição das Classes

    GerenciamentoEstudantil: Classe principal que estende JFrame e representa a interface gráfica do sistema. Esta classe contém os métodos para criar a interface, gerenciar menus e manipular eventos relacionados a alunos, professores e cursos.

    Estudante: Classe que representa um estudante. Contém atributos como nome, idade e matrícula. Possui métodos para acessar (getters) e manipular esses dados.

    Professor: Classe que representa um professor. Contém atributos como nome, idade e especialidade. Também possui métodos para acessar (getters) e manipular esses dados.

    Curso: Classe que representa um curso. Contém atributos como nome do curso, carga horária e um objeto do tipo Professor que representa o professor responsável pelo curso. Possui métodos para acessar (getters) e manipular esses dados.

2. Modelagem de Dados

    Estudante:
        String nome
        int idade
        String matricula

    Professor:
        String nome
        int idade
        String especialidade

    Curso:
        String nomeCurso
        int cargaHoraria
        Professor professorResponsavel

3. Fluxo do Sistema

    Inicialização: O sistema inicia com a criação da janela principal (GerenciamentoEstudantil), que apresenta um menu com opções para gerenciar alunos, professores e cursos.

    Cadastro: O usuário pode selecionar a opção de cadastrar um aluno, professor ou curso. Um diálogo é exibido solicitando as informações necessárias.

    Consulta: O usuário pode consultar a lista de alunos, professores ou cursos cadastrados. O sistema compila as informações e as exibe em um diálogo.

    Armazenamento: As informações são armazenadas em listas dinâmicas (ArrayList) que permitem a adição e consulta de dados em tempo real.

4. Principais Funcionalidades

    Cadastro de Alunos: Permite que o usuário insira informações sobre novos alunos e os armazene na lista de estudantes.

    Consulta de Alunos: Exibe todos os alunos cadastrados com seus respectivos nomes e matrículas.

    Cadastro de Professores: Permite que o usuário insira informações sobre novos professores e os armazene na lista de professores.

    Consulta de Professores: Exibe todos os professores cadastrados com seus respectivos nomes e especialidades.

    Cadastro de Cursos: Permite que o usuário insira informações sobre novos cursos, incluindo o professor responsável, e os armazene na lista de cursos.

    Consulta de Cursos: Exibe todos os cursos cadastrados com seus respectivos nomes e cargas horárias.
