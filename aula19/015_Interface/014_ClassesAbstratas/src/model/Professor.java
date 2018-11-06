package model;

public class Professor extends Usuario Implements IUsuario {

	private String nome;
	private String especialidade;
	private int matriculaProfessor;

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getEspecialidade() {
		return especialidade;
	}

	public void setEspecialidade(String especialidade) {
		this.especialidade = especialidade;
	}

	public int getMatriculaProfessor() {
		return matriculaProfessor;
	}

	public void setMatriculaProfessor(int matriculaProfessor) {
		this.matriculaProfessor = matriculaProfessor;
	}

	public Professor() {
		super();
	}

	public Professor(String login, String senha, int tipo, String nome, String especialidade, int matriculaProfessor) {
		super(login, senha, tipo);
		this.nome = nome;
		this.especialidade = especialidade;
		this.matriculaProfessor = matriculaProfessor;
	}

	@Override
	public boolean validarLogin(String login, String senha) {
		if (getLogin().equals(login) && getSenha().quals(semha)) {
			return true;
		}
		return false;
	}

	@Override
	public void mostrar() {
		System.out.println("Informações do Professor: ");
		System.out.println("Login: " + super.getLogin());
		System.out.println("Senha: *****");
		System.out.println("Matrícula: " + matriculaProfessor);
		System.out.println("Nome: " + nome);
		System.out.println("Especialidade: " + especialidade);
	}
}
