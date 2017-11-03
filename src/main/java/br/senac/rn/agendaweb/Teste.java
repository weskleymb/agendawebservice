package br.senac.rn.agendaweb;

import br.senac.rn.agendawebservice.dao.AlunoDao;
import br.senac.rn.agendawebservice.model.Aluno;
import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

public class Teste {

    public static void main(String[] args) {

//        Aluno aluno = new Aluno();
//
//        aluno.setMatricula(2);
//        aluno.setNome("Sobrinho");
//        aluno.setEndereco("Rua das Flores, 75");
//        aluno.setFone("3232-2514");
//        aluno.setSite("www.sitedosobrinho.com.br");
//        aluno.setNota(8.0);

        

        AlunoDao dao =  new AlunoDao();
        
        Aluno aluno = dao.selectByMatricula(2);
        
        dao.delete(aluno);

        System.exit(0);

    }

}
