package poly;
class Base{
  String var="BaseVar";  //实例变量
  static String staticVar="StaticBaseVar";  //静态变量

  void method(){  //实例方法
     System.out.println("Base method");
  }
  static void staticMethod(){  //静态方法
     System.out.println("Static Base method");
  }
}

public class Sub extends Base{
  String var="SubVar";  //实例变量
  static String staticVar="StaticSubVar";  //静态变量

  void method(){  //覆盖父类的method()方法 
     System.out.println("Sub method");
  }
  static void staticMethod(){  //隐藏父类的staticMethod()方法
      System.out.println("Static Sub method");
  }

  String subVar="Var only belonging to Sub";
  void subMethod(){
      System.out.println("Method only belonging to Sub");
  }

  public static void main(String args[]){
    Base who=new Sub();  //who被声明为Base类型，引用Sub实例
    System.out.println("who.var="+who.var);  //打印Base类的var变量
    System.out.println("who.staticVar="+who.staticVar); //打印Base类的staticVar变量
    who.method();  //打印Sub实例的method()方法
    who.staticMethod();  //打印Base类的staticMethod()方法
  }
}



/****************************************************
 * 作者：孙卫琴                                     *
 * 来源：<<Java面向对象编程>>                       *
 * 技术支持网址：www.javathinker.org                *
 ***************************************************/
