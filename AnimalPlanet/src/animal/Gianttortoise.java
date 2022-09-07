package animal;

public class Gianttortoise extends Reptiles {
	public Gianttortoise() {
		this.name = "ゾウガメ";
		this.bodyLength = 130;
		this.gender = '雌';
		this.carnivorous = false;
		//System.out.println(this.name + "が火星に誕生した！");

	}

	public void moving() {
		System.out.println(this.name + "はのそのそ歩いた");

	}
	public void moulting() {
		System.out.println(this.name + " は脱皮した!");
	}
	public String toString() {
		return "名前:" + this.name + "/体長:" + this.bodyLength + "/性別:" + this.gender;
	}
	public void die() {
		System.out.println(this.name + "は寿命を迎えた");
	}
	public void info() {
		System.out.println("開けた草原や有刺植物からなる藪地・Scalesia属からなる森林・サボテンや低木が散在する荒地・火山の斜面など様々な環境に生息する。低地の乾燥地と高地の水場を往復する種もいて、これにより踏み固めた「道」を作ることもある。\r\n" +
				"\r\n" +
				"植物食で、草本や低木・サボテンを含む多肉植物の葉、果実、花などを主に食べるが、シダ植物、コケ植物、地衣類などを食べることもある。\r\n" +
				"\r\n" +
				"繁殖様式は卵生。繁殖期になるとオスは他のオスに対して体当たりや頭突きをして追い払う。オスは交尾の際に唸り声のような呼吸音をあげることもある。6 - 12月に1回に3 - 26個の卵を年に1 - 4回に分けて産む。卵は100 - 200日で孵化し、1 - 3月に孵化することが多い。孵化後も幼体は卵黄を消費しつつ地中に留まり、気温が低くなり降雨があると地表に現れる。\r\n" +
				"\r\n" +
				"不確実な長寿記録としてオーストラリア動物園で2006年に死亡した個体の170年（推定年齢175歳）という飼育記録がある（ハリエット）。ハリエット（当初は大型であるためオスと考えられハリーとされていた）はJohn Clements Wickhamがブリスベン植物園（ブリスベン植物園での飼育開始時の記録は失われている）に寄贈したとされる個体で、WickhamにCharles Darwinが3頭のガラパゴスゾウガメを譲渡したことを示唆する文章があるとされる。1994年に地方新聞への投稿から調査が進められ、記録に空白期間があるもののハリエットが1835年にDarwinによって捕獲された可能性が考えられるようになった。一方でハリエットは形態からサンクリストバルゾウガメだと考えられていたが、ミトコンドリアDNAの分子解析からCharles Darwinが寄港していないサンタクルス島に分布するサンタクルスゾウガメC. porteri（後に2種に分割）とする解析結果が得られたため、Darwinに由来する個体ではないとする説もある。");
	}
}