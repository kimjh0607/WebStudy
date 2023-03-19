package weekend;

public class StringConcatImpl implements StringConcat{

    //위에 두 매서드를 지우고 메서드 형태 그대로 생성자로 교체 해서 제작
	public StringConcatImpl(String str) {
		System.out.println("good!!"+str);
	}

	public void makeString(String s1, String s2) {
        System.out.println(s1+","+s2);
        print("123");
    }

    public void print(String str) {
        System.out.println("good!!"+str);
    }
	
		

}