package com.spring.mvc;

import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

import javax.servlet.http.HttpServletRequest;
import javax.validation.Valid;


@org.springframework.stereotype.Controller
public class Controller {

    @RequestMapping(value = "/")
    public String showFirstView() {
        return "first-view";
    }

    @RequestMapping(value = "/askDetails")
    public String askEmpDetails(Model model) {

/*        Employee emp = new Employee();
        emp.setName("test");
        emp.setSalary(45);
        emp.setSurname("some surname");

        model.addAttribute("employee", emp);*/

        model.addAttribute("employee", new Employee());

        return "ask-emp-details-view";
    }


    @RequestMapping(value = "/showDetails")
    public String showEmpDetails(@Valid @ModelAttribute("employee") Employee emp, BindingResult bindingResult) {

/*        String name = emp.getName();
        emp.setName("Mr. " + name);

        String surname = emp.getSurname();
        emp.setSurname(surname);

        int salary = emp.getSalary();
        emp.setSalary(salary + 666);*/

        if (bindingResult.hasErrors()) {
            return "ask-emp-details-view";
        } else {
            return "show-emp-details-view";
        }

    }

    // Using HTTP Servlet
    /*    @RequestMapping(value = "/showDetails", method = RequestMethod.GET)
    public String showEmpDetails(HttpServletRequest request, Model model) {

        String empName = request.getParameter("employeeName");
        empName = "Mr. " + empName;

        model.addAttribute("nameAttribute", empName);
        model.addAttribute("description", "some text goes here");


        return "show-emp-details-view";
    }*/

}
