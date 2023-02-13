import coursework1.Employee;

public class Main {
    public static double salarySum() {
        double sum = 0;
        for (Employee e : employee) {
            sum += e.getSalary();
        }
        return sum;
    }
    public static double averageSalary() {
        double averageSalary = 0;
        for(Employee e : employee) {
            averageSalary += e.getSalary();
        }
        System.out.println("Среднее значение зарплат = " + averageSalary / employee.length);

        return averageSalary / employee.length;

    }
    public static double minSalary() {
        double min = employee[0].getSalary();
        for(Employee e : employee)
            if (e.getSalary() < min) {
                min = e.getSalary();
            }
        return min;
    }
    public static double maxSalary() {
        double max = employee[0].getSalary();
        for (Employee e : employee)
            if (e.getSalary() > max) {
                max = e.getSalary();
            }
        return max;
    }
    public static void giveName() {
        for (Employee e : employee)
            System.out.println(e.getFullName());
    }
    public static void salaryIndexing() {
        double salaryPercent = 0;
        double percent = 0.01;
        for (Employee e : employee) {
            salaryPercent = (e.getSalary() * percent) + e.getSalary();
            e.setSalary(salaryPercent);
            System.out.println("Зарплата после индексации  "  + e.getSalary()  + " рублей ");
        }


}



    static Employee[] employee = new Employee[10];

    public static void main(String[] args) {
        employee[0] = new Employee("Иванов Иван Иванович", 1, 21125);
        employee[1] = new Employee("Петров Пётр Петрович", 1, 20500);
        employee[2] = new Employee("Сидоров Андрей Анатольевич", 2, 25000);
        employee[3] = new Employee("Клименко Андрей Ильич", 2, 25347);
        employee[4] = new Employee("Данилова Людмила Евгеньевна", 3, 25900);
        employee[5] = new Employee("Трунов Владимир Николаевич", 3, 33800);
        employee[6] = new Employee("Павлова Анна Анатольевна", 4, 29657);
        employee[7] = new Employee("Хомякова Надежда Викторовна", 4, 30200);
        employee[8] = new Employee("Грибанов Артём Сергеевич", 4, 29555);
        employee[9] = new Employee("Новикова Анна Николаевна", 5, 26800);

        for (Employee e : employee) {
            System.out.println(e);
        }
        System.out.println();
        double sum = salarySum();
        System.out.println("Сумма затрат на зарплаты в месяц= " + sum);

        System.out.println();
        averageSalary();

        System.out.println();
        double min = minSalary();
        System.out.println("Сотрудник с минимальной зарплатой " + min);

        System.out.println();
        double max = maxSalary();
        System.out.println("Сотрудник с максимальной зарплатой " + max);

        System.out.println();
        giveName();

        System.out.println();
        salaryIndexing();


        


    }
}