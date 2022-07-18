package net.minecraft.src;
/*
 * Decompiled with CFR 0.152.
 */
public class ZMH
extends ycv {
    private static final int[] field_4039e0a_FWm;
    public final int field_2092ae_Dne;
    private static final int[] field_3f1c589_Dne;
    private static final String[] field_f5e54dca_Dne;
    private static final int[] field_59d86bc_bzF;

    @Override
    public boolean method_c6fa7cbf_Dne(ycv ycv2) {
        return !(ycv2 instanceof ZMH);
    }

    @Override
    public int method_7a46288d_Dne() {
        return 5;
    }

    static {
        field_f5e54dca_Dne = new String[]{"all", "undead", "arthropods"};
        field_3f1c589_Dne = new int[]{1, 5, 5};
        field_4039e0a_FWm = new int[]{11, 8, 8};
        field_59d86bc_bzF = new int[]{20, 20, 20};
    }

    @Override
    public int method_60f1bf32_Dne(int n, FUH fUH) {
        return this.field_2092ae_Dne == 0 ? geR.method_ce7f5259_Dne((float)n * 2.75f) : (this.field_2092ae_Dne == 1 && fUH.method_230cd2e0_Dne() == aYc.field_202d1060_FWm ? geR.method_ce7f5259_Dne((float)n * 4.5f) : (this.field_2092ae_Dne == 2 && fUH.method_230cd2e0_Dne() == aYc.field_75bb126e_bzF ? geR.method_ce7f5259_Dne((float)n * 4.5f) : 0));
    }

    @Override
    public boolean method_7c61cf19_Dne(NMq nMq) {
        return nMq.method_230de6ba_Dne() instanceof gKO ? true : super.method_7c61cf19_Dne(nMq);
    }

    @Override
    public int method_ce7f5d9c_Dne(int n) {
        return field_3f1c589_Dne[this.field_2092ae_Dne] + (n - 1) * field_4039e0a_FWm[this.field_2092ae_Dne];
    }

    @Override
    public String method_eecad346_Dne() {
        return "enchantment.damage." + field_f5e54dca_Dne[this.field_2092ae_Dne];
    }

    @Override
    public int method_117d19dd_FWm(int n) {
        return this.method_ce7f5d9c_Dne(n) + field_59d86bc_bzF[this.field_2092ae_Dne];
    }

    public ZMH(int n, int n2, int n3) {
        super(n, n2, ACj.field_1617900d_DyG);
        this.field_2092ae_Dne = n3;
    }
}

