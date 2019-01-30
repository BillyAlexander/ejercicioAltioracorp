package com.example.altiora.demoAltiora.module.item.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.altiora.demoAltiora.module.item.entity.Item;

@Repository
public interface ItemRepo extends JpaRepository<Item,Integer> {

}
