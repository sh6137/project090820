function idCheck(id){
    if(memberid == ""){
        alert("아이디를 입력해주세요.");
        document.reg.memberid.focus();
    }
    else{
        var popWidth = 300;
        var popHeight = 200;
        var winHeight = document.body.clientHeight;    // 현재창의 높이
        var winWidth = document.body.clientWidth;    // 현재창의 너비
        var winX = window.screenLeft;    // 현재창의 x좌표
        var winY = window.screenTop;    // 현재창의 y좌표
        var popX = winX + (winWidth - popWidth)/2;
        var popY = winY + (winHeight - popHeight)/2;
        url="/reg?id="+id;
        window.open(url, "post", 
                "left="+popX+",top="+popY+",width="+popWidth+", height="+popHeight);
    }
}