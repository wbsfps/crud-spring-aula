package br.unit.apiMed03.Repository;

import br.unit.apiMed03.Model.Medico;
import org.springframework.data.jpa.repository.JpaRepository;

public interface MedicoRepository extends JpaRepository<Medico, Long> {

}
