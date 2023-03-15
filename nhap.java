/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author fpt
 */
public class nhap {
    
}
class SinhVien{
    private String id , name, date,clas;
    private float gpa;

    public void setId(String id) {
        this.id = id;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setDate(String date) {
        this.date = date;
    }

    public void setClas(String clas) {
        this.clas = clas;
    }

    public void setGpa(float gpa) {
        this.gpa = gpa;
    }

    public SinhVien(String id, String name, String date, String clas, float gpa) {
        this.id = id;
        this.name = name;
        this.date = date;
        this.clas = clas;
        this.gpa = gpa;
    }

    public String getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public String getDate() {
        return date;
    }

    public String getClas() {
        return clas;
    }

    public float getGpa() {
        return gpa;
    }

    @Override
    public String toString() {
        return "SinhVien{" + "id=" + id + ", name=" + name + ", date=" + date + ", clas=" + clas + ", gpa=" + gpa + '}';
    }
    
}