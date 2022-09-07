package arkNightsGatya;

public class Rare6_Gentei {
	String genteiName = "限定";
	String medamaName = "ピックアップ";

	public void GenteiHantei(){
		int per = new java.util.Random().nextInt(100);
		if(per < 70) {
			if(per < 35) {
				System.out.println(genteiName + "！！！");
			}else {
				System.out.println(medamaName + "！！");
			}
		}else {
			System.out.println("☆6！");
		}
	}

}
