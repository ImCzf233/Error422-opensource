package net.minecraft.src;
/*
 * Decompiled with CFR 0.152.
 */
import java.util.AbstractCollection;
import java.util.AbstractSet;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashSet;
import java.util.List;
import org.lwjgl.opengl.GL11;

public class snt {
    public List field_f27c122c_Dne;
    public int field_2f0dd8_div;
    public int field_2e5f1b_bzF;
    public boolean field_267d06_Qnq;
    public static int field_2092ae_Dne;
    public int field_21260d_FWm;
    public boolean field_21261e_FWm;
    public bSp field_373a3ed_Dne;
    private List field_6a0474ed_FWm;
    public int field_33448c_mrb;
    public int field_267cf5_Qnq;
    private static WAR field_36e5ca4_Dne;
    public int field_2a9ad6_Zpi;
    public boolean field_2d2a05_aFZ;
    public Qnq field_36c4f18_Dne;
    private int field_348572_qLR;
    public int field_31b816_kGO;
    private boolean field_388db7_zGp = false;
    public int field_36b0a9_udO;
    public int field_22c602_IjH;
    public boolean field_2092bf_Dne = false;
    public int field_29186d_XHL;
    public int field_20b857_DyG;
    public boolean[] field_3f1c59a_Dne = new boolean[2];
    public boolean field_2e5f2c_bzF = true;
    private int field_367154_trS = -1;
    public int field_388da6_zGp;
    public int field_342264_ooe;
    public int field_2d29f4_aFZ;

    public snt(Qnq qnq, List list, int n, int n2, int n3, int n4) {
        this.field_f27c122c_Dne = new ArrayList();
        this.field_36c4f18_Dne = qnq;
        this.field_6a0474ed_FWm = list;
        this.field_367154_trS = n4;
        this.field_21260d_FWm = -999;
        this.method_2c2cf7c9_Dne(n, n2, n3);
        this.field_21261e_FWm = false;
    }

    private void method_d44b4592_zGp() {
        GL11.glTranslatef(this.field_2f0dd8_div, this.field_22c602_IjH, this.field_33448c_mrb);
    }

    public void method_2c2cf7c9_Dne(int n, int n2, int n3) {
        if (n != this.field_21260d_FWm || n2 != this.field_2e5f1b_bzF || n3 != this.field_267cf5_Qnq) {
            this.method_7c6f6039_FWm();
            this.field_21260d_FWm = n;
            this.field_2e5f1b_bzF = n2;
            this.field_267cf5_Qnq = n3;
            this.field_29186d_XHL = n + 8;
            this.field_2a9ad6_Zpi = n2 + 8;
            this.field_31b816_kGO = n3 + 8;
            this.field_2f0dd8_div = n & 0x3FF;
            this.field_22c602_IjH = n2;
            this.field_33448c_mrb = n3 & 0x3FF;
            this.field_2d29f4_aFZ = n - this.field_2f0dd8_div;
            this.field_388da6_zGp = n2 - this.field_22c602_IjH;
            this.field_20b857_DyG = n3 - this.field_33448c_mrb;
            float f = 6.0f;
            this.field_373a3ed_Dne = bSp.method_b4ea3e0c_Dne((float)n - f, (float)n2 - f, (float)n3 - f, (float)(n + 16) + f, (float)(n2 + 16) + f, (float)(n3 + 16) + f);
            GL11.glNewList(this.field_367154_trS + 2, 4864);
            eKj.method_9ed6d428_Dne(bSp.method_23186cf1_Dne().method_b4ea3e0c_Dne((float)this.field_2f0dd8_div - f, (float)this.field_22c602_IjH - f, (float)this.field_33448c_mrb - f, (float)(this.field_2f0dd8_div + 16) + f, (float)(this.field_22c602_IjH + 16) + f, (float)(this.field_33448c_mrb + 16) + f));
            GL11.glEndList();
            this.method_a98a0660_aFZ();
        }
    }

    public void method_ae128dc7_bzF() {
        this.method_7c6f6039_FWm();
        this.field_36c4f18_Dne = null;
    }

    public void method_7c6f6039_FWm() {
        for (int i = 0; i < 2; ++i) {
            this.field_3f1c59a_Dne[i] = true;
        }
        this.field_2092bf_Dne = false;
        this.field_388db7_zGp = false;
    }

