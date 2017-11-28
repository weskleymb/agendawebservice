package br.senac.rn.agendawebservice.service;

import br.senac.rn.agendawebservice.dao.AlunoDao;
import br.senac.rn.agendawebservice.model.Aluno;
import java.util.List;
import javax.ws.rs.Consumes;
import javax.ws.rs.DELETE;
import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.PUT;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

@Path("/aluno")
public class AlunoService {

    private AlunoDao dao = new AlunoDao();
    
    @POST
    @Path("/salvar")
    @Consumes({MediaType.APPLICATION_JSON})
    public void salvar(Aluno aluno) {
        dao.insert(aluno);
    }
    
    @PUT
    @Path("/editar")
    @Consumes({MediaType.APPLICATION_JSON})
    public void editar(Aluno aluno) {
        dao.update(aluno);
    }
    
    @DELETE
    @Path("/remover/{matricula}")
    public void excluir(@PathParam("matricula") Integer id) {
        Aluno aluno = dao.selectById(id);
        dao.delete(aluno);
    }
    
    @GET
    @Path("/matricula/{matricula}")
    @Produces({MediaType.APPLICATION_JSON})
    public Aluno buscarPorMatricula(@PathParam("matricula")  Integer id) { 
        return dao.selectById(id);
    }
    
    @GET
    @Path("/todos")
    @Produces({MediaType.APPLICATION_JSON})
    public List<Aluno> buscarTodos() { 
        return dao.selectAll();
    }
    
}
