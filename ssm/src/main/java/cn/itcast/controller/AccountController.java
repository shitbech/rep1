package cn.itcast.controller;

import cn.itcast.domain.Account;
import cn.itcast.service.AccountService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.List;

/**
 * @Description: JAVA类作用描述
 * @Author :胡辉
 * @CreatDate: 2019/3/21 19:46
 * @Version : 1.0
 */
@Controller
@RequestMapping("/account")
public class AccountController {
    @Autowired
    private AccountService accountService;
    @RequestMapping("/findAll")
    public String findAll(Model model){
        System.out.println("表现层：执行查询了方法");
        List<Account> list = accountService.findAll();
        model.addAttribute("list",list);
        for(Account account:list){
            System.out.println(account);
        }
        return "list";
    }

    @RequestMapping("/save")
    public String save(Account account){
        accountService.saveAccount(account);
        return "redirect:/account/findAll";
    }
}
