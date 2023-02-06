import coursework1.Employee;

public class Main {
    public static int salarySum(Employee[] employee) {
        int sum = 0;
        for (int i = 0; i < employee.length; i++) {
            sum = sum + employee[i].getSalary();
        }
        System.out.println("Сумма затрат на зарплаты в месяц= " + sum);
        return sum;
    }
    public static int averageSalary(Employee[] employee) {
        int averageSalary = 0;
        for(int i = 0; i < employee.length; i++)
            averageSalary += employee[i].getSalary() / employee.length;
        System.out.println("Среднее значение зарплат = " + averageSalary);

        return averageSalary;

    }
    public static int minSalary(Employee[] employee) {
        int min = employee[0].getSalary();
        for(int i = 0; i < employee.length; i++)
            if (employee[i].getSalary() < min) {
                min = employee[i].getSalary();
            }
        System.out.println("Сотрудник с минимальной зарплатой " + min);

        return min;
    }
    public static int maxSalary(Employee[] employee) {
        int max = employee[0].getSalary();
        for (int i = 0; i < employee.length; i++)
            if (employee[i].getSalary() > max) {
                max = employee[i].getSalary();
            }
        System.out.println("Сотрудник с минимальной зарплатой " + max);

        return max;
    }
    public static void giveName(Employee[] employee) {
        for (int i = 0; i < employee.length; i++)
            System.out.println(employee[i].getFullName());


    }


    public static void main(String[] args) {
        Employee[] employee = new Employee[10];
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
        salarySum(employee);

        System.out.println();
        averageSalary(employee);

        System.out.println();
        minSalary(employee);

        System.out.println();
        maxSalary(employee);

        System.out.println();
        giveName(employee);

    }
}