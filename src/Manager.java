import java.io.Serializable;

class Manager extends Employee implements Serializable{
    private double bonus;

    public Manager(String name, String surname, double salary, Manager manager, double bonus) {
        super(name, surname, salary, manager);
        this.bonus = bonus;
    }

    public void setBonus(double bonus) {
        this.bonus = bonus;
    }

    @Override
    public double getSalary(){
        return this.salary + this.bonus;
    }

    @Override
    public String toString(){
        if(this.manager == null){
            return "Manager №-" + this.id + " Name: " + this.name + " " + this.surname + " Salary: " + this.salary + " " + " " + " " + this.bonus;
        }
        else{
            return "Employeer: " + this.id + " Name: " + this.name + " Surname: " + this.surname + " Salary: " + this.salary + " Manager №-" + this.manager.getId() + " Bonus: " + this.bonus;
        }
    }
}