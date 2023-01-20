package com.kluevja.bankappweb.controllers;

<<<<<<< HEAD
<<<<<<< HEAD
import com.kluevja.bankappweb.models.Account;
import com.kluevja.bankappweb.services.AccountService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

@Controller
@RequestMapping("/account")
public class AccountController {

    @Autowired
    public AccountService accountService;

    @PostMapping("/create")
<<<<<<< HEAD
    public ModelAndView create (@RequestParam Long id, RedirectAttributes model) {
=======
    public ModelAndView create(@RequestParam Long id, RedirectAttributes model) {
>>>>>>> 79376e0 (Пробный)

        if (accountService.createAccount(id)) {
            model.addFlashAttribute("msg", "Счет успешно создан");
        } else {
            model.addFlashAttribute("msg", "Не удалось создать счет");
        }

        return new ModelAndView("redirect:/account");
    }

    @GetMapping("/get")
    public ModelAndView get (@RequestParam Long id, RedirectAttributes model) {
        model.addFlashAttribute("account", accountService.getAccount(id));
        return new ModelAndView("redirect:/account");
    }

    @GetMapping("/getAccountList")
    public ModelAndView getAccountList(@RequestParam Long id, RedirectAttributes model) {
        System.out.println(id);
        model.addFlashAttribute("accountList", accountService.getAccountList(id));
        return new ModelAndView("redirect:/account");
    }

    @PostMapping("/update")
    public ModelAndView update (@ModelAttribute Account account, RedirectAttributes model) {
        return new ModelAndView("redirect:/account");
    }

    @PostMapping("/delete")
    public ModelAndView delete (@RequestParam Long id, RedirectAttributes model) {
        return new ModelAndView("redirect:/account");
    }
=======
=======
import com.kluevja.bankappweb.models.Account;
import com.kluevja.bankappweb.services.AccountService;
import org.springframework.beans.factory.annotation.Autowired;
>>>>>>> c630f34 (Add AccountService, AccountController)
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

@Controller //RestController для проверки в постман и поменять на стринг
@RequestMapping("/account")

public class AccountController {
<<<<<<< HEAD
//    @PostMapping
//    public ModelAndView create () {
//        return  new ModelAndView("redirect:/accoount");
//    }
//    public ModelAndView get () {
//
//    }
//    public ModelAndView updete () {
//
//    }
//    public ModelAndView delete () {
//
//    }
>>>>>>> 4f319af (Addition Transaction,TransactionRepository)
=======
    @Autowired
    public AccountService accountService;
    @PostMapping("/create")
    public ModelAndView create (@RequestParam Long id, RedirectAttributes model) {
        if (accountService.createAccount(id)) {
            model.addFlashAttribute("msg", "Счет успешно создан");
        } else {
            model.addFlashAttribute("msg", "Не удалось создать счет");
        }
        return new ModelAndView("redirect:/account");
<<<<<<< HEAD
    }
    @GetMapping("/get")
    public ModelAndView get (@RequestParam Long id, RedirectAttributes model) {
        model.addFlashAttribute("account", accountService.getAccount(id));
        return  new ModelAndView("redirect:/account");

    }
    @GetMapping("/getAccountList")
    public  ModelAndView getAccountList(@RequestParam Long id, RedirectAttributes model){
        model.addFlashAttribute("acountList", accountService.getAccountList(id));
        return new ModelAndView("redirect:/account");
    }
    @PostMapping("/update")
    public ModelAndView update (@ModelAttribute Account account, RedirectAttributes model) {
        return  new ModelAndView("redirect:/account");

    }
    @PostMapping("/delete")
    public ModelAndView delete (@RequestParam Long id, RedirectAttributes model) {
        return  new ModelAndView("redirect:/account");

=======
>>>>>>> 79376e0 (Пробный)
    }
>>>>>>> c630f34 (Add AccountService, AccountController)
}
