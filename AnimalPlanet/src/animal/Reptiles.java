package animal;

public abstract class Reptiles extends Animal {

	//---------フィールド定義 ---------
	protected boolean viviparity;	// 胎生 true or false

	//========コンストラクタ==========
	// 引数なしの場合
	public Reptiles() {
		super();
		this.viviparity = false;	// 卵生
	}

	// 引数4つの場合(名前・体長・雌雄・肉食)
	public Reptiles(String name, int bodyLength, char gender, boolean carnivorous) {
		super(name,bodyLength,gender,carnivorous);
		this.viviparity = false;	// 卵生
	}

	// 引数5つの場合(名前・体長・雌雄・肉食・胎生)
	// ※ 卵生でない爬虫類の例外的な生き物(トカゲ等)に使う
	public Reptiles(String name, int bodyLength, char gender, boolean carnivorous, boolean viviparity) {
			super(name,bodyLength,gender,carnivorous);
			this.viviparity = viviparity;
	}

	//*********** メソッド定義 ***********
	// 脱皮メソッド
	public void moulting() {
		System.out.println(this.name + " は脱皮した。");
	}

}
