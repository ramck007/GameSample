
public class Player2 extends Player1 {
	private int health;
	private boolean armour; 
	
	public Player2(String name, String weapon, int health, boolean armour) {
		super(name, weapon, health);
		this.health=health;
		this.armour=armour;
	}
	
	@Override
	public void shotbyGun1() {
		if(armour) {
			this.health-=20;
			if(this.health<=0) this.health=0;
			System.out.println("Armour is on."+getName()+" Got Shot by Gun1. 1.Health is reduced by 20. "+"New Health is "+this.health);
			if(this.health==0) {
				System.out.println(getName()+" is dead");
			}
		}
		if(!armour) {
			this.health-=30;
			if(this.health<=0) this.health=0;
			System.out.println("Armour is off."+getName()+" Got Shot by Gun1. 1.Health is reduced by 30. "+"New Health is "+this.health);
			if(this.health==0) {
				System.out.println(getName()+" is dead");
			}
		}
	}
	
	@Override
	public void shotbyGun2() {
		if(armour) {
			this.health-=40;
			if(this.health<=0) this.health=0;
			System.out.println("Armour is on."+getName()+" Got Shot by Gun2. 1.Health is reduced by 40. "+"New Health is "+this.health);
			if(this.health==0) {
				System.out.println(getName()+" is dead");
			}
		}
		if(!armour) {
			this.health-=50;
			if(this.health<=0) this.health=0;
			System.out.println("Armour is off."+getName()+" Got Shot by Gun2. 1.Health is reduced by 50. "+"New Health is "+this.health);
			if(this.health==0) {
				System.out.println(getName()+" is dead");
			}
		}
	}
	
	public void heal() {
		if(this.health<=0) {
			System.out.println(getName()+" is dead. So heal can't be possible");
		}
		else {
			this.health=100;
			System.out.println("Health Boosted "+this.health);
		}
	}
	

}
