package AbstractClassesAndInterfaces;

public class Manager extends Employee{

//    @Override
    public String work(){
        return "managing emmployees";
    }

    public Manager(String name, String dept){
        super(name, dept);
    }

    public static void main(String[] args) {
        Employee david = new Manager("david", "sofftware development");
        System.out.println(david.department);

    }
}
