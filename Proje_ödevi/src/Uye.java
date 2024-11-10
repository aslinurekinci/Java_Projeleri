
import java.util.ArrayList;
import java.util.List;

public class Uye {
    private String isim;
    private int uyeNo;
    private List<Kitap> oduncAlinanKitaplar;
    private List<String> oduncGecmisi;

    public Uye(String isim, int uyeNo) {
        this.isim = isim;
        this.uyeNo = uyeNo;
        this.oduncAlinanKitaplar = new ArrayList<>();
        this.oduncGecmisi = new ArrayList<>();
    }

    public String getIsim() {
        return isim;
    }

    public void setIsim(String isim) {
        this.isim = isim;
    }

    public int getUyeNo() {
        return uyeNo;
    }

    public void setUyeNo(int uyeNo) {
        this.uyeNo = uyeNo;
    }

    public List<Kitap> getOduncAlinanKitaplar() {
        return oduncAlinanKitaplar;
    }

    public void setOduncAlinanKitaplar(List<Kitap> oduncAlinanKitaplar) {
        this.oduncAlinanKitaplar = oduncAlinanKitaplar;
    }

    public List<String> getOduncGecmisi() {
        return oduncGecmisi;
    }

    public void oduncGecmisiEkle(String kayit) {
        oduncGecmisi.add(kayit);
    }

    public void kitapOduncAl(Kitap kitap) {
        oduncAlinanKitaplar.add(kitap);
        kitap.setMevcut(false);
    }

    public void kitapIadeEt(Kitap kitap) {
        oduncAlinanKitaplar.remove(kitap);
        kitap.setMevcut(true);
    }
}