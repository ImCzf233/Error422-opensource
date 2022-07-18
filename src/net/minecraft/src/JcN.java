package net.minecraft.src;
/*
 * Decompiled with CFR 0.152.
 */
import java.util.List;

public class JcN {
    private final int field_2092ae_Dne;
    public static final JcN field_5b95c4b_IjH;
    public static final JcN field_5e5261be_Qnq;
    public static final JcN field_74f385d5_mrb;
    public static final JcN field_2022bed6_FWm;
    public static final JcN field_368f2f7_Dne;
    public static final JcN field_f09ab1ef_zGp;
    public static final JcN[] field_835f4052_Dne;
    public static final JcN field_1411c921_div;
    private String field_d9a85c6_FWm = "list_items.png";
    private final String field_569fcf45_Dne;
    public static final JcN field_6162a71f_Zpi;
    public static final JcN field_1c2a8136_XHL;
    public static final JcN field_712c773d_aFZ;
    public static final JcN field_161c1c20_DyG;
    private boolean field_2092bf_Dne = true;
    private boolean field_21261e_FWm = true;
    public static final JcN field_75b0c0e4_bzF;

    public boolean method_7c6f603d_FWm() {
        return this.field_2092bf_Dne;
    }

    public JcN method_284bc3a0_Dne(String string) {
        this.field_d9a85c6_FWm = string;
        return this;
    }

    public int method_7c6f602c_FWm() {
        return 1;
    }

    public dEr method_230de6ba_Dne() {
        return dEr.field_836aa5b6_Dne[this.method_7c6f602c_FWm()];
    }

    public boolean method_7a46289e_Dne() {
        return this.field_21261e_FWm;
    }

    public String method_6859cdb9_bzF() {
        return this.field_d9a85c6_FWm;
    }

    public JcN method_23028156_Dne() {
        this.field_21261e_FWm = false;
        return this;
    }

    public JcN method_f878d175_FWm() {
        this.field_2092bf_Dne = false;
        return this;
    }

    public JcN(int n, String string) {
        this.field_2092ae_Dne = n;
        this.field_569fcf45_Dne = string;
        JcN.field_835f4052_Dne[n] = this;
    }

    public int method_ae128dba_bzF() {
        return this.field_2092ae_Dne % 6;
    }

    public boolean method_ae128dcb_bzF() {
        return this.field_2092ae_Dne < 6;
    }

    public void method_ea14418b_Dne(List list) {
        for (dEr dEr2 : dEr.field_836aa5b6_Dne) {
            if (dEr2 == null || dEr2.method_23028156_Dne() != this) continue;
            dEr2.method_d88f4bf4_Dne(dEr2.field_267cf5_Qnq, this, list);
        }
    }

    public String method_eecad346_Dne() {
        return this.field_569fcf45_Dne;
    }

    public String method_d1f1ed87_FWm() {
        return irb.method_2310d392_Dne().method_39193c_Dne("itemGroup." + this.method_eecad346_Dne());
    }

    public void method_e4ea598f_Dne(List list, ACj ... aCjArray) {
        for (ycv ycv2 : ycv.field_8374a29b_Dne) {
            if (ycv2 == null || ycv2.field_36466e4_Dne == null) continue;
            boolean bl = false;
            for (int i = 0; i < aCjArray.length && !bl; ++i) {
                if (ycv2.field_36466e4_Dne != aCjArray[i]) continue;
                bl = true;
            }
            if (!bl) continue;
            list.add(dEr.field_374f605_Dne.method_18643d7a_Dne(new RmG(ycv2, ycv2.method_7a46288d_Dne())));
        }
    }

    static {
        field_835f4052_Dne = new JcN[12];
        field_368f2f7_Dne = new nbD(0, "buildingBlocks");
        field_2022bed6_FWm = new MqY(1, "decorations");
        field_75b0c0e4_bzF = new twp_0(2, "redstone");
        field_5e5261be_Qnq = new HgA(3, "transportation");
        field_712c773d_aFZ = new aqs(4, "misc");
        field_f09ab1ef_zGp = new BfU(5, "search").method_284bc3a0_Dne("search.png");
        field_161c1c20_DyG = new ILr(6, "food");
        field_1411c921_div = new fyz_0(7, "tools");
        field_5b95c4b_IjH = new AWi(8, "combat");
        field_74f385d5_mrb = new Bnv(9, "brewing");
        field_1c2a8136_XHL = new SUE(10, "materials");
        field_6162a71f_Zpi = new jnv(11, "inventory").method_284bc3a0_Dne("survival_inv.png").method_f878d175_FWm().method_23028156_Dne();
    }

    public int method_7a46288d_Dne() {
        return this.field_2092ae_Dne;
    }
}

