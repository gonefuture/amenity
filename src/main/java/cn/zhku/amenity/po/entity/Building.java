package cn.zhku.amenity.po.entity;

public class Building {
    private String buildingno;

    private Integer campus;

    public String getBuildingno() {
        return buildingno;
    }

    public void setBuildingno(String buildingno) {
        this.buildingno = buildingno == null ? null : buildingno.trim();
    }

    public Integer getCampus() {
        return campus;
    }

    public void setCampus(Integer campus) {
        this.campus = campus;
    }
}