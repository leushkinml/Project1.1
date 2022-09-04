public class Employee {
    private final String surname;
    private final String name;
    private final String secondName;
    String companyBranch;
    int salary;
    private final Counted counter;
    static int idOfEmployee;


    public Employee(String surname, String name, String secondName, String companyBranch, int salary) {
        this.surname = surname;
        this.name = name;
        this.secondName = secondName;
        this.companyBranch = companyBranch;
        this.salary = salary;
        this.counter = new Counted();
        idOfEmployee = Counted.getId();
    }

    static Employee[] employer = new Employee[10];

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

    public int getIdOfEmployee() {
        return idOfEmployee;
    }

    @Override
    public String toString() {
        return  "Учётная карточка сотрудника" + '\n' +
                "1. Фамилия: " + surname + '\n' +
                "2. Имя: " + name + '\n' +
                "3. Отчество: " + secondName + '\n' +
                "4. Отдел: " + companyBranch + '\n' +
                "5. Зарплата " + (int) salary +
                '.' + '\n';
    }

    public static void printStaffTable() {
        System.out.println();
        System.out.println("Штатное расписание компании");
        System.out.println();
        System.out.println("Всего сотрудников: " + Counted.getId());
        System.out.println();
        for (int i = 0; i < Employee.employer.length; i++)
            if (Employee.employer[i] == null) {
                System.out.println("ID сотрудника: " + (i + 1)+ '\n' + "Позиция вакантна.");
            } else {
                System.out.println("ID сотрудника: " + (i + 1) + '\n' + Employee.employer[i]);
            }
    }

    public static int amountOfSalaryCostsPerMonth() {
        int summary = 0;
        for (int i = 0; i < idOfEmployee; i++) {
            summary += Employee.employer[i].getSalary();
            }
        return summary;
    }

    public static String  staffWithMaxSalary() {
        String staffWithMax = null;
        int maxSalary = -1;
        for (int i = 0; i < idOfEmployee; i++) {
            if (Employee.employer[i].getSalary() > maxSalary) {
                maxSalary = Employee.employer[i].getSalary();
                staffWithMax = Employee.employer[i].getSurname() + " " + Employee.employer[i].getName() + " " + Employee.employer[i].getSecondName() + ", имеющий зарплату " + Employee.employer[i].getSalary() + " руб.";
            }
        }
        return staffWithMax;
    }

    public static String  staffWithMinSalary() {
        String staffWithMin = null;
        int minSalary = 1000000000;
        for (int i = 0; i < idOfEmployee; i++) {
            if (Employee.employer[i].getSalary() < minSalary) {
                minSalary = Employee.employer[i].getSalary();
                staffWithMin = Employee.employer[i].getSurname() + " " + Employee.employer[i].getName() + " " + Employee.employer[i].getSecondName() + ", имеющий зарплату " + Employee.employer[i].getSalary() + " руб.";
            }
        }
        return staffWithMin;
    }

    public static int averageSalaryPerMonth() {
        int average = amountOfSalaryCostsPerMonth() / idOfEmployee;

        return average;
    }

    public static void printFullNameOfStaff() {
        System.out.println();
        System.out.println("Фамилия, Имя, Отчество действующих сотрудников компании:");
        System.out.println();
        for (int j = 0; j < Employee.employer.length; j++)
            if (Employee.employer[j] == null) {
                System.out.println("Позиция вакантна.");
            } else {
                System.out.println(Employee.employer[j].getSurname() + " " + Employee.employer[j].getName() + " " + Employee.employer[j].getSecondName() + ".");
            }
    }
}
