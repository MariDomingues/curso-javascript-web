package com.nutricao.controller;

import com.nutricao.model.request.PacienteRequest;
import com.nutricao.model.response.PacienteResponse;
import com.nutricao.service.PacienteService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/paciente")
public class PacienteController {

    @Autowired
    private PacienteService pacienteService;

    @CrossOrigin
    @PostMapping
    public PacienteResponse create(@RequestBody PacienteRequest pPaciente) {

        return pacienteService.create(pPaciente);
    }
}
