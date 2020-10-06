public class Student{

private String name;
private String email;
private String surname;


public String getName(){
return name;
}
public void setName(String name){
this.name = name;
}

public String getSUrname(){
return surname;
}
public void setSurname(String surname){
this.surname = surname;
}

public String getEmail(){
return email;
}
public void setEmail(String email){
this.email = email;
}


public String toString(){

return "\nname = " +name  + "\nSurname = "+surname +"\nEmail = "+email;
}

public void display(){
System.out.println("----------------------------------------------------");
System.out.println("Name = "+name);
System.out.println("Surname = "+surname);
System.out.println("Email = "+email);
System.out.println("---------------------------------------------------- \n");
}

}
