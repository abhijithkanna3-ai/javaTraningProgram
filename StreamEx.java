import java.util.List;

class Staff{
    String name;
    String deparment;
    double salary ;
    int age;
    Staff(String name , String  deparment , double salary , int age){
        this.name = name;
        this.deparment = deparment;
        this.salary = salary;
        this.age= age;
    }
    public String getName(){
        return name;
    }
    public String getDev(){
        return deparment;
    }
    public double getSalary(){
        return salary;
    }
    public int getAge(){
        return age;
    }
    @Override
    public String toString(){
        return name + " " + deparment + " " + salary;
    }
}
public class StreamEx {
    public static void main(String [] args){
        List<Staff> list = List.of(new Staff("abi","Dev",123457,21) ,new Staff("ben","Hr",1200000,25),new Staff("tan","support",12000,22));
        List<Staff> Bydev = list.stream().filter((i)->i.getDev().charAt(0)=='D').toList();
        System.out.println(Bydev);
        List<Staff> BySal = list.stream().filter((i)-> i.getSalary()>50000).toList();
        System.out.println(BySal);
        double Sumofsal = list.stream().mapToDouble((n)->n.getSalary()).sum();
        System.out.println(Sumofsal);
        double AvgSal = list.stream().mapToDouble((n)->n.getSalary()).average().orElse(0.0);
        System.out.println(AvgSal);
        long count = list.stream().count();
        System.out.println(count);
    }
}
