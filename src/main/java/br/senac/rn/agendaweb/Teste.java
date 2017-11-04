package br.senac.rn.agendaweb;

import br.senac.rn.agendawebservice.dao.AlunoDao;
import br.senac.rn.agendawebservice.model.Aluno;
import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

public class Teste {

    public static void main(String[] args) {

        AlunoDao dao =  new AlunoDao();
        
        System.out.println(dao.selectAll());

        System.exit(0);

    }

}
