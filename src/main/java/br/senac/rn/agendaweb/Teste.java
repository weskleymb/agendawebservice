package br.senac.rn.agendaweb;

import br.senac.rn.agendawebservice.dao.AlunoDao;
import br.senac.rn.agendawebservice.model.Aluno;
import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

public class Teste {

    public static void main(String[] args) {

        AlunoDao dao =  new AlunoDao();
        
        Aluno a1 = new Aluno();
        a1.setId(8);
        a1.setNome("Lucio");
        a1.setEndereco("Rua das Flores");
        a1.setFone("9696-4512");
        a1.setSite("www.sitedolucio.com.br");
        a1.setNota(6.0);
        dao.update(a1);
        
        dao.fechar();

        System.exit(0);

    }

}
