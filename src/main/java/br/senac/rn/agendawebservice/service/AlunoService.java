package br.senac.rn.agendawebservice.service;

import br.senac.rn.agendawebservice.dao.AlunoDao;
import br.senac.rn.agendawebservice.model.Aluno;
import java.util.List;
import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

@Path("/aluno")
public class AlunoService {

    private AlunoDao dao = new AlunoDao();
    
    public void salvar() {}
    
    public void editar() {}
    
    public void excluir() {}
    
    public Aluno buscarPorMatricula() { return null; }
    
    @GET
    @Path("/todos")
    @Produces({MediaType.APPLICATION_JSON})
    public List<Aluno> buscarTodos() { 
        return dao.selectAll();
    }
    
}
