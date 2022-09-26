package com.backend.DEVikings.controller;

import com.backend.DEVikings.model.Empresa;
import com.backend.DEVikings.service.EmpresaService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class EmpresaController {
    @Autowired
    EmpresaService empresaService;

    @GetMapping("/empresas")
    private List<Empresa> verEntrenador(){
        return empresaService.verEmpresa();
    }

    @PostMapping("/empresas")
    private void crearEmpresa(@RequestBody Empresa empresa){
        empresaService.crearYActualizarEmpresa(empresa);
    }

    @DeleteMapping("/empresas/{id}")
    private void eliminarEmpresa(@PathVariable("id") Long id){
        empresaService.eliminarEmpresa(id);
    }

    @GetMapping("/entrenador/{id}")
    private Empresa verEmpresaPorId(@PathVariable("id") Long id){
        return empresaService.verEmpresaPorId(id);
    }

    @PutMapping("/empresas")
    private void editarEntrenador(@RequestBody Empresa entrenador){
        empresaService.crearYActualizarEmpresa(entrenador);
    }

}