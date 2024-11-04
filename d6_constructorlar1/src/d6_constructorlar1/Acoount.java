package d6_constructorlar1;

public class Acoount {
	private String hesapno;
	private double bakiye;
	private String isim;
	private String email;
	private String telefono;

	public Acoount() {
		/*this.hesapno="bilgiyok";
		this.bakiye=0.0;
		this.isim="bilgi yok";
		this.email="bilgi yok";
		this.telefono="bilgi yok";*/
		
		this.("bilgi yok",0.0,"bilgi yok","bilgi yok","bilgi yok");
		
		
		 
		
	}

	public Acoount(String hesapno, double bakiye, String isim, String email, String telefono) {
		this.hesapno = hesapno;
		this.bakiye = bakiye;
		this.isim = isim;
		this.email = email;
		this.telefono = telefono;

	}

	public void parayatir(double miktar) {
		bakiye += miktar;
		System.out.println(" yeni bakiye= " + bakiye);

	}

	public void paracekme(double miktar) {
		if (miktar > 1500) {

			System.out.println("bir günden 1500den fazla para çekemezsiniz..");
		}
		if (bakiye - miktar < 0) {
			System.out.println("yeterli bakiye bulunmamaktadır.bakiye:" + bakiye);
		} else {
			bakiye -= miktar;
			System.out.println("yeni bakiye: " + bakiye);
		}

	}

	public String getTelefono() {
		return telefono;
	}

	public void setTelefono(String telefono) {
		this.telefono = telefono;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getIsim() {
		return isim;
	}

	public void setIsim(String isim) {
		this.isim = isim;
	}

	public double getBakiye() {
		return bakiye;
	}

	public void setBakiye(double bakiye) {
		this.bakiye = bakiye;
	}

	public String getHesapno() {
		return hesapno;
	}

	public void setHesapno(String hesapno) {
		this.hesapno = hesapno;
	}

}
