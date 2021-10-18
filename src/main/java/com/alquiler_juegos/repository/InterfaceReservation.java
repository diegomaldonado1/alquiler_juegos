/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package com.alquiler_juegos.repository;

import com.alquiler_juegos.model.Reservation;
import org.springframework.data.repository.CrudRepository;

/**
 *
 * @author diemal
 */
public interface InterfaceReservation extends CrudRepository<Reservation,Integer> {
    
}
