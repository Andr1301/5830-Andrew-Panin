package Task1;

/*Вынес подсчет зарплаты в отдельный класс */
public class Salary {

    /**В метод подсчета зарплаты передаем работника
     * @param emp Экземпляр класса Employee
     * @return
     */
    public int calculateNetSalary(Employee emp) {
        int tax = (int) (emp.getBaseSalary() * 0.25);//calculate in otherway
        return emp.getBaseSalary() - tax;
        }
    }
