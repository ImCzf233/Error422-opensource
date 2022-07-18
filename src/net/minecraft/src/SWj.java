package net.minecraft.src;
/*
 * Decompiled with CFR 0.152.
 */
import java.util.Date;

class SWj
extends LSv {
    final PRD field_36b6c2a_Dne;

    @Override
    protected int method_ae128dba_bzF() {
        return PRD.method_41cb4282_Dne(this.field_36b6c2a_Dne).size() * 36;
    }

    @Override
    protected void method_7a46289a_Dne() {
        this.field_36b6c2a_Dne.method_a98a0660_aFZ();
    }

    @Override
    protected void method_8a73475f_Dne(int n, int n2, int n3, int n4, WAR wAR) {
        pQP pQP2 = (pQP)PRD.method_41cb4282_Dne(this.field_36b6c2a_Dne).get(n);
        String string = pQP2.method_d1f1ed87_FWm();
        if (string == null || geR.method_8f501fe8_Dne(string)) {
            string = PRD.method_ee4421b_Dne(this.field_36b6c2a_Dne) + " " + (n + 1);
        }
        String string2 = pQP2.method_eecad346_Dne();
        string2 = string2 + " (" + PRD.method_7ecf6ba6_Dne(this.field_36b6c2a_Dne).format(new Date(pQP2.method_7a46288e_Dne()));
        string2 = string2 + ")";
        String string3 = "";
        if (pQP2.method_7a46289e_Dne()) {
            string3 = PRD.method_d908687a_FWm(this.field_36b6c2a_Dne) + " " + string3;
        } else {
            string3 = PRD.method_462f35b4_Dne(this.field_36b6c2a_Dne)[pQP2.method_230878ef_Dne().method_7a46288d_Dne()];
            if (pQP2.method_7c6f603d_FWm()) {
                string3 = (Object)((Object)Dne.field_7129e917_aFZ) + KGL.method_39193c_Dne("gameMode.hardcore") + (Object)((Object)Dne.field_d3fa959_FfS);
            }
            if (pQP2.method_ae128dcb_bzF()) {
                string3 = string3 + ", " + KGL.method_39193c_Dne("selectWorld.cheats");
            }
        }
        this.field_36b6c2a_Dne.method_67d6d54c_FWm(this.field_36b6c2a_Dne.field_3791671_Dne, string, n2 + 2, n3 + 1, 0xFFFFFF);
        this.field_36b6c2a_Dne.method_67d6d54c_FWm(this.field_36b6c2a_Dne.field_3791671_Dne, string2, n2 + 2, n3 + 12, 0x808080);
        this.field_36b6c2a_Dne.method_67d6d54c_FWm(this.field_36b6c2a_Dne.field_3791671_Dne, string3, n2 + 2, n3 + 12 + 10, 0x808080);
    }

    public SWj(PRD pRD) {
        super(pRD.field_493682ed_Dne, pRD.field_21260d_FWm, pRD.field_2e5f1b_bzF, 32, pRD.field_2e5f1b_bzF - 64, 36);
        this.field_36b6c2a_Dne = pRD;
    }

    @Override
    protected void method_16d0a4b_Dne(int n, boolean bl) {
        boolean bl2;
        PRD.method_7fb31671_Dne(this.field_36b6c2a_Dne, n);
        PRD.method_54f760e6_Dne((PRD)this.field_36b6c2a_Dne).field_2092bf_Dne = bl2 = PRD.method_7ffd8118_Dne(this.field_36b6c2a_Dne) >= 0 && PRD.method_7ffd8118_Dne(this.field_36b6c2a_Dne) < this.method_7a46288d_Dne();
        PRD.method_31d94c27_FWm((PRD)this.field_36b6c2a_Dne).field_2092bf_Dne = bl2;
        PRD.method_91357e59_bzF((PRD)this.field_36b6c2a_Dne).field_2092bf_Dne = bl2;
        PRD.method_1340143f_Qnq((PRD)this.field_36b6c2a_Dne).field_2092bf_Dne = bl2;
        if (bl && bl2) {
            this.field_36b6c2a_Dne.method_ce7f5da9_Dne(n);
        }
    }

    @Override
    protected boolean method_ce7f5dad_Dne(int n) {
        return n == PRD.method_7ffd8118_Dne(this.field_36b6c2a_Dne);
    }

    @Override
    protected int method_7a46288d_Dne() {
        return PRD.method_41cb4282_Dne(this.field_36b6c2a_Dne).size();
    }
}

