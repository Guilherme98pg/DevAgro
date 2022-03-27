package com.devinhouse.agro.repositories;

import com.devinhouse.agro.models.Grao;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface GraoRepository extends JpaRepository<Grao, Long> {
}
