import java.util.List;

class Employee{
    String name;
    double salary ;
    Employee(String name , double salary){
        this.name=name;
        this.salary= salary;
    }

    public String getName(){
        return name;
    }
    public double getSalary(){
        return salary;
    }
    @Override
    public String toString(){
        return name + " " + salary;
    }
}
public class SteamsExample{
    public static void main(String [] args){
        //map 
        List<Integer> numbs = List.of(2,3,4,5,6,7);
        List<Integer> multiplyBy2 = numbs.stream().map((i)->i*2).toList();
        System.out.println(multiplyBy2);
        List<Integer> even = numbs.stream().filter((i)->i%2==0).toList();
        System.out.println(even);
        int total = even.stream().reduce(0, (a,b)-> a+b);
        System.out.println(total);
        List<Employee> employees = List.of(new Employee("Employee1",222222),new Employee("Employee2",33333),new Employee("Employee3", 14));
        List<Employee> highsalary = employees.stream().filter((i)-> i.getSalary()>3000).toList();
        for(int i=0;i<highsalary.size();i++){
            System.out.println(highsalary.toString());
        }
        List<String> result = employees.stream().map((i)->i.getName()).toList();
        System.out.println(result);
    }
}