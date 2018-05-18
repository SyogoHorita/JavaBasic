package practice13.common;

public class SuperHero extends Hero{
	//TODO HeroのHP,POWER,ENDURANCEの継承
	public SuperHero() {
		super();
		}
	//フィールド名
	Item equipment;

	public int attack() {
		return super.attack()+equipment.getAdditionalDamage();
	}
	//アクセサ
	public void setEquipment(Item equipment) {
		this.equipment=equipment;
	}
	public Item getEquipment() {
		return this.equipment;
	}
}