package com.yellownology.bootstrapadmintheme.controller.dashboard

import org.springframework.stereotype.Controller
import org.springframework.web.bind.annotation.RequestMapping

@Controller("DashboardController")
@RequestMapping("/")
class HttpController {

    @RequestMapping("")
    fun dashboardPage(): String{
        return "layout"
    }
}