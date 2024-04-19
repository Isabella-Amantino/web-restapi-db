package ps2.restapidb;

import javax.persistence.*;

@Entity
@Table(name="Disciplinas")
public class Disciplinas {
	@Id @GeneratedValue
	private long id;
	private String nomeDisciplina;
	private int cargaHoraria;
    private int qtdeInscritos;
		
	public Disciplinas() {
		super();
	}

	public long getId() {
		return id;
	}
	public void setId(long id) {
		this.id = id;
	}
	public String getNomeDisciplina() {
		return nomeDisciplina;
	}
	public void setNomeDisciplinas(String nomeDisciplina) {
		this.nomeDisciplina = nomeDisciplina;
	}
	public int getCargaHoraria() {
		return cargaHoraria;
	}
	public void setCargaHoraria(int cargaHoraria) {
		this.cargaHoraria = cargaHoraria;
	}
    public int getQtdeInscritos(){
        return qtdeInscritos;
    }
    public void setQtdeInscritos(int qtdeInscritos){
        this.qtdeInscritos = qtdeInscritos;
    }
    

}