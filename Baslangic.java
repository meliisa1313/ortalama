package Giris;

import javax.swing.*;
import java.util.Scanner;
//Eğer şifre yanlış ise kullanıcıya şifresini sıfırlayıp sıfırlamayacağını sorun, eğer kullanıcı sıfırlamak isterse yeni girdiği şifrenin hatalı girdiği ve unuttuğu şifre ile aynı olmaması gerektiğini kontrol edip , şifreler aynı ise ekrana "Şifre oluşturulamadı, lütfen başka şifre giriniz." sorun yoksa "Şifre oluşturuldu" yazan programı yazınız.
public class Baslangic {
    public static void main(String[] args) {
    //Dersler : Matematik, Fizik, Türkçe, Kimya, Müzik
        //Geçme Notu : 55
        //Ödev
        //Eğer girilen ders notları 0 veya 100 arasında değil ise ortalamaya katılmasın.

    int mat,fizik,turkce,kimya,muzik,ortalama;
    Scanner inp=new Scanner(System.in);

        System.out.println("mat notunu gir ");
        mat=inp.nextInt();
        System.out.println("fizik notunu gir");
        fizik= inp.nextInt();
        System.out.println("turkce notunu gir");
        turkce=inp.nextInt();
        System.out.println("kimya notunu gir");
        kimya=inp.nextInt();
        System.out.println("muzik");
        muzik=inp.nextInt();
        if(((0<mat)&&(mat<100))&&((0<turkce)&&(turkce<100))&&((0<fizik)&&(fizik<100))&&((0<kimya)&&(kimya<100))&&((0<muzik)&&(muzik<100)))
        {
            System.out.println("girdiginiz bir not uymuyor");
        }
        else
        {
            ortalama=(mat+fizik+turkce+kimya+muzik)/5;
            System.out.println(ortalama);
        }









        }






    }

