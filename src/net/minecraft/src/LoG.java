package net.minecraft.src;
/*
 * Decompiled with CFR 0.152.
 */
import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.File;
import java.io.IOException;
import java.util.HashMap;
import java.util.Map;

public class LoG {
    private static final Map<Object, inq_0> field_83b1c1b0_Dne = new HashMap();

    public static synchronized void method_7a46289a_Dne() {
        for (inq_0 inq_02 : field_83b1c1b0_Dne.values()) {
            try {
                if (inq_02 == null) continue;
                inq_02.method_7a46289a_Dne();
            }
            catch (IOException iOException) {
                iOException.printStackTrace();
            }
        }
        field_83b1c1b0_Dne.clear();
    }

    public static synchronized inq_0 method_daf6_Dne(File file, int n, int n2) {
        File file2 = new File(file, "region");
        File file3 = new File(file2, "r." + (n >> 5) + "." + (n2 >> 5) + ".mca");
        inq_0 inq_02 = (inq_0)field_83b1c1b0_Dne.get(file3);
        if (inq_02 != null) {
            return inq_02;
        }
        if (!file2.exists()) {
            file2.mkdirs();
        }
        if (field_83b1c1b0_Dne.size() >= 256) {
            LoG.method_7a46289a_Dne();
        }
        inq_0 inq_03 = new inq_0(file3);
        field_83b1c1b0_Dne.put(file3, inq_03);
        return inq_03;
    }

    public static DataOutputStream method_1476532d_Dne(File file, int n, int n2) {
        inq_0 inq_02 = LoG.method_daf6_Dne(file, n, n2);
        return inq_02.method_e4950984_Dne(n & 0x1F, n2 & 0x1F);
    }

    public static DataInputStream method_993f207e_Dne(File file, int n, int n2) {
        inq_0 inq_02 = LoG.method_daf6_Dne(file, n, n2);
        return inq_02.method_1bd4c347_Dne(n & 0x1F, n2 & 0x1F);
    }
}

