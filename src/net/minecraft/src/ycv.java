package net.minecraft.src;
/*
 * Decompiled with CFR 0.152.
 */
import java.util.ArrayList;

public abstract class ycv {
    public static final ycv field_758a702d_EyB;
    public static final ycv field_d5799c8_FfS;
    public static final ycv field_16317e69_DyG;
    public static final ycv field_1c3fe37f_XHL;
    public static final ycv field_37e5540_Dne;
    public static final ycv field_5e67c407_Qnq;
    public final int field_21260d_FWm;
    public static final ycv[] field_8374a29b_Dne;
    public static final ycv field_329870e6_trS;
    public static final ycv field_850f9b18_ceE;
    public static final ycv field_f0b01438_zGp;
    public static final ycv[] field_fdf4529c_FWm;
    public static final ycv field_61780968_Zpi;
    public static final ycv field_5cebe94_IjH;
    public static final ycv field_14272b6a_div;
    public static final ycv field_71ad6b0f_Vxn;
    public ACj field_36466e4_Dne;
    public static final ycv field_2038211f_FWm;
    public static final ycv field_7141d986_aFZ;
    public static final ycv field_35ddb629_ATE;
    public static final ycv field_1f134604_qLR;
    public static final ycv field_75c6232d_bzF;
    public static final ycv field_af0efdbb_udO;
    public static final ycv field_ab3719f6_ooe;
    public static final ycv field_a22e86a8_kGO;
    private final int field_2092ae_Dne;
    public static final ycv field_7508e81e_mrb;
    protected String field_569fcf45_Dne;

    public int method_7a46288d_Dne() {
        return 1;
    }

    public String method_eecad346_Dne() {
        return "enchantment." + this.field_569fcf45_Dne;
    }

    protected ycv(int n, int n2, ACj aCj) {
        this.field_21260d_FWm = n;
        this.field_2092ae_Dne = n2;
        this.field_36466e4_Dne = aCj;
        if (field_8374a29b_Dne[n] != null) {
            throw new IllegalArgumentException("Duplicate enchantment id!");
        }
        ycv.field_8374a29b_Dne[n] = this;
    }

    public int method_ae128dba_bzF() {
        return 1;
    }

    public int method_ce7f5d9c_Dne(int n) {
        return 1 + n * 10;
    }

    public int method_117d19dd_FWm(int n) {
        return this.method_ce7f5d9c_Dne(n) + 5;
    }

    public int method_60f1bf32_Dne(int n, FUH fUH) {
        return 0;
    }

    public String method_2c0e7e17_Dne(int n) {
        String string = KGL.method_39193c_Dne(this.method_eecad346_Dne());
        return string + " " + KGL.method_39193c_Dne("enchantment.level." + n);
    }

    public ycv method_286125e9_Dne(String string) {
        this.field_569fcf45_Dne = string;
        return this;
    }

    public boolean method_7c61cf19_Dne(NMq nMq) {
        return this.field_36466e4_Dne.method_a17c251a_Dne(nMq.method_230de6ba_Dne());
    }

    static {
        field_8374a29b_Dne = new ycv[256];
        field_37e5540_Dne = new oAi(0, 10, 0);
        field_2038211f_FWm = new oAi(1, 5, 1);
        field_75c6232d_bzF = new oAi(2, 5, 2);
        field_5e67c407_Qnq = new oAi(3, 2, 3);
        field_7141d986_aFZ = new oAi(4, 5, 4);
        field_f0b01438_zGp = new KBS(5, 2);
        field_16317e69_DyG = new QHu(6, 2);
        field_14272b6a_div = new kqp(7, 1);
        field_5cebe94_IjH = new ZMH(16, 10, 0);
        field_7508e81e_mrb = new ZMH(17, 5, 1);
        field_1c3fe37f_XHL = new ZMH(18, 5, 2);
        field_61780968_Zpi = new xrq(19, 5);
        field_a22e86a8_kGO = new KuM(20, 2);
        field_af0efdbb_udO = new ncG(21, 2, ACj.field_1617900d_DyG);
        field_ab3719f6_ooe = new EBB(32, 10);
        field_329870e6_trS = new iSk(33, 1);
        field_1f134604_qLR = new Nkb(34, 5);
        field_35ddb629_ATE = new ncG(35, 2, ACj.field_140d3d0e_div);
        field_71ad6b0f_Vxn = new kwB(48, 10);
        field_850f9b18_ceE = new WsU(49, 2);
        field_758a702d_EyB = new tkj(50, 2);
        field_d5799c8_FfS = new RfV(51, 1);
        ArrayList<ycv> arrayList = new ArrayList<ycv>();
        for (ycv ycv2 : field_8374a29b_Dne) {
            if (ycv2 == null) continue;
            arrayList.add(ycv2);
        }
        field_fdf4529c_FWm = arrayList.toArray(new ycv[0]);
    }

    public int method_7c6f602c_FWm() {
        return this.field_2092ae_Dne;
    }

    public int method_b8b34705_Dne(int n, zBn zBn2) {
        return 0;
    }

    public boolean method_c6fa7cbf_Dne(ycv ycv2) {
        return this != ycv2;
    }
}

