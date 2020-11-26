package com.hendisantika.springbootthymeleafbootstrapwizard.controller;

import com.hendisantika.springbootthymeleafbootstrapwizard.model.Account;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * Created by IntelliJ IDEA.
 * Project : springboot-thymeleaf-bootstrap-wizard
 * User: hendisantika
 * Email: hendisantika@gmail.com
 * Telegram : @hendisantika34
 * Date: 27/11/20
 * Time: 05.57
 */
@Controller
@RequestMapping("/account")
public class AccountController {

    @PostMapping
    public String submit(Account account, Model model) {
        model.addAttribute("account", account);
        return "saved";
    }
}
