package com.example.ships.repositories;

import com.example.ships.models.ShipClass;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface ClassRepo extends JpaRepository<ShipClass,String> {
    @Query(value = "SELECT * \n" +
            "FROM Classes cl\n" +
            "LEFT JOIN Ships s ON s.class_name = cl.classs\n" +
            "WHERE cl.classs IN (SELECT ship FROM Outcomes WHERE result = ?1) OR\n" +
            "s.name IN (SELECT ship FROM Outcomes WHERE result = ?1)\n" +
            "GROUP BY cl.classs, s.name",nativeQuery = true)
    List<ShipClass> findByBattleResult(String result);
}
