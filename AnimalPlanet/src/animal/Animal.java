package animal;

public abstract class Animal {

	//---------フィールド定義 ---------
	protected boolean life = true;	// 生死  true or false
	protected String name;			// 名前
	protected int bodyLength;		// 体長(頭（顔）の先端からお尻までの長さ)
	protected char gender; 			// 雌雄 M(オス) F(メス) U(不明)
	protected boolean carnivorous;	// 肉食 true or false

	//========コンストラクタ==========
	// 引数なしの場合
	public Animal() {
		this.name = "UMA";
		this.bodyLength = 0;
		this.gender = 'U';
		this.carnivorous = false;
		System.out.println(this.name + "が火星に誕生した！");
	}

	// 引数4つの場合(名前・体長・雌雄・肉食)
	public Animal(String name, int bodyLength, char gender, boolean carnivorous) {
		this.name = name;
		this.bodyLength = bodyLength;
		this.gender = gender;
		this.carnivorous = carnivorous;
		System.out.println(this.name + "が惑星に誕生した！");
	}

	//*********** メソッド定義 ***********

	//----------- 移動メソッド【抽象メソッド】 -----------
	public abstract void moving() ;

	//----------- 食べるメソッド -----------
	// 引数として渡された動物を食べるメソッド
	public void eating(Animal animal) {

		// 肉食 or 草食
		if(this.carnivorous) {
			System.out.println(this.name + " は " + animal.name + "を食べた");
			//食べられた動物は死亡する
			animal.died();
		}else {
			System.out.println(this.name + " は " + animal.name + "は食べれない！");
			System.out.println(this.name + " は草を食べた");
		}

	}
	//----------- 死亡メソッド -----------
	// 引数として渡された動物を食べるメソッド
	public void died() {
		System.out.println(this.name + " は死亡した");
		this.life = false;
	}

	//----------- ゲッター -----------
	public String getName() {
		return name;
	}

	public int getBodyLength() {
		return bodyLength;
	}

	public char getGender() {
		return gender;
	}

	public boolean isCarnivorous() {
		return carnivorous;
	}

}