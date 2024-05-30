package sem4;

/*
 * Employee - класс, позволяющий создать объект "Сотрудник".
 */

public class Employee {
    int tabelNumber;
    String name;
    String phoneNumber;
    int experience;

    /**
     * Конструктор класс Employee.
     *
     * @param tabelNumber - порядковый номер в БД;
     * @param name        - фамилия и имя;
     * @param phoneNumber - номер телефона;
     * @param experience  - стаж работы.
     */
    public Employee(int tabelNumber, String name, String phoneNumber, int experience) {
        this.tabelNumber = tabelNumber;
        this.name = name;
        this.phoneNumber = phoneNumber;
        this.experience = experience;
    }

    /**
     * Селектор.
     *
     * @return - возвращает порядковый номер.
     */
    public int getTabelNumber() {
        return tabelNumber;
    }

    /**
     * Селектор.
     *
     * @return - возвращает имя и фамилию сотрудника.
     */
    public String getName() {
        return name;
    }

    /**
     * Селектор.
     *
     * @return - возвращает номер телефона.
     */
    public String getPhoneNumber() {
        return phoneNumber;
    }

    /**
     * Селектор.
     *
     * @return - возвращает опыт работы (количество полных лет).
     */
    public int getExperience() {
        return experience;
    }

    /**
     * toString - переопределенный метод вывода данных на печать.
     *
     * @return - сведения об объекте "сотрудник", изложенные в заданном порядке.
     */
    @Override
    public String toString() {
        return "№ сотрудника: " + tabelNumber + "; Имя: " + name + "; Номер телефона: " + phoneNumber +
                "; Стаж (полных лет): " + experience + ".\n";
    }
}