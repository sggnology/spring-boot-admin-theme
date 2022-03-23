(function($){
    'use strict'

    const $sidebarMenu = $("#sidebarMenu")
    const activeClass = "active"
    const pathName = location.pathname

    /**
     * sidebar menu 활성화
     * */
    function activeTab(href){
        $sidebarMenu.find(`[href='${href}']`).addClass(activeClass)
    }

    /**
     * sidebar menu 활성화 클래스 초기화
     * */
    function clearTab(){
        $sidebarMenu.find('.nav-link').each(function(idx, ele){
            $(ele).removeClass(activeClass)
        })
    }

    /**
     * 어떤 메뉴가 활성화 되어있는지 시각화
     * */
    function checkWhichTab(){

        clearTab()

        if(pathName.startsWith('/member')) activeTab('/member')
        else if(pathName.startsWith('/pointHistory')) activeTab('/pointHistory')
        else activeTab('/')
    }

    $(function(){
        checkWhichTab()
    })

})(jQuery)