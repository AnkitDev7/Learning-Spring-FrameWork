package Controller;
import DTO.Employee;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

@Controller
public class myController {

    @GetMapping("/register.do")
    public String register(Model model){
        if (!model.containsAttribute("massage")){
            model.addAttribute("massage","This is my registration Page");  // data persist x
        }

        System.out.println("register");
        return "registerform";
    }

    @PostMapping("/save.do")
    public String saveData(@ModelAttribute Employee employee , RedirectAttributes redirectAttributes){
        System.out.println(employee);
        redirectAttributes.addFlashAttribute("massage","Data Inserted");
        return "redirect:/register.do";
    }

}
