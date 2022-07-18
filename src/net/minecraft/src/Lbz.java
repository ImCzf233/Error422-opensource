package net.minecraft.src;
/*
 * Decompiled with CFR 0.152.
 */
import org.lwjgl.input.Keyboard;

public class Lbz {
    public static int field_2092ae_Dne;
    public static int field_21260d_FWm;
    private static boolean field_2092bf_Dne;

    public static void method_7a46289a_Dne() {
        if (Keyboard.getEventKeyState()) {
            if (!field_2092bf_Dne) {
                field_2092bf_Dne = true;
                ++field_2092ae_Dne;
            }
        } else {
            field_2092bf_Dne = false;
        }
        if (field_21260d_FWm >= Jcz.method_ce7f5d9c_Dne(10)) {
            if (field_2092ae_Dne < 20) {
                qxi_0.field_493682ed_Dne.method_b88fcbd2_Dne(new bze());
            }
            field_2092ae_Dne = 0;
            field_21260d_FWm = 0;
        }
        ++field_21260d_FWm;
    }
}

