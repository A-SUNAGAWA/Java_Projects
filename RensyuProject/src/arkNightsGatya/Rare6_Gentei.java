package arkNightsGatya;

public class Rare6_Gentei {
	String genteiName;
	String medamaName;

	public Rare6_Gentei(String gName, String mName){
		this.genteiName = gName;
		this.medamaName = mName;
	}

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
