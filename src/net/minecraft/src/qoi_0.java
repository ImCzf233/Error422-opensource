package net.minecraft.src;
/*
 * Decompiled with CFR 0.152.
 */
/*
 * Renamed from Qoi
 */
public class qoi_0
extends dEr {
    public final int field_2092ae_Dne;
    private gDn field_75bd7f28_bzF;
    public final int field_21260d_FWm;
    private static final int[] field_3f1c589_Dne = new int[]{11, 16, 15, 13};
    private gDn field_202f7d1a_FWm;
    private static final String[] field_1e416769_FWm = new String[]{"helmetCloth_overlay", "chestplateCloth_overlay", "leggingsCloth_overlay", "bootsCloth_overlay"};
    private final TNy field_36d350d_Dne;
    public final int field_2e5f1b_bzF;
    public static final String[] field_f5e54dca_Dne = new String[]{"slot_empty_helmet", "slot_empty_chestplate", "slot_empty_leggings", "slot_empty_boots"};
    private static final ClS field_365e6c2_Dne = new LhV();

    public boolean method_7c61cf19_Dne(NMq nMq) {
        return this.field_36d350d_Dne != TNy.field_36d350d_Dne ? false : (!nMq.method_a98a0664_aFZ() ? false : (!nMq.method_230886fb_Dne().method_8f501fe8_Dne("display") ? false : nMq.method_230886fb_Dne().method_2851c945_Dne("display").method_8f501fe8_Dne("color")));
    }

    @Override
    public int method_7a46288d_Dne() {
        return this.field_36d350d_Dne.method_7a46288d_Dne();
    }

    public qoi_0(int n, TNy tNy, int n2, int n3) {
        super(n);
        this.field_36d350d_Dne = tNy;
        this.field_2092ae_Dne = n3;
        this.field_2e5f1b_bzF = n2;
        this.field_21260d_FWm = tNy.method_117d19dd_FWm(n3);
        this.method_77cbb00a_FWm(tNy.method_ce7f5d9c_Dne(n3));
        this.field_2d29f4_aFZ = 1;
        this.method_829e7ad2_Dne(JcN.field_5b95c4b_IjH);
        CVd.field_37ddf2f_Dne.method_eabd8452_Dne(this, field_365e6c2_Dne);
    }

    @Override
    public void method_845caac7_Dne(Rbp rbp) {
        super.method_845caac7_Dne(rbp);
        if (this.field_36d350d_Dne == TNy.field_36d350d_Dne) {
            this.field_202f7d1a_FWm = rbp.method_285881e4_Dne(field_1e416769_FWm[this.field_2092ae_Dne]);
        }
        this.field_75bd7f28_bzF = rbp.method_285881e4_Dne(field_f5e54dca_Dne[this.field_2092ae_Dne]);
    }

    @Override
    public boolean method_a981fd7e_Dne(NMq nMq, NMq nMq2) {
        return this.field_36d350d_Dne.method_7c6f602c_FWm() == nMq2.field_2e5f1b_bzF ? true : super.method_a981fd7e_Dne(nMq, nMq2);
    }

    static int[] method_ce7eeb8a_Dne() {
        return field_3f1c589_Dne;
    }

    public TNy method_2306c36c_Dne() {
        return this.field_36d350d_Dne;
    }

    @Override
    public int method_fd88681_Dne(NMq nMq, int n) {
        if (n > 0) {
            return 0xFFFFFF;
        }
        int n2 = this.method_7c61cf08_Dne(nMq);
        if (n2 < 0) {
            n2 = 0xFFFFFF;
        }
        return n2;
    }

    @Override
    public NMq method_d4201764_Dne(NMq nMq, Qnq qnq, FiG fiG) {
        int n = FUH.method_7c61cf08_Dne(nMq) - 1;
        NMq nMq2 = fiG.method_77c1cdc9_FWm(n);
        if (nMq2 == null) {
            fiG.method_19b4c3a3_a_(n, nMq.method_23040479_Dne());
            nMq.field_2092ae_Dne = 0;
        }
        return nMq;
    }

    @Override
    public boolean method_7a46289e_Dne() {
        return this.field_36d350d_Dne == TNy.field_36d350d_Dne;
    }

    public void method_fd8868e_Dne(NMq nMq, int n) {
        if (this.field_36d350d_Dne != TNy.field_36d350d_Dne) {
            throw new UnsupportedOperationException("Can't dye non-leather!");
        }
        WkD wkD = nMq.method_230886fb_Dne();
        if (wkD == null) {
            wkD = new WkD();
            nMq.method_66a36cd8_FWm(wkD);
        }
        WkD wkD2 = wkD.method_2851c945_Dne("display");
        if (!wkD.method_8f501fe8_Dne("display")) {
            wkD.method_312ec00d_Dne("display", wkD2);
        }
        wkD2.method_5ab44f9f_Dne("color", n);
    }

    public int method_7c61cf08_Dne(NMq nMq) {
        if (this.field_36d350d_Dne != TNy.field_36d350d_Dne) {
            return -1;
        }
        WkD wkD = nMq.method_230886fb_Dne();
        if (wkD == null) {
            return 10511680;
        }
        WkD wkD2 = wkD.method_2851c945_Dne("display");
        return wkD2 == null ? 10511680 : (wkD2.method_8f501fe8_Dne("color") ? wkD2.method_8f501fd7_Dne("color") : 10511680);
    }

    @Override
    public gDn method_9051f17a_Dne(int n, int n2) {
        return n2 == 1 ? this.field_202f7d1a_FWm : super.method_9051f17a_Dne(n, n2);
    }

    public void method_7c61cf15_Dne(NMq nMq) {
        WkD wkD;
        WkD wkD2;
        if (this.field_36d350d_Dne == TNy.field_36d350d_Dne && (wkD2 = nMq.method_230886fb_Dne()) != null && (wkD = wkD2.method_2851c945_Dne("display")).method_8f501fe8_Dne("color")) {
            wkD.method_8f501fe4_Dne("color");
        }
    }

    public static gDn method_3064814c_a_(int n) {
        switch (n) {
            case 0: {
                return dEr.field_a21c8349_kGO.field_75bd7f28_bzF;
            }
            case 1: {
                return dEr.field_aefcfa5c_udO.field_75bd7f28_bzF;
            }
            case 2: {
                return dEr.field_ab251697_ooe.field_75bd7f28_bzF;
            }
            case 3: {
                return dEr.field_32866d87_trS.field_75bd7f28_bzF;
            }
        }
        return null;
    }
}

