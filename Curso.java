public class Curso {

  // Atributos da classe Curso

  private String nomeCurso; // Nome do curso

  private int cargaHoraria; // Carga horária do curso em horas

  private Professor professor; // Professor responsável pelo curso


  // Construtor da classe Curso

  public Curso(String nomeCurso, int cargaHoraria, Professor professor) {

      this.nomeCurso = nomeCurso; // Inicializa o nome do curso

      this.cargaHoraria = cargaHoraria; // Inicializa a carga horária

      this.professor = professor; // Inicializa o professor responsável

  }


  // Método getter para obter o nome do curso

  public String getNomeCurso() {

      return nomeCurso; // Retorna o nome do curso

  }


  // Método para exibir os dados do curso

  public void exibirDados() {

      // Exibe informações do curso no console

      System.out.println("Curso: " + nomeCurso + ", Carga Horária: " + cargaHoraria + ", Professor: " + professor.getNome());

  }

}