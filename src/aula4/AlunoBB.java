package aula4;


import java.io.Serializable;
import java.util.Vector;

import javax.annotation.PostConstruct;
import javax.enterprise.context.SessionScoped;
import javax.inject.Inject;
import javax.inject.Named;

@Named("alunoBB")
@SessionScoped
public class AlunoBB implements Serializable {
	/**
	 * 
	 */
	private static final long serialVersionUID = 6623271179313349482L;
	private Vector<Aluno> alunos;
	@Inject
    private Aluno aluno;

    @PostConstruct
    public void init() {
        this.alunos = new Vector<Aluno>();
		this.aluno = new Aluno();
        
    }

	public Vector<Aluno> getAlunos() {
		return alunos;
	}

	public void setAlunos(Vector<Aluno> alunos) {
		this.alunos = alunos;
	}

	public Aluno getAluno() {
		return aluno;
	}

	public void setAluno(Aluno aluno) {
		this.aluno = aluno;
	}
	
	public String addAluno() {
		this.alunos.add(aluno);
		aluno = new Aluno();
		return "resposta";
	}
	
	public void remover(Aluno a) {
		System.out.println(a.getRa());
		this.alunos.remove(a);
	}
	
	public String alterar(Aluno a) {
		try {
			this.aluno = (Aluno)a.clone();
		} catch (CloneNotSupportedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return "edit";
	}
    
	public String alterar_aluno(Aluno a) {
		for (Aluno aluno : alunos) {
			if	(aluno.getRa().compareToIgnoreCase(a.getRa()) == 0) {
				aluno = a;
				this.aluno = new Aluno();
			}
		}
		return "resposta";
	}
}
