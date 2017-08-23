package cn.zhku.amenity.po.entity;

public class Proof {
    private Integer id;

    private String ybRealname;

    private String ybShoolname;

    private String ybCollegename;

    private String ybClassname;

    private String ybEnteryear;

    private String ybEmployid;

    private String address;

    private Integer state;

    private String pic;

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

    public String getYbShoolname() {
        return ybShoolname;
    }

    public void setYbShoolname(String ybShoolname) {
        this.ybShoolname = ybShoolname == null ? null : ybShoolname.trim();
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

    public String getYbEnteryear() {
        return ybEnteryear;
    }

    public void setYbEnteryear(String ybEnteryear) {
        this.ybEnteryear = ybEnteryear == null ? null : ybEnteryear.trim();
    }

    public String getYbEmployid() {
        return ybEmployid;
    }

    public void setYbEmployid(String ybEmployid) {
        this.ybEmployid = ybEmployid == null ? null : ybEmployid.trim();
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address == null ? null : address.trim();
    }

    public Integer getState() {
        return state;
    }

    public void setState(Integer state) {
        this.state = state;
    }

    public String getPic() {
        return pic;
    }

    public void setPic(String pic) {
        this.pic = pic == null ? null : pic.trim();
    }
}