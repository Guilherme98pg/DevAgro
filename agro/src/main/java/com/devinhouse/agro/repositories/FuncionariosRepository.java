package com.devinhouse.agro.repositories;

import com.devinhouse.agro.models.Empresas;
import com.devinhouse.agro.models.Funcionarios;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface FuncionariosRepository extends JpaRepository<Funcionarios, Long> {
}
