package cn.zhku.amenity.po.entity;

import java.util.Date;

public class Askleave {
    private Integer id;

    private String ybRealname;

    private String ybSchoolname;

    private String ybCollegename;

    private String ybClassname;

    private String ybStudentid;

    private Integer leaveType;

    private String ybEmployid;

    private Integer state;

    private Date sinceTime;

    private Date endTime;

    private Date leaveTime;

    private String reason;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getYbRealname() {
        return ybRealname;
    }

    public void setYbRealname(String ybRealname) {
        this.ybRealname = ybRealname == null ? null : ybRealname.trim();
    }

    public String getYbSchoolname() {
        return ybSchoolname;
    }

    public void setYbSchoolname(String ybSchoolname) {
        this.ybSchoolname = ybSchoolname == null ? null : ybSchoolname.trim();
    }

    public String getYbCollegename() {
        return ybCollegename;
    }

    public void setYbCollegename(String ybCollegename) {
        this.ybCollegename = ybCollegename == null ? null : ybCollegename.trim();
    }

    public String getYbClassname() {
        return ybClassname;
    }

    public void setYbClassname(String ybClassname) {
        this.ybClassname = ybClassname == null ? null : ybClassname.trim();
    }

    public String getYbStudentid() {
        return ybStudentid;
    }

    public void setYbStudentid(String ybStudentid) {
        this.ybStudentid = ybStudentid == null ? null : ybStudentid.trim();
    }

    public Integer getLeaveType() {
        return leaveType;
    }

    public void setLeaveType(Integer leaveType) {
        this.leaveType = leaveType;
    }

    public String getYbEmployid() {
        return ybEmployid;
    }

    public void setYbEmployid(String ybEmployid) {
        this.ybEmployid = ybEmployid == null ? null : ybEmployid.trim();
    }

    public Integer getState() {
        return state;
    }

    public void setState(Integer state) {
        this.state = state;
    }

    public Date getSinceTime() {
        return sinceTime;
    }

    public void setSinceTime(Date sinceTime) {
        this.sinceTime = sinceTime;
    }

    public Date getEndTime() {
        return endTime;
    }

    public void setEndTime(Date endTime) {
        this.endTime = endTime;
    }

    public Date getLeaveTime() {
        return leaveTime;
    }

    public void setLeaveTime(Date leaveTime) {
        this.leaveTime = leaveTime;
    }

    public String getReason() {
        return reason;
    }

    public void setReason(String reason) {
        this.reason = reason == null ? null : reason.trim();
    }
}