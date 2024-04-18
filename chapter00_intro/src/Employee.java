abstract class Employee {
    abstract void printInfo();

    void companyInfo(){
        System.out.println("employee of PT.mencari cinta sejati");
    }
}

class NewEmployee extends Employee {
    @Override
    void printInfo() {
        String name = "Aldie";
        int age = 77;
        float salary = 600.2F;

        System.out.println(name);
        System.out.println(age);
        System.out.println(salary);
    }
}

class OldEmployee extends Employee {
    @Override
    void printInfo() {
        String name = "putri";
        int age = 44;
        float salary = 500.2F;

        System.out.println(name);
        System.out.println(age);
        System.out.println(salary);
    }
}