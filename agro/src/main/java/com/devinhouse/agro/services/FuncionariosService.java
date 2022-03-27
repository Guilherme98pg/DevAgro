package com.devinhouse.agro.services;

import com.devinhouse.agro.repositories.FuncionariosRepository;
import org.springframework.stereotype.Service;

@Service
public class FuncionariosService {
    final FuncionariosRepository funcionariosRepository;

    public FuncionariosService(FuncionariosRepository funcionariosRepository) {
        this.funcionariosRepository = funcionariosRepository;
    }
}
