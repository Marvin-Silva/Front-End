package com.example.silva.mj.controller;

import java.util.List;

import com.example.silva.mj.model.Evenements;
import com.example.silva.mj.repository.EvenementsRepo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/evenements")
public class EvenementsController {

    @Autowired
    EvenementsRepo vehiculeRepo;

    //recupere de la liste tous les contenus dans la base des donnees
    @GetMapping()
    public List <Evenements> AfficherVoitures(){
        return vehiculeRepo.findAll();
    }

    //Cibler les contenus de la BDD par id
    @GetMapping("/{id}")
    Evenements idsVehicule(@PathVariable(value="id") int id){
        return vehiculeRepo.findById(id);
    }
//     @PostMapping("/index")
//     public List <Evenements> createEvenement(){
//         return vehiculeRepo.findAll();
// }
}