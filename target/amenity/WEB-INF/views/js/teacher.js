/**
 * Created by Administrator on 2017/8/24 0024.
 */

/**
 *
 * 用于加载当前学生的以往历史记录
 */
function showHistory(){
    var yb_studentid=getUrlParam(yb_studentid);
    $.ajax({
        type: "get",
        url: "../askleave/query",
        dataType: "json",
        data: {'id': id},
        success: function (data, textStatus) {
            list = eval(data).list;
            var id = list[0].id;
            var ybRealname = list[0].ybRealname;
            var ybCollegename = list[0].ybCollegename;
            var ybClassname = list[0].ybClassname;
            var leaveType = list[0].leaveType;
            if(leaveType==1){
                leaveType="病假";
            }else if(leaveType==2){
                leaveType="事假";
            }
            var sinceTime = list[0].sinceTime;
            var endTime = list[0].endTime;
            sinceTime=sinceTime.substring(0,10);
            endTime=endTime.substring(0,10);
            var reason = list[0].reason;
            $("#main").append("姓名:" + ybRealname +"<br/>学院:"+ybCollegename+"<br/>班级:"+ybClassname+"<br/>请假类型:"+leaveType+"<br/>请假时间:"+sinceTime+"&nbsp&nbsp至&nbsp&nbsp"+endTime+"<br/>请假原因:"+reason+"<br/><button onclick='passLeave("+id+")' >审核通过</button>&nbsp;&nbsp;&nbsp;&nbsp;<button onclick='reject("+id+")'>驳回</button>"+"<hr>");
        }, error: function (xhr, status, errMsg) {
            alert("查找记录失败!请稍后再试");
        }
    });
}
/**
 *  用于showDetail.html加载页面信息
 */
function showDetail() {
    var id = getUrlParam(id);
    $.ajax({
        type: "get",
        url: "../askleave/query",
        dataType: "json",
        data: {'id': id},
        success: function (data, textStatus) {
            list = eval(data).list;
            var id = list[0].id;
            var ybRealname = list[0].ybRealname;
            var ybCollegename = list[0].ybCollegename;
            var ybClassname = list[0].ybClassname;
            var leaveType = list[0].leaveType;
            if(leaveType==1){
                leaveType="病假";
            }else if(leaveType==2){
                leaveType="事假";
            }
            var sinceTime = list[0].sinceTime;
            var endTime = list[0].endTime;
            sinceTime=sinceTime.substring(0,10);
            endTime=endTime.substring(0,10);
            var reason = list[0].reason;
            $("#main").append("<div border=2wpx>"+"姓名:" + ybRealname +"<br/>学院:"+ybCollegename+"<br/>班级:"+ybClassname+"<br/>请假类型:"+leaveType+"<br/>请假时间:"+sinceTime+"&nbsp&nbsp至&nbsp&nbsp"+endTime+"<br/>请假原因:"+reason+"<br/><button onclick='passLeave("+id+")' >审核通过</button>&nbsp;&nbsp;&nbsp;&nbsp;<button onclick='reject("+id+")'>驳回</button>"+"<hr>"+"</div>");
        }, error: function (xhr, status, errMsg) {
            alert("查找记录失败!请稍后再试");
        }
    });
}




/**
 *
 * @param state
 */
