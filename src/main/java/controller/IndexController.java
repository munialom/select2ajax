package controller;

import java.util.ArrayList;
import java.util.List;

import com.ctecx.select2ajax.model.Employee;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;


@Controller
public class IndexController {
    @GetMapping(value="/index")
    public String index () {
        return"/index";
    }

    public List<String> listofEmployees(){
        
 
        List<String> emp= new ArrayList<String>();
        emp.add("moses");
        emp.add("moses");
        emp.add("moses");
        emp.add("moses");
        emp.add("moses");
        emp.add("moses");
        

       return emp;  
    }
    
    
}
