package Chpater06;

public class TeamMember {
	
	//�ʵ�=�������
	public String teamName;//����
	public String mName;//����
	public String mPhone;//���� ��ȣ
	public String sName;//������
	public String Name;//������
	public String gender;//����
	
	//�⺻ ������
	public TeamMember() {
		
	}
	
	//������ �����ε�(�����)
	public TeamMember(String name, String gender) {
		this.Name=name;
		this.gender=gender;

	}


	//getter and setters
	public String getTeamName() {
		return teamName;
	}

	public void setTeamName(String teamName) {
		this.teamName = teamName;
	}

	public String getmName() {
		return mName;
	}

	public void setmName(String mName) {
		this.mName = mName;
	}

	public String getmPhone() {
		return mPhone;
	}

	public void setmPhone(String mPhone) {
		this.mPhone = mPhone;
	}

	public String getsName() {
		return sName;
	}

	public void setsName(String sName) {
		this.sName = sName;
	}

	public String getName() {
		return Name;
	}

	public void setName(String name) {
		Name = name;
	}

	public String getGender() {
		return gender;
	}

	public void setGender(String gender) {
		this.gender = gender;
	}
	
	
}
