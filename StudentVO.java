public class StudentVO{
	private String name;
	private int rollNo;

	StudentVO(String name, int rollNo){
		this.name = name;
		this.rollNo = rollNo;
	}
	public void setName(String name){
		this.name = name;
	}
	public void setRollNo(int rollNo){
		this.rollNo = rollNo;
	}
	public String getName(){
		return name;
	}
	public int getRollNo(){
		return rollNo;
	}
}
