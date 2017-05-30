/**
 * Created by angeloluz on 29/05/17.
 */
package edu.senacrs.repository;

import edu.senacrs.entity.Aluno;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface AlunoRepository extends JpaRepository<Aluno, Long> {

    /**
     * Encontra todos os alunos de um curso
     *
     * @param curso
     * @return lista de livros
     */
    List<Aluno> findByCurso(String curso);

    /**
     * Encontra um aluno pelo seu nome
     *
     * @param nome
     * @return lista de Alunos
     */
    List<Aluno> findByNome(String nome);

    /**
     * Encontra aluno pela matrícula
     *
     * @param matricula
     * @return aluno
     */
    Aluno findByMatricula(String matricula);

}
