package com.example.demo.controller;

import com.example.demo.model.BankAccount;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;


@Controller
public class Show {

    public BankAccount bankAccount = new BankAccount("Simba", 2000.428, "lion");

    private List<BankAccount> accountList = new ArrayList();

    public Show() {
        accountList.add(new BankAccount("Scar", 50.00, "lion"));
        accountList.add(new BankAccount("Pumbaa", 200.34, "pig"));
        accountList.add(new BankAccount("Nala", 2999.777, "lioness"));
    }

    @GetMapping(value = "/show")
    public String firstAccount(Model model) {
        model.addAttribute("name", bankAccount.getName());
        model.addAttribute("balance", bankAccount.getBalanceFormatted());
        model.addAttribute("animalType", bankAccount.getAnimalType());
        return "BankAccountTemplate";

    }

    @GetMapping(value = "/HTMLception")
    public String HTMLcepetion() {
        return "HTMLception";

    }

    @GetMapping(value = "/showlist")
    public String showlist(Model model) {
        model.addAttribute("accountList", accountList);
        return "ListOfBankAccounts";
    }
}