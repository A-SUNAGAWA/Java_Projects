package animal;

//	ヤモリ。名前、性別を指定してもいいし、しなくてもいい

public class Yamori extends Reptiles{

	// ヤモリが壁に張り付いてるかを判定するフィールド変数
	private boolean withWall;
	// LethalfallYamoriメソッドを召喚するためのパスワード。おまけ。
	private final int PW = 666;

	public Yamori() {
		//	体長はcm(参照:ニホンヤモリ)
		super("ヤモリ", 10, 'M',  true);
	}

	public Yamori(char Gender) {
		// 性別を選ぶ場合のコンストラクタ
		super("ヤモリ", 10, Gender, true);
	}

	public Yamori(String name) {
		// 名前を選ぶ場合のコンストラクタ。先頭に強制的に「ヤモリ」とつく
		super("ヤモリ" + name, 10, 'M', true);
	}

	public Yamori(String n, char g) {
		// 名前、性別を選ぶ場合のコンストラクタ
		super("ヤモリ" + n, 10, g, true);
	}

	private String isC(boolean c) {
		// 「肉食」「草食」を文字化して返すメソッド
		// Mainで呼び出す必要がないので不可視化

		if(c) {
			String hantei = "肉食";
			return hantei;
		}else {
			String hantei = "草食";
			return hantei;
		}
	}


	public void info() {
		// 自己紹介メソッド
		System.out.println("名前:" + this.getName());
		System.out.println("体長:" + this.getBodyLength());
		System.out.println("性別:" + this.getGender());
		System.out.println("食性:" + this.isC(this.isCarnivorous()));
	}

	public void withWall(boolean change) {
		// 	ヤモリが壁に張り付くメソッド
		if(change) {
			System.out.println(this.name + " は壁に張り付いた");
			this.withWall = true;
		}else {
			System.out.println(this.name + " は壁から降りた");
			this.withWall = false;
		}
	}

	public void moving() {
		// ヤモリが壁に張り付いていたら、壁を歩く
		if(withWall) {
			System.out.println(this.name + " は壁を歩いた");
		}else {
			System.out.println(this.name + " はうねうね歩いた");
		}
	}

	public void biting(Animal animal) {
		// 噛みつくメソッド。Mainから呼び出してもいいが特に何も処理しない
		// 小さい動物には噛みつけない(噛みつく必要がない)
		if(animal.bodyLength > 5) {
			System.out.println(this.name + "は" + animal.name + "に噛みついた！");
		}
	}

	public void eating(Animal animal) {
		// たぶん肉食だが、大きい動物を食べることはできない
		if(animal.bodyLength > 5) {
			biting(animal);
			System.out.println(this.name + " は " + animal.name + "を食べようとした");
			System.out.println("しかし大きすぎて食べられなかった");
		}else {
			super.eating(animal);
		}
	}

	public void fallYamori(int pw, Animal animal){
		// 入力されたパスワード(pw)を判定し、LethalFallYamoriメソッドを召喚するメソッド
		if(pw == PW) {
			this.LethalFallYamori(animal);
		}else {
			System.out.println(animal.name + " の近くに" + this.name + "が落ちてきた");
		}
	}


	private void LethalFallYamori(Animal animal) {
		// ヤモリが指定した動物の顔面に落ちてくるメソッド。おまけ。
		System.out.println(this.name + " が突然" + animal.name + " の顔面に落ちてきた！");
		System.out.println(animal.name + " は驚いて心停止した！");
		animal.died();
	}


}
