package br.senac.rn.agendawebservice.model;

import java.io.Serializable;
import static java.lang.Integer.compare;
import java.util.Objects;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "tb_alunos")
public class Aluno implements Serializable, Comparable<Aluno> {
    
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer matricula;
    private String nome;
    private String endereco;
    private String fone;
    private String site;
    private Double nota;

    public Aluno() {}

    public Aluno(String nome, String endereco, String fone, String site, Double nota) {
        this.nome = nome;
        this.endereco = endereco;
        this.fone = fone;
        this.site = site;
        this.nota = nota;
    }

    public Integer getMatricula() {
        return matricula;
    }

    public String getNome() {
        return nome;
    }

    public String getEndereco() {
        return endereco;
    }

    public String getFone() {
        return fone;
    }

    public String getSite() {
        return site;
    }

    public Double getNota() {
        return nota;
    }

    public void setMatricula(Integer matricula) {
        this.matricula = matricula;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public void setEndereco(String endereco) {
        this.endereco = endereco;
    }

    public void setFone(String fone) {
        this.fone = fone;
    }

    public void setSite(String site) {
        this.site = site;
    }

    public void setNota(Double nota) {
        this.nota = nota;
    }

    @Override
    public int hashCode() {
        int hash = 5;
        hash = 23 * hash + Objects.hashCode(this.matricula);
        return hash;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final Aluno other = (Aluno) obj;
        if (!Objects.equals(this.matricula, other.matricula)) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "Aluno{" + "matricula=" + matricula + ", nome=" + nome + ", endereco=" + endereco + ", fone=" + fone + ", site=" + site + ", nota=" + nota + '}';
    }

    @Override
    public int compareTo(Aluno aluno) {
        return compare(this.matricula, aluno.matricula);
    }
    
}
