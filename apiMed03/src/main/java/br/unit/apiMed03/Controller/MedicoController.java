package br.unit.apiMed03.Controller;

import br.unit.apiMed03.Model.Medico;
import br.unit.apiMed03.Repository.MedicoRepository;
import br.unit.apiMed03.medico.AtualizacaoMedicoDTO;
import br.unit.apiMed03.medico.CadastroMedicoDTO;
import br.unit.apiMed03.medico.ListagemMedicoDTO;
import jakarta.transaction.Transactional;
import jakarta.validation.Valid;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/medicos")
public class MedicoController {
    @Autowired
    private MedicoRepository repository;
    @PostMapping
    @Transactional
    public void cadastrarMedico(@RequestBody @Valid CadastroMedicoDTO dados) {
        repository.save(new Medico(null, dados.nome(), dados.email(), dados.crm(), dados.especialidade()));
    }

    @GetMapping
    public List<ListagemMedicoDTO> listar() {
        return repository.findAll().stream().map(ListagemMedicoDTO::new).toList();
    }

    @PutMapping("/{id}")
    @Transactional
    public void atualizar(@PathVariable Long id, @RequestBody @Valid AtualizacaoMedicoDTO dados) {
        var medico = repository.getReferenceById(id);
        medico.atualizarInformacoes(dados);
    }

    @DeleteMapping("/{id}")
    @Transactional
    public void excluir(@PathVariable Long id) {
        repository.deleteById(id);
    }
}
