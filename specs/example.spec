Getting Started with Gauge
==========================

This is an executable specification file. This file follows markdown syntax. Every heading in this file denotes a scenario. Every bulleted point denotes a step.
To execute this specification, use `mvn test`

AppiumOzdilek
------------------
* XPATH ile "//android.widget.TextView[contains(@text,'Kategoriler')]" ile elementi bul ve "Kategoriler" ile kontrol et.
* "2" saniye bekle
* XPATH ile "//android.widget.TextView[contains(@text,'ALIŞVERİŞE BAŞLA')]" ile elementi bul ve "ALIŞVERİŞE BAŞLA" ile kontrol et.
* "2" saniye bekle
* "com.ozdilek.ozdilekteyim:id/tv_startShoppingStore" id'li elemente tikla
* "2" saniye bekle
*"com.ozdilek.ozdilekteyim:id/nav_categories" id'li elemente tikla
*"2" saniye bekle
*XPATH ile "//android.widget.TextView[contains(@text,'Kategoriler')]" ile elementi bul ve "Kategoriler" ile kontrol et.
*"2" saniye bekle
*"//android.widget.RelativeLayout[@index=1]" xpath'li elemente tıkla
*"2" saniye bekle
* "//android.widget.TextView[@text='Pantolon']" xpath'li elemente tıkla
*"2" saniye bekle
*scroll et
*"2" saniye bekle
*scroll et
*"2" saniye bekle
*"//android.widget.ImageView[@resource-id='com.ozdilek.ozdilekteyim:id/imageView']" random bir ürün seç
*"6" saniye bekle
*Product detail sayfası doğrulama
* "2" saniye bekle
* "com.ozdilek.ozdilekteyim:id/imgFav" id'li elemente tikla
*"2" saniye bekle
*"com.ozdilek.ozdilekteyim:id/etEposta" İd'li elemente "ahmet@becerik.com" değerini yaz
*"2" saniye bekle
* "com.ozdilek.ozdilekteyim:id/etPassword" İd'li elemente "test1234" değerini yaz
*"2" saniye bekle
*"com.ozdilek.ozdilekteyim:id/btnLogin" id'li elemente tikla
*"2" saniye bekle
* "com.ozdilek.ozdilekteyim:id/ivBack" İd'li elemente tıkla
* "1" saniye bekle
* "com.ozdilek.ozdilekteyim:id/ivBack" İd'li elemente tıkla
* "1" saniye bekle
* "//android.widget.ImageView[@resource-id='com.ozdilek.ozdilekteyim:id/imageView']" random bir ürün seç
*"2" saniye bekle
*"//android.widget.RelativeLayout/android.widget.TextView[@text=36]"size xpath elemente tıkla
*"5" saniye bekle
*Sepete ekle
*"5" saniye bekle