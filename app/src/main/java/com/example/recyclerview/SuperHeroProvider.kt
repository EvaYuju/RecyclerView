package com.example.recyclerview

class SuperHeroProvider {
    // Para poder acceder a lo que está dentro de estra clase
    companion object {
        // Creamos una variable llamada superherofirst y seria = un objeto de clase SuperHero
        // [data class SuperHero(val superhero:String, val publisher:String, val realName:String, val photo:String )
        //val superHeroFirst = SuperHero("Koting","JetBrains","AristiDevs", "http://google.com/imagen.jpg")
        // Lo mismo pero hacemos una lista:
        val superHeroList = listOf<SuperHero>(
            SuperHero(
                "KotlinMan",
                "Jetbrains",
                "Jemerov",
                "https://badoystudio.com/wp-content/uploads/2018/07/Kotlin-logo-150x150.png"

            ),
            SuperHero(
                "PhpMan",
                "PHPF",
                "Lerdorf",
                "https://www.designbust.com/download/240/png/php_icon512.png"
            ),
            SuperHero(
                "JavaMan",
                "Sun MS",
                "Gossling",
                "https://www.minecraftkrant.nl/media/166/java-logo.png"
            ),
            SuperHero(
                "HTMLMan",
                "W3C",
                "Berners-Lee",
                "https://spng.pngfind.com/pngs/s/47-472394_open-html-5-hd-png-download.png"
            ),
            SuperHero(
                "CSSMan",
                "W3C",
                "W3C",
                "https://p1.hiclipart.com/preview/326/868/1022/css3-badge-blue-and-white-css-icon-png-clipart.jpg"
            ),
            SuperHero(
                "JSMan",
                "ECMA",
                "Eich",
                "https://img1.gratispng.com/20180807/ut/kisspng-javascript-portable-network-graphics-logo-clip-art-javascript-programs-amp-output-apps-on-google-5b69409aa8f0c1.449723611533624474692.jpg"
            ),
            SuperHero(
                "XMLMan",
                "W3C",
                "Bray",
                "https://www.shareicon.net/data/512x512/2016/05/06/760857_interface_512x512.png"
            ),
            SuperHero(
                "DjangoMan",
                "DSF",
                "Holovaty",
                "https://logodix.com/logo/1758841.png"
            ),
            SuperHero(
                "PythonMan",
                "PSF",
                "Van Rossum",
                "https://www.pnglib.com/wp-content/uploads/2020/08/python-logo_5f39305855876-350x350.png"
            ),
            SuperHero(
                "C#Man",
                "Microsoft",
                "Hejlsberg",
                "https://iconape.com/wp-content/png_logo_vector/c.png"
            )



        )
    }
}