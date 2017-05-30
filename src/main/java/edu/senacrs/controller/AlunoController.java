package edu.senacrs.controller;
import edu.senacrs.entity.Aluno;
import edu.senacrs.repository.AlunoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import java.util.List;

@Controller
@RequestMapping("/Aluno")
public class AlunoController {

    private AlunoRepository alunoRepository;

    @Autowired
    public AlunoController(AlunoRepository alunoRepository) {
        this.alunoRepository = alunoRepository;
    }

    @RequestMapping(value = "/{curso}", method = RequestMethod.GET)
    public String listaAlunos(@PathVariable("curso") String curso, Model model) {
        List<Aluno> listaAlunos = alunoRepository.findByCurso(curso);
        if (listaAlunos != null) {
            model.addAttribute("alunos", listaAlunos);
        }
        return "listaAlunos";
    }

    @RequestMapping(value = "/{curso}", method = RequestMethod.POST)
    public String adicionaAlunoCurso(@PathVariable("curso") String curso, Aluno aluno) {
        aluno.setCurso(curso);
        alunoRepository.save(aluno);
        return "redirect:/Aluno/{curso}";
    }
}
