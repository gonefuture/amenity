package cn.zhku.amenity.po.entity;

public class RoleTeacher {
    private Integer roleId;

    private String ybEmployid;

    public Integer getRoleId() {
        return roleId;
    }

    public void setRoleId(Integer roleId) {
        this.roleId = roleId;
    }

    public String getYbEmployid() {
        return ybEmployid;
    }

    public void setYbEmployid(String ybEmployid) {
        this.ybEmployid = ybEmployid == null ? null : ybEmployid.trim();
    }
}