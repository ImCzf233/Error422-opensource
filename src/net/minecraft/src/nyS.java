package net.minecraft.src;
/*
 * Decompiled with CFR 0.152.
 */
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class nyS
extends dEr {
    public final String field_569fcf45_Dne;
    private static final Map field_83b1c1b0_Dne = new HashMap();

    @Override
    public gDn method_9e795529_Dne(int n) {
        return this.field_375b13b_Dne;
    }

    @Override
    public GXY method_c99eed3e_Dne(NMq nMq) {
        return GXY.field_75af3bd1_bzF;
    }

    protected nyS(int n, String string) {
        super(n);
        this.field_569fcf45_Dne = string;
        this.field_2d29f4_aFZ = 1;
        this.method_829e7ad2_Dne(JcN.field_712c773d_aFZ);
        field_83b1c1b0_Dne.put(string, this);
    }

    @Override
    public void method_845caac7_Dne(Rbp rbp) {
        this.field_375b13b_Dne = rbp.method_285881e4_Dne("record_" + this.field_569fcf45_Dne);
    }

    public String method_eecad346_Dne() {
        return "C418 - " + this.field_569fcf45_Dne;
    }

    @Override
    public void method_497c81fb_Dne(NMq nMq, FiG fiG, List list, boolean bl) {
        list.add(this.method_eecad346_Dne());
    }

    @Override
    public boolean method_4ddc487f_Dne(NMq nMq, FiG fiG, Qnq qnq, int n, int n2, int n3, int n4, float f, float f2, float f3) {
        if (qnq.method_2c2cf7bc_Dne(n, n2, n3) == zKP.field_20bdd0fb_jBE.field_21260d_FWm && qnq.method_2dee76f_bzF(n, n2, n3) == 0) {
            if (qnq.field_2d2a05_aFZ) {
                return true;
            }
            ((VKe)zKP.field_20bdd0fb_jBE).method_4e0c543f_Dne(qnq, n, n2, n3, nMq);
            qnq.method_bfa54b80_Dne(null, 1005, n, n2, n3, this.field_267cf5_Qnq);
            --nMq.field_2092ae_Dne;
            return true;
        }
        return false;
    }

    public static nyS method_285c742d_Dne(String string) {
        return (nyS)field_83b1c1b0_Dne.get(string);
    }
}

