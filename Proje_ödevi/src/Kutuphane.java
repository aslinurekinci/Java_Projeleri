
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public class Kutuphane {
    private List<Kitap> kitaplar;
    private List<Uye> uyeler;

    public Kutuphane() {
        kitaplar = new ArrayList<>();
        uyeler = new ArrayList<>();
    }

    // Kitap İşlemleri

    public void kitapEkle(Kitap kitap) {
        kitaplar.add(kitap);
    }

    public void kitapSil(Kitap kitap) {
        kitaplar.remove(kitap);
    }

    public Kitap kitapAra(String ISBN) {
        for (Kitap kitap : kitaplar) {
            if (kitap.getISBN().equals(ISBN)) {
                return kitap;
            }
        }
        return null;
    }

    public List<Kitap> tumKitaplariListele() {
        return kitaplar;
    }

    // Üye İşlemleri

    public void uyeEkle(Uye uye) {
        uyeler.add(uye);
    }

    public void uyeSil(Uye uye) {
        uyeler.remove(uye);
    }

    public Uye uyeAra(int uyeNo) {
        for (Uye uye : uyeler) {
            if (uye.getUyeNo() == uyeNo) {
                return uye;
            }
        }
        return null;
    }

    public List<Uye> tumUyeleriListele() {
        return uyeler;
    }

    // Ödünç Alma İşlemleri

    public void kitapOduncVer(Uye uye, Kitap kitap) {
        if (!kitap.isMevcut()) {
            System.out.println("Kitap şu anda başka bir üyede!");
            return;
        }
        
        if (uye.getOduncAlinanKitaplar().size() >= 5) {
            System.out.println("Üye maksimum kitap sayısına ulaşmış!");
            return;
        }
        
        LocalDate bugun = LocalDate.now();
        kitap.setOduncAlmaTarihi(bugun);
        kitap.setIadeTarihi(bugun.plusDays(14));
        kitap.setOduncAlanUye(uye.getIsim());
        
        uye.kitapOduncAl(kitap);
        String gecmisKayit = String.format("%s - %s kitabını ödünç aldı", 
            bugun.toString(), kitap.getBaslik());
        uye.oduncGecmisiEkle(gecmisKayit);
        
        System.out.println("Kitap başarıyla ödünç verildi. İade tarihi: " + kitap.getIadeTarihi());
    }

    public void kitapIadeAl(Uye uye, Kitap kitap) {
        if (!uye.getOduncAlinanKitaplar().contains(kitap)) {
            System.out.println("Bu kitap bu üyede değil!");
            return;
        }
        
        LocalDate bugun = LocalDate.now();
        if (bugun.isAfter(kitap.getIadeTarihi())) {
            System.out.println("Kitap geç iade edildi! Ceza uygulanacak.");
        }
        
        uye.kitapIadeEt(kitap);
        String gecmisKayit = String.format("%s - %s kitabını iade etti", 
            bugun.toString(), kitap.getBaslik());
        uye.oduncGecmisiEkle(gecmisKayit);
        
        kitap.setOduncAlmaTarihi(null);
        kitap.setIadeTarihi(null);
        kitap.setOduncAlanUye(null);
        
        System.out.println("Kitap başarıyla iade alındı.");
    }

    // Ek Özellikler

    public List<Kitap> oduncVerilenKitaplariListele() {
        List<Kitap> oduncVerilenKitaplar = new ArrayList<>();
        for (Kitap kitap : kitaplar) {
            if (!kitap.isMevcut()) {
                oduncVerilenKitaplar.add(kitap);
            }
        }
        return oduncVerilenKitaplar;
    }

    public int toplamKitapSayisi() {
        return kitaplar.size();
    }

    public int toplamUyeSayisi() {
        return uyeler.size();
    }

}