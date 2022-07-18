package net.minecraft.src;
/*
 * Decompiled with CFR 0.152.
 */
import java.util.List;

public class YxX
extends cMv {
    private boolean field_2092bf_Dne = false;
    private CDE field_3654ee8_Dne;
    private pjB field_37a51e4_Dne;
    private int field_2092ae_Dne;

    @Override
    public void method_ae128dc7_bzF() {
        this.field_37a51e4_Dne.method_230db26a_Dne().method_d3754820_Dne(this.field_3654ee8_Dne, 30.0f, 30.0f);
        if (this.field_3654ee8_Dne.method_c5287a51_qLR() == this.field_2092ae_Dne) {
            this.field_37a51e4_Dne.method_23028a4c_Dne().method_740ba296_Dne(this.field_3654ee8_Dne, 0.15f);
            this.field_2092bf_Dne = true;
        }
        if (this.field_2092bf_Dne && this.field_37a51e4_Dne.method_bb7dd80e_Dne(this.field_3654ee8_Dne) < 4.0) {
            this.field_3654ee8_Dne.method_117d59bb_FWm(false);
            this.field_37a51e4_Dne.method_23028a4c_Dne().method_7c6f6039_FWm();
        }
    }

    @Override
    public void method_7a46289a_Dne() {
        this.field_2092ae_Dne = this.field_37a51e4_Dne.method_b5ceee8_Dne().nextInt(320);
        this.field_2092bf_Dne = false;
        this.field_3654ee8_Dne.method_23028a4c_Dne().method_7c6f6039_FWm();
    }

    @Override
    public boolean method_7c6f603d_FWm() {
        return this.field_3654ee8_Dne.method_c5287a51_qLR() > 0;
    }

    @Override
    public boolean method_7a46289e_Dne() {
        if (this.field_37a51e4_Dne.method_ae128dba_bzF() >= 0) {
            return false;
        }
        if (!this.field_37a51e4_Dne.field_36c4f18_Dne.method_7a46289e_Dne()) {
            return false;
        }
        List<CDE> list = this.field_37a51e4_Dne.field_36c4f18_Dne.method_9314b7e8_Dne(CDE.class, this.field_37a51e4_Dne.field_373a3ed_Dne.method_b78565d7_FWm(6.0, 2.0, 6.0));
        if (list.isEmpty()) {
            return false;
        }
        for (CDE cDE : list) {
            if (cDE.method_c5287a51_qLR() <= 0) continue;
            this.field_3654ee8_Dne = cDE;
            break;
        }
        return this.field_3654ee8_Dne != null;
    }

    public YxX(pjB pjB2) {
        this.field_37a51e4_Dne = pjB2;
        this.method_ce7f5da9_Dne(3);
    }

    @Override
    public void method_7c6f6039_FWm() {
        this.field_3654ee8_Dne = null;
        this.field_37a51e4_Dne.method_23028a4c_Dne().method_7c6f6039_FWm();
    }
}

