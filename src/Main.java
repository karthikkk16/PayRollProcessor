class Employee{
    public double calculatePay(int salary) {
        return salary*25;
    }
    public double calculatePay(int hourlyRate,int hoursWorked){
        return hourlyRate*hoursWorked;
    }
}
class Main{
    public static void main(String[] args) {
        Employee employee=new Employee();
        System.out.println(employee.calculatePay(40000));
        System.out.println(employee.calculatePay(3,24));
    }
}