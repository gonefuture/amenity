/**
 * Created by Administrator on 2017/8/8 0008.
 */




/**
 * 对首页进行初始化操作
 */
function  init() {
    $.ajax({
        type: "get",
        url: "../getuser",
        dataType: "json",
        success: function (data, textStatus) {
            var yb_realname = eval(data).yb_realname;
            var yb_collegename = eval(data).yb_collegename;
            var yb_studentid = eval(data).yb_studentid;
            var yb_classname = eval(data).yb_classname;
            $("#name").append(yb_realname);
            $("#stuid").append(yb_studentid);
            $("#classname").append(yb_classname);
            $("#college").append(yb_collegename);
            $("#yb_realname").append(yb_realname);
            $("#yb_studentid").append(yb_studentid);
            $("#yb_classname").append(yb_classname);
            $("#yb_collegename").append(yb_collegename);
        },
        error : function(xhr, status, errMsg) {
            alert("系统异常!请稍后再试!");
        }
    });
}






/*
 根据state传入的参数值查找不同状态的订单
 */
function  showWater(pageNum) {
    var state=getUrlParam("state");
    $.ajax({
        type:"get",
        url:"../user/waterList",
        dataType : "json",
        data: {'pageNum': pageNum, 'waterState': state},
        success : function(data, textStatus){
            $("#waterOrderList").empty();
            $("#waterOrderpageNav").empty();
            list = eval(data).list;
            total= eval(data).total;
            if(total==0){
                $("#waterOrderList").append("<br/><br/>你还没有相关的订单哦!");
            }else {
                for (var i in list) {
                    var waterId = list[i].waterId;
                    var waterNum = list[i].waterNum;
                    var waterTime = list[i].waterTime;
                    var time = new Date(waterTime);
                    var orderTime = time.toLocaleString();
                    var html="";
                    if(state==3){///如果订单状态为3,则添加一个评价按钮
                        $("#waterOrderList").append("订单号:" + waterId + "<br/>数量:" + waterNum + "桶<br/>下单时间:" + orderTime + "<br/><a href='feedback.html?id="+waterId+"&type=2"+"'><button>评价</button></a>");
                    }else{
                        $("#waterOrderList").append("订单号:" + waterId + "<br/>数量:" + waterNum + "桶<br/>下单时间:" + orderTime + "<hr/>");
                    }

                }
                showPage(eval(data).pages,eval(data).pageNum,2,total);
            }
        },
        error : function(xhr, status, errMsg) {
            alert("查找订单失败!请稍后再试");
        }
    });
}



function showRepair(pageNum) {
    var state=getUrlParam("state");
    $.ajax({
        type:"get",
        url:"../user/repairList",
        dataType : "json",
        data: {'pageNum': pageNum, 'repairState': state},
        success : function(data, textStatus){
            $("#repairOrderList").empty();
            $("#repairOrderpageNav").empty();
            list = eval(data).list;
            total= eval(data).total;
            if(total==0){
                $("#repairOrderList").append("<br/><br/>你还没有相关的订单哦!");
            }else{
                for(var i in list){
                    var repairId=list[i].repairId;
                    var operateTime=list[i].operateTime;
                    var repairTime=list[i].repairTime;
                    $("#repairOrderList").append("订单号:"+repairId+"<br/>订单时间:"+operateTime+"<br/>维修时间:"+repairTime+"<br/><a href='feedback.html?id="+repairId+"&type=3"+"'><button>评价</button></a>");
                }
                showPage(eval(data).pages,eval(data).pageNum,3,total);
            }
        },
        error : function(xhr, status, errMsg) {
            alert("查找订单失败!请稍后再试");
        }
    });
}
/**
 *  用于订单显示时分页

 */
/**
 *
 * @param pages 表示总页数
 * @param pageNum 表示当前页面
 * @param type表示订单类型,2表示为订水订单,3表示为维修订单
 * @param total表示记录总数
 */
function showPage(pages,pageNum,type,total){
    var pageNav;
    var functionName;
    if(type==2){
        pageNav="#waterOrderpageNav";
        functionName="showWater";
    }else if(type==3){
        pageNav="#repairOrderpageNav";
        functionName="showRepair"
    }
    var begin;
    var end;
    var next=pageNum+1;
    var pre=pageNum-1;
    if(pages<=10){
        begin=1;
        end=pages;
    }else{
        begin=pageNum-4;
        end=pageNum+5;
        if(begin<1){
            begin=1;
            end=10;
        }
        if(end>pages){
            begin=pages-9;
            end=pages;
        }
    }
    if(pageNum!=1){
        $(pageNav).append("<button type='button' class='btn btn-info' onclick='"+functionName+"("+pre+")"+"'>上一页</button>");
    }
    for(var i=begin;i<=end;++i){
        if(i===pageNum){
            $(pageNav).append("<button type='button' class='btn btn-success' ><b>"+i+"</b></button>");
        }else{
            $(pageNav).append("<button type='button' class='btn btn-info' onclick='"+functionName+"("+i+")"+"'>"+i+"</button>");
        }
    }
    if(pageNum!=pages){
        $(pageNav).append("<button type='button' class='btn btn-info' onclick='"+functionName+"("+next+")"+"'>下一页</button>");
    }
    $(pageNav).append("<br/>共"+total+"条记录");
}



function showProof(pageNum) {
    var state=getUrlParam("state");
    $.ajax({
        type:"get",
        url:"../user/repairList",
        dataType : "json",
        data: {'pageNum': pageNum, 'repairState': state},
        success : function(data, textStatus){
            $("#repairOrderList").empty();
            $("#repairOrderpageNav").empty();
            list = eval(data).list;
            total= eval(data).total;
            if(total==0){
                $("#repairOrderList").append("<br/><br/>你还没有相关的订单哦!");
            }else{
                for(var i in list){
                    var repairId=list[i].repairId;
                    var operateTime=list[i].operateTime;
                    var repairTime=list[i].repairTime;
                    $("#repairOrderList").append("订单号:"+repairId+"<br/>订单时间:"+operateTime+"<br/>维修时间:"+repairTime+"<br/><a href='feedback.html?id="+repairId+"&type=3"+"'><button>评价</button></a>");
                }
                showPage(eval(data).pages,eval(data).pageNum,3,total);
            }
        },
        error : function(xhr, status, errMsg) {
            alert("查找订单失败!请稍后再试");
        }
    });
}



function  showLeave(pageNum) {
    $.ajax({
        type:"get",
        url:"../student/askleave",
        dataType : "json",
        data: {'pageNum': pageNum},
        success : function(data, textStatus){
            $("#leave").empty();
            $("#leaveNav").empty();
            list = eval(data).list;
            total= eval(data).total;
            if(total==0){
                $("#leave").append("<br/><br/>你还没有相关的记录哦!");
            }else {
                for (var i in list) {
                    var id = list[i].id;
                    var ybRealname = list[i].ybRealname;
                    var ybCollegename = list[i].ybCollegename;
                    var ybClassname = list[i].ybClassname;
                    var leaveType = list[i].leaveType;
                    var sinceTime = list[i].sinceTime;
                    var endTime = list[i].endTime;
                    var reason = list[i].reason;
                    $("#leave").append("申请记录号:" + id + "<br/>姓名:" + ybRealname +"<br/>学院:"+ybCollegename+"<br/>班级:"+ybClassname+"<br/>请假类型:"+leaveType+"<br/>请假时间:"+sinceTime+"---"+endTime+"<br>请假原因:"+reason+"<hr>");
                }
                showPage(eval(data).pages,eval(data).pageNum,1,total);
            }
        },
        error : function(xhr, status, errMsg) {
            alert("查找记录失败!请稍后再试");
        }
    });
}



