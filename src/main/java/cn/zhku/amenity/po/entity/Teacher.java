package cn.zhku.amenity.po.entity;

public class Teacher {
    private String ybEmployid;

    private String scope;

    public String getYbEmployid() {
        return ybEmployid;
    }

    public void setYbEmployid(String ybEmployid) {
        this.ybEmployid = ybEmployid == null ? null : ybEmployid.trim();
    }

    public String getScope() {
        return scope;
    }

    public void setScope(String scope) {
        this.scope = scope == null ? null : scope.trim();
    }
}