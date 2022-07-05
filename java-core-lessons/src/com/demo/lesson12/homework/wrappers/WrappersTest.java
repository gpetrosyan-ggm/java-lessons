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
     1. demo1(12);
    private double demo1(Integer i) { boxing
        Double d = 120.0; boxing
        return d + i; unboxing
    }
  -----------------------------------------------------------------------------------------------------
    2. demo1(new Integer(1)); boxing
     private double demo1(Integer i) { mnum boxing
        Double d = 120.0; boxing
        return d + i; unboxing
    }
  ------------------------------------------------------------------------------------------------------
3. demo2(true, 1);
    private Integer demo2(Boolean b, Integer i) {  boxing
        int a;
        if (b) { unboxing, qani vor auto-boxing stugum chi anum
            a = i; unboxing
        } else {
            a = 12;
        }
        return a + 1; boxing gumarumic heto, vorovhetev return type Integer e.
    }

    ---------------------------------------------------------------------------------------------------
    4. demo2(false, Integer(1)); boxing Integer-i hamar
     private Integer demo2(Boolean b, Integer i) {  boxing boolean type hamar,
        int a;
        if (b) { unboxing
            a = i; unboxing
        } else {
            a = 12;
        }
        return a + 1; boxing gumarumic heto, vorovhetev return type Integer e.
    }
    ----------------------------------------------------------------------------------------------------
    5. demo2(null, 10);
     private Integer demo2(Boolean b, Integer i) {  boxing erkusn el
        int a;
        if (b) {  kqci error, qani vor if()-um bacarac chi null-i pah@
            a = i; unboxing
        } else {
            a = 12;
        }
        return a + 1; boxing gumarumic heto, vorovhetev return type Integer e.
    }
     */

}
