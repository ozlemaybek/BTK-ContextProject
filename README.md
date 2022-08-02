# BTK-ContextProject

## Kotlin İle Android Mobil Uygulama Geliştirme Eğitimi Temel Seviye (BTK AKADEMİ) Notlarım

> İki mesaj çeşidi vardır

- 1)Toast Message

- 2)Alert (AlertDialog şeklinde geçer)

## Context Nedir?

> Context; uygulamamızın nerede ne yaptığını anlamak için geliştirilmiş bir yapıdır.

> Context; durum demektir ama tek bir durum yoktur.

> Uygulamamızın bütününün bir context'i vardır ve buna "Appcontext (ApplicationContext)" denir. Bu uygulamanın kendi context'idir.

> Her activity'ninde kendi context'i vardır. Bu yüzden yaptığımız işlemlerin Activity context'inden mi yoksa uygulama context'inden mi olacağı değişiklik gösterir.
     
> Activity context'i; this ya da this@MainActivity şeklinde alınabilir.

> Fakat this kullanırken dikkat etmeliyiz çünkü this; bulunduğu yerin bir üst seviyesine referans verir. Örneğin onCreate içinde kullanırsak MainActiivty'te referans verir.

> IDE içerisinde this yazdığımızda zaten tamamlama özelliğinde nereye referans vereceği görünüyor.
        
> Bazı yapılar uygulamanın herhangi bir yerinden çalıştırılabilir. Yani applicationContext ya da activity context vermemiz bir problem olmaz.Ama bazı yapılar mutlaka actiivty içinde bir context'e sahip olmak ve onunla çalışmak ister.

## AlertDialog

> Alert bir uyarı mesajıdır.

> AlertDialog'un kendi inşa edici bir yapısı var. -> Builder() Bu yapıyı kullanarak içerisine farklı farklı özellikler koyabiliyoruz.

> Bir şeyin özelliklerini incelemek istersek developer.android.com'dan okuyabiliyoruz.

> 3 çeşit AlertDialog butonu vardır: pozitif, negatif, nötr

### Listener

> Listener; biz bir işlem yaptığımızda sonucunu bize bildiren ve ona göre aksiyon almamızı sağlayan yapılardır.

> Örneğin kullanıcının bastığı butona göre ne yapacağımızı dinler.

> Listener oluşturmanın iki farklı yolu vardır:

- 1)Lambda Gösterimi (->): Buna lambda gösterimi denir

- 2)DialogInterface.OnClickListener{}

> Bir buton oluşturmak için ikisinide kullanabiliriz. 

> Örnek bir kullanım (Şu anda butona ait onClick metodunun içindeyiz):

![image](https://user-images.githubusercontent.com/109730490/182364336-2781ccd1-eb71-46f2-b70d-767ec9f8e0b1.png)

## Projeye Ait Ekran Görüntüleri

![image](https://user-images.githubusercontent.com/109730490/182364753-3c807a7f-1947-4138-854d-19fb5da9dd96.png)

> Butona tıkladığımızda:

![image](https://user-images.githubusercontent.com/109730490/182364820-2c9c25d9-e8b4-43e4-b5b8-1b2493d827e8.png)

> YES'e tıkladığımızda (Aşağıda görünen mesaj bir ToastMessage):

![image](https://user-images.githubusercontent.com/109730490/182364889-170d3b1c-42b7-42db-a7a5-815074f70ad8.png)

> NO seçeneğine tıkladığımızda:

![image](https://user-images.githubusercontent.com/109730490/182364998-2d434294-3b00-431f-b132-1764187ea09c.png)

> AlertDialog'da herhangi bir butona tıkladıktan sonra mesajı gösterip tekrar bu hale geliyor:

![image](https://user-images.githubusercontent.com/109730490/182365134-0469cc02-8696-4f4d-b64b-e754214571ce.png)

## Kaynaklar

- [BTK Akademi](https://www.btkakademi.gov.tr/portal/course/kotlin-ile-android-mobil-uygulama-gelistirme-egitimi-temel-seviye-10274)
