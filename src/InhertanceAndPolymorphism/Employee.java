package InhertanceAndPolymorphism;

public class Employee extends Person{

//    public String jobTitle;

    public Employee(String employeeName, String title){
        super(employeeName);
        this.jobTitle = title;
    }

    public String work(){
        return "filling out reports";
    }

    public void doWork(Employee e){
        System.out.println("EMPLOYEE CLASS] doWork(): " + e.work());
    }


    public static void main(String[] args) {
        Employee y = new Employee("Josef", "software engineer");
//        System.out.println("[Employee Class] employee's y name is:" + y.name + " and their job title is: " + y.jobTitle);
//        y.sayHello();

        y.doWork(y);


    }

}
