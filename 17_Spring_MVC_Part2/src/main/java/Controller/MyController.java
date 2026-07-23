package Controller;
import DTO.Employee;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import javax.servlet.http.HttpServletRequest;

@Controller
@RequestMapping("/admision")
public class MyController {

    @GetMapping("/register.do")
    public  String  registrationview(){
        return "registration";
    }

    @PostMapping("/registerAccount.do")
    public  String  registration(HttpServletRequest request){
        String id = request.getParameter("id");
        String name = request.getParameter("name");
        String address = request.getParameter("address");
        String salary = request.getParameter("salary");

        System.out.println(" id :- " + id + "  name :- " + name + " address :- " +address + " salary :- " +salary  );

        return "registration";
    }


/*    @PostMapping("/registeration.do")
    public  String  registration(@ModelAttribute Employee employee){
        System.out.println(employee);
        return "redirect:/admision/registerAccount.do";
    }  */


/*    @GetMapping("/delete.do")
    public  String  registration(@RequestParam("id") int id ,@RequestParam("name") String name){
        System.out.println(id);
        System.out.println(name);
        return "redirect:/admision/registerAccount.do";
    }  */

/*    @GetMapping("/delete.do/{id}")
    public  String  registration( @PathVariable int id){
        System.out.println(id);
        return "redirect:/admision/registerAccount.do";
    } */

}
