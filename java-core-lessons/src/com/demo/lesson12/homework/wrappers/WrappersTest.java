package com.demo.lesson12.homework.wrappers;

public class WrappersTest {
    /*
     2. Քայլ առ քայլ գրի, որ տողի վրա ինչ է կատարվում (auto-boxing թե auto-unboxing),
      հետևյալ method call֊երի ժամանակ

      1. demo1(12);
      2. demo1(new Integer(1));

      3. demo2(true, 1);
      4. demo2(false, Integer(1));
      5. demo2(null, 10);
---------------------------------------------------------------------------------------------------------
     1. demo1(12); sarqum auto-unboxing
    private double demo1(Integer i) { sarquma auto-boxing
        Double d = 120.0; auto-unboxing
        return d + i; auto-boxing qani vor i-n auto-boxing e
    }
  -----------------------------------------------------------------------------------------------------
    2. demo1(new Integer(1)); sarqum auto-boxing
     private double demo1(Integer i) { mnum auto-boxing
        Double d = 120.0; auto-unboxing
        return d + i; auto-boxing qani vor i-n auto-boxing e
    }
  ------------------------------------------------------------------------------------------------------
3. demo2(true, 1);auto-unboxing e @ndunum
    private Integer demo2(Boolean b, Integer i) {  sarqum auto-boxing
        int a; auto-unboxing
        if (b) {  auto-unboxing, qani vor auto-boxing stugum chi anum
            a = i; sarqu auto-boxing, qani vor i-n auto-boxing e
        } else {
            a = 12; chi poxvum auto-unboxing;
        }
        return a + 1; ete if()-i payman@ bavararvec uremn kpoxvi auto-unboxing, ete che uremn anpopox e
    }

    ---------------------------------------------------------------------------------------------------
    4. demo2(false, Integer(1)); auto-unboxing, i-n sarqum auto-boxing
     private Integer demo2(Boolean b, Integer i) {  sarqum auto-boxing, i-n mnuma nuyn@
        int a; auto-unboxing
        if (b) {  vochinch chi anum qani vor b-n iskzbane auto-unboxing e
            a = i; sarqu auto-boxing, qani vor i-n auto-boxing e
        } else {
            a = 12; vochinch chi anum qani vor a-n i skzbane auto-unboxing e;
        }
        return a + 1; kaxvac if-ic an kam mnuma auto-unboxing, kam poxvum darnum e auto-unboxing;
    }
    ----------------------------------------------------------------------------------------------------
    5. demo2(null, 10);
     private Integer demo2(Boolean b, Integer i) {  sarqum auto-boxing i-n
        int a; auto-unboxing
        if (b) {  kqci error, qani vor if()-um bacarac chi null-i pah@
            a = i;
        } else {
            a = 12;
        }
        return a + 1;
    }
     */

}
