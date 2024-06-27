package com.nv.GL309_5_1_SP3.controllersTwo;

import com.nv.GL309_5_1_SP3.model.User;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class UserController {
    //PostMapping acts as a shortcut for @RequestMapping(method = RequestMethod.POST
    @PostMapping("/users")//@PostMapping handle the HTTP POST requests matched with a given URI expression
    public void printData(@RequestBody User user) { //@RequestBody allows us to retrieve the request’s body and automatically convert it to a Java Object.
        System.out.println("Printing user: " + user);
    }
}
