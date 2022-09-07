public class Main {
    public static void main(String[] args) {

        Employee[] employer = new Employee[10];


        Employee ivanovIvan = new Employee("Иванов", "Иван", "Иванович", "1", 51_500);
        Employee.employer[0] = ivanovIvan;
        Employee petrovPetr = new Employee("Петров", "Пётр", "Петрович", "5", 112_300);
        Employee.employer[1] = petrovPetr;
        Employee sidorovSidor = new Employee("Сидоров", "Сидор", "Сидорович", "3", 36_800);
        Employee.employer[2] = sidorovSidor;
        Employee alexPushkin = new Employee("Пушкин", "Александр", "Сергеевич", "2", 777_777);
        Employee.employer[3] = alexPushkin;
        Employee ivanTurgenev = new Employee("Тургенев", "Иван", "Сергеевич", "2", 555_000);
        Employee.employer[4] = ivanTurgenev;
        Employee vladimirMayakovskiy = new Employee("Маяковский", "Владимир", "Владимирович", "2", 300_500);
        Employee.employer[5] = vladimirMayakovskiy;

        System.out.println(Employee.employer[4]);

        printStaffTable(); // Получить cписок всех сотрудников со всеми имеющимися по ним данными.

        System.out.println("Сумма затрат на зарплаты в месяц: " + amountOfSalaryCostsPerMonth()+ " руб."); // Посчитать сумму затрат на зарплаты в месяц.
        System.out.println();

        System.out.println("Сотрудник с минимальной зарплатой в месяц: " + staffWithMinSalary()); // Найти сотрудника с минимальной зарплатой.
        System.out.println();

        System.out.println("Сотрудник с максимальной зарплатой в месяц: " + staffWithMaxSalary()); // Найти сотрудника с максимальной зарплатой.
        System.out.println();

        System.out.println("Среднее значение зарплат в месяц: " + averageSalaryPerMonth() + " руб."); // Подсчитать среднее значение зарплат.
        System.out.println();

        printFullNameOfStaff(); // Получить Ф. И. О. всех сотрудников
    }

    private static void printStaffTable() {
        System.out.println();
        System.out.println("Штатное расписание компании");
        System.out.println();
        System.out.println("Всего сотрудников: " + Employee.getCounter());
        System.out.println();
        for (int i = 0; i < Employee.employer.length; i++)
            if (Employee.employer[i] == null) {
                System.out.println("ID сотрудника: " + (i + 1)+ '\n' + "Позиция вакантна.");
            } else {
                System.out.println("ID сотрудника: " + (i + 1) + '\n' + Employee.employer[i]);
            }
        System.out.println();
    }
    private static int amountOfSalaryCostsPerMonth() {
        int summary = 0;
        for (int i = 0; i < Employee.employer.length; i++) {
            if (Employee.employer[i] != null) {
                summary += Employee.employer[i].getSalary();
            }
        }
        return summary;
    }
    private static Employee staffWithMinSalary() {
        //String staffWithMin = null;
        int minSalary = 1000000000;
        int i;
        for (i = 0; i < Employee.employer.length-1; i++) {
            if (Employee.employer[i] != null) {
                if (Employee.employer[i].getSalary() < minSalary) {
                    minSalary = Employee.employer[i].getSalary();
                    //staffWithMin = Employee.employer[i].getSurname() + " " + Employee.employer[i].getName() + " " + Employee.employer[i].getSecondName() + ", имеющий зарплату " + Employee.employer[i].getSalary() + " руб.";
                }
            }
        }
        return Employee.employer[i];

    }

    public static String  staffWithMaxSalary() {
        String staffWithMax = null;
        int maxSalary = -1;
        for (int i = 0; i < Employee.employer.length; i++) {
            if (Employee.employer[i] != null) {
                if (Employee.employer[i].getSalary() > maxSalary) {
                maxSalary = Employee.employer[i].getSalary();
                staffWithMax = Employee.employer[i].getSurname() + " " + Employee.employer[i].getName() + " " + Employee.employer[i].getSecondName() + ", имеющий зарплату " + Employee.employer[i].getSalary() + " руб.";
                }
            }
        }
        return staffWithMax;
    }

   private static double averageSalaryPerMonth() {
        double average = amountOfSalaryCostsPerMonth() / Employee.employer.length;

        return average;
   }

    private static void printFullNameOfStaff() {
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