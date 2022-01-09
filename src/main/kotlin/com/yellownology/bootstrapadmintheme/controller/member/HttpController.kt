package com.yellownology.bootstrapadmintheme.controller.member

import org.springframework.stereotype.Controller
import org.springframework.web.bind.annotation.RequestMapping

@Controller("MemberController")
@RequestMapping("/member")
class HttpController {

    @RequestMapping("")
    fun memberPage(): String{
        return "view/member/content"
    }
}