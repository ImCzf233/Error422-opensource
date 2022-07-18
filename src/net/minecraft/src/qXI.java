package net.minecraft.src;
/*
 * Decompiled with CFR 0.152.
 */
import java.util.HashMap;
import java.util.Map;

public class qXI {
    private static final Object field_63dcf1d7_Dne;
    private static final Map field_da2182cf_FWm;
    public static boolean field_2092bf_Dne;
    private static final Map field_83b1c1b0_Dne;

    /*
     * WARNING - Removed try catching itself - possible behaviour change.
     */
    public static void method_16cce3b_Dne(int n, long l) {
        if (field_2092bf_Dne) {
            Object object = field_63dcf1d7_Dne;
            Object object2 = field_63dcf1d7_Dne;
            synchronized (object2) {
                if (field_83b1c1b0_Dne.containsKey(n)) {
                    field_83b1c1b0_Dne.put(n, (Long)field_83b1c1b0_Dne.get(n) + 1L);
                    field_da2182cf_FWm.put(n, (Long)field_da2182cf_FWm.get(n) + l);
                } else {
                    field_83b1c1b0_Dne.put(n, 1L);
                    field_da2182cf_FWm.put(n, l);
                }
            }
        }
    }

    static {
        field_2092bf_Dne = true;
        field_83b1c1b0_Dne = new HashMap();
        field_da2182cf_FWm = new HashMap();
        field_63dcf1d7_Dne = new Object();
    }
}

