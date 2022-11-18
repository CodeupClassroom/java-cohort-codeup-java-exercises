package AbstractClassesAndInterfaces;

abstract class Employee {
    public abstract String work();
    protected String name;
    protected String department;


//    public Employee(String name, String department) {
//        super();
//    }

    public Employee(String name, String dept){
        System.out.println("employee constructor");
        this.name = name;
        this.department = dept;
    }


    public static void main(String[] args) {
//        Employee tim = new Employee();

//        Employee bob = new Accountant();
//        bob.work();
    }

}

// why not use interfaces insteadd of class?
// can you force an implementation of an abstract class


//let abstract Employee = {
//        name;
//        work;
//}
//
//let timTheEmployee = {
//        name: "Tim",
//        work: function(){"do some work"}
//        }
//
//
//        let saraTheEmployee = {
//        name: "Sara",
//        work: function(){"do some work"}
//        }