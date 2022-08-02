package com.ozlem.contextproject

import android.content.DialogInterface
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Toast
import androidx.appcompat.app.AlertDialog

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        // Activity Context'i:
        // Eğer bu satırda yazarsak;
        // this ve this@MainActivity aynı şeye referans verir(ikiside MainActivity'nin kendisine referans verir).
        // Çünkü this içinde bulunduğu yerin bir üst seviyesine referans veriyordu.


        // Uygulama açılır açılmaz gösterilecek bir toast message yazalım:
        // 3 parametre isteyecek:
        // 1) context, 2) gösterilecek mesaj, 3) duration yani süre (mesaj ne kadar süre gösterilecek)
        // 3.parametre saniye sormaz ya uzun ya da kısa diyebiliriz
        // .show dediğimizde gösteriyor
        // this yerine applicationContext'te yazsak çalışırdı
        Toast.makeText(this,"Welcome!!!",Toast.LENGTH_LONG).show()

    }

    fun onClickShowMessage(view : View){

        // Şimdi bir AlertDialog oluşturalım:
        // Bizden ilk parametre olarak bir context isteyecek
        // Burada applicationContext kullanırsak uygulama butona basıldığı anda çöker.
        // Bizden Activity Context istiyor.
        // Net olmak adına this@MainActivity kullanalım:
        val warningMessage = AlertDialog.Builder(this@MainActivity)

        // Uyarı mesajına bir başlık ekleyelim:
        warningMessage.setTitle("Password Error")

        // Şimdi uyarı mesajını verelim:
        warningMessage.setMessage("You didn't enter the password, would you like to try again?")
        // Bu diyaloğun içerisinde butonlar olabiliyor.
        // Çünkü kullanıcı evet'e tıklarsa ne yapayım, hayır'a tıklarsa ne yapayım şeklinde mekanizmalar kurmak isteyebiliriz.

        // Buton verdiğimizde bizden önce göstereceği mesajı isteyecek
        // Sonrada bir listener yani dinleyici isteyecek.

        // Önce 2. yöntemi kullanalım:
        // Uyarı mesajımız için bir buton koyduk
        // DialogInterface bize YES'e tıklandığında ne yapılacağını veriyor.
        warningMessage.setPositiveButton("YES", DialogInterface.OnClickListener { dialogInterface, i ->
            // Bu kod bloğuna yazdığım her şey YES'e tıklayınca olacak:
            Toast.makeText(this,"Try Again...", Toast.LENGTH_LONG).show()
        })

        // Şimdi negatif butonumuzu koyalım:
        warningMessage.setNegativeButton("NO") {dialogInterface , i ->
            Toast.makeText(this,"You chose NO. You cannot try.",Toast.LENGTH_LONG).show()
        }
        // Bu satırı eklemezsek warningMessage'ımız gösterilmez:
        warningMessage.show()
    }
}