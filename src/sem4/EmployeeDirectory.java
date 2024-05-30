package sem4;

import java.util.ArrayList;
import java.util.List;

/*
Добавить методы:
1. Добавить метод добавления нового сотрудника в справочник
2. Добавить метод, который ищет сотрудника по табельному номеру
3. Добавить метод, который ищет сотрудника по стажу (может быть список)
4. Добавить метод, который возвращает номер телефона сотрудника по имени (может быть список)
*/

/**
 * EmployeeDirectory - класс, реализующий методы работы с базой данных сотрудников.
 */
public class EmployeeDirectory {
    List<Employee> directory = new ArrayList<>();

    /**
     * addEmployee - метод добавления сведений о новом сотруднике в базу данных.
     *
     * @param employee - сведения о сотруднике.
     */
    public List<Employee> addEmployee(Employee employee) {
        directory.add(employee);
        return this.directory.stream().toList();
    }

    /**
     * findByTabelNumber - метод поиска сотрудника по табельному номеру.
     *
     * @param tabelNumber - номер сотрудника в реестре.
     * @return - вывод имеющихся сведений о сотруднике.
     */
    public List<Employee> findByTabelNumber(int tabelNumber) {
        return this.directory.stream().filter(employee -> employee.tabelNumber == tabelNumber).toList();
    }

    /***
     * findByExperience - метод поиска сотрудника по стажу.
     * @param experience - стаж.
     * @return - вывод данных о сотруднике.
     */
    public List<Employee> findByExperience(int experience) {
        return this.directory.stream().filter(employee -> employee.getExperience() == experience).toList();
    }

    /**
     * findPhoneNumber - метод вывода номера телефона сотрудника по имени.
     *
     * @param name - имя сотрудника.
     * @return - вывод номера телефона.
     */
    public List<String> findPhoneNumber(String name) {
        List<String> result = new ArrayList<>();
        this.directory.forEach(employee -> {
            if (employee.getName().equals(name)) {
                result.add(employee.getPhoneNumber());
            }
        });
        return result;
    }
}