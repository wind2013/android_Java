package secondforcopy;

//如果只含有基本数据类型，使用super.clone()实现field to field的拷贝
class Student implements Cloneable {   
	String name;
	int age;

	Student(String name, int age) {
		this.name = name;
		this.age = age;
	}

	public Object clone() {
		Object o = null;
		try {
			// Object中的clone()识别出你要复制的是哪一个对象
			o = (Student) super.clone();  //allow for field to field
		} catch (CloneNotSupportedException e) {
			System.out.println(e.toString());
		}
		return o;
	}

	public static void main(String[] args) {
		Student s1 = new Student("zhangsan", 18);
		Student s2 = (Student) s1.clone();
		s2.name = "lisi";
		s2.age = 20;
		System.out.println("name=" + s1.name + "," + "age=" + s1.age);// 修改学生2后，不影响学生1的值。
	}
}
