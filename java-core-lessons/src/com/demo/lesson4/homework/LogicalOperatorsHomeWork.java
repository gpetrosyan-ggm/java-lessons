package com.demo.lesson4.homework;

public class LogicalOperatorsHomeWork {

    public static void main(String[] args) {
        simpleDemo(true, true);
        simpleDemo(true, false);
        simpleDemo(false, true);
        simpleDemo(false, false);
    }

    /**
     * 1. Use logical AND(&) and print the result
     * 2. Use logical OR(|) and print the result
     * 3. Use logical XOR(^) and print the result
     * 4. Use short-circuit OR(||) and print the result
     * 5. Use short-circuit AND(&&) and print the result
     * 6. Use logical unary NOT(!) and print the result
     * 7. Show the difference between | and ||, or & and &&
     *
     * @param a the first boolean value
     * @param b the second boolean value
     */
    private static void simpleDemo(boolean a, boolean b) {
        System.out.println("");
        System.out.println("LOGICAL AND(&)- " + (a & b));
        System.out.println("LOGICAL OR(I)- "  + (a | b));
        System.out.println("LOGICAL XOR(^)- "  + (a ^ b));
        System.out.println("SHORT LOGICAL AND(&&)- "  +(a && b));
        System.out.println("SHORT LOGICAL OR(||)- "  + (a || b));
        System.out.println("UNARY NOT(!)- "  + (!a));
        System.out.println("UNARY NOT(!)- "  +(!b));


        // tarberutyun@ kam nshani mek hatanoci (|) ev 2 hatanoci (||) kayanum e nranum, vor
        // ete xndrum kan mi qani druytner keter apa (|) bolor keter@ hat ar hat stugum e u verjum
        // bolor patasxanneri mej gtnum e tekuz mek true drakan patasxan apa ardyun@ stacvum e TRUE
        // erku hatanoc@ (||) skzbic sksum e stugel@ u henc gtnum e mek TRUE apa dadarecnum e hetaga ashxatanq@ u
        // talis patasxatn TRUE
        // matematikayi kami nshani pes [ ka tekuz mek chisht apa patasxan@ chisht e


        // (&) ev (&&), nshanner@ irencic nerkayacnum en ev matemum haytni {
        // xndri mej gtnelov tekuz mek FALSE anhamadzaynutyun (sxal) apa patasxan@ kstana FALSE
        // mek hatanoci u erku hatanoci tarberutyun@ kayanum e nranum vor mek hatanoc@ stugum e bolor paymanner@
        // u verjum talis patasxan isk erku hatanoc@ skzbic stugelov galis e u henc gtav FOLSE dadarecnum e hetaga
        // @ntacq@ u taklis patasxan FALSE
        // orinak ete im tvyaler@ liner grvac vor
        // es cnvel em 12 mart 1987, mek hatanoc@ sax kstuger, or - amis - taretiv u verjum ktar FALSE
        // bayc ay 2 hatanoc@ henc skzbic ktesner vor cnndyans or@ sxal e grvac u el cher sharunaki
        // ktper FALSE
        // shnorhakalutyun ushadrutyan hamar

    }

}
