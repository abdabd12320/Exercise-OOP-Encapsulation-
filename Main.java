import java.util.Scanner;
public class Main{
    public static Scanner in = new Scanner(System.in);
    public static void main(String[] args) {

        Account account1 = new Account("1","Ali",300);
        Account account2 = new Account("2","Ahmed");
        Account account3 = new Account("3","Sami",5000);
        Account account4 = new Account("4","Fady",1500);
        Account account5 = new Account();

        System.out.println(account1.toString());
        System.out.println(account2.toString());
        System.out.println(account3.toString());
        System.out.println(account4.toString());
        System.out.println(account5.toString());

        account5.setId("5");
        account5.setName("Sara");
        account5.credit(200);
        account3.debit(1000);
        account4.transferTo(account2,250);

        System.out.println();
        System.out.println(account1.toString());
        System.out.println(account2.toString());
        System.out.println(account3.toString());
        System.out.println(account4.toString());
        System.out.println(account5.toString());

        System.out.println("-------------------------");

        Employee employee1 = new Employee("1","Ali",7000);
        Employee employee2 = new Employee("2","Ahmed",3000);
        Employee employee3 = new Employee("3","Fady",12500);
        Employee employee4 = new Employee("4","Sami",9500);
        Employee employee5 = new Employee();

        System.out.println(employee1.toString());
        System.out.println(employee2.toString());
        System.out.println(employee3.toString());
        System.out.println(employee4.toString());
        System.out.println(employee5.toString());
        System.out.println("Annual salary of employee5 is " + employee5.getAnnualSalary());

        employee5.setId("5");
        employee5.setName("Sara");
        employee5.setSalary(2300);
        employee5.raisedSalary(5);

        System.out.println();
        System.out.println(employee1.toString());
        System.out.println(employee2.toString());
        System.out.println(employee3.toString());
        System.out.println(employee4.toString());
        System.out.println(employee5.toString());
        System.out.println("Annual salary of employee5 is " + employee5.getAnnualSalary());
    }
}