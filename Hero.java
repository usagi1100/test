package code10_09;

public class Hero {
	private String name = "ミナト";
	int hp = 100;
	
	public void attack(Matango m) {
		System.out.println(this.name + "の攻撃！");
		m.hp -= 5;
		System.out.println("5ポイントのダメージをあたえた！");
	}
	
	public void run() {
		System.out.println(this.name + "は、逃げ出した！");
	}
	
	public final void slip() {
		System.out.println("dami");
	}
	
	public String getName() {
		return this.name;
	}
	
	public void setName(String name) {
		this.name = name;
	}

}
