package com.factory.rh.Controller;

import com.factory.rh.DTO.WorkerDTO;
import com.factory.rh.Service.IWorkerService;
import org.springframework.web.bind.annotation.*;

import java.util.List;
@CrossOrigin(origins = "http://localhost:4200")
@RestController
@RequestMapping("/worker")
public class WorkerController {


    private IWorkerService workerService;

    public WorkerController(IWorkerService workerService) {
        this.workerService = workerService;
    }

    @GetMapping
    public List<WorkerDTO> findAll() {
        return workerService.findAll();
    }

    @GetMapping("/{id}")
    public WorkerDTO findById(@PathVariable Long id) {
        return workerService.findById(id);
    }

    @PostMapping
    public WorkerDTO add(@RequestBody WorkerDTO workerDTO) {
        return workerService.add(workerDTO);
    }

    @DeleteMapping("/{id}")
    public void delete(@PathVariable Long id) {
        workerService.delete(id);
    }

    @DeleteMapping("/name/{name}")
    public void deleteByName(@PathVariable String name) {
        workerService.deleteByName(name);
    }

    @GetMapping("/role/{role}")
    public List<WorkerDTO> findByRole(@PathVariable String role) {
        return workerService.findByRole(role);
    }

    @GetMapping("/name/{name}")
    public WorkerDTO findByName(@PathVariable String name) {
        return workerService.findByName(name);
    }

    @PutMapping("/{id}")
    public WorkerDTO update(@PathVariable Long id, @RequestBody WorkerDTO workerDTO) {
        return workerService.update(id, workerDTO);
    }
}
