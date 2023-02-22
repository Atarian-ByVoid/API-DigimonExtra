package com.planotatico.digimonextra.digimon.resources;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.planotatico.digimonextra.digimon.digimon_repository.DigimonRepository;
import com.planotatico.digimonextra.digimon.domain.Digimon;

import org.springframework.web.bind.annotation.RequestMethod;

@RestController
@RequestMapping(value = "/digimon")
public class DigimonResources {

    @Autowired
    private DigimonRepository digimonRepository;

    @RequestMapping(method = RequestMethod.GET)
    public List<Digimon> listar() {
        return digimonRepository.findAll();
    }

    @RequestMapping(value = "/{id}", method = RequestMethod.GET)
    public Digimon buscaId(@PathVariable("id") Long id) {
        return digimonRepository.findById(id).orElse(null);
    }

    @RequestMapping(method = RequestMethod.POST)
    public void inserir(@RequestBody Digimon digimon) {
        digimonRepository.save(digimon);
    }

    @RequestMapping(value = "/{id}", method = RequestMethod.DELETE)
    public void deletar(@PathVariable("id") Long id) {
        digimonRepository.deleteById(id);
    }

    @RequestMapping(value = "/{id}", method = RequestMethod.PUT)
    public void atualizar(@PathVariable("id") Long id, @RequestBody Digimon digimon) {
        digimonRepository.save(digimon);
        digimon.setId(id);
    }

}
