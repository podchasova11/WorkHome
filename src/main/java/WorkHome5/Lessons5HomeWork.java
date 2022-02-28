package WorkHome5;

class Lessons5HomeWork {
    public static void main(String[] args) {
        Employee[] employees = {
                new Employee("Podchasov Oleg", "Engineer",
                        "podchasov@mail.com", "2536148", 120000, 29),
                new Employee("Podchasov Alex", "Admin",
                        "podchasov@mail.com", "1524141", 150000, 27),
                new Employee("Podchasova Yana", "Animator",
                        "podchasova@mail.com", "5536145", 120000, 21),
                new Employee("Ivanov Ivan", "Engineer",
                        "ivanovov@mail.com", "5361124", 100000, 43),
                new Employee("Petrov Oleg", "Engineer",
                        "petrov@mail.com", "1136141", 60000, 45),
        };

        for (Employee employee : employees) {
            if (employee.getAge() > 40) {
                System.out.println(employee);
            }
        }
    }
}

class Employee {
    private String name;
    private String position;
    private String email;
    private String phone;
    private int salary;
    private int age;

    public Employee (String name, String position, String email, String phone,
                     int salary, int age) {
        this.name = name;
        this.position = position;
        this.email = email;
        this.phone = phone;
        this.salary = salary;
        this.age = age;
    }

    public int getAge() { // getter for age
        return age;
    }

    @Override
    public String toString() { // overrided method toString()
        return (name +
                "\n| Position: " + position +
                "\n| Email: " + email +
                "\n| Phone: " + phone +
                "\n| Salary: " + salary +
                "\n| Age: " + age);
    }
}
