

import java.time.LocalDate;
import java.time.temporal.ChronoUnit;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Kutuphane kutuphane = new Kutuphane();

        // Başlangıç örnek verilerini ekle
        ornekVeriEkle(kutuphane);

        while (true) {
            System.out.println("\n=== KÜTÜPHANE YÖNETİM SİSTEMİ ===");
            System.out.println("1. Kitap İşlemleri");
            System.out.println("2. Üye İşlemleri");
            System.out.println("3. Ödünç Alma İşlemleri");
            System.out.println("4. İade İşlemleri");
            System.out.println("5. Kitap Arama");
            System.out.println("6. Üye Arama");
            System.out.println("7. Raporlar");
            System.out.println("8. Gecikmiş Kitapları Listele");
            System.out.println("9. Üye Ödünç Geçmişi");
            System.out.println("0. Çıkış");
            System.out.print("Seçiminiz: ");

            int secim = scanner.nextInt();
            scanner.nextLine(); // Buffer temizleme

            switch (secim) {
                case 1:
                    kitapIslemleriMenu(scanner, kutuphane);
                    break;
                case 2:
                    uyeIslemleriMenu(scanner, kutuphane);
                    break;
                case 3:
                    oduncAlmaIslemi(scanner, kutuphane);
                    break;
                case 4:
                    iadeIslemi(scanner, kutuphane);
                    break;
                case 5:
                    kitapArama(scanner, kutuphane);
                    break;
                case 6:
                    uyeArama(scanner, kutuphane);
                    break;
                case 7:
                    raporlarMenu(kutuphane);
                    break;
                case 8:
                    gecikmisKitaplariListele(kutuphane);
                    break;
                case 9:
                    uyeOduncGecmisi(scanner, kutuphane);
                    break;
                case 0:
                    System.out.println("Program sonlandırılıyor...");
                    System.exit(0);
                default:
                    System.out.println("Geçersiz seçim!");
            }
        }
    }

    private static void kitapIslemleriMenu(Scanner scanner, Kutuphane kutuphane) {
        System.out.println("\n=== KİTAP İŞLEMLERİ ===");
        System.out.println("1. Yeni Kitap Ekle");
        System.out.println("2. Kitap Sil");
        System.out.println("3. Tüm Kitapları Listele");
        System.out.print("Seçiminiz: ");
        
        int secim = scanner.nextInt();
        scanner.nextLine();

        switch (secim) {
            case 1:
                System.out.print("Kitap Başlığı: ");
                String baslik = scanner.nextLine();
                System.out.print("Yazar: ");
                String yazar = scanner.nextLine();
                System.out.print("ISBN: ");
                String isbn = scanner.nextLine();
                
                Kitap yeniKitap = new Kitap(baslik, yazar, isbn, true);
                kutuphane.kitapEkle(yeniKitap);
                System.out.println("Kitap başarıyla eklendi.");
                break;
                
            case 2:
                System.out.print("Silinecek kitabın ISBN'si: ");
                String silinecekIsbn = scanner.nextLine();
                Kitap silinecekKitap = kutuphane.kitapAra(silinecekIsbn);
                if (silinecekKitap != null) {
                    kutuphane.kitapSil(silinecekKitap);
                    System.out.println("Kitap başarıyla silindi.");
                } else {
                    System.out.println("Kitap bulunamadı.");
                }
                break;
                
            case 3:
                List<Kitap> tumKitaplar = kutuphane.tumKitaplariListele();
                if (tumKitaplar.isEmpty()) {
                    System.out.println("Kütüphanede kitap bulunmamaktadır.");
                } else {
                    System.out.println("\nTÜM KİTAPLAR:");
                    for (Kitap kitap : tumKitaplar) {
                        System.out.println(kitap.getKitapBilgisi());
                    }
                }
                break;
        }
    }

    private static void uyeIslemleriMenu(Scanner scanner, Kutuphane kutuphane) {
        System.out.println("\n=== ÜYE İŞLEMLERİ ===");
        System.out.println("1. Yeni Üye Ekle");
        System.out.println("2. Üye Sil");
        System.out.println("3. Tüm Üyeleri Listele");
        System.out.print("Seçiminiz: ");
        
        int secim = scanner.nextInt();
        scanner.nextLine();

        switch (secim) {
            case 1:
                System.out.print("Üye Adı: ");
                String isim = scanner.nextLine();
                System.out.print("Üye No: ");
                int uyeNo = scanner.nextInt();
                
                Uye yeniUye = new Uye(isim, uyeNo);
                kutuphane.uyeEkle(yeniUye);
                System.out.println("Üye başarıyla eklendi.");
                break;
                
            case 2:
                System.out.print("Silinecek üyenin numarası: ");
                int silinecekNo = scanner.nextInt();
                Uye silinecekUye = kutuphane.uyeAra(silinecekNo);
                if (silinecekUye != null) {
                    kutuphane.uyeSil(silinecekUye);
                    System.out.println("Üye başarıyla silindi.");
                } else {
                    System.out.println("Üye bulunamadı.");
                }
                break;
                
            case 3:
                List<Uye> tumUyeler = kutuphane.tumUyeleriListele();
                if (tumUyeler.isEmpty()) {
                    System.out.println("Sistemde kayıtlı üye bulunmamaktadır.");
                } else {
                    System.out.println("\nTÜM ÜYELER:");
                    for (Uye uye : tumUyeler) {
                        System.out.println("Üye No: " + uye.getUyeNo() + ", İsim: " + uye.getIsim());
                    }
                }
                break;
        }
    }

    private static void oduncAlmaIslemi(Scanner scanner, Kutuphane kutuphane) {
        System.out.print("Üye No: ");
        int uyeNo = scanner.nextInt();
        System.out.print("Kitap ISBN: ");
        scanner.nextLine();
        String isbn = scanner.nextLine();

        Uye uye = kutuphane.uyeAra(uyeNo);
        Kitap kitap = kutuphane.kitapAra(isbn);

        if (uye != null && kitap != null) {
            kutuphane.kitapOduncVer(uye, kitap);
        } else {
            System.out.println("Üye veya kitap bulunamadı!");
        }
    }

    private static void iadeIslemi(Scanner scanner, Kutuphane kutuphane) {
        System.out.print("Üye No: ");
        int uyeNo = scanner.nextInt();
        System.out.print("Kitap ISBN: ");
        scanner.nextLine();
        String isbn = scanner.nextLine();

        Uye uye = kutuphane.uyeAra(uyeNo);
        Kitap kitap = kutuphane.kitapAra(isbn);

        if (uye != null && kitap != null) {
            kutuphane.kitapIadeAl(uye, kitap);
        } else {
            System.out.println("Üye veya kitap bulunamadı!");
        }
    }

    private static void kitapArama(Scanner scanner, Kutuphane kutuphane) {
        System.out.print("Aranacak kitabın ISBN'si: ");
        String isbn = scanner.nextLine();
        
        Kitap kitap = kutuphane.kitapAra(isbn);
        if (kitap != null) {
            System.out.println(kitap.getKitapBilgisi());
        } else {
            System.out.println("Kitap bulunamadı.");
        }
    }

    private static void uyeArama(Scanner scanner, Kutuphane kutuphane) {
        System.out.print("Aranacak üyenin numarası: ");
        int uyeNo = scanner.nextInt();
        
        Uye uye = kutuphane.uyeAra(uyeNo);
        if (uye != null) {
            System.out.println("Üye Bilgileri:");
            System.out.println("İsim: " + uye.getIsim());
            System.out.println("Üye No: " + uye.getUyeNo());
            System.out.println("Ödünç Alınan Kitaplar:");
            for (Kitap kitap : uye.getOduncAlinanKitaplar()) {
                System.out.println("- " + kitap.getBaslik());
            }
        } else {
            System.out.println("Üye bulunamadı.");
        }
    }

    private static void raporlarMenu(Kutuphane kutuphane) {
        System.out.println("\n=== RAPORLAR ===");
        System.out.println("Toplam Kitap Sayısı: " + kutuphane.toplamKitapSayisi());
        System.out.println("Toplam Üye Sayısı: " + kutuphane.toplamUyeSayisi());
        System.out.println("\nÖdünç Verilen Kitaplar:");
        for (Kitap kitap : kutuphane.oduncVerilenKitaplariListele()) {
            System.out.println(kitap.getKitapBilgisi());
        }
    }

    private static void gecikmisKitaplariListele(Kutuphane kutuphane) {
        System.out.println("\n=== GECİKMİŞ KİTAPLAR ===");
        LocalDate bugun = LocalDate.now();
        for (Kitap kitap : kutuphane.tumKitaplariListele()) {
            if (!kitap.isMevcut() && kitap.getIadeTarihi() != null && 
                bugun.isAfter(kitap.getIadeTarihi())) {
                System.out.println(kitap.getKitapBilgisi());
                System.out.println("Gecikme Süresi: " + 
                    ChronoUnit.DAYS.between(kitap.getIadeTarihi(), bugun) + " gün");
            }
        }
    }

    private static void uyeOduncGecmisi(Scanner scanner, Kutuphane kutuphane) {
        System.out.print("Üye No: ");
        int uyeNo = scanner.nextInt();
        
        Uye uye = kutuphane.uyeAra(uyeNo);
        if (uye != null) {
            System.out.println("\nÖDÜNÇ GEÇMİŞİ:");
            for (String kayit : uye.getOduncGecmisi()) {
                System.out.println(kayit);
            }
        } else {
            System.out.println("Üye bulunamadı.");
        }
    }

    private static void ornekVeriEkle(Kutuphane kutuphane) {
        // Örnek kitaplar
        kutuphane.kitapEkle(new Kitap("Sefiller", "Victor Hugo", "1234", true));
        kutuphane.kitapEkle(new Kitap("Yüzüklerin Efendisi", "J.R.R. Tolkien", "5678", true));
        kutuphane.kitapEkle(new Kitap("Suç ve Ceza", "Dostoyevski", "7168", true));

        // Örnek üyeler
        kutuphane.uyeEkle(new Uye("Kutay Şahin", 12345));
        kutuphane.uyeEkle(new Uye("Aslı Nur Şahin", 67890));
    }
}

