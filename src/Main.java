public class Main {
    public static void main(String[] args) {

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


        Employee.printStaffTable(); // Получить cписок всех сотрудников со всеми имеющимися по ним данными.
        System.out.println();

        System.out.println("Сумма затрат на зарплаты в месяц: " + Employee.amountOfSalaryCostsPerMonth()+ " руб."); // Посчитать сумму затрат на зарплаты в месяц.
        System.out.println();

        System.out.println("Сотрудник с минимальной зарплатой в месяц: " + Employee.staffWithMinSalary()); // Найти сотрудника с минимальной зарплатой.
        System.out.println();

        System.out.println("Сотрудник с максимальной зарплатой в месяц: " + Employee.staffWithMaxSalary()); // Найти сотрудника с максимальной зарплатой.
        System.out.println();

        System.out.println("Среднее значение зарплат в месяц: " + Employee.averageSalaryPerMonth() + " руб."); // Подсчитать среднее значение зарплат.
        System.out.println();

        Employee.printFullNameOfStaff(); // Получить Ф. И. О. всех сотрудников
    }
}