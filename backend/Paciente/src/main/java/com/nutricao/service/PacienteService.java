package com.nutricao.service;

import com.nutricao.mapper.PacienteMapper;
import com.nutricao.model.entity.PacienteEntity;
import com.nutricao.model.request.PacienteRequest;
import com.nutricao.model.response.PacienteResponse;
import com.nutricao.repository.PacienteRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class PacienteService {

    @Autowired
    private PacienteRepository pacienteRepository;

    @Autowired
    private PacienteMapper pacienteMapper;

    public PacienteResponse create(PacienteRequest pPaciente) {

        PacienteEntity paciente = pacienteMapper.requestToEntity(pPaciente);

        paciente = pacienteRepository.save(paciente);

        return pacienteMapper.entityToResponse(paciente);
    }
}
