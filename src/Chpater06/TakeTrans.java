package Chpater06;

public class TakeTrans {

	public static void main(String[] args) {
		
		//학생 2명 생성(studentJaames,studentTom)
		StdInfo studentJames = new StdInfo("James",15000);
		StdInfo studentTom = new StdInfo("Tom",12000);
		
		//버스타기(100)
		Bus bus100=new Bus(100);
		studentJames.takeBus(bus100);//13600
		//James 정보보기
		studentJames.showinfo();
		bus100.showinfo();
		
		//버스타기(999)
		Bus bus999=new Bus(999);
		studentTom.takeBus(bus999);//10600
		//Tom 정보보기
		studentTom.showinfo();
		bus999.showinfo();
//-------------------------------------------
		//지하철 타기(1호선)
		Subway subway1=new Subway("1호선");//String이니까 1에 쌍따옴표해야함
		studentJames.takesubway(subway1);
		studentJames.showinfo();
		subway1.showinfo();
		
		Subway subwayOrange=new Subway("3호선");
		studentTom.takesubway(subwayOrange);
		studentTom.showinfo();
		subwayOrange.showinfo();
		
		
	}

}
