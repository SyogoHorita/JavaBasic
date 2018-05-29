package practice13.common;

public class Employee extends Person{
	String departmentNm;
	int departmentCnt;

	public void setDepartmentNm(String departmentNm) {
		this.departmentNm=departmentNm;
	}
	public String getDepartmentNm() {
		return this.departmentNm;
	}
	public void setDepartmentCnt(int departmentCnt) {
		this.departmentCnt=departmentCnt;
	}
	public int getDepartmentCnt() {
		return this.departmentCnt;
	}
}
