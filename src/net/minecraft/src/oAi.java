package net.minecraft.src;
/*
 * Decompiled with CFR 0.152.
 */
public class oAi
extends ycv {
    private static final String[] field_f5e54dca_Dne = new String[]{"all", "fire", "fall", "explosion", "projectile"};
    private static final int[] field_4039e0a_FWm;
    private static final int[] field_59d86bc_bzF;
    private static final int[] field_3f1c589_Dne;
    public final int field_2092ae_Dne;

    @Override
    public int method_7a46288d_Dne() {
        return 4;
    }

    public static double method_b43d8c0c_Dne(sMa sMa2, double d) {
        int n = UYp.method_54a80d6_Dne(ycv.field_5e67c407_Qnq.field_21260d_FWm, sMa2.method_56f900f6_Dne());
        if (n > 0) {
            d -= (double)geR.method_117d0718_FWm(d * (double)((float)n * 0.15f));
        }
        return d;
    }

    @Override
    public int method_117d19dd_FWm(int n) {
        return this.method_ce7f5d9c_Dne(n) + field_59d86bc_bzF[this.field_2092ae_Dne];
    }

    public static int method_b43d9ed6_Dne(sMa sMa2, int n) {
        int n2 = UYp.method_54a80d6_Dne(ycv.field_2038211f_FWm.field_21260d_FWm, sMa2.method_56f900f6_Dne());
        if (n2 > 0) {
            n -= geR.method_ce7f5259_Dne((float)n * (float)n2 * 0.15f);
        }
        return n;
    }

    static {
        field_3f1c589_Dne = new int[]{1, 10, 5, 5, 3};
        field_4039e0a_FWm = new int[]{11, 8, 6, 8, 6};
        field_59d86bc_bzF = new int[]{20, 12, 10, 12, 15};
    }

    @Override
    public String method_eecad346_Dne() {
        return "enchantment.protect." + field_f5e54dca_Dne[this.field_2092ae_Dne];
    }

    public oAi(int n, int n2, int n3) {
        super(n, n2, ACj.field_201e32c3_FWm);
        this.field_2092ae_Dne = n3;
        if (n3 == 2) {
            this.field_36466e4_Dne = ACj.field_75ac34d1_bzF;
        }
    }

    @Override
    public boolean method_c6fa7cbf_Dne(ycv ycv2) {
        if (ycv2 instanceof oAi) {
            oAi oAi2 = (oAi)ycv2;
            return oAi2.field_2092ae_Dne == this.field_2092ae_Dne ? false : this.field_2092ae_Dne == 2 || oAi2.field_2092ae_Dne == 2;
        }
        return super.method_c6fa7cbf_Dne(ycv2);
    }

    @Override
    public int method_ce7f5d9c_Dne(int n) {
        return field_3f1c589_Dne[this.field_2092ae_Dne] + (n - 1) * field_4039e0a_FWm[this.field_2092ae_Dne];
    }

    @Override
    public int method_b8b34705_Dne(int n, zBn zBn2) {
        if (zBn2.method_907a9d25_Qnq()) {
            return 0;
        }
        float f = (float)(6 + n * n) / 3.0f;
        return this.field_2092ae_Dne == 0 ? geR.method_ce7f5259_Dne(f * 0.75f) : (this.field_2092ae_Dne == 1 && zBn2.method_a98a0664_aFZ() ? geR.method_ce7f5259_Dne(f * 1.25f) : (this.field_2092ae_Dne == 2 && zBn2 == zBn.field_142722f0_div ? geR.method_ce7f5259_Dne(f * 2.5f) : (this.field_2092ae_Dne == 3 && zBn2.method_7c6f603d_FWm() ? geR.method_ce7f5259_Dne(f * 1.5f) : (this.field_2092ae_Dne == 4 && zBn2.method_7a46289e_Dne() ? geR.method_ce7f5259_Dne(f * 1.5f) : 0))));
    }
}

