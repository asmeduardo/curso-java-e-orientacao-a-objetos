package entities;

import entities.enums.WorkerLevel;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

public class Worker {

    private String name;
    private WorkerLevel level;
    private Double baseSalary;

    private Departament departament;
    private final List<HourContract> contracts = new ArrayList<>();

    public Worker(String name, WorkerLevel level, Double baseSalary, Departament departament) {
        this.name = name;
        this.level = level;
        this.baseSalary = baseSalary;
        this.departament = departament;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public WorkerLevel getLevel() {
        return level;
    }

    public void setLevel(WorkerLevel level) {
        this.level = level;
    }

    public Double getBaseSalary() {
        return baseSalary;
    }

    public void setBaseSalary(Double baseSalary) {
        this.baseSalary = baseSalary;
    }

    public Departament getDepartament() {
        return departament;
    }

    public void setDepartament(Departament departament) {
        this.departament = departament;
    }

    public List<HourContract> getContracts() {
        return contracts;
    }

    public void addContract(HourContract contract) {
        this.contracts.add(contract);
    }

    public void removeContract(HourContract contract) {
        this.contracts.removeIf(c -> c == contract);
    }

    public Double income(Integer month, Integer year) {
        double sum = baseSalary;
        for(HourContract c : contracts){
            int cYear = c.getDate().getYear();
            int cMonth = c.getDate().getMonthValue();

            if(cMonth == month && cYear == year) {
                sum += c.totalValeu();
            }
        }
        return sum;
    }
}
