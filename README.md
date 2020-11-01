# HepsiBuradaAutomationTestCase

1-)	Entegrasyon testi Jmeter ile yazıldı. 3. adımdaki otomasyon modeline de implement olabilecek bir yapı da düşünülebilirdi.
	Ancak Jmeter performans testlerinde başarılı olduğu kadar entegrasyon testlerinde de oldukça başarılı. 
	CI/CD içerisine kolayca entegre olabiliyor.
	Kullanım bilgisi artan tester zamanla api seviyesinde entegraasyon testiyle birlikte performans testleri de hazırlayıp devops süreçlerine dahil edebilir oluyor.
	entegrasyon testi jmx formatındadır. "jmeter -n –t test.jmx -l testresults.jtl" komutu ile çağırıldığında cevap dönecektir. 
	Ya da jmeter kurulu bir bilgisayardan dosyayı açabilirsiniz.


3-)	Otomasyon test çalışması Java-Selenium-Cucumber-Junit-Maven kullanılarak yazılmıştır. 
	Proje içerisinde /target/cucumber-reports klasörü altında cucumber.json cucumber.xml raporlarını görebilirsiniz.
	Aynı klasör altında html raporu da index.html adı ile üretilmektedir.
	Projede bir adımın hata alması durumunda screenshot yine aynı klasörün altında embedded0.png adı ile tutulmaktadır.
	projenin hata alması durumunda html raporunun içerisinde screenshot görüntülenebilir. 
	Projede browser geçişleri feature dosyaları içerisinde BDD formatı gereği kullanıcıya bırakılmıştır. 
	"i go to website with chrome" veya "i go to website with firefox" diyerek testi kullanan kişi parametrik geçiş yapabilir.
	Proje aynı zamanda cross-platform çalışmaya da müsaittir. Test aynı anda hem chrome'da hem de firefox'ta koşulabilir.
	Proje 'maven run' için uygundur. Dolayısıyla bir repoya atılması durumunda Jenkins üzerinden yönetilebilir haldedir.
	Projede her fonksiyonun assertion adımları mevcuttur. Sayfa geçişleri de bu seviyede kontrol edilmiştir. Projenin genişliği ve kritiklik sevivyesine göre assertion miktarları da artabilir.
 
 	Not: Proje dosyasında kullanılan chromedriver ve geckodriver lokalimdeki chrome ve firefox sürümleri için indirdiğim sürümlerdir. Projede lokaldeki sürümü otomatik alıp ona göre driver indiren bir kütüphane de kullanabilirdim. Ancak iş bilgisayarlarınızda 3rd party bir kütüphanenin çalışmasını istemeyebileceğinizden bu kısımında driverları proje kalsöründe tutmayı daha doğru buldum


Bonus Soru-)	Sitede alışveriş yaparken sepet içeriğinin görülmesi için sepetim butonuna tıklanıyor ve yeni bir sayfaya yönlendiriliyor. 
		Bunun yerine sayfanın sağ altında slip edip açılıp kapanabilen bir sepet olması kullanıcıyı aynı sayfada daha çok fonksiyon kullanabilir bir hale getirebilir.
		Aynı gerçek hayattaki alışverişlerimizde olduğu gibi sanal alışveriş esnasında da sepet içeriğine tekrar göz gezdirmek isteyebiliyor kullanıcılar.
		Bunu da kullanıcı için kolaylaştırmak adına aynı sayfada açılır kapanır, sağ altta konumlanmış bir ikon yapılabilir.
