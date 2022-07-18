package net.minecraft.src;
/*
 * Decompiled with CFR 0.152.
 */
import java.util.Random;

public class YHc
extends ljW {
    @Override
    public int method_7a46288d_Dne() {
        return 22;
    }

    @Override
    protected boolean method_a98a0664_aFZ() {
        return true;
    }

    protected YHc(int n) {
        super(n, KFd.field_712c8169_aFZ);
        this.method_82a88d64_Dne(JcN.field_2022bed6_FWm);
        this.method_eb14b51a_Dne(0.0625f, 0.0f, 0.0625f, 0.9375f, 0.875f, 0.9375f);
    }

    @Override
    public void method_ff5e68fb_FWm(Qnq qnq, int n, int n2, int n3, Random random) {
        for (int i = 0; i < 3; ++i) {
            double d = (float)n + random.nextFloat();
            double d2 = (float)n2 + random.nextFloat();
            d = (float)n3 + random.nextFloat();
            double d3 = 0.0;
            double d4 = 0.0;
            double d5 = 0.0;
            int n4 = random.nextInt(2) * 2 - 1;
            int n5 = random.nextInt(2) * 2 - 1;
            d3 = ((double)random.nextFloat() - 0.5) * 0.125;
            d4 = ((double)random.nextFloat() - 0.5) * 0.125;
            d5 = ((double)random.nextFloat() - 0.5) * 0.125;
            double d6 = (double)n3 + 0.5 + 0.25 * (double)n5;
            d5 = random.nextFloat() * 1.0f * (float)n5;
            double d7 = (double)n + 0.5 + 0.25 * (double)n4;
            d3 = random.nextFloat() * 1.0f * (float)n4;
            qnq.method_8600ec24_Dne("portal", d7, d2, d6, d3, d4, d5);
        }
    }

    @Override
    public void method_845caac7_Dne(Rbp rbp) {
        this.field_5e5f2002_Qnq = rbp.method_285881e4_Dne("obsidian");
    }

    @Override
    public boolean method_7c6f603d_FWm() {
        return false;
    }

    @Override
    public ipD method_c35d5be7_Dne(Qnq qnq) {
        return new RPI();
    }

    @Override
    public int method_cfc9daf9_Dne(Random random) {
        return 8;
    }

    @Override
    public int method_24763341_Dne(int n, Random random, int n2) {
        return zKP.field_e641c680_cot.field_21260d_FWm;
    }

    @Override
    public boolean method_7a46289e_Dne() {
        return false;
    }

    @Override
    public void method_ca7e4e57_Dne(Qnq qnq, int n, int n2, int n3, FUH fUH, NMq nMq) {
        int n4 = 0;
        int n5 = geR.method_117d0718_FWm((double)(fUH.field_334489_mrb * 4.0f / 360.0f) + 0.5) & 3;
        if (n5 == 0) {
            n4 = 2;
        }
        if (n5 == 1) {
            n4 = 5;
        }
        if (n5 == 2) {
            n4 = 3;
        }
        if (n5 == 3) {
            n4 = 4;
        }
        qnq.method_d4dc89ed_Dne(n, n2, n3, n4, 2);
    }

    @Override
    public boolean method_cb53d52e_Dne(Qnq qnq, int n, int n2, int n3, FiG fiG, int n4, float f, float f2, float f3) {
        fTB fTB2 = fiG.method_230f01f7_Dne();
        RPI rPI = (RPI)qnq.method_d98e681d_Dne(n, n2, n3);
        if (fTB2 != null && rPI != null) {
            if (qnq.method_6fdef3c4_DyG(n, n2 + 1, n3)) {
                return true;
            }
            if (qnq.field_2d2a05_aFZ) {
                return true;
            }
            fTB2.method_834d493c_Dne(rPI);
            fiG.method_7c9aa178_Dne(fTB2);
            return true;
        }
        return true;
    }
}

