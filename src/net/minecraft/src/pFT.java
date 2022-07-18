package net.minecraft.src;
/*
 * Decompiled with CFR 0.152.
 */
import java.util.ArrayList;
import java.util.List;

public class pFT {
    private final List<JIS> field_f27c122c_Dne = new ArrayList();
    private boolean field_21261e_FWm = false;
    private String field_569fcf45_Dne;
    private int field_2092ae_Dne = 0;
    private final FUH field_366ec33_Dne;
    private boolean field_2092bf_Dne = false;

    public void method_7ae95ee1_Dne(zBn zBn2, int n, int n2) {
        this.method_ae128dc7_bzF();
        this.method_7a46289a_Dne();
        JIS jIS = new JIS(zBn2, this.field_366ec33_Dne.field_388da6_zGp, n, n2, this.field_569fcf45_Dne, this.field_366ec33_Dne.field_2e8483_ceE);
        this.field_f27c122c_Dne.add(jIS);
        this.field_2092ae_Dne = this.field_366ec33_Dne.field_388da6_zGp;
        this.field_21261e_FWm = true;
        this.field_2092bf_Dne |= jIS.method_7a46289e_Dne();
    }

    private JIS method_23022057_Dne() {
        JIS jIS = null;
        JIS jIS2 = null;
        int n = 0;
        float f = 0.0f;
        for (int i = 0; i < this.field_f27c122c_Dne.size(); ++i) {
            JIS jIS3;
            JIS jIS4 = (JIS)this.field_f27c122c_Dne.get(i);
            JIS jIS5 = jIS3 = i > 0 ? (JIS)this.field_f27c122c_Dne.get(i - 1) : null;
            if ((jIS4.method_2317db25_Dne() == zBn.field_142722f0_div || jIS4.method_2317db25_Dne() == zBn.field_5ceb61a_IjH) && jIS4.method_7a46288a_Dne() > 0.0f && (jIS == null || jIS4.method_7a46288a_Dne() > f)) {
                jIS = i > 0 ? jIS3 : jIS4;
                f = jIS4.method_7a46288a_Dne();
            }
            if (jIS4.method_eecad346_Dne() == null || jIS2 != null && jIS4.method_7a46288d_Dne() <= n) continue;
            jIS2 = jIS4;
        }
        if (f > 5.0f && jIS != null) {
            return jIS;
        }
        if (n > 5 && jIS2 != null) {
            return jIS2;
        }
        return null;
    }

    public String method_eecad346_Dne() {
        if (this.field_f27c122c_Dne.size() == 0) {
            return this.field_366ec33_Dne.method_c6f17a40_aFZ() + " died";
        }
        JIS jIS = this.method_23022057_Dne();
        JIS jIS2 = (JIS)this.field_f27c122c_Dne.get(this.field_f27c122c_Dne.size() - 1);
        String string = "";
        String string2 = jIS2.method_d1f1ed87_FWm();
        sMa sMa2 = jIS2.method_2317db25_Dne().method_f88b2463_FWm();
        if (jIS != null && jIS2.method_2317db25_Dne() == zBn.field_142722f0_div) {
            String string3 = jIS.method_d1f1ed87_FWm();
            if (jIS.method_2317db25_Dne() != zBn.field_142722f0_div && jIS.method_2317db25_Dne() != zBn.field_5ceb61a_IjH) {
                if (!(string3 == null || string2 != null && string3.equals(string2))) {
                    NMq nMq;
                    sMa sMa3 = jIS.method_2317db25_Dne().method_f88b2463_FWm();
                    NMq nMq2 = nMq = sMa3 instanceof FUH ? ((FUH)sMa3).method_23040479_Dne() : null;
                    string = nMq != null && nMq.method_d44b4596_zGp() ? KGL.method_98148f73_Dne("death.fell.assist.item", this.field_366ec33_Dne.method_c6f17a40_aFZ(), string2, nMq.method_d1f1ed87_FWm()) : KGL.method_98148f73_Dne("death.fell.assist", this.field_366ec33_Dne.method_c6f17a40_aFZ(), string3);
                } else if (string2 != null) {
                    NMq nMq;
                    NMq nMq3 = nMq = sMa2 instanceof FUH ? ((FUH)sMa2).method_23040479_Dne() : null;
                    string = nMq != null && nMq.method_d44b4596_zGp() ? KGL.method_98148f73_Dne("death.fell.finish.item", this.field_366ec33_Dne.method_c6f17a40_aFZ(), string2, nMq.method_d1f1ed87_FWm()) : KGL.method_98148f73_Dne("death.fell.finish", this.field_366ec33_Dne.method_c6f17a40_aFZ(), string2);
                } else {
                    string = KGL.method_98148f73_Dne("death.fell.killer", this.field_366ec33_Dne.method_c6f17a40_aFZ());
                }
            } else {
                string = KGL.method_98148f73_Dne("death.fell.accident." + this.method_53fd7d8d_Dne(jIS), this.field_366ec33_Dne.method_c6f17a40_aFZ());
            }
        } else {
            string = jIS2.method_2317db25_Dne().method_eee94b72_Dne(this.field_366ec33_Dne);
        }
        return string;
    }

