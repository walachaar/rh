package com.factory.rh.Service;

import com.factory.rh.DTO.WorkerDTO;
import com.factory.rh.model.worker;
import com.factory.rh.repository.WorkerRepository;
import jakarta.transaction.Transactional;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service

public class WorkerService implements IWorkerService {
    private final WorkerRepository workerRepository;

    public WorkerService(WorkerRepository workerRepository) {
        this.workerRepository = workerRepository;
    }


    @Override
    public List<WorkerDTO> findAll() {
        List<WorkerDTO> v = new ArrayList<>();

        for (worker w : workerRepository.findAll()) {
            v.add(new WorkerDTO(w));
        }
        return v;
    }

    @Override
    public WorkerDTO findById(Long id) {

        return new WorkerDTO (workerRepository.findById(id).orElseThrow(()-> new RuntimeException("Worker not found")));
    }

    @Override
    public WorkerDTO add(WorkerDTO WorkerDTO) {
        return  new WorkerDTO(workerRepository.save(WorkerDTO.toWorker()));
    }

    @Override
    public void delete(Long id) {
        workerRepository.deleteById(id);
    }

    @Override
    public List<WorkerDTO> findByRole(String role) {
        List<WorkerDTO> v = new ArrayList<>();
        for (worker w : workerRepository.findByRole(role)) {
            v.add(new WorkerDTO(w));
        }
        return v;
    }

    @Override
    public WorkerDTO findByName(String name) {
        return  new WorkerDTO (workerRepository.findByName(name));
    }

    @Override
    public WorkerDTO update(long id, WorkerDTO WorkerDTO) {
         workerRepository.findById(id).ifPresent(w -> {
             w.setName(WorkerDTO.getName());
             w.setPhone(WorkerDTO.getPhone());
             w.setAddress(WorkerDTO.getAddress());
             w.setRole(WorkerDTO.getRole());
             w.setSalary(WorkerDTO.getSalary());
             workerRepository.save(w);
         });
         return  new WorkerDTO (workerRepository.findById(id).orElseThrow(()-> new RuntimeException("Worker not found")));
    }
    @Transactional
    public void deleteByName(String name){
        workerRepository.deleteByName(name);
    }
}
