package net.minecraft.src;
/*
 * Decompiled with CFR 0.152.
 */
public class WbP
implements Comparable {
    private final int field_21260d_FWm;
    private final int field_2092ae_Dne;
    private float field_2092ab_Dne = 1.0f;
    private final dmo field_374ee26_Dne;
    private boolean field_2092bf_Dne;

    public void method_7a46289a_Dne() {
        this.field_2092bf_Dne = !this.field_2092bf_Dne;
    }

    public String toString() {
        return "TextureHolder{width=" + this.field_2092ae_Dne + ", height=" + this.field_21260d_FWm + '}';
    }

    public int compareTo(Object object) {
        return this.method_8cd659f5_Dne((WbP)object);
    }

    public WbP(dmo dmo2) {
        this.field_374ee26_Dne = dmo2;
        this.field_2092ae_Dne = dmo2.method_ae128dba_bzF();
        this.field_21260d_FWm = dmo2.method_907a9d14_Qnq();
        this.field_2092bf_Dne = this.method_ce7f5d9c_Dne(this.field_21260d_FWm) > this.method_ce7f5d9c_Dne(this.field_2092ae_Dne);
    }

    public int method_8cd659f5_Dne(WbP wbP) {
        int n;
        if (this.method_7c6f602c_FWm() == wbP.method_7c6f602c_FWm()) {
            if (this.method_7a46288d_Dne() == wbP.method_7a46288d_Dne()) {
                if (this.field_374ee26_Dne.method_eecad346_Dne() == null) {
                    return wbP.field_374ee26_Dne.method_eecad346_Dne() == null ? 0 : -1;
                }
                return this.field_374ee26_Dne.method_eecad346_Dne().compareTo(wbP.field_374ee26_Dne.method_eecad346_Dne());
            }
            n = this.method_7a46288d_Dne() < wbP.method_7a46288d_Dne() ? 1 : -1;
        } else {
            n = this.method_7c6f602c_FWm() < wbP.method_7c6f602c_FWm() ? 1 : -1;
        }
        return n;
    }

    public void method_ce7f5da9_Dne(int n) {
        if (this.field_2092ae_Dne > n && this.field_21260d_FWm > n) {
            this.field_2092ab_Dne = (float)n / (float)Math.min(this.field_2092ae_Dne, this.field_21260d_FWm);
        }
    }

    public dmo method_230e7c85_Dne() {
        return this.field_374ee26_Dne;
    }

    public int method_7a46288d_Dne() {
        return this.field_2092bf_Dne ? this.method_ce7f5d9c_Dne((int)((float)this.field_21260d_FWm * this.field_2092ab_Dne)) : this.method_ce7f5d9c_Dne((int)((float)this.field_2092ae_Dne * this.field_2092ab_Dne));
    }

    public int method_7c6f602c_FWm() {
        return this.field_2092bf_Dne ? this.method_ce7f5d9c_Dne((int)((float)this.field_2092ae_Dne * this.field_2092ab_Dne)) : this.method_ce7f5d9c_Dne((int)((float)this.field_21260d_FWm * this.field_2092ab_Dne));
    }

    public boolean method_7a46289e_Dne() {
        return this.field_2092bf_Dne;
    }

    private int method_ce7f5d9c_Dne(int n) {
        return (n >> 0) + ((n & 0) == 0 ? 0 : 1) << 0;
    }
}

