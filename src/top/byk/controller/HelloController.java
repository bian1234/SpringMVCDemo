package top.byk.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
//import org.springframework.web.portlet.ModelAndView;
import org.springframework.web.servlet.ModelAndView;
/**
 * @author: ykbian
 * @date: 2019/5/12 14:07
 * @Description:
 */
@Controller
@RequestMapping("/test")
public class HelloController {

    @RequestMapping("/demo1")
    public String demo1() {
        return "hello";
    }

    @RequestMapping("/demo2")
    public String demo2(Model model) {
        model.addAttribute("name","雷锋");
        model.addAttribute("url","https://blog.csdn.net/weixin_42074377");
        return "hello";
    }

    @RequestMapping("/demo3")
    public ModelAndView demo3() {
        ModelAndView modelAndView= new ModelAndView();
        modelAndView.setViewName("hello");
        modelAndView.addObject("name","雷锋");
        return modelAndView;
    }

}