    public void method_7a46289a_Dne() {
        if (this.field_21261e_FWm) {
            Object object;
            this.field_21261e_FWm = false;
            int n = this.field_21260d_FWm;
            int n2 = this.field_2e5f1b_bzF;
            int n3 = this.field_267cf5_Qnq;
            int n4 = this.field_21260d_FWm + 16;
            int n5 = this.field_2e5f1b_bzF + 16;
            int n6 = this.field_267cf5_Qnq + 16;
            for (int i = 0; i < 2; ++i) {
                this.field_3f1c59a_Dne[i] = true;
            }
            qMV.field_2092bf_Dne = false;
            HashSet hashSet = new HashSet();
            hashSet.addAll(this.field_f27c122c_Dne);
            this.field_f27c122c_Dne.clear();
            int n7 = 1;
            ATE aTE = new ATE(this.field_36c4f18_Dne, n - n7, n2 - n7, n3 - n7, n4 + n7, n5 + n7, n6 + n7, n7);
            if (!aTE.method_907a9d25_Qnq()) {
                ++field_2092ae_Dne;
                object = new zVu(aTE);
                this.field_348572_qLR = 0;
                for (int i = 0; i < 2; ++i) {
                    boolean bl = false;
                    boolean bl2 = false;
                    boolean bl3 = false;
                    for (int j = n2; j < n5; ++j) {
                        for (int k = n3; k < n6; ++k) {
                            for (int i2 = n; i2 < n4; ++i2) {
                                int n8;
                                ipD ipD2;
                                zKP zKP2;
                                int n9 = aTE.method_2c2cf7bc_Dne(i2, j, k);
                                if (n9 <= 0) continue;
                                if (!bl3) {
                                    bl3 = true;
                                    GL11.glNewList(this.field_367154_trS + i, 4864);
                                    GL11.glPushMatrix();
                                    this.method_d44b4592_zGp();
                                    float f = 1.000001f;
                                    GL11.glTranslatef(-8.0f, -8.0f, -8.0f);
                                    GL11.glScalef(f, f, f);
                                    GL11.glTranslatef(8.0f, 8.0f, 8.0f);
                                    field_36e5ca4_Dne.method_7a46289a_Dne();
                                    field_36e5ca4_Dne.method_a663d9a5_FWm(-this.field_21260d_FWm, -this.field_2e5f1b_bzF, -this.field_267cf5_Qnq);
                                }
                                if ((zKP2 = zKP.field_8374b848_Dne[n9]) == null) continue;
                                if (i == 0 && zKP2.method_c073dafc_mrb() && xwr_0.field_36f2779_Dne.method_ac4d69ce_Dne(ipD2 = aTE.method_d98e681d_Dne(i2, j, k))) {
                                    this.field_f27c122c_Dne.add(ipD2);
                                }
                                if ((n8 = zKP2.method_582b28a_a_()) != i) {
                                    bl = true;
                                    continue;
                                }
                                if (n8 != i) continue;
                                bl2 |= ((zVu)object).method_5632927f_Dne(zKP2, i2, j, k);
                            }
                        }
                    }
                    if (bl3) {
                        this.field_348572_qLR += field_36e5ca4_Dne.method_7a46288d_Dne();
                        GL11.glPopMatrix();
                        GL11.glEndList();
                        field_36e5ca4_Dne.method_a663d9a5_FWm(0.0, 0.0, 0.0);
                    } else {
                        bl2 = false;
                    }
                    if (bl2) {
                        this.field_3f1c59a_Dne[i] = false;
                    }
                    if (!bl) break;
                }
            }
            object = new HashSet();
            ((AbstractCollection)object).addAll(this.field_f27c122c_Dne);
            ((AbstractSet)object).removeAll(hashSet);
            this.field_6a0474ed_FWm.addAll((Collection) object);
            hashSet.removeAll(this.field_f27c122c_Dne);
            this.field_6a0474ed_FWm.removeAll(hashSet);
            this.field_2d2a05_aFZ = qMV.field_2092bf_Dne;
            this.field_388db7_zGp = true;
        }
    }

    public void method_a98a0660_aFZ() {
        this.field_21261e_FWm = true;
    }

    public float method_bb7dd810_Dne(sMa sMa2) {
        float f = (float)(sMa2.field_2f0dd3_div - (double)this.field_29186d_XHL);
        float f2 = (float)(sMa2.field_22c5fd_IjH - (double)this.field_2a9ad6_Zpi);
        float f3 = (float)(sMa2.field_334487_mrb - (double)this.field_31b816_kGO);
        return f * f + f2 * f2 + f3 * f3;
    }

    public void method_907a9d21_Qnq() {
        GL11.glCallList(this.field_367154_trS + 2);
    }

    static {
        field_36e5ca4_Dne = WAR.field_36e5ca4_Dne;
        field_2092ae_Dne = 0;
    }

    public int method_ce7f5d9c_Dne(int n) {
        return !this.field_2092bf_Dne ? -1 : (!this.field_3f1c59a_Dne[n] ? this.field_367154_trS + n : -1);
    }

    public boolean method_7a46289e_Dne() {
        return !this.field_388db7_zGp ? false : this.field_3f1c59a_Dne[0] && this.field_3f1c59a_Dne[1];
    }

    public void method_74070916_Dne(IPx iPx) {
        this.field_2092bf_Dne = iPx.method_9ed6d42c_Dne(this.field_373a3ed_Dne);
    }
}

