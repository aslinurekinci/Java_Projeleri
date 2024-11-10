
import java.time.LocalDate;

public class Kitap {
    private String baslik;
    private String yazar;
    private String ISBN;
    private boolean mevcut;
    private LocalDate oduncAlmaTarihi;
    private LocalDate iadeTarihi;
    private String oduncAlanUye;

    public Kitap(String baslik, String yazar, String ISBN, boolean mevcut) {
        this.baslik = baslik;
        this.yazar = yazar;
        this.ISBN = ISBN;
        this.mevcut = mevcut;
        this.oduncAlmaTarihi = null;
        this.iadeTarihi = null;
        this.oduncAlanUye = null;
    }

    public String getBaslik() {
        return baslik;
    }

    public void setBaslik(String baslik) {
        this.baslik = baslik;
    }

    public String getYazar() {
        return yazar;
    }

    public void setYazar(String yazar) {
        this.yazar = yazar;
    }

    public String getISBN() {
        return ISBN;
    }

    public void setISBN(String iSBN) {
        ISBN = iSBN;
    }

    public boolean isMevcut() {
        return mevcut;
    }

    public void setMevcut(boolean mevcut) {
        this.mevcut = mevcut;
    }

    public String getKitapBilgisi() {
        return "Başlık: " + baslik + ", Yazar: " + yazar + ", ISBN: " + ISBN + ", Mevcut: " + mevcut
                + ", Ödünç Alma Tarihi: " + (oduncAlmaTarihi != null ? oduncAlmaTarihi : "Belirtilmemiş")
                + ", İade Tarihi: " + (iadeTarihi != null ? iadeTarihi : "Belirtilmemiş")
                + ", Ödünç Alan Üye: " + (oduncAlanUye != null ? oduncAlanUye : "Belirtilmemiş");
    }

    public LocalDate getOduncAlmaTarihi() {
        return oduncAlmaTarihi;
    }

    public void setOduncAlmaTarihi(LocalDate oduncAlmaTarihi) {
        this.oduncAlmaTarihi = oduncAlmaTarihi;
    }

    public String getOduncAlanUye() {
        return oduncAlanUye;
    }

    public void setOduncAlanUye(String oduncAlanUye) {
        this.oduncAlanUye = oduncAlanUye;
    }

    public LocalDate getIadeTarihi() {
        return iadeTarihi;
    }

    public void setIadeTarihi(LocalDate iadeTarihi) {
        this.iadeTarihi = iadeTarihi;
    }
}