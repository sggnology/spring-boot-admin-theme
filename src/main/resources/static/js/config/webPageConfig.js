(function($){

  'use strict'

  /**
   * 0. 탭의 타이틀 수정
   * 1. 사이드바 타이틀 설정
   * 2. 사이드바 아이콘 설정
   * 3. 푸터 타이틀 설정
   * 4. 푸터 아이콘 설정
   * */

  const $sidebarTitle = $('#sidebarTitle')
  const $sidebarIcon = $('#sidebarIcon')
  const $footerTitle = $("#footerTitle")
  const $footerIcon = $("#footerIcon")

  const setDocumentTitle = function(){
    document.title = systemVariable.web_resources_title
  }

  const setText = function({$titleDom, content}){
    $titleDom.text(content)
  }

  const setIcon = function({$iconDom}){
    if(systemVariable.web_resources_common_page_icon_icon_is_favicon === "N"){
      $iconDom.addClass(systemVariable.web_resources_common_page_icon)
    }
    else{
      $iconDom.replaceWith(`<img class="px-1" style="object-fit: contain; width: 30px; height: 30px;" src="/favicon.ico">`)
    }
  }

  $(function(){
    /**
     * document Title 설정
     * */
    setDocumentTitle()

    /**
     * sidebar 제목, 아이콘 설정
     * */
    setText({
      $titleDom : $sidebarTitle,
      content : systemVariable.web_resources_sidebar_title
    })

    setIcon({
      $iconDom: $sidebarIcon
    })

    /**
     * footer 제목, 아이콘 설정
     * */
    setText({
      $titleDom : $footerTitle,
      content : systemVariable.web_resources_footer_title
    })

    setIcon({
      $iconDom: $footerIcon
    })
  })


})(jQuery)