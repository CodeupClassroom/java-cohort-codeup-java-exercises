package InhertanceAndPolymorphism;

public class Manager extends Employee{
    public Manager(String managerName, String managerTitle){
        super(managerName, managerTitle);
    }

    @Override // intention
    public String work(){
        return "managing employees";
    }

    public static void main(String[] args) {
        Manager x = new Manager("John", "awesome manager");

        System.out.println("[Manager Class] manager x's name is:" + x.name + " and their job title is: " + x.jobTitle);

        x.doWork(x);

        Manager manager = new Manager("John", "question master");
        System.out.println(manager.work());
        manager.work(); // managing employees
    }
}
