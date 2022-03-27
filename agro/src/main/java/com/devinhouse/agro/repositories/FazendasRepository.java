package com.devinhouse.agro.repositories;

import com.devinhouse.agro.models.Empresas;
import com.devinhouse.agro.models.Fazendas;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface FazendasRepository extends JpaRepository   <Fazendas, Long>{

    List<Fazendas> findAllByempresa_id(Long id);

    Long countByEmpresa(Empresas empresa);
}