    public pFT(FUH fUH) {
        this.field_366ec33_Dne = fUH;
    }

    public FUH method_23007a92_Dne() {
        FUH fUH = null;
        FiG fiG = null;
        int n = 0;
        int n2 = 0;
        for (JIS jIS : this.field_f27c122c_Dne) {
            if (jIS.method_2317db25_Dne().method_f88b2463_FWm() instanceof FiG && (fiG == null || jIS.method_7a46288d_Dne() > n2)) {
                n2 = jIS.method_7a46288d_Dne();
                fiG = (FiG)jIS.method_2317db25_Dne().method_f88b2463_FWm();
            }
            if (!(jIS.method_2317db25_Dne().method_f88b2463_FWm() instanceof FUH) || fUH != null && jIS.method_7a46288d_Dne() <= n) continue;
            n = jIS.method_7a46288d_Dne();
            fUH = (FUH)jIS.method_2317db25_Dne().method_f88b2463_FWm();
        }
        if (fiG != null && n2 >= n / 3) {
            return fiG;
        }
        return fUH;
    }

    private String method_53fd7d8d_Dne(JIS jIS) {
        return jIS.method_eecad346_Dne() == null ? "generic" : jIS.method_eecad346_Dne();
    }

    public void method_7a46289a_Dne() {
        this.method_7c6f6039_FWm();
        if (this.field_366ec33_Dne.method_b0a28148_div()) {
            int n = this.field_366ec33_Dne.field_36c4f18_Dne.method_2c2cf7bc_Dne(geR.method_117d0718_FWm(this.field_366ec33_Dne.field_2f0dd3_div), geR.method_117d0718_FWm(this.field_366ec33_Dne.field_373a3ed_Dne.field_212608_FWm), geR.method_117d0718_FWm(this.field_366ec33_Dne.field_334487_mrb));
            if (n == zKP.field_fa1a6f1_ZfC.field_21260d_FWm) {
                this.field_569fcf45_Dne = "ladder";
            } else if (n == zKP.field_728b3649_ipf.field_21260d_FWm) {
                this.field_569fcf45_Dne = "vines";
            }
        } else if (this.field_366ec33_Dne.method_9feec6c6_Zpi()) {
            this.field_569fcf45_Dne = "water";
        }
    }

    private void method_7c6f6039_FWm() {
        this.field_569fcf45_Dne = null;
    }

    private void method_ae128dc7_bzF() {
        int n;
        int n2 = n = this.field_2092bf_Dne ? 300 : 100;
        if (this.field_21261e_FWm && this.field_366ec33_Dne.field_388da6_zGp - this.field_2092ae_Dne > n) {
            this.field_f27c122c_Dne.clear();
            this.field_21261e_FWm = false;
            this.field_2092bf_Dne = false;
        }
    }
}

