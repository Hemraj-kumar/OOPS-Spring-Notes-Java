package streams;
import java.util.*;
public class Main
{
	public static void main(String[] args) {
		// Set<Employee> set = new HashSet<>();
		// set.add(new Employee("Subha","101"));
		// set.add(new Employee("Subha","101"));
		
        // set.stream()
        //   .forEach(x -> System.out.println(x.getName() + " " + x.getId()));	
        List<Employee> emp = new ArrayList<>();
        emp.add(new Employee("Subhashri HemrajKumar",24,99000));
        emp.add(new Employee("Subhashri",24,90000));
        emp.add(new Employee("Subhashri H",24,10000));
        
        List<Integer> ls= new ArrayList<>(Arrays.asList(55,4,55,66,3,46,11,11));
        //salary>50k
         emp.stream().filter(x -> x.getSalary()>50000).map(Employee::getName).forEach(System.out::println);
        //max salary
         emp.stream().max(Comparator.comparing(Employee::getSalary)).map(Employee::getName).ifPresent(System.out::println);
        //salary>50k with desc
        emp.stream().filter(x -> x.getSalary()>50000).sorted(Comparator.comparing(Employee::getSalary).reversed()).map(Employee::getName).forEach(System.out::println);
        
        //average
        emp.stream().filter(x -> x.getSalary()>40000).mapToDouble(Employee::getSalary).average().ifPresent(System.out::println);
        
        //distinct sorted
        ls.stream().distinct().sorted().forEach(System.out::println);
        
        
    }

}
class Employee{
    public String name;
    public int age;
    public double salary;
    
    public String getName() {
        return this.name;
    }
    public void setName(String name){
        this.name = name;
    }
    public int getAge(){
        return this.age;
    } 
    public void setAge(int id){
        this.age = id;
    }
    public void setSalary(double sal){
        this.salary =sal;
    }
    public double getSalary(){
        return this.salary;
    }
    public Employee(String name, int age, double salary){
        this.name = name;
        this.age = age;
        this.salary = salary;
    }
}

