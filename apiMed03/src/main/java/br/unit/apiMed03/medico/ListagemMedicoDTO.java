package br.unit.apiMed03.medico;

import br.unit.apiMed03.Model.Medico;


public record ListagemMedicoDTO (String nome, String email, String crm, Especialidade especialidade)
{
    public ListagemMedicoDTO(Medico medico) {
        this(medico.getNome(), medico.getEmail(), medico.getCrm(), medico.getEspecialidade());
    }
}
