package single;

public class Student extends citizen {
	private int sid;
	private String course;
	public Student() {
		super();
	}
	public Student(int cid,String name,int age,int sid,String course)
	{
		super(cid,name,age);
		this.sid=sid;
		this.course=course;
	}
	public int getSid() {
		return sid;
	}
	public void setSid(int sid) {
		this.sid = sid;
	}
	public String getCourse() {
		return course;
	}
	public void setCourse(String course) {
		this.course = course;
	}
	@Override
	public String toString() {
		return "Student [sid=" + sid + ", course=" + course + ",Cid="+getCid()+",Name="+getName()+",Age="+getAge()+"]";
	}
}
	


