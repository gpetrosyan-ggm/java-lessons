package com.demo.lesson3.examples;

public class Head3 {

    public static void main(String[] args) {
        int Lightspeed;
        long days;
        long seconds;
        long distance;
        // lusssi motavor aragutyun@ metr/varkan
        Lightspeed = 299_792_458;
        days = 1000;
        seconds = days * 24 * 60 * 60;//veraceci varkanneri

        distance = Lightspeed * seconds;
        System.out.print("1.  " + days);
        System.out.print(" orum lus@ kancni ");
        System.out.println(distance + " metr ");

// 2-rd xndir@

        double pi, r, a;
        byte m, k;
        m = 22;  // shrjanagci erkarutan haraberutun@ tramagci stacvum e 22:7
        k = 7;
        r = 10.8;

        pi = m / k;
        a = pi * r * r;
        System.out.println("2.  shrjanagci tramagic@ kstacvi" + a);


// ancanq sinvolnerin vori imast@ chakkaca namanavand es orinak@
        char ch1, ch2;
        ch1 = 88; // kod sinvol X yani incha
        ch2 = 'Y';
        System.out.print("3.  ch1 ev ch2: ");
        System.out.println(ch1 + "   " + ch2);

        // 4_rd mas@ false u true
        boolean b;
        b = false;
        System.out.println("4.  b havasar e " + b);
        b = true;
        System.out.println("    b havasar e " + b);
        if (b) System.out.println("    ays kod@ ktstacvi"); // ete ankexc chakkaaa pakagci grac@
        b = false;
        if (b) System.out.println("    ays kod@ chi stacvi");
        System.out.println("    10 > 9 havasar e " + (10 > 9));
        System.out.println("    -3 = 3 havasar e " + (-3 == 3)); // stex xi chem karum = nshan@ dnem,
        // toxuma mec kam poqr
        // ay vor mi qich zor tayi nor komment greyi, shut kogeyi vor havasar@ 2 hat petqa greyi ==
        // ay vor kod@ greci prca nor haskaca

        //5. ancanq anhamatexeliutan@
        byte s;
        int i = -129;
        double d = 451.142;
        System.out.println("5.  \nPoxakerpum int-@ byte-in.");
        s = (byte) i;
        System.out.println("    i  u  s " + i + "  " + s);
        System.out.println("    \nPoxakerpum double-n int-in.");
        i = (int) d;
        System.out.println("    d  u  i " + d + "  " + i);
        System.out.println("    \nPoxakerpel double-n byte-in.");
        s = (byte) d;
        System.out.println("    d  u  s " + d + "  " + s);

        // byte-in ancnelis myus tiperic hanvum e 256*k, vortex K-n drakan, anboxajakan tiv e
        // xi 256, qani vor byte-i tiruyt@ kazmum e -128_ic 127
        // ir amboxjakan iikl@ kazmum e 256, uni 256 tiv 0-n el hashvac
        // (диапазон допустимых значений типа byte)
charDemo();
array();
arrayDemo();
    }

    private static void charDemo() {
        byte b = 42;
        char c = 'a';
        short s = 1024;
        int i = 50000;
        float f = 5.67f;
        double d = .1234;
        double result = (f * b) + (i / c)- (d * s);
        System.out.println((f * b) + "  +  " + (i / c)  +  " - " + result);
        System.out.println("result = "  + result);
    }
    private static void array() {
        int monthe_days[];
        monthe_days = new int[12];
        monthe_days[0] = 31;
        monthe_days[1] = 28;
        monthe_days[2] = 31;
        monthe_days[3] = 30;
        monthe_days[4] = 31;
        monthe_days[5] = 30;
        monthe_days[6] = 31;
        monthe_days[7] = 31;
        monthe_days[8] = 30;
        monthe_days[9] = 31;
        monthe_days[10] = 30;
        monthe_days[11] = 31;
        System.out.println("aprel amis@ uni"  + monthe_days[3] +  "or.");
    }
    private static void arrayDemo(){
        int monthe_days[] = {31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31 };
        System.out.println("aprel amsum ka"  + monthe_days[3] + "or.");
        //tvyal orinakum aveli npataharmar che int-i poxaren byte ogtagoreel
        // qani vor aminneri qanakn u oreri qanak@ byte-i dopuski mej en
    }
    private static void Averaj()  {
     double nums[] = new double[]{10.1, 11.2, 12.3, 13.4, 14.5};
     double result = 0;
     int i;
     for(i=0; i<5; i++)
         result = result + nums[i];
     System.out.println("mijin arjeq@ kkazmi"  + result / 5);
    }
}