package go.skypro.homeworkcollectionsheetsandsets;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/employee")
public class EmployeeController {
    private final EmployeeService employeeService;

    EmployeeController(EmployeeService employeeService) {
        this.employeeService = employeeService;
    }

    @GetMapping("/add")
    public String add(@RequestParam("firstName") String firstName,
                      @RequestParam("lastName") String lastName) {
        return
    }

    @GetMapping("/remove")
    public String remove(@RequestParam("firstName") String firstName,
                         @RequestParam("lastName") String lastName) {
        return
    }

    @GetMapping("/find")
    public String find(@RequestParam("firstName") String firstName,
                       @RequestParam("lastName") String lastName) {
        return
    }
}