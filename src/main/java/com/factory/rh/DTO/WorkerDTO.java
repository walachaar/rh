package com.factory.rh.DTO;

import com.factory.rh.model.worker;
import lombok.Data;

@Data
public class WorkerDTO {

    private String name;
    private String phone;
    private String address;
    private String role;
    private String salary;

    public WorkerDTO( String name, String phone, String address, String role, String salary) {

        this.name = name;
        this.phone = phone;
        this.address = address;
        this.role = role;
        this.salary = salary;
    }

    public WorkerDTO() {

    }
    public WorkerDTO(worker worker ){
        this.name = worker.getName();
        this.phone = worker.getPhone();
        this.address = worker.getAddress();
        this.role = worker.getRole();
        this.salary = worker.getSalary();
    }


    public worker toWorker() {
        return new worker(name, phone, address, role, salary);
    }
}
