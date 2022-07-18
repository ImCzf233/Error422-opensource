package net.minecraft.src;
/*
 * Decompiled with CFR 0.152.
 */
import java.util.Random;

public class rPc
extends OdI {
    @Override
    public int method_ae128dba_bzF() {
        double d = this.method_ae128db7_bzF();
        double d2 = this.method_7c6f6029_FWm();
        return ((bzF.method_16a71cd_Dne(d, d2) & 0xFEFEFE) + 0x4E0E4E) / 2;
    }

    @Override
    public int method_907a9d14_Qnq() {
        double d = this.method_ae128db7_bzF();
        double d2 = this.method_7c6f6029_FWm();
        return ((QFY.method_16a71cd_Dne(d, d2) & 0xFEFEFE) + 0x4E0E4E) / 2;
    }

    @Override
    public gwq method_d15c9bd6_Dne(Random random) {
        return this.field_36f0e0b_Dne;
    }

    protected rPc(int n) {
        super(n);
        this.field_3674e49_Dne.field_267cf5_Qnq = 2;
        this.field_3674e49_Dne.field_2d29f4_aFZ = -999;
        this.field_3674e49_Dne.field_20b857_DyG = 1;
        this.field_3674e49_Dne.field_2f0dd8_div = 8;
        this.field_3674e49_Dne.field_22c602_IjH = 10;
        this.field_3674e49_Dne.field_31b816_kGO = 1;
        this.field_3674e49_Dne.field_2e5f1b_bzF = 4;
        this.field_2e5f1b_bzF = 14745518;
        this.field_f27c122c_Dne.add(new oIf(Tgj.class, 1, 1, 1));
    }
}

