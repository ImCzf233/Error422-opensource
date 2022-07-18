package net.minecraft.src;
/*
 * Decompiled with CFR 0.152.
 */
import java.util.HashSet;
import java.util.Random;
import java.util.Set;
import net.minecraft.client.Minecraft;

public class VzZ
extends Qnq {
    private Set field_da244c89_FWm;
    private hMY field_37644d8_Dne;
    private Set field_4199517_bzF;
    private final Minecraft field_493682ed_Dne;
    private fzy field_37608e7_Dne;
    private final Set field_11f36d71_Qnq;
    private ZGT field_36fd085_Dne = new ZGT();

    static Set method_b926b360_Dne(VzZ vzZ) {
        return vzZ.field_da244c89_FWm;
    }

    @Override
    protected void method_b0a28144_div() {
        super.method_b0a28144_div();
        this.field_11f36d71_Qnq.retainAll(this.field_83b48b6a_Dne);
        if (this.field_11f36d71_Qnq.size() == this.field_83b48b6a_Dne.size()) {
            this.field_11f36d71_Qnq.clear();
        }
        int n = 0;
        for (Sxs sxs : this.field_83b48b6a_Dne) {
            if (this.field_11f36d71_Qnq.contains(sxs)) continue;
            int n2 = sxs.field_2092ae_Dne * 16;
            int n3 = sxs.field_21260d_FWm * 16;
            this.field_365731d_Dne.method_8f501fe4_Dne("getChunk");
            qMV qMV2 = this.method_e1796070_FWm(sxs.field_2092ae_Dne, sxs.field_21260d_FWm);
            this.method_f322b0ed_Dne(n2, n3, qMV2);
            this.field_365731d_Dne.method_7c6f6039_FWm();
            this.field_11f36d71_Qnq.add(sxs);
            if (++n < 10) continue;
            return;
        }
    }

    @Override
    public boolean method_94d18be5_FWm(sMa sMa2) {
        boolean bl = super.method_94d18be5_FWm(sMa2);
        this.field_da244c89_FWm.add(sMa2);
        if (!bl) {
            this.field_4199517_bzF.add(sMa2);
        }
        return bl;
    }

    public void method_9feec6c2_Zpi() {
        int n;
        int n2;
        sMa sMa2;
        int n3;
        this.field_f27c122c_Dne.removeAll(this.field_6a0474ed_FWm);
        for (n3 = 0; n3 < this.field_6a0474ed_FWm.size(); ++n3) {
            sMa2 = (sMa)this.field_6a0474ed_FWm.get(n3);
            n2 = sMa2.field_22c602_IjH;
            n = sMa2.field_29186d_XHL;
            if (!sMa2.field_367165_trS || !this.method_16cca7e_Dne(n2, n)) continue;
            this.method_e1796070_FWm(n2, n).method_94d18be1_FWm(sMa2);
        }
        for (n3 = 0; n3 < this.field_6a0474ed_FWm.size(); ++n3) {
            this.method_94d18be1_FWm((sMa)this.field_6a0474ed_FWm.get(n3));
        }
        this.field_6a0474ed_FWm.clear();
        for (n3 = 0; n3 < this.field_f27c122c_Dne.size(); ++n3) {
            sMa2 = (sMa)this.field_f27c122c_Dne.get(n3);
            if (sMa2.field_203511c4_FWm != null) {
                if (!sMa2.field_203511c4_FWm.field_2a9ae7_Zpi && sMa2.field_203511c4_FWm.field_37b45e5_Dne == sMa2) continue;
                sMa2.field_203511c4_FWm.field_37b45e5_Dne = null;
                sMa2.field_203511c4_FWm = null;
            }
            if (!sMa2.field_2a9ae7_Zpi) continue;
            n2 = sMa2.field_22c602_IjH;
            n = sMa2.field_29186d_XHL;
            if (sMa2.field_367165_trS && this.method_16cca7e_Dne(n2, n)) {
                this.method_e1796070_FWm(n2, n).method_94d18be1_FWm(sMa2);
            }
            this.field_f27c122c_Dne.remove(n3--);
            this.method_94d18be1_FWm(sMa2);
        }
    }

    public sMa method_77d29d94_FWm(int n) {
        sMa sMa2 = (sMa)this.field_36fd085_Dne.method_bb07ce88_FWm(n);
        if (sMa2 != null) {
            this.field_da244c89_FWm.remove(sMa2);
            this.method_ad72a713_bzF(sMa2);
        }
        return sMa2;
    }

    public VzZ(fzy fzy2, mrb mrb2, int n, int n2, Bkx bkx, dLs dLs2) {
        super((iDE)new kqb_0(), "MpServer", Jik.method_9e6cb0ee_Dne(n), mrb2, bkx, dLs2);
        this.field_da244c89_FWm = new HashSet();
        this.field_4199517_bzF = new HashSet();
        this.field_493682ed_Dne = Minecraft.method_81a5f12e_Dne();
        this.field_11f36d71_Qnq = new HashSet();
        this.field_37608e7_Dne = fzy2;
        this.field_2d29f4_aFZ = n2;
        this.method_76d9fc43_aFZ(8, 64, 8);
        this.field_3698a74_Dne = fzy2.field_3698a74_Dne;
    }

    public void method_2c2d379a_Dne(int n, int n2, boolean bl) {
        if (bl) {
            this.field_37644d8_Dne.method_e1796070_FWm(n, n2);
        } else {
            this.field_37644d8_Dne.method_1e269659_FWm(n, n2);
        }
        if (!bl) {
            this.method_c6b5263a_Dne(n * 16, 0, n2 * 16, n * 16 + 15, 256, n2 * 16 + 15);
        }
    }

    static Set method_6ef04161_FWm(VzZ vzZ) {
        return vzZ.field_4199517_bzF;
    }

    public void method_e2f11780_aFZ(int n, int n2, int n3, int n4, int n5, int n6) {
    }

    @Override
    public sMa method_9e7ee9d3_Dne(int n) {
        return n == this.field_493682ed_Dne.field_369f6b6_Dne.field_2d29f4_aFZ ? this.field_493682ed_Dne.field_369f6b6_Dne : (sMa)this.field_36fd085_Dne.method_394ba0a9_Dne(n);
    }

    @Override
    public void method_ad72a713_bzF(sMa sMa2) {
        super.method_ad72a713_bzF(sMa2);
        this.field_da244c89_FWm.remove(sMa2);
    }

    @Override
    public void method_8288d6ee_IjH() {
        this.field_37608e7_Dne.method_7be2fb8c_Dne(new yZV("Quitting"));
    }

    @Override
    protected void method_94d18be1_FWm(sMa sMa2) {
        super.method_94d18be1_FWm(sMa2);
        if (this.field_da244c89_FWm.contains(sMa2)) {
            if (sMa2.method_cd4cb3d9_udO()) {
                this.field_4199517_bzF.add(sMa2);
            } else {
                this.field_da244c89_FWm.remove(sMa2);
            }
        }
    }

    public void method_e53317d1_zGp(int n, int n2, int n3) {
        int n4 = 16;
        Random random = new Random();
        for (int i = 0; i < 1000; ++i) {
            int n5;
            int n6;
            int n7 = n + this.field_7331eae7_Dne.nextInt(n4) - this.field_7331eae7_Dne.nextInt(n4);
            int n8 = this.method_2c2cf7bc_Dne(n7, n6 = n2 + this.field_7331eae7_Dne.nextInt(n4) - this.field_7331eae7_Dne.nextInt(n4), n5 = n3 + this.field_7331eae7_Dne.nextInt(n4) - this.field_7331eae7_Dne.nextInt(n4));
            if (n8 == 0 && this.field_7331eae7_Dne.nextInt(8) > n6 && this.field_3690d00_Dne.method_907a9d25_Qnq()) {
                this.method_8600ec24_Dne("depthsuspend", (float)n7 + this.field_7331eae7_Dne.nextFloat(), (float)n6 + this.field_7331eae7_Dne.nextFloat(), (float)n5 + this.field_7331eae7_Dne.nextFloat(), 0.0, 0.0, 0.0);
                continue;
            }
            if (n8 <= 0) continue;
            zKP.field_8374b848_Dne[n8].method_ff5e68fb_FWm(this, n7, n6, n5, random);
        }
    }

    public boolean method_ae303dae_FWm(int n, int n2, int n3, int n4, int n5) {
        this.method_e2f11780_aFZ(n, n2, n3, n, n2, n3);
        return super.method_17d7ea9d_FWm(n, n2, n3, n4, n5, 3);
    }

    @Override
    protected void method_bb7dd820_Dne(sMa sMa2) {
        super.method_bb7dd820_Dne(sMa2);
        if (this.field_4199517_bzF.contains(sMa2)) {
            this.field_4199517_bzF.remove(sMa2);
        }
    }

    @Override
    public Noo method_f7903e73_Dne(McM mcM) {
        Noo noo = super.method_f7903e73_Dne(mcM);
        noo.method_2aeeb7ad_Dne("Forced entities", new QUe(this));
        noo.method_2aeeb7ad_Dne("Retry entities", new QIz(this));
        return noo;
    }

    public void method_847193d9_Dne(SFA sFA) {
        this.field_36c9bde_Dne = sFA;
    }

    @Override
    public qDW method_f4d8ada1_Dne(Ebp ebp) {
        return new TNI(this.field_493682ed_Dne.field_3788296_Dne, ebp, this.field_493682ed_Dne.field_369f6b6_Dne);
    }

    @Override
    protected void method_a98a0660_aFZ() {
        if (!this.field_3690d00_Dne.field_21261e_FWm) {
            this.field_2092ab_Dne = this.field_21260a_FWm;
            this.field_21260a_FWm = this.field_37e0a6a_Dne.method_7c6f603d_FWm() ? (float)((double)this.field_21260a_FWm + 0.01) : (float)((double)this.field_21260a_FWm - 0.01);
            if (this.field_21260a_FWm < 0.0f) {
                this.field_21260a_FWm = 0.0f;
            }
            if (this.field_21260a_FWm > 1.0f) {
                this.field_21260a_FWm = 1.0f;
            }
            this.field_2e5f18_bzF = this.field_267cf2_Qnq;
            this.field_267cf2_Qnq = this.field_37e0a6a_Dne.method_7a46289e_Dne() ? (float)((double)this.field_267cf2_Qnq + 0.01) : (float)((double)this.field_267cf2_Qnq - 0.01);
            if (this.field_267cf2_Qnq < 0.0f) {
                this.field_267cf2_Qnq = 0.0f;
            }
            if (this.field_267cf2_Qnq > 1.0f) {
                this.field_267cf2_Qnq = 1.0f;
            }
        }
    }

    @Override
    public void method_62d7c9a6_Dne(double d, double d2, double d3, String string, float f, float f2, boolean bl) {
        double d4;
        float f3 = 16.0f;
        if (f > 1.0f) {
            f3 *= f;
        }
        if ((d4 = this.field_493682ed_Dne.field_366ec33_Dne.method_2be42992_Dne(d, d2, d3)) < (double)(f3 * f3)) {
            if (bl && d4 > 100.0) {
                double d5 = Math.sqrt(d4) / 40.0;
                this.field_493682ed_Dne.field_3788296_Dne.method_c3169827_Dne(string, (float)d, (float)d2, (float)d3, f, f2, (int)Math.round(d5 * 20.0));
            } else {
                this.field_493682ed_Dne.field_3788296_Dne.method_d4bea65c_Dne(string, (float)d, (float)d2, (float)d3, f, f2);
            }
        }
    }

    @Override
    public void method_907a9d21_Qnq() {
        super.method_907a9d21_Qnq();
        this.method_ce7f616a_Dne(this.method_7c6f602d_FWm() + 1L);
        this.method_117d1dab_FWm(this.method_ae128dbb_bzF() + 1L);
        this.field_365731d_Dne.method_8f501fe4_Dne("reEntryProcessing");
        for (int i = 0; i < 10 && !this.field_4199517_bzF.isEmpty(); ++i) {
            sMa sMa2 = (sMa)this.field_4199517_bzF.iterator().next();
            this.field_4199517_bzF.remove(sMa2);
            if (this.field_f27c122c_Dne.contains(sMa2)) continue;
            this.method_94d18be5_FWm(sMa2);
        }
        this.field_365731d_Dne.method_110c4dc3_FWm("connection");
        this.field_37608e7_Dne.method_7c6f6039_FWm();
        this.field_365731d_Dne.method_110c4dc3_FWm("chunkCache");
        this.field_37644d8_Dne.method_7a46289e_Dne();
        this.field_365731d_Dne.method_110c4dc3_FWm("tiles");
        this.method_b0a28144_div();
        this.field_365731d_Dne.method_7c6f6039_FWm();
        qxi_0.method_7a46289a_Dne();
        if (qxi_0.field_36b4fb5_Dne != null && !qxi_0.field_36b4fb5_Dne.field_2a9ae7_Zpi) {
            fRU.method_230efcc2_Dne().method_7a46289a_Dne();
        }
    }

    @Override
    protected ZfC method_2309d134_Dne() {
        this.field_37644d8_Dne = new hMY(this);
        return this.field_37644d8_Dne;
    }

    @Override
    public void method_37142557_Dne(double d, double d2, double d3, double d4, double d5, double d6, WkD wkD) {
        this.field_493682ed_Dne.field_364ffb6_Dne.method_68e8f1ab_Dne(new ZIm(this, d, d2, d3, d4, d5, d6, this.field_493682ed_Dne.field_364ffb6_Dne, wkD));
    }

    public void method_ad567471_Dne(int n, sMa sMa2) {
        sMa sMa3 = this.method_9e7ee9d3_Dne(n);
        if (sMa3 != null) {
            this.method_ad72a713_bzF(sMa3);
        }
        this.field_da244c89_FWm.add(sMa2);
        sMa2.field_2d29f4_aFZ = n;
        if (!this.method_94d18be5_FWm(sMa2)) {
            this.field_4199517_bzF.add(sMa2);
        }
        this.field_36fd085_Dne.method_ad009545_Dne(n, sMa2);
    }
}

