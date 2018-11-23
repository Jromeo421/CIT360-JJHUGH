package hibernate;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author JRome
 */
public class Client {
private long id;
private String full_name;
private String service;
private String appointment;
private long phone;
 
public long getId() {
return id;
}
public void setId(long id) {
this.id = id;
}
public String getFull_Name() {
return full_name;
}
public void setFull_Name(String full_name) {
this.full_name = full_name;
}
public String getService() {
return service;
}
public void setDegree(String degree) {
this.service = service;
}
public String getAppointment() {
return appointment;
}
public void setAppointment(String roll) {
this.appointment = appointment;
}
public String getPhone() {
return phone;
}
public void setPhone(String phone) {
this.phone = phone;
}
}