package Chpater05;

public class FuncTest_Overload_main {

	public static void main(String[] args) {
		// FuncTest_Overload obj
		FuncTest_Overload01 Obj=new FuncTest_Overload01();
		
		Obj.getResult(4);
		Obj.getResult('A');
		Obj.getResult("월요일 입니다,");
		Obj.getResult(3,"2024");

	}

}
