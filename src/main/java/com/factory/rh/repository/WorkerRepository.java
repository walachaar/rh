package com.factory.rh.repository;

import com.factory.rh.model.worker;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface WorkerRepository extends JpaRepository<worker, Long> {
    List<worker> findByRole(String Role);

    worker findByName(String name);
    void deleteByName(String name);


}
