package org.example.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/admin")
public class AdminController {

    @GetMapping("/login")
    public String getLoginPage() {
        return "admin-login";
    }

    @GetMapping("/panel")
    public String getAdminPanelPage() {
        return "admin-panel";
    }
}