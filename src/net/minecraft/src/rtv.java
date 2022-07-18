package net.minecraft.src;
/*
 * Decompiled with CFR 0.152.
 */
public final class rtv
extends PiY {
    private static final lEc field_377f982_Dne = new GZl();

    private static String method_3d15941a_Dne(edm_0 edm_02, Object[] objectArray, bab bab2) {
        return "Failed to find " + edm_02.field_37ba8b5_Dne.toString() + " at [" + edm_0.method_f459a75_Dne(edm_02.field_f27c122c_Dne) + "] while resolving [" + rtv.method_f7f6f529_Dne(objectArray) + "] in " + field_377f982_Dne.method_a223bd1c_Dne(bab2) + ".";
    }

    static rtv method_e1bd6b83_Dne(edm_0 edm_02, Object[] objectArray, bab bab2) {
        return new rtv(edm_02, objectArray, bab2);
    }

    private rtv(edm_0 edm_02, Object[] objectArray, bab bab2) {
        super(rtv.method_3d15941a_Dne(edm_02, objectArray, bab2));
    }

    private static String method_f7f6f529_Dne(Object[] objectArray) {
        StringBuilder stringBuilder = new StringBuilder();
        boolean bl = true;
        Object[] objectArray2 = objectArray;
        int n = objectArray.length;
        for (int i = 0; i < n; ++i) {
            Object object = objectArray2[i];
            if (!bl) {
                stringBuilder.append(".");
            }
            bl = false;
            if (object instanceof String) {
                stringBuilder.append("\"").append(object).append("\"");
                continue;
            }
            stringBuilder.append(object);
        }
        return stringBuilder.toString();
    }
}

