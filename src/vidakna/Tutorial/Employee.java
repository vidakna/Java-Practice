package Tutorial;
public class Employee {
    
        private int employeeId;
        private String employeeName;
        private double basicSalary;
        
   
        public int getEmployeeId() {
            return employeeId;
        }
        public void setEmployeeId(int employeeId) {
            this.employeeId = employeeId;
        }
        public String getEmployeeName() {
            return employeeName;
        }
        public void setEmployeeName(String employeeName) {
            this.employeeName = employeeName;
        }
        public double getBasicSalary() {
            return basicSalary;
        }
        public void setBasicSalary(double basicSalary) {
            this.basicSalary = basicSalary;
        }
        
        
    }
 class testt{
    public static void main(String args[]) {
		
       
                Employee emp = new Employee();
                
       
                emp.setEmployeeId(20);
                emp.setEmployeeName("perera");
                emp.setBasicSalary(20000.00);
                
       
                System.out.println("Employee Id : " + emp.getEmployeeId());
                System.out.println("Employee Name : " + emp.getEmployeeName());
                System.out.println("Employee basic salary : " + emp.getBasicSalary());
            }
}
