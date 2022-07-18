package net.minecraft.src;
/*
 * Decompiled with CFR 0.152.
 */
import java.util.ArrayList;

public class OEk {
    static int field_2e5f1b_bzF;
    public static int field_21260d_FWm;
    public static ArrayList field_dc9cb15_Dne;
    public static ArrayList field_8f85f8f4_FWm;
    public static int field_2092ae_Dne;

    public static void method_7c6f6039_FWm() {
        if (field_2e5f1b_bzF == 13) {
            OEk.method_7a46289a_Dne();
            field_2e5f1b_bzF = 0;
        } else {
            ++field_2e5f1b_bzF;
        }
        int n = 0;
        int n2 = 0;
        int n3 = 0;
        for (int i = 0; i < field_21260d_FWm / 6 + 1; ++i) {
            for (int j = 0; j < field_2092ae_Dne / 10; ++j) {
                qxi_0.field_493682ed_Dne.field_3791671_Dne.method_e88b55f3_FWm((String)field_dc9cb15_Dne.get(n3), n, n2, (Integer)field_8f85f8f4_FWm.get(n3));
                n2 += 11;
                ++n3;
            }
            n += 6;
            n2 = 0;
        }
    }

    static {
        field_dc9cb15_Dne = new ArrayList();
        field_8f85f8f4_FWm = new ArrayList();
    }

    public static void method_7a46289a_Dne() {
        field_dc9cb15_Dne.clear();
        field_8f85f8f4_FWm.clear();
        field_21260d_FWm = qxi_0.field_493682ed_Dne.field_37a7e17_Dne.field_21260d_FWm;
        field_2092ae_Dne = qxi_0.field_493682ed_Dne.field_37a7e17_Dne.field_2e5f1b_bzF;
        for (int i = 0; i < (field_21260d_FWm / 6 + 1) * (field_2092ae_Dne / 10); ++i) {
            field_dc9cb15_Dne.add(Character.toString(qxi_0.field_3f1c583_Dne[eCD.method_ce7f5d9c_Dne(qxi_0.field_3f1c583_Dne.length)]));
            field_8f85f8f4_FWm.add(eCD.method_ce7f5d9c_Dne(0xFFFFFF));
        }
    }
}

