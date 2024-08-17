package com.senacshoes.api.model.medico;

public record DadosListagemMedico(String nome, String email, String crm, Especialidades especialidade) {
   

    public DadosListagemMedico(Medico medico) {
        this(medico.getNome(), medico.getEmail(), medico.getCrm(), medico.getEspecialidade());
    }
    

}
