import java.util.ArrayList;
import java.util.List;




public class DemoView {
	private Demo demo = new Demo();
	private List<Demo> liste = new ArrayList<Demo>();
	
	private String kullAdi;
	private String sifre;
	
	public String giris() {
		if (kullAdi.equals("tumer") && sifre.equals("1234")) 
			return "dogru";
		else  
			return "yanlis";
		
	}

	
	
	public void kaydet() {
		
		liste.add(demo);
		demo = new Demo();
	}

	public void sil() {
		liste.remove(demo);
		demo = new Demo();
	}

	public void duzenle() {
		demo = new Demo();
	}

	public Demo getDemo() {
		return demo;
	}

	public void setDemo(Demo demo) {
		this.demo = demo;
	}

	public List<Demo> getListe() {
		return liste;
	}

	public void setListe(List<Demo> liste) {
		this.liste = liste;
	}

	public String getKullAdi() {
		return kullAdi;
	}

	public void setKullAdi(String kullAdi) {
		this.kullAdi = kullAdi;
	}

	public String getSifre() {
		return sifre;
	}

	public void setSifre(String sifre) {
		this.sifre = sifre;
	}

	

}
