package org.example

import kotlin.random.Random

fun main() {

    //Koleksiyonlar listOf()
    println("************************Koleksiyonlar listOf()************************")
    val dersListesi = listOf("Fizik", "Kimya", "Matematik")
    println(dersListesi)
    println(dersListesi::class.java)

    //Generic
    //Generic kısmı koleksiynumuzun içerisindeki ver türlerinin tutarlı olmasını sağlar.
    // Örneğin <String> olarak tanımlanmış bir koleksiyona String dışı türe sahip bir eleman eklemenez.

    //Aşağısı hata verecektir,çünkü generic kısmı String olmasına rağmen 5 olarak bir Int değeri var.
    // val dersListesi2 = listOf<String>("Matematik", "Fizik", 5)
    // println(dersListesi2)

    //Her türden bir liste istersek, generic kısmı <Any> olan bir koleksiyon açabiliriz.Bu sayede
    //her veri türünden eleman alabiliriz.

    val anyListesi = listOf<Any>("String", true, 5, 10.6f, 5L)
    println(anyListesi)
    println(anyListesi::class.java)

    //Liste mutableListOf()
    println("************************Liste mutableListOf()************************")

    //Mutable listelerde içerik değiştirilebir normal koleksiyon aksine.
    val mutableListesi = mutableListOf<Int>(5)

    mutableListesi.add(0, 1)
    mutableListesi.add(1, 2)
    mutableListesi.add(2, 3)
    mutableListesi.add(3, 4)

    mutableListesi.removeLast()
    mutableListesi.removeFirst()
    mutableListesi.removeAt(0)

    println(mutableListesi)


    // Array ve ArrayList()(Diziler)
    println("************************Array ve ArrayList()(Diziler)************************")

    //arrayOf()

    /*
    * Arrayler İle Diziler arasındaki farklar nelerdir?
    *
    * ->Arrayler mutabledir.Fakat listelerde immutable seçeneeği vardır.
    * ->Arrayların boyutu sabittir.Arrayler daha performanslıdır ama listeler daha esnektir.
    * */

    //Aşağıdaki yazım şeklinide kullabiliriz.
    //val denemeArray = booleanArrayOf(true, false, true, true)

    val denemeArray = arrayOf<String>("Ali", "Ayşe", "Mehmet")

    denemeArray[0] = "Alp"
    println(denemeArray[0])
    //Arrayler listlerdeki gibi direkt çekilmez,spesifik olarak indexten seçmeliyiz.
    println(denemeArray)

    //denemeArray.add veya denemeArray.remove kullanamayız.

    //arrayListOf() -> mutableListOf() ile aynı.

    val renkler = arrayListOf<String>("Beyaz", "Mavi", "Pembe")
    println(renkler)

    renkler.add(0, "Turkuaz")
    println(renkler)
    renkler[0] = "Lacivert"
    println(renkler)


}