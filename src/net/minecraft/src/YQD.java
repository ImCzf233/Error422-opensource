package net.minecraft.src;
/*
 * Decompiled with CFR 0.152.
 */
import java.util.Arrays;

public final class YQD {
    public static iod method_af8451ca_Dne(Object ... objectArray) {
        return YQD.method_6b86d37f_Dne(objectArray, new iod(new etN()));
    }

    public static iod method_9e7ade1c_Dne(int n) {
        return new iod(new Ofm(n));
    }

    private static iod method_6b86d37f_Dne(Object[] objectArray, iod iod2) {
        iod iod3 = iod2;
        for (int i = objectArray.length - 1; i >= 0; --i) {
            if (objectArray[i] instanceof Integer) {
                iod3 = YQD.method_7fef39ed_Dne(YQD.method_77ce91dd_FWm((Integer)objectArray[i]), iod3);
                continue;
            }
            if (!(objectArray[i] instanceof String)) {
                throw new IllegalArgumentException("Element [" + objectArray[i] + "] of path elements [" + Arrays.toString(objectArray) + "] was of illegal type [" + objectArray[i].getClass().getCanonicalName() + "]; only Integer and String are valid.");
            }
            iod3 = YQD.method_7fef39ed_Dne(YQD.method_f27e3136_FWm((String)objectArray[i]), iod3);
        }
        return iod3;
    }

    public static iod method_f27e3136_FWm(String string) {
        return YQD.method_466c5544_aFZ(new Object[0]).method_f8151e9c_Dne(YQD.method_285a0ad7_Dne(string));
    }

    public static iod method_29e4f74b_FWm(Object ... objectArray) {
        return YQD.method_6b86d37f_Dne(objectArray, new iod(new hNJ()));
    }

    public static iod method_785fb563_Qnq(Object ... objectArray) {
        return YQD.method_6b86d37f_Dne(objectArray, new iod(new hAN()));
    }

    public static iod method_466c5544_aFZ(Object ... objectArray) {
        return YQD.method_6b86d37f_Dne(objectArray, new iod(new ZHl()));
    }

    private static iod method_7fef39ed_Dne(iod iod2, iod iod3) {
        return new iod(new bjh_0(iod2, iod3));
    }

    public static iod method_78ec2b2f_Dne(QUo qUo) {
        return new iod(new NYC(qUo));
    }

    public static iod method_285a0ad7_Dne(String string) {
        return YQD.method_78ec2b2f_Dne(ACm.method_284ec1aa_Dne(string));
    }

    public static iod method_77ce91dd_FWm(int n) {
        return YQD.method_785fb563_Qnq(new Object[0]).method_f8151e9c_Dne(YQD.method_9e7ade1c_Dne(n));
    }

    public static iod method_dfdc69fd_bzF(Object ... objectArray) {
        return YQD.method_6b86d37f_Dne(objectArray, new iod(new ujK()));
    }
}

