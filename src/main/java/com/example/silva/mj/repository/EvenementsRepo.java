package com.example.silva.mj.repository;

import java.util.List;

import com.example.silva.mj.model.Evenements;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

//Le repository permet le controller d'éxecuter les commands
// Interface que herite de Jpa qui a pour parametre la base relationnel et son id
@Repository
public interface EvenementsRepo extends JpaRepository<Evenements, Integer>{
    Evenements findById(int id);
    List <Evenements> findAll();
}