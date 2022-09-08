public class Employee {
    private final String surname;
    private final String name;
    private final String secondName;
    private String companyBranch;
    private int salary;
    private static int counter;
    private int idOfEmployee;


    public Employee(String surname, String name, String secondName, String companyBranch, int salary) {
        this.surname = surname;
        this.name = name;
        this.secondName = secondName;
        this.companyBranch = companyBranch;
        this.salary = salary;
        idOfEmployee = counter++;
    }

    public String getSurname() {
        return surname;
    }

    public String getName() {
        return name;
    }

    public String getSecondName() {
        return secondName;
    }

    public String getCompanyBranch() {
        return companyBranch;
    }

    public void setCompanyBranch(String companyBranch) {
        this.companyBranch = companyBranch;
    }

    public int getSalary() {
        return salary;
    }

    public void setSalary(int salary) {
        this.salary = salary;
    }

    public static int getCounter() { return counter; }

    //public static int getLength() { return length; }

    /*public static int getIdOfEmployee() { return idOfEmployee; }*/

    @Override
    public String toString() {
        return  "Учётная карточка сотрудника" + '\n' +
                "1. Фамилия: " + surname + '\n' +
                "2. Имя: " + name + '\n' +
                "3. Отчество: " + secondName + '\n' +
                "4. Отдел: " + companyBranch + '\n' +
                "5. Зарплата " + (int) salary +
                '.';
    }
}
