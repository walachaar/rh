package com.factory.rh.Service;

import com.factory.rh.DTO.WorkerDTO;


import java.util.List;

public interface IWorkerService {

    List<WorkerDTO> findAll();

    WorkerDTO findById(Long id);

    WorkerDTO add(WorkerDTO WorkerDTO);

    void delete(Long id);

    List<WorkerDTO> findByRole(String role);

    WorkerDTO findByName(String name);

    WorkerDTO update(long id, WorkerDTO WorkerDTO);
    void deleteByName(String name);

}
