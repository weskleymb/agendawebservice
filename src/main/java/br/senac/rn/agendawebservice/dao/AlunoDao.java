package br.senac.rn.agendawebservice.dao;

import br.senac.rn.agendawebservice.model.Aluno;
import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

public class AlunoDao {
    
    private final EntityManagerFactory factory;   
    private final EntityManager manager;

    public AlunoDao() {
        factory = Persistence.createEntityManagerFactory("ConexaoDB");
        manager = factory.createEntityManager();
    }

    public void insert(Aluno aluno) {
        change(Operacao.INSERIR, aluno);
    }
    
    public void delete(Aluno aluno) {
        change(Operacao.DELETAR, aluno);
    }
    
    public void update(Aluno aluno) {
        change(Operacao.ATUALIZAR, aluno);
    }
    
    private void change(Operacao operacao, Aluno aluno) {
        manager.getTransaction().begin();
        switch(operacao) {
            case INSERIR:
                manager.persist(aluno);
                break;
            case DELETAR:
                manager.remove(aluno);
                break;
            case ATUALIZAR:
                manager.merge(aluno);
                break;
        }
        manager.getTransaction().commit();
        manager.close();
    }
    
    public Aluno selectByMatricula(Integer matricula) {
        return manager.find(Aluno.class, matricula);
    }
    
}
