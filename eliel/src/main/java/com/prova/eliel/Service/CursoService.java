package com.prova.eliel.Service;

import com.prova.eliel.Model.Curso;
import com.prova.eliel.Repository.CursoRepostory;
import io.swagger.v3.oas.annotations.servers.Server;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;
import java.util.Optional;

@Server
public class CursoService {

    @Autowired
    private CursoRepostory cursoRepository;

    public Curso salvar(Curso curso) {
        return cursoRepository.save(curso);
    }

    public List<Curso> listarTodos() {
        return cursoRepository.findAll();
    }

    public Optional<Curso> buscarPorId(Long id) {
        return cursoRepository.findById(id);
    }

    public Curso atualizar(Long id, Curso cursoAtualizado) {
        return cursoRepository.findById(id).map(curso -> {
            curso.setNome(cursoAtualizado.getNome());
            curso.setCargaHoraria(cursoAtualizado.getCargaHoraria());
            curso.setMatricula(cursoAtualizado.getMatricula());
            return cursoRepository.save(curso);
        }).orElseThrow(() -> new RuntimeException("Produto não encontrado"));
    }

    public void excluir(Long id) {
        cursoRepository.deleteById(id);
    }
}