/**
 *  用于订单显示时分页

 */
/**
 *
 * @param pages 表示总页数
 * @param pageNum 表示当前页面
 * @param type表示订单类型,1表示为请假记录,2表示为证明记录
 * @param total表示记录总数
 */
function showPage(pages,pageNum,type,total){
    var pageNav;
    var functionName;
    if(type==1){
        pageNav="#leaveNav";
        functionName="showLeave";
    }else if(type==2){
        pageNav="#proofNav";
        functionName="showProof"
    }
    var begin;
    var end;
    var next=pageNum+1;
    var pre=pageNum-1;
    if(pages<=10){
        begin=1;
        end=pages;
    }else{
        begin=pageNum-4;
        end=pageNum+5;
        if(begin<1){
            begin=1;
            end=10;
        }
        if(end>pages){
            begin=pages-9;
            end=pages;
        }
    }
    if(pageNum!=1){
        $(pageNav).append("<button type='button' class='btn btn-info' onclick='"+functionName+"("+pre+")"+"'>上一页</button>");
    }
    for(var i=begin;i<=end;++i){
        if(i===pageNum){
            $(pageNav).append("<button type='button' class='btn btn-success' ><b>"+i+"</b></button>");
        }else{
            $(pageNav).append("<button type='button' class='btn btn-info' onclick='"+functionName+"("+i+")"+"'>"+i+"</button>");
        }
    }
    if(pageNum!=pages){
        $(pageNav).append("<button type='button' class='btn btn-info' onclick='"+functionName+"("+next+")"+"'>下一页</button>");
    }
    $(pageNav).append("<br/>共"+total+"条记录");
}



///申请请假
function bookLeave(){
    var sinceTime=$('#my-start-2').val();
    var endTime=$('#my-end-2').val();
    var reason = $('#reason').val();
    var leaveType=$("#type").val(); //获取Select选择的Value
    $.ajax({
        type: "post",
        url: "../askleave/apply",
        dataType: "json",
        data: {'since': sinceTime, 'end': endTime,'leaveType':leaveType,'reason':reason},
        success : function(data, textStatus) {
            var status = eval(data).status;
            var info = eval(data).info;
            alert(info);
        },
        error : function(xhr, status, errMsg) {
            alert("申请请假失败!请稍后再试!");
        }
    })
}

///申请证明
function bookProof(){
    var userId=getUrlParam('userId');
    var zone  =getUrlParam('zone');
    var waterNum = $('#orderWater input[name="orderNum"]:checked ').val();
    $.ajax({
        type: "post",
        url: "../water/bookWater",
        dataType: "json",
        data: {'userId': userId, 'waterNum': waterNum,'zone':zone},
        success : function(data, textStatus) {
            var status = eval(data).status;
            var info = eval(data).info;
            if(status==1){
                alert("你成功预定"+waterNum+"桶水,请等待配送!")
            }else {
                alert(info);
            }
        },
        error : function(xhr, status, errMsg) {
            alert("预定饮用水失败,请稍后再试!");
        }
    })
}



/***
 *
 * @param {Object} name 表示参数名
 */

function getUrlParam(name){
    //构造一个含有目标参数的正则表达式对象
    var reg = new RegExp("(^|&)"+ name +"=([^&]*)(&|$)");
    //匹配目标参数
    var r = window.location.search.substr(1).match(reg);
    //返回参数值
    if (r!=null) {
        return unescape(r[2]);
    }
    return null;
}



/**
 *
 *  type 表示页面要加载的是请假记录还是证明记录

function initOrder(){
    var type=getUrlParam(type);
    if(type==1){///显示请假
        $("#main").empty();
        $("#main").append("<br /><div id='proof'></div><br/><div id='proofNav'></div>");
    }else if(type==2){//显示证明
        $("#main").empty();
        $("#main").append("<br /><div id='leave'></div><br/><div id='leaveNav'></div>");
    }
}

 */



