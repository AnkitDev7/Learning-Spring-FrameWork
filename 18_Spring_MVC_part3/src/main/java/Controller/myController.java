package Controller;

import DTO.Employee;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.servlet.http.HttpServletRequest;

@Controller
public class myController {

    @GetMapping("/regesteraply.do")
    public String register(){
        System.out.println("register account");
        return "register";
    }

/*    @PostMapping("/registersucess.do")
    public String register(HttpServletRequest request){

        int id = Integer.parseInt(request.getParameter("id"));
        int mobile = Integer.parseInt(request.getParameter("mobile"));
        String name = request.getParameter("name");
        String address = request.getParameter("address");

        System.out.println(id);
        System.out.println(mobile);
        System.out.println(name);
        System.out.println(address);

        return "redirect:/regesteraply.do";
    }  */

    @PostMapping("/registersucess.do")
    public String registerAccount(@ModelAttribute Employee employee){
        System.out.println(employee);
        return "redirect:/regesteraply.do";
    }

}
