// Classe que representa um professor, que é uma especialização da classe Pessoa
public class Professor extends Pessoa {
  // Atributo específico da classe Professor
  private String especialidade; // Especialidade do professor

  // Construtor da classe Professor
  public Professor(String nome, int idade, String especialidade) {
      super(nome, idade); // Chama o construtor da classe pai (Pessoa) para inicializar nome e idade
      this.especialidade = especialidade; // Inicializa a especialidade do professor
  }

  // Método getter para obter a especialidade do professor
  public String getEspecialidade() {
      return especialidade; // Retorna a especialidade do professor
  }

  // Método sobrescrito para exibir os dados do professor
  @Override
  public void exibirDados() {
      // Exibe informações do professor no console
      System.out.println("Professor: " + nome + ", Idade: " + idade + ", Especialidade: " + especialidade);
  }
}