function  showLeave(state,pageNum) {
    console.log("1state:   "+state);
    $.ajax({
        type:"get",
        url:"../askleave/query",
        dataType : "json",
        data: {'pageNum': pageNum,'state':state},
        success : function(data, textStatus){
            if(state==1){
                $("#wait").empty();
                $("#waitNav").empty();
            }else if(state==2){
                $("#pass").empty();
                $("#passnav").empty();
            }else if(state==3){
                $("#reject").empty();
                $("#rejectNav").empty();
            }
            console.log("2state:   "+state);
            list = eval(data).list;
            total= eval(data).total;
            console.log("total:"+total);
            if(total==0){
                if(state==1){
                    $("#wait").append("<br/><br/>没有相关的记录哦!");
                }else if(state==2){
                    $("#pass").append("<br/><br/>没有相关的记录哦!");
                }else if(state==3){
                    $("#reject").append("<br/><br/>没有相关的记录哦!");
                }
                console.log("3state:   "+state);
            }else {
                for (var i in list) {
                    var id = list[i].id;
                    var ybRealname = list[i].ybRealname;
                    var ybCollegename = list[i].ybCollegename;
                    var ybClassname = list[i].ybClassname;
                    var leaveType = list[i].leaveType;
                    if(leaveType==1){
                        leaveType="病假";
                    }else if(leaveType==2){
                        leaveType="事假";
                    }
                    var sinceTime = list[i].sinceTime;
                    var endTime = list[i].endTime;
                    sinceTime=sinceTime.substring(0,10);
                    endTime=endTime.substring(0,10);
                    var reason = list[i].reason;
                    var nowState=list[i].state;
                    if(nowState==1){
                        nowState="未审核";
                    }else if(nowState==2){
                        nowState="已通过";
                    }else if(nowState==3){
                        nowState="已驳回";
                    }
                    console.log(ybClassname);
                    console.log(reason);
                    if(state==1){
                        $("#wait").append("姓名:" + ybRealname +"<br/>学院:"+ybCollegename+"<br/>班级:"+ybClassname+"<br/>请假类型:"+leaveType+"<br/>请假时间:"+sinceTime+"&nbsp&nbsp至&nbsp&nbsp"+endTime+"<br/>请假原因:"+reason+"<br/>状态:"+nowState+"<br/><a href='leaveDetail.html?id="+id+"'><button >审核</button></a>"+"<hr>");
                    }else if(state==2){
                        $("#pass").append("姓名:" + ybRealname +"<br/>学院:"+ybCollegename+"<br/>班级:"+ybClassname+"<br/>请假类型:"+leaveType+"<br/>请假时间:"+sinceTime+"&nbsp&nbsp至&nbsp&nbsp"+endTime+"<br/>请假原因:"+reason+"<br/>状态:"+nowState+"<hr>");
                     }else if(state==3){
                        console.log("这里执行了!很好");
                        $("#reject").append("姓名:" + ybRealname +"<br/>学院:"+ybCollegename+"<br/>班级:"+ybClassname+"<br/>请假类型:"+leaveType+"<br/>请假时间:"+sinceTime+"&nbsp&nbsp至&nbsp&nbsp"+endTime+"<br/>请假原因:"+reason+"<br/>状态:"+nowState+"<hr>");
                    }

                }
                console.log("4state:  "+state);
               // showPage(eval(data).pages,eval(data).pageNum,1,state,total);///1表示当前显示的是请假记录的页码
            }
        },
        error : function(xhr, status, errMsg) {
            alert("查找记录失败!请稍后再试");
        }
    });
}

/**
 *
 * @param pages 表示总页数
 * @param pageNum 表示当前页面
 * @param type表示订单类型,1表示为请假记录,2表示为证明记录
 * @param state表示订单状态
 * @param total表示记录总数
 */
function showPage(pages,pageNum,type,state,total){
    var pageNav;
    var functionName;
    if(type==1){
        if(state==1){
            pageNav="#waitNav";
            functionName="showLeave";
        }else if(state==2){
            pageNav="#passNav";
            functionName="showLeave";
        }else if(state==3){
            pageNav="#rejectNav";
            functionName="showLeave";
        }
    }else if(type==2){
        pageNav="#proofNav";
        functionName="showProof";
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
    console.log(pageNav);
    if(pageNum!=1){
        $(pageNav).append("<button type='button' class='btn btn-info' onclick='"+functionName+"("+state+","+pre+")"+"'>上一页</button>");
    }
    for(var i=begin;i<=end;++i){
        if(i===pageNum){
            $(pageNav).append("<button type='button' class='btn btn-success' ><b>"+i+"</b></button>");
        }else{
            $(pageNav).append("<button type='button' class='btn btn-info' onclick='"+functionName+"("+state+","+i+")"+"'>"+i+"</button>");
        }
    }
    if(pageNum!=pages){
        $(pageNav).append("<button type='button' class='btn btn-info' onclick='"+functionName+"("+state+","+next+")"+"'>下一页</button>");
    }
    $(pageNav).append("<br/>共"+total+"条记录");
}



/**
 * 审核通过请假
 * @param id  请假单号
 */
function  passLeave(id) {
    $.ajax({
        type:"get",
        url:"../askleave/audit",
        dataType : "json",
        data: {'id': id,'state':2},
        success : function(data, textStatus){
            var msg = eval(data).msg;
            var info = eval(data).info;
            if(msg==4){
                alert(info)
            }else{
                alert("审核通过成功!");
                window.location.href="index.html";///审核完成之后跳到主页,继续进行审核
            }
        },
        error : function(xhr, status, errMsg) {
            alert("查找记录失败!请稍后再试");
        }
    });
}

/**
 * 驳回请假
 * @param id  请假单号
 */
function reject(id) {
    id=23;
    $.ajax({
        type:"get",
        url:"../askleave/audit",
        dataType : "json",
        data: {'id': id,'state':3},
        success : function(data, textStatus){
            var msg = eval(data).msg;
            var info = eval(data).info;
            if(msg==4){
                alert(info)
            }else{
                alert("审核驳回成功!");
                window.location.href="index.html";///审核完成之后跳到主页,继续进行审核
            }
        },
        error : function(xhr, status, errMsg) {
            alert("查找记录失败!请稍后再试");
        }
    });
}

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
