public class Employee {
    private String name;
    private String position;
    private String email;
    private String phone;
    private int salary;
    private int age;

    public Employee(String name, String position, String email, String phone, int salary, int age) {
        this.name = name;
        this.position = position;
        this.email = email;
        this.phone = phone;
        this.salary = salary;
        this.age = age;
    }

    public void info() {
        System.out.println("ФИО: " + name + "; Должность: " + position + "; email: " + email + "; Телефон: " + phone + "; Зарплата: " + salary + "; Возраст: " + age);
    }

    Employee[] empArr = new Employee[5];

    {
        empArr[0] = new Employee("Lenin Vladimir Ilyich", "CEO KPSS", "len1n@kpss.su", "88005553535", 30000, 53);
        empArr[1] = new Employee("Stalin Iosif Vissarionovich", "General Secretary", "koba1878@kpss.su", "88005554545", 25000, 74);
        empArr[2] = new Employee("Hruschev Nikita Sergeevich", "Governor", "kuzkinamatb@kpss.su", "88005556565", 14000, 77);
        empArr[3] = new Employee("Brezhnev Leonid Ilyich", "Head of Prezidium", "sweetlips@kpss.su", "88005557575", 20000, 75);
        empArr[4] = new Employee("Andropov Yury Vladimirovich", "Head of KGB", "gulagtours@kpss.su", "88005558585", 18000, 69);
    }
}
