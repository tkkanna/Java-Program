public class L5p2
private int eid;
private String ename;
private static String companyName;
public L5p2(int eid, String ename) 
this.eid = eid;
this.ename = ename;
｝
public static void setCompanyName(String name) {
companyName = name;
}
public static String getCompanyName () {
return companyName;
public int getEid() {
return eid;
}
public void setEid(int eid) {
this. eid = eid;
public String getEname() {
return ename;
}
public void setEname (String ename) {
this.ename = ename;
}
public static void main(String[] args) {
L5p2. setCompanyName ("Anudip Corp");
L5p2 emp1 = new L5p2(101, "kanna");
L5p2 emp2 = new L5p2(102, "kanna");

System.out. println("Employee 1 Details:");
System.out.println("ID: " + empl.getEid());
System. out. printin("Name+ empl.getEname());

System.out.printin("Company: " + L5p2.getCompanyName());
System.out. printIn("\nEmployee 2 Details:");
System. out. println("ID: " + emp2.getEid());
System.out. printIn("Name: " + emp2. getEname ());
System. out. println("Company: " + L5p2. getCompanyName ());
}
}