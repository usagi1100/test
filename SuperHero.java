package code10_09;

public class SuperHero extends Hero {
	boolean flying;
	int hp = 120;
	String newName;
	
//名前をオーバーライドさせて、かつ過去の名前も呼べるようにしたい
	
	//名前のオーバーライド
	//private String name = "アサカ";
	super.setName("アサカ");
	
	public String getName() {
	   return this.setName;
	 }
	
	public void attack(Matango m) {
		super.attack(m);
		if(this.flying) {
			super.attack(m);
		}
	}
	

	public void fly() {
		this.flying = true;
		System.out.println("飛び上がった");
	}
	
	public void land() {
		this.flying = false;
		System.out.println("着地した！");
	}
	
	public void run() {
		System.out.println(this.getName() + "は撤退した");
	}
	
	public String kakoName() {
		return super.getName(); 
	}


}