class Organiztion {
    void rateoforg() {
        System.out.println("Organization is very good");
    }
}

class Employee extends Organiztion {


    void categoryofemployee() {
        System.out.println("Current employee is ");
    }
}

class Worker extends Employee {
    void Salaryofworker() {
        System.out.println("Salary of worker");
    }
}

class Manager extends Employee {
    void Experienceofmanager() {
        System.out.println("Experience of manager");
    }
}

 class Organizationpravallika {
    public static void main(String args[]) {
        Manager m = new Manager();
        m.categoryofemployee();
        m.rateoforg();
        m.Experienceofmanager();
        Employee e = new Employee();

    }
}