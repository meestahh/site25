package com.example.site;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class AppController {

    @Autowired
    private ConfService service;

    @RequestMapping("/")
    public String viewHomePage(Model model, @Param("keyword") String keyword){
        List<Conf> listConf = service.listAll(keyword);
        model.addAttribute("ListDevice", listConf);
        model.addAttribute("keyword", keyword);
        return "index";
    }
    @RequestMapping("/gist")
    public String index(Model model, @Param("keyword") String keyword){
        List<Conf> listConf = service.listAll(keyword);
        model.addAttribute("ListConf", listConf);
        model.addAttribute("keyword", keyword);
        return "gist";
    }

    @RequestMapping("/new")
    public String showNewTypeForm(Model model){
        Conf type = new Conf();
        model.addAttribute("Conf", type);
        return "new_conf";
    }

    @RequestMapping(value = "/save", method = RequestMethod.POST)
    public String saveType(@ModelAttribute("type") Conf type){
        service.save(type);
        return "redirect:/";
    }

    @RequestMapping("/edit/{id}")
    public ModelAndView showEditTypeForm(@PathVariable(name="id") Long id){
        ModelAndView mav = new ModelAndView("edit_conf");
        Conf type = service.get(id);
        mav.addObject("Type", type);
        return mav;
    }

    @RequestMapping("/delete/{id}")
    public String deleteType(@PathVariable(name = "id") Long id){
        service.delete(id);
        return "redirect:/";
    }


}