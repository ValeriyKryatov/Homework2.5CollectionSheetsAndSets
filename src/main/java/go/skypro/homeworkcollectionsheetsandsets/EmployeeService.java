package go.skypro.homeworkcollectionsheetsandsets;

import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class EmployeeService {

    List <Employee> employees = new ArrayList(List.of(
            new Employee("Ivan", "Ivanov"),
            new Employee("Петр", "Петров"),
            new Employee("Игорь", "Афанасьев"),
            new Employee("Геннадий", "Кашин"),
            new Employee("Никита", "Глазов"),
            new Employee("Арсений", "Быстров"),
            new Employee("Николай", "Зеленоглазов"),
            new Employee("Владимир", "Куценко"),
            new Employee("Иван", "Быков"),
            new Employee("Родион", "Николаев")
    ));

    public void add() {

    }
    public void remove() {

    }

    public void find() {

    }
}