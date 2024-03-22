// 1) Переписать код в соответствии с Single Responsibility Principle:
// Подсказка: вынесите метод calculateNetSalary() в отдельный класс

package Task1;

import java.util.Date;

public class Employee {
private String name;
private Date dob;
private int baseSalary;

public Employee(String name, Date dob, int baseSalary) {
this.name = name;
this.dob = dob;
this.baseSalary = baseSalary;
}
/*Добавил геттер для базовой зарплаты */
public int getBaseSalary(){
    return baseSalary;
}

public String getEmpInfo() {
    return "name - " + name + " , dob - " + dob.toString();
}

}
