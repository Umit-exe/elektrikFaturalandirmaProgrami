/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package faturalandirmaprogramı;

import java.util.Scanner;
import jdk.nashorn.internal.ir.BreakNode;

/**
 *
 * @author HP
 */
public class FaturalandirmaProgramı {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        gidilecekYer:
        while(true){
            double kullanimMiktari=0;
            double tutar=0;
            double meskenSabit=1.62;
            double ticariSabit=1.21;
            double endüstriyelSabit=0.98;
            Scanner read=new Scanner(System.in);
            System.out.println("                ELEKTRİK FATURASI HESAPLAMA PROGRAMI               \n");
            System.out.println("Bu program elektrik faturanızı hesaplamak için geliştirildi.\nYapmanız gereken kullanım bilgilerinizi doğru biçimde girmek.");
            System.out.print("\n\nLütfen 6 haneli abone numaranızı giriniz:  ");
            int aboneNumarasi=read.nextInt();
            if(aboneNumarasi>0&&aboneNumarasi<1000000){
                System.out.println("Lütfen kullanım türünü giriniz\n");
                System.out.println("(Mesken için m ya da M, ticari için t ya da T, endüstriyel için e ya da E giriniz.)");
                String kullanimTürü=read.next();
                if(kullanimTürü.length()>1||kullanimTürü.length()<1){
                    System.out.println("GEÇERSİZ KULLANIM TÜRÜ!!! EN BAŞA YÖNLENDİRİLİYORSUNUZ...\n\n");
                    continue gidilecekYer;
                }
                else{
                    switch(kullanimTürü){
                        case "m":
                        case "M":{
                            System.out.print("Lütfen kullanım miktarınızı kw/h biriminden giriniz:");
                            kullanimMiktari=read.nextDouble();
                            tutar=kullanimMiktari*meskenSabit;
                            System.out.println(aboneNumarasi+" abone numaralı kullanıcımız fatura tutarınız "+tutar+" Türk lirasıdır.");
                        }
                        break;
                        case "t":
                        case "T":{
                            System.out.print("Lütfen kullanım miktarınızı kw/h biriminden giriniz:");
                            kullanimMiktari=read.nextDouble();
                            tutar=kullanimMiktari*ticariSabit;
                            System.out.println(aboneNumarasi+" abone numaralı kullanıcımız fatura tutarınız "+tutar+" Türk lirasıdır.");
                        }
                        break;
                        case "e":
                        case "E":{
                            System.out.print("Lütfen kullanım miktarınızı kw/h biriminden giriniz:");
                            kullanimMiktari=read.nextDouble();
                            tutar=kullanimMiktari*endüstriyelSabit;
                            System.out.println(aboneNumarasi+" abone numaralı kullanıcımız fatura tutarınız "+tutar+" Türk lirasıdır.");
                        }
                        break;
                    }
                    System.out.print("\nÇıkmak için 0 a tekrar sorgu için 1 e basınız");
                    int cikis=read.nextInt();
                    System.out.println("\n\n");
                    if(cikis==0){
                        break;
                    }
                    else if(cikis==1){
                        continue gidilecekYer;
                    }
                }
            }
            else{

                System.out.println("Geçersiz abone numarası! En başa yönlendiriliyorsunuz...\n\n");
                continue gidilecekYer;
            }
        }
    }
}
