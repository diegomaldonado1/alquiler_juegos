/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.alquiler_juegos.repository;


import com.alquiler_juegos.model.Category;
import java.util.List;
import java.util.Optional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

/**
 *
 * @author Diego Maldonado
 */

@Repository
public class RepositoryCategory {
    
  @Autowired
    private InterfaceCategory crud;
    
    public List<Category> getAll(){
        return (List<Category>) crud.findAll();
    }
    public Optional <Category> getCategory(int id){
        return crud.findById(id);
    }
    
    public Category save(Category category){
        return crud.save(category);   
    }
    
    public void delete(Category category){
    crud.delete(category);
    }
    
}
