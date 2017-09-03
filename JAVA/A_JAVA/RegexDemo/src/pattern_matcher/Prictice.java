package pattern_matcher;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
/*
 * ���õļ����������ʽ
 * ����֤�������֤����\\d{15}|\\d{18}��
 * email����֤��"\\w+([-+.]\\w+)*@\\w+([-.]\\w+)*\\.\\w+([-.]\\w+)*"
 * ip��ַ�ļ�飺"\\d{1,3}+\\.\\d{1,3}+\\.\\d{1,3}+\\.\\d{1,3}"
 * �������ļ�飺"^[\u4e00-\u9fa5]+$"
 * �ַ���ƥ��ķ��� "\\d+"
 * �绰�����ƥ�䣺"[1][3,5]\\d{9}"
 * X?��ʾһ�������  ����
 * X+��ʾһ������  ̰��
*/


/**
 * A typical invocation sequence is thus 

 Pattern p = Pattern.compile("a*b");
 Matcher m = p.matcher("aaaaab");
 boolean b = m.matches();
 
 A matches method is defined by this class as a convenience for 
 when a regular expression is used just once. 
 This method compiles an expression and matches an input sequence 
 against it in a single invocation. The statement 

 boolean b = Pattern.matches("a*b", "aaaaab");

is equivalent to the three statements above, 
though for repeated matches it is less efficient 
since it does not allow the compiled pattern to be reused
 *
 */
public class Prictice {
	
	public Prictice() throws IOException{
	Pattern p = null; //�������ʽ 
	Matcher m = null; //�������ַ��� 
	boolean b = false;
	String input=getString();
	System.out.println(input);
	
	//����һ��ģʽ
	p=creatRegex(getRegex());
	//����һ��ƥ��
	m=creatMatcher(p,input);
	//�����ѯ���
	doSomeWork(input,getRegex(),m);
	}
	private String getRegex() {
		String string="<a\\s.*?href=\"([^\"]+)\"[^>]*>(.*?)</a>";
		string=".*<a.*?</a>.*";
		return string;
	}
	
	
	private void doSomeWork(String input, String regex, Matcher m) {
		   System.out.println("��Ҫ���������Ϊ �� "+input);
		   System.out.println("      �������ʽΪ ��"+regex);
		   System.out.println("------------------------------------");
		  if(m.matches()){
			    System.out.println("ƥ��ɹ�");
			    while(m.find()){
					 System.out.println(m.group());
					 }
		  }
		  else{
			    System.out.println("ƥ�䲻�ɹ�");
		  }
		
    }
	
	/**
	 * ���ݵ�ǰƥ���ַ�������һ��ƥ��
	 * @param p
	 * @param input
	 * @return
	 */
	private Matcher creatMatcher(Pattern p, String input) {
		Matcher matcher=p.matcher(input);
		return matcher;
	}
	
	
	/**
	 * ����һ���Ѿ�����õ��������ʽ
	 * @param regex
	 * @return
	 */
	public Pattern creatRegex(String regex){
		Pattern pattern=Pattern.compile(regex);
		return pattern;
	}
	public static void main(String argus[]) throws IOException{
	      new Prictice();
	}
	
	private String getString() throws IOException {
		StringBuffer buffer=new StringBuffer();
		
		File file=new File("d://search.txt");
		BufferedReader reader=new BufferedReader(new FileReader(file));
		String data=null;
		while((data=reader.readLine())!=null)
		{
			buffer=buffer.append(data);
		}
		reader.close();
		return buffer.toString();
	}
}