package secondforcopy;

//���ֻ���л����������ͣ�ʹ��super.clone()ʵ��field to field�Ŀ���
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
			// Object�е�clone()ʶ�����Ҫ���Ƶ�����һ������
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
		System.out.println("name=" + s1.name + "," + "age=" + s1.age);// �޸�ѧ��2�󣬲�Ӱ��ѧ��1��ֵ��
	}
}