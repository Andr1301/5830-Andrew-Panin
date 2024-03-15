package Controllers;

import java.util.Comparator;
import java.util.List;

import Domain.Person;
import Domain.Student;
import Domain.Teacher;
import Domain.PersonComparator;

public class AccountController {

    public static <V extends Person> void print(List<V> group) {
        for(V s : group)
        {
            System.out.println(s);
        }
    }

    /**Метод, сортирующий и печатающий список персон. Объединяет метод сортировки, который на семинаре писался для каждого класса отдельно, и метод принт.
     * @param <T> Кого сортируем, значение автоматически подбирается из списка
     * @param group Список для сортировки
     */
    public static <T extends Person> void printSortedByFIO(List<T> group){
        PersonComparator<T> sortFIO = new PersonComparator<T>();
        group.sort(sortFIO);
        for(T g : group)
        {
            System.out.println(g);
        }
    }


    public static <T extends Teacher> void paySalary(T person, int salary) {
        System.out.println(person.getName() + " выплачено зарплата " + salary + "р. ");
    }


    /**Метод, определяющий средний возраст персон из переданного списка
     * @param <T> Обобщенный тип лиц
     * @param persons Список лиц
     * @return
     */
    public static <T extends Person> double averageAge(List<T> persons)
    {
        double sumAge = 0;
        for(T p : persons){
            sumAge += p.getAge();
        }
        return (sumAge / persons.size());
    }
}
