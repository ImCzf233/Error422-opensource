package net.minecraft.src;
/*
 * Decompiled with CFR 0.152.
 */
import org.lwjgl.opengl.GL11;

class TIk
extends lSb {
    final wWl field_37d3e40_Dne;

    @Override
    protected void method_8a73475f_Dne(int n, int n2, int n3, int n4, WAR wAR) {
        if (n < wWl.method_d5e11f2c_Dne(this.field_37d3e40_Dne).size()) {
            this.method_675532a0_FWm(n, n2, n3, n4, wAR);
        }
    }

    @Override
    protected int method_7c6f602c_FWm() {
        return this.method_7a46288d_Dne() * 36;
    }

    @Override
    protected void method_16d0a4b_Dne(int n, boolean bl) {
        if (n < wWl.method_d5e11f2c_Dne(this.field_37d3e40_Dne).size()) {
            wWl.method_eaa4c8fa_FWm(this.field_37d3e40_Dne, n);
            muh muh2 = (muh)wWl.method_d5e11f2c_Dne(this.field_37d3e40_Dne).get(wWl.method_c2e325ae_Dne(this.field_37d3e40_Dne));
            wWl.method_acacca7c_Dne((wWl)this.field_37d3e40_Dne).field_2092bf_Dne = wWl.method_4b9fa29a_bzF((wWl)this.field_37d3e40_Dne).field_37d3e5f_Dne.field_569fcf45_Dne.equals(muh2.field_9e60dbde_Qnq);
            boolean bl2 = wWl.method_898eb5bd_FWm((wWl)this.field_37d3e40_Dne).field_2092bf_Dne = muh2.field_c480ca78_bzF.equals("OPEN") && !muh2.field_2092bf_Dne;
            if (bl && wWl.method_898eb5bd_FWm((wWl)this.field_37d3e40_Dne).field_2092bf_Dne) {
                wWl.method_998204a8_Dne(this.field_37d3e40_Dne, wWl.method_c2e325ae_Dne(this.field_37d3e40_Dne));
            }
        }
    }

    @Override
    protected boolean method_ce7f5dad_Dne(int n) {
        return n == wWl.method_c2e325ae_Dne(this.field_37d3e40_Dne);
    }

    @Override
    protected int method_7a46288d_Dne() {
        return wWl.method_d5e11f2c_Dne(this.field_37d3e40_Dne).size() + 1;
    }

    @Override
    protected void method_7a46289a_Dne() {
        this.field_37d3e40_Dne.method_a98a0660_aFZ();
    }

    public TIk(wWl wWl2) {
        super(wWl.method_8837a40c_FWm(wWl2), wWl2.field_21260d_FWm, wWl2.field_2e5f1b_bzF, 32, wWl2.field_2e5f1b_bzF - 64, 36);
        this.field_37d3e40_Dne = wWl2;
    }

    /*
     * WARNING - Removed try catching itself - possible behaviour change.
     */
    private void method_ccadf558_Dne(int n, int n2, int n3, muh muh2) {
        if (muh2.field_bc57ecbf_aFZ != null) {
            int n4;
            boolean bl;
            Object object = wWl.method_fc07f5d8_Dne();
            synchronized (object) {
                if (wWl.method_7a46288d_Dne() < 5 && (!muh2.field_21261e_FWm || muh2.field_2e5f2c_bzF)) {
                    new dvr(this, muh2).start();
                }
            }
            boolean bl2 = muh2.field_21260d_FWm > 61;
            boolean bl3 = muh2.field_21260d_FWm < 61;
            boolean bl4 = bl = bl2 || bl3;
            if (muh2.field_309c90bc_DyG != null) {
                this.field_37d3e40_Dne.method_67d6d54c_FWm(wWl.method_6b02dcca_Qnq(this.field_37d3e40_Dne), muh2.field_309c90bc_DyG, n2 + 215 - wWl.method_504c6a6b_aFZ(this.field_37d3e40_Dne).method_8f501fd7_Dne(muh2.field_309c90bc_DyG), n3 + 1, 0x808080);
            }
            if (bl) {
                String string = (Object)((Object)Dne.field_7129e917_aFZ) + muh2.field_8b8e234d_zGp;
                this.field_37d3e40_Dne.method_67d6d54c_FWm(wWl.method_77da2379_zGp(this.field_37d3e40_Dne), string, n2 + 200 - wWl.method_6de71028_DyG(this.field_37d3e40_Dne).method_8f501fd7_Dne(string), n3 + 1, 0x808080);
            }
            GL11.glColor4f(1.0f, 1.0f, 1.0f, 1.0f);
            wWl.method_441d90e5_zGp((wWl)this.field_37d3e40_Dne).field_36d36bf_Dne.method_8f501fe4_Dne("/gui/icons.png");
            int n5 = 0;
            boolean bl5 = false;
            String string = null;
            if (bl) {
                string = bl2 ? "Client out of date!" : "Server out of date!";
                n4 = 5;
                this.field_37d3e40_Dne.method_17d7ea99_FWm(n2 + 205, n3, n5 * 10, 176 + n4 * 8, 10, 8);
            }
            if (this.field_267cf5_Qnq >= n2 + 205 - (n4 = 4) && this.field_2d29f4_aFZ >= n3 - n4 && this.field_267cf5_Qnq <= n2 + 205 + 10 + n4 && this.field_2d29f4_aFZ <= n3 + 8 + n4) {
                wWl.method_88f9407b_Dne(this.field_37d3e40_Dne, string);
            }
        }
    }

    @Override
    protected boolean method_117d19ee_FWm(int n) {
        return n < wWl.method_d5e11f2c_Dne(this.field_37d3e40_Dne).size() && ((muh)wWl.method_d5e11f2c_Dne((wWl)this.field_37d3e40_Dne).get((int)n)).field_9e60dbde_Qnq.toLowerCase().equals(wWl.method_d86c8cf4_Qnq((wWl)this.field_37d3e40_Dne).field_37d3e5f_Dne.field_569fcf45_Dne);
    }

    private void method_675532a0_FWm(int n, int n2, int n3, int n4, WAR wAR) {
        muh muh2 = (muh)wWl.method_d5e11f2c_Dne(this.field_37d3e40_Dne).get(n);
        this.field_37d3e40_Dne.method_67d6d54c_FWm(wWl.method_acba2971_Dne(this.field_37d3e40_Dne), muh2.method_d1f1ed87_FWm(), n2 + 2, n3 + 1, 0xFFFFFF);
        int n5 = 207;
        int n6 = 1;
        if (muh2.field_2092bf_Dne) {
            wWl.method_e319f8fb_Dne(this.field_37d3e40_Dne, n2 + n5, n3 + n6, this.field_267cf5_Qnq, this.field_2d29f4_aFZ);
        } else if (muh2.field_c480ca78_bzF.equals("CLOSED")) {
            wWl.method_bffbe43c_FWm(this.field_37d3e40_Dne, n2 + n5, n3 + n6, this.field_267cf5_Qnq, this.field_2d29f4_aFZ);
        } else if (muh2.field_9e60dbde_Qnq.equals(wWl.method_820882b3_aFZ((wWl)this.field_37d3e40_Dne).field_37d3e5f_Dne.field_569fcf45_Dne) && muh2.field_2092ae_Dne < 7) {
            this.method_ccadf558_Dne(n, n2 - 14, n3, muh2);
            wWl.method_80259968_Dne(this.field_37d3e40_Dne, n2 + n5, n3 + n6, this.field_267cf5_Qnq, this.field_2d29f4_aFZ, muh2.field_2092ae_Dne);
        } else if (muh2.field_c480ca78_bzF.equals("OPEN")) {
            wWl.method_1f58166e_bzF(this.field_37d3e40_Dne, n2 + n5, n3 + n6, this.field_267cf5_Qnq, this.field_2d29f4_aFZ);
            this.method_ccadf558_Dne(n, n2 - 14, n3, muh2);
        }
        this.field_37d3e40_Dne.method_67d6d54c_FWm(wWl.method_899c14b2_FWm(this.field_37d3e40_Dne), muh2.method_eecad346_Dne(), n2 + 2, n3 + 12, 0x6C6C6C);
        this.field_37d3e40_Dne.method_67d6d54c_FWm(wWl.method_e8f846e4_bzF(this.field_37d3e40_Dne), muh2.field_9e60dbde_Qnq, n2 + 2, n3 + 12 + 11, 0x4C4C4C);
    }
}

