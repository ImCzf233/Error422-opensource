package net.minecraft.src;
/*
 * Decompiled with CFR 0.152.
 */
import java.util.ArrayList;
import java.util.List;

public class ksB
extends uOw {
    public List field_f27c122c_Dne;

    public static ksB method_285afe7b_Dne(String string) {
        ksB ksB2 = new ksB();
        ksB2.field_f27c122c_Dne = new ArrayList();
        try {
            bab bab2 = new tjH().method_2856a772_Dne(string);
            if (bab2.method_8fc1d85b_Dne("servers")) {
                for (LIC lIC : bab2.method_d26b6110_Dne("servers")) {
                    ksB2.field_f27c122c_Dne.add(muh.method_e595f3b2_Dne(lIC));
                }
            }
        }
        catch (pPp pPp2) {
        }
        catch (IllegalArgumentException illegalArgumentException) {
            // empty catch block
        }
        return ksB2;
    }
}

