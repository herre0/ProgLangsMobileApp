package mert.prog.dilleri;

public class language {
    String app1;
    String app2;
    String app3;
    String app4;
    String app5;
    String company;
    int compare;
    String description;
    int id;
    String image;
    String image2;
    String name;
    String types;

    public language(String name2, String image3, String company2, String description2, String app12, String app22, String app32, String app42, String app52, int compare2, String types2) {
        this.name = name2;
        this.image = image3;
        this.company = company2;
        this.description = description2;
        this.app1 = app12;
        this.app2 = app22;
        this.app3 = app32;
        this.app4 = app42;
        this.app5 = app52;
        this.compare = compare2;
        this.types = types2;
    }

    public int getId() {
        return this.id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return this.name;
    }

    public void setName(String name2) {
        this.name = name2;
    }

    public String getImage() {
        return this.image;
    }

    public void setImage(String image3) {
        this.image = image3;
    }

    public String getImage2() {
        return this.image2;
    }

    public void setImage2(String image22) {
        this.image2 = image22;
    }

    public String getCompany() {
        return this.company;
    }

    public void setCompany(String company2) {
        this.company = company2;
    }

    public String getDescription() {
        return this.description;
    }

    public void setDescription(String description2) {
        this.description = description2;
    }

    public String getApp1() {
        return this.app1;
    }

    public void setApp1(String app12) {
        this.app1 = app12;
    }

    public String getApp2() {
        return this.app2;
    }

    public void setApp2(String app22) {
        this.app2 = app22;
    }

    public String getApp3() {
        return this.app3;
    }

    public void setApp3(String app32) {
        this.app3 = app32;
    }

    public String getApp4() {
        return this.app4;
    }

    public void setApp4(String app42) {
        this.app4 = app42;
    }

    public String getApp5() {
        return this.app5;
    }

    public void setApp5(String app52) {
        this.app5 = app52;
    }

    public int getCompare() {
        return this.compare;
    }

    public void setCompare(int compare2) {
        this.compare = compare2;
    }

    public String getTypes() {
        return this.types;
    }

    public void setTypes(String types2) {
        this.types = types2;
    }
}

