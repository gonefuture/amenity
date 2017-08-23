function impower() {
    $.ajax({
        type:"get",
        url:"/amenity/auth",
        dataType : "json",
        data: {'yb_userid':"878787",
			    'yb_realname':"张三",
			    'yb_schoolid':"111111",
			    'yb_schoolname':"仲恺农业工程学院",
			    'yb_collegename':"信息科学与技术学院",
			    'yb_classname':"计算机154",
			    'yb_enteryear':"2015",
			    'yb_studentid':"201510224499",
			    'yb_examid':"",
			    'yb_admissionid':"",
			    'yb_employid':""},
        success : function(data, textStatus){
          alert("授权成功");
        },
        error : function(xhr, status, errMsg) {
            alert("授权失败");
        }
    });
}

function teacherTest() {
    $.ajax({
        type:"get",
        url:"/amenity/auth",
        dataType : "json",
        data: {'yb_userid':"5244708",
			    'yb_realname':"吴四",
			    'yb_schoolid':"22222",
			    'yb_schoolname':"仲恺农业工程学院",
			    'yb_collegename':"信息科学与技术学院",
			    'yb_classname':"",
			    'yb_enteryear':"",
			    'yb_studentid':"",
			    'yb_examid':"",
			    'yb_admissionid':"",
			    'yb_employid':"206068"},
        success : function(data, textStatus){
          alert("授权成功");
        },
        error : function(xhr, status, errMsg) {
            alert("授权失败");
        }
    });
}
