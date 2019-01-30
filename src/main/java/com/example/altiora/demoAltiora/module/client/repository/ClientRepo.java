package com.example.altiora.demoAltiora.module.client.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.altiora.demoAltiora.module.client.entity.Client;

@Repository
public interface ClientRepo extends JpaRepository<Client,Integer> {

}
