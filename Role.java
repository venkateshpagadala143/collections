package oopsprograms;

public class Role {
private String name;
private String decription;
private Prevelige[] preveligies;
public String getName() {
	return name;
}
public void setName(String name) {
	this.name = name;
}
public String getDecription() {
	return decription;
}
public void setDecription(String decription) {
	this.decription = decription;
}

public Role(String name, String decription, Prevelige[] preveligies) {
	super();
	this.name = name;
	this.decription = decription;
	this.preveligies = preveligies;
}
public Prevelige[] getPreveligies() {
	return preveligies;
}
public void setPreveligies(Prevelige[] preveligies) {
	this.preveligies = preveligies;
}


}
