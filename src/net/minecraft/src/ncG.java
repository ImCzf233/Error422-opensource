package net.minecraft.src;
/*
 * Decompiled with CFR 0.152.
 */
public class ncG
extends ycv {
    @Override
    public int method_ce7f5d9c_Dne(int n) {
        return 15 + (n - 1) * 9;
    }

    protected ncG(int n, int n2, ACj aCj) {
        super(n, n2, aCj);
        this.method_286125e9_Dne("lootBonus");
        if (aCj == ACj.field_140d3d0e_div) {
            this.method_286125e9_Dne("lootBonusDigger");
        }
    }

    @Override
    public boolean method_c6fa7cbf_Dne(ycv ycv2) {
        return super.method_c6fa7cbf_Dne(ycv2) && ycv2.field_21260d_FWm != ncG.field_329870e6_trS.field_21260d_FWm;
    }

    @Override
    public int method_117d19dd_FWm(int n) {
        return super.method_ce7f5d9c_Dne(n) + 50;
    }

    @Override
    public int method_7a46288d_Dne() {
        return 3;
    }
}

