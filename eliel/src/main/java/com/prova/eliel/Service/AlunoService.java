package com.prova.eliel.Service;

import com.prova.eliel.Model.Aluno;
import com.prova.eliel.Repository.AlunoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class AlunoService {

    @Autowired
    private AlunoRepository alunoRepository;

    public Aluno salvarA(Aluno aluno) {
        return alunoRepository.save(aluno);
    }

    public List<Aluno> listarTodosA() {
        return alunoRepository.findAll();
    }

    public Optional<Aluno> buscarPorIdA(Long id) {
        return alunoRepository.findById(id);
    }

    public Aluno atualizarA(Long id, Aluno alunoAtualizado) {
        return alunoRepository.findById(id).map(aluno -> {
            aluno.setNome(alunoAtualizado.getNome());
            aluno.setMatricula(alunoAtualizado.getMatricula());
            aluno.setStatus(alunoAtualizado.getStatus());
            return alunoRepository.save(aluno);
        }).orElseThrow(() -> new RuntimeException("Produto não encontrado"));
    }

    public void excluirA(Long id) {
        alunoRepository.deleteById(id);
    }
}
