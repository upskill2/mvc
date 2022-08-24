package com.spring.mvc;

import com.spring.mvc.validation.CheckEmail;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

import javax.validation.constraints.*;

import java.util.HashMap;
import java.util.Map;

@Getter
@Setter
@ToString
public class Employee {

    @Size(min = 5, message = "name is too short")
    private String name;

    @NotBlank(message = "required field")
    private String surname;

    @Min(value = 1500, message = "should be > 1.499")
    @Max(value = 2500, message = "should be < 2.499")
    private int salary;

    private String department;

    private Map<String, String> dpts;
    private Map<String, String> cars;

    private String carBrand;

    private String[] languages;

    private Map<String, String> langs;

    @CheckEmail
    private String email;

    @Pattern(regexp = "\\d{3}-\\d{3}-\\d{3}", message = "please use XXX XXX XXX")
    private String phoneNumber;

    public Employee() {
        dpts = new HashMap<>();
        dpts.put("IT", "Information Technology");
        dpts.put("HR", "Human Resources");
        dpts.put("Finance", "Banking Services");

        cars = new HashMap<>();
        cars.put("Renault", "Renault");
        cars.put("BMW", "BMW");
        cars.put("Ford", "Ford Motor");

        langs = new HashMap<>();

        langs.put("EN", "ENGLISH");
        langs.put("UA", "UKRAINIAN");
        langs.put("FR", "ENGLISH");
    }

}
