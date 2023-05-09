package in.ineuron.model;

import lombok.AllArgsConstructor;
import lombok.Data;

public class Student {
@Override
public String toString() {
	return "Student [firstname=" + firstname + ", lastname=" + lastname + ", age=" + age + ", profession=" + profession
			+ "]";
}
public String getFirstname() {
	return firstname;
}
public void setFirstname(String firstname) {
	this.firstname = firstname;
}
public String getLastname() {
	return lastname;
}
public void setLastname(String lastname) {
	this.lastname = lastname;
}
public Integer getAge() {
	return age;
}
public void setAge(Integer age) {
	this.age = age;
}
public String getProfession() {
	return profession;
}
public void setProfession(String profession) {
	this.profession = profession;
}
private String firstname;
private String lastname;
private Integer age;
private String profession;

}
