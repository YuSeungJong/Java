package f_game;

public class Monster {

	String name;	// 이름
	int maxHp; 		// 최대체력
	int hp; 		// 체력
	int maxMp; 		// 최대마나
	int mp; 		// 마나
	int att; 		// 공격력
	int def; 		// 방어력
	int exp; 		// 경험치
	int level; 		// 레벨
	Item[] items; 	// 보유 아이템
	
	Monster(String name, int hp, int mp, int att, int def, Item[] items){
		this.name = name;
		this.maxHp = hp;
		this.maxMp = mp;
		this.hp = this.maxHp;
		this.mp = this.maxMp;
		this.att = att;
		this.def = def;
		this.items = items;
	}
	
	
	void attack(Character m) {
		int damage = att - m.def;
		damage = damage <= 0 ? 1 : damage;
		m.hp = m.hp < damage ? m.hp - m.hp : m.hp - damage;
		System.out.println(name + "가 공격으로" + m.name + "에게" + damage
				+ "만큼 데미지를 주었습니다.");
		System.out.println(m.name + "의 남은 HP : " + m.hp);
	}
	
	Item itemDrop(){
		return items[(int)(Math.random() * items.length)];
	}
	
	
	
}














