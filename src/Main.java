public class Main {

    public static void main(String[] args) {

        Employee[] employer = new Employee[10];

        employer[0] = new Employee("Иванов", "Иван", "Иванович", "1", 51_500);
        employer[1] = new Employee("Петров", "Пётр", "Петрович", "5", 112_300);
        employer[2] = new Employee("Сидоров", "Сидор", "Сидорович", "3", 36_800);
        Employee alexPushkin = new Employee("Пушкин", "Александр", "Сергеевич", "2", 777_777);
        employer[3] = alexPushkin;
        Employee ivanTurgenev = new Employee("Тургенев", "Иван", "Сергеевич", "2", 555_000);
        employer[4] = ivanTurgenev;
        Employee vladimirMayakovskiy = new Employee("Маяковский", "Владимир", "Владимирович", "2", 300_500);
        employer[5] = vladimirMayakovskiy;


        printStaffTable(employer); // Получить cписок всех сотрудников со всеми имеющимися по ним данными.

        System.out.println("Сумма затрат на зарплаты в месяц: " + amountOfSalaryCostsPerMonth(employer) + " руб."); // Посчитать сумму затрат на зарплаты в месяц.
        System.out.println();

        System.out.println("Сотрудник с минимальной зарплатой в месяц: " + '\n' + staffWithMinSalary(employer)); // Найти сотрудника с минимальной зарплатой.
        System.out.println();

        System.out.println("Сотрудник с максимальной зарплатой в месяц: " + '\n' + staffWithMaxSalary(employer)); // Найти сотрудника с максимальной зарплатой.
        System.out.println();

        System.out.println("Среднее значение зарплат в месяц: " + averageSalaryPerMonth(employer) + " руб."); // Подсчитать среднее значение зарплат.
        System.out.println();

        printFullNameOfStaff(employer); // Получить Ф. И. О. всех сотрудников.
    }

    private static void printStaffTable(Employee[] employer) {
        System.out.println();
        System.out.println("Штатное расписание компании");
        System.out.println();
        System.out.println("Всего сотрудников: " + Employee.getCounter());
        System.out.println();
        for (int i = 0; i < employer.length; i++)
            if (employer[i] == null) {
                System.out.println("ID сотрудника: " + (i + 1) + '\n' + "Позиция вакантна.");
                System.out.println();
            } else {
                System.out.println("ID сотрудника: " + (i + 1) + '\n' + employer[i]);
                System.out.println();
            }
        System.out.println();
    }


    private static int amountOfSalaryCostsPerMonth(Employee[] employer) {
        int summary = 0;
        for (int i = 0; i < employer.length; i++) {
            if (employer[i] != null) {
                summary += employer[i].getSalary();
            }
        }
        return summary;
    }

    private static Employee staffWithMinSalary(Employee[] employer) {
        Employee staffWithMin = null;
        int minSalary = 1000000000;
        int i;
        for (i = 0; i < employer.length; i++) {
            if (employer[i] != null) {
                if (employer[i].getSalary() != 0) {
                    if (employer[i].getSalary() < minSalary) {
                        minSalary = employer[i].getSalary();
                        staffWithMin = employer[i];
                    }
                }
            }
        }
        return staffWithMin;
    }

    public static Employee staffWithMaxSalary(Employee[] employer) {
        Employee staffWithMax = null;
        int maxSalary = -1;
        for (int i = 0; i < employer.length; i++) {
            if (employer[i] != null) {
                if (employer[i].getSalary() > maxSalary) {
                    maxSalary = employer[i].getSalary();
                    staffWithMax = employer[i];
                }
            }
        }
        return staffWithMax;
    }

    private static double averageSalaryPerMonth(Employee[] employer) {
        double average = amountOfSalaryCostsPerMonth(employer) / (double) employer.length;
        return average;
    }

    private static void printFullNameOfStaff(Employee[] employer) {
        System.out.println();
        System.out.println("Фамилия, Имя, Отчество действующих сотрудников компании:");
        System.out.println();
        for (int i = 0; i < employer.length; i++) {
            if (employer[i] != null) {
                System.out.println(employer[i].getSurname() + " " + employer[i].getName() + " " + employer[i].getSecondName() + ".");
            }
        }
    }

}
