package com.example;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created by user1 on 18-10-2016.
 */

@RestController
public class AccountController
{
    @Autowired
    public AccountRepository acctRepo;

    @RequestMapping(value = "/getSubscription")
    public String getAccounts()
    {
        String result = "<html>";

        for(AccountModel am : acctRepo.findAll())
        {
            result = result + "<div>" + am.toString() + "</div>";
        }

        return result + "</html>";
    }
}
