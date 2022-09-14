package assignment4java;

public class student {

	 int stdId;
	 String stdName;
	 Integer marks;
	 student( int stdId,String stdName,Integer marks){
		 this.stdId=stdId;
		 this.stdName=stdName;
		 this.marks=marks;
	 }
	@Override
	public String toString() {
		return "student [stdId=" + stdId + ", stdName=" + stdName + ", marks=" + marks + "]";
	}
	public int getStdId() {
		return stdId;
	}
	public void setStdId(int stdId) {
		this.stdId = stdId;
	}
	public String getStdName() {
		return stdName;
	}
	public void setStdName(String stdName) {
		this.stdName = stdName;
	}
	public int getMarks() {
		return marks;
	}
	public void setMarks(Integer marks) {
		this.marks = marks;
	}
	}

