import javax.swing.*; // Importa as classes necessárias para criar a interface gráfica
import java.awt.*; // Importa classes para layout e componentes gráficos
import java.awt.event.ActionEvent; // Importa a classe para manipular eventos de ação
import java.awt.event.ActionListener; // Importa a interface para ouvir eventos de ação
import java.util.ArrayList; // Importa a classe ArrayList para armazenar listas dinâmicas

// Classe principal que estende JFrame para criar uma janela de aplicativo
public class GerenciamentoEstudantil extends JFrame {
    // Listas para armazenar estudantes, professores e cursos
    private ArrayList<Estudante> estudantes = new ArrayList<>();
    private ArrayList<Professor> professores = new ArrayList<>();
    private ArrayList<Curso> cursos = new ArrayList<>();

    // Construtor da classe que configura a janela
    public GerenciamentoEstudantil() {
        setTitle("Sistema de Gerenciamento Estudantil"); // Define o título da janela
        setSize(500, 400); // Define o tamanho da janela
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); // Fecha o aplicativo ao fechar a janela
        setLocationRelativeTo(null); // Centraliza a janela na tela
        createMenu(); // Chama o método para criar o menu
    }

    // Método para criar o menu da aplicação
    private void createMenu() {
        JMenuBar menuBar = new JMenuBar(); // Cria a barra de menu

        // Criação do menu "Aluno"
        JMenu alunoMenu = new JMenu("Aluno");
        JMenuItem cadastrarAluno = new JMenuItem("Cadastrar"); // Item de menu para cadastrar aluno
        JMenuItem consultarAluno = new JMenuItem("Consultar"); // Item de menu para consultar aluno
        alunoMenu.add(cadastrarAluno); // Adiciona os itens ao menu
        alunoMenu.add(consultarAluno);

        // Criação do menu "Professor"
        JMenu professorMenu = new JMenu("Professor");
        JMenuItem cadastrarProfessor = new JMenuItem("Cadastrar"); // Item de menu para cadastrar professor
        JMenuItem consultarProfessor = new JMenuItem("Consultar"); // Item de menu para consultar professor
        professorMenu.add(cadastrarProfessor);
        professorMenu.add(consultarProfessor);

        // Criação do menu "Curso"
        JMenu cursoMenu = new JMenu("Curso");
        JMenuItem cadastrarCurso = new JMenuItem("Cadastrar"); // Item de menu para cadastrar curso
        JMenuItem consultarCurso = new JMenuItem("Consultar"); // Item de menu para consultar curso
        cursoMenu.add(cadastrarCurso);
        cursoMenu.add(consultarCurso);

        // Adiciona os menus à barra de menu
        menuBar.add(alunoMenu);
        menuBar.add(professorMenu);
        menuBar.add(cursoMenu);

        // Define a barra de menu na janela
        setJMenuBar(menuBar);

        // Ações dos menus (definindo o que acontece quando os itens são clicados)
        cadastrarAluno.addActionListener(e -> cadastrarAluno()); // Chama o método para cadastrar aluno
        consultarAluno.addActionListener(e -> consultarAluno()); // Chama o método para consultar aluno
        cadastrarProfessor.addActionListener(e -> cadastrarProfessor()); // Chama o método para cadastrar professor
        consultarProfessor.addActionListener(e -> consultarProfessor()); // Chama o método para consultar professor
        cadastrarCurso.addActionListener(e -> cadastrarCurso()); // Chama o método para cadastrar curso
        consultarCurso.addActionListener(e -> consultarCurso()); // Chama o método para consultar curso
    }

    // Método para cadastrar um aluno
    private void cadastrarAluno() {
        // Criação dos campos de entrada para o cadastro do aluno
        JTextField nomeField = new JTextField();
        JTextField idadeField = new JTextField();
        JTextField matriculaField = new JTextField();

        // Criação de um array de objetos para exibir no diálogo
        Object[] message = {
            "Nome:", nomeField,
            "Idade:", idadeField,
            "Matrícula:", matriculaField
        };

        // Exibe um diálogo para o usuário preencher os dados do aluno
        int option = JOptionPane.showConfirmDialog(null, message, "Cadastrar Aluno", JOptionPane.OK_CANCEL_OPTION);
        if (option == JOptionPane.OK_OPTION) { // Se o usuário clicar em OK
            // Captura os dados inseridos
            String nome = nomeField.getText();
            int idade = Integer.parseInt(idadeField.getText());
            String matricula = matriculaField.getText();
            // Cria um novo objeto Estudante e adiciona à lista
            Estudante aluno = new Estudante(nome, idade, matricula);
            estudantes.add(aluno);
            // Exibe uma mensagem de sucesso
            JOptionPane.showMessageDialog(null, "Aluno cadastrado com sucesso!");
        }
    }

    // Método para consultar alunos cadastrados
    private void consultarAluno() {
        StringBuilder sb = new StringBuilder("Alunos Cadastrados:\n"); // StringBuilder para construir a lista de alunos
        for (Estudante aluno : estudantes) { // Itera sobre a lista de alunos
            sb.append(aluno.getNome()).append(" - ").append(aluno.getMatricula()).append("\n"); // Adiciona o nome e matrícula do aluno
        }
        // Exibe a lista de alunos em um diálogo
        JOptionPane.showMessageDialog(null, sb.toString());
    }

    // Método para cadastrar um professor
    private void cadastrarProfessor() {
        // Criação dos campos de entrada para o cadastro do professor
        JTextField nomeField = new JTextField();
        JTextField idadeField = new JTextField();
        JTextField especialidadeField = new JTextField();

        // Criação de um array de objetos para exibir no diálogo
        Object[] message = {
            "Nome:", nomeField,
            "Idade:", idadeField,
            "Especialidade:", especialidadeField
        };

        // Exibe um diálogo para o usuário preencher os dados do professor
        int option = JOptionPane.showConfirmDialog(null, message, "Cadastrar Professor", JOptionPane.OK_CANCEL_OPTION);
        if (option == JOptionPane.OK_OPTION) { // Se o usuário clicar em OK
            // Captura os dados inseridos
            String nome = nomeField.getText();
            int idade = Integer.parseInt(idadeField.getText());
            String especialidade = especialidadeField.getText();
            // Cria um novo objeto Professor e adiciona à lista
            Professor professor = new Professor(nome, idade, especialidade);
            professores.add(professor);
            // Exibe uma mensagem de sucesso
            JOptionPane.showMessageDialog(null, "Professor cadastrado com sucesso!");
        }
    }

    // Método para consultar professores cadastrados
    private void consultarProfessor() {
        StringBuilder sb = new StringBuilder("Professores Cadastrados:\n"); // StringBuilder para construir a lista de professores
        for (Professor professor : professores) { // Itera sobre a lista de professores
            sb.append(professor.getNome()).append(" - ").append(professor.getEspecialidade()).append("\n"); // Adiciona o nome e especialidade do professor
        }
        // Exibe a lista de professores em um diálogo
        JOptionPane.showMessageDialog(null, sb.toString());
    }

    // Método para cadastrar um curso
    private void cadastrarCurso() {
        // Criação dos campos de entrada para o cadastro do curso
        JTextField nomeCursoField = new JTextField();
        JTextField cargaHorariaField = new JTextField();
        JTextField professorField = new JTextField();

        // Criação de um array de objetos para exibir no diálogo
        Object[] message = {
            "Nome do Curso:", nomeCursoField,
            "Carga Horária:", cargaHorariaField,
            "Professor Responsável:", professorField
        };

        // Exibe um diálogo para o usuário preencher os dados do curso
        int option = JOptionPane.showConfirmDialog(null, message, "Cadastrar Curso", JOptionPane.OK_CANCEL_OPTION);
        if (option == JOptionPane.OK_OPTION) { // Se o usuário clicar em OK
            // Captura os dados inseridos
            String nomeCurso = nomeCursoField.getText();
            int cargaHoraria = Integer.parseInt(cargaHorariaField.getText());
            String nomeProfessor = professorField.getText();

            // Procura o professor correspondente na lista
            Professor professor = null;
            for (Professor p : professores) {
                if (p.getNome().equalsIgnoreCase(nomeProfessor)) { // Compara nomes ignorando maiúsculas/minúsculas
                    professor = p; // Se encontrado, atribui à variável professor
                    break;
                }
            }

            // Se o professor foi encontrado, cria o curso e adiciona à lista
            if (professor != null) {
                Curso curso = new Curso(nomeCurso, cargaHoraria, professor);
                cursos.add(curso);
                // Exibe uma mensagem de sucesso
                JOptionPane.showMessageDialog(null, "Curso cadastrado com sucesso!");
            } else {
                // Se o professor não foi encontrado, exibe uma mensagem de erro
                JOptionPane.showMessageDialog(null, "Professor não encontrado. Curso não cadastrado.");
            }
        }
    }

    // Método para consultar cursos cadastrados
    private void consultarCurso() {
        StringBuilder sb = new StringBuilder("Cursos Cadastrados:\n"); // StringBuilder para construir a lista de cursos
        for ( Curso curso : cursos) { // Itera sobre a lista de cursos
            sb.append(curso.getNomeCurso()).append(" - ").append(curso.getCargaHoraria()).append(" horas\n"); // Adiciona o nome e carga horária do curso
        }
        // Exibe a lista de cursos em um diálogo
        JOptionPane.showMessageDialog(null, sb.toString());
    }

    // Método principal que inicia a aplicação
    public static void main(String[] args) {
        // Executa a criação da interface gráfica na thread de eventos do Swing
        SwingUtilities.invokeLater(() -> {
            GerenciamentoEstudantil frame = new GerenciamentoEstudantil(); // Cria uma nova instância da classe
            frame.setVisible(true); // Torna a janela visível
        });
    }
}