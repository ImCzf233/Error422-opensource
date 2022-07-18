package net.minecraft.src;
/*
 * Decompiled with CFR 0.152.
 */
import java.util.ArrayList;
import java.util.List;
import org.lwjgl.opengl.GL11;

public class rxL {
    public final String field_569fcf45_Dne;
    private int field_2092ae_Dne;
    public boolean field_21261e_FWm = true;
    public boolean field_2e5f2c_bzF = false;
    public List field_6a0474ed_FWm;
    public float field_21260a_FWm = 32.0f;
    public float field_2f0dd5_div;
    public float field_2d29f1_aFZ;
    public float field_267cf2_Qnq;
    public float field_22c5ff_IjH;
    public float field_29186a_XHL;
    public float field_334489_mrb;
    public boolean field_2092bf_Dne = false;
    public float field_2092ab_Dne = 64.0f;
    private boolean field_267d06_Qnq = false;
    public float field_388da3_zGp;
    private int field_2e5f1b_bzF = 0;
    public float field_2e5f18_bzF;
    private int field_21260d_FWm;
    public float field_20b854_DyG;
    public List field_f27c122c_Dne = new ArrayList();
    private Gor field_367c742_Dne;

    public rxL(Gor gor, int n, int n2) {
        this(gor);
        this.method_9057b0a5_Dne(n, n2);
    }

    public void method_2c0148e6_Dne(float f, float f2, float f3) {
        this.field_2e5f18_bzF = f;
        this.field_267cf2_Qnq = f2;
        this.field_2d29f1_aFZ = f3;
    }

    public void method_bc1d6661_Dne(rxL rxL2) {
        if (this.field_6a0474ed_FWm == null) {
            this.field_6a0474ed_FWm = new ArrayList();
        }
        this.field_6a0474ed_FWm.add(rxL2);
    }

    public rxL method_9c49b372_Dne(String string, float f, float f2, float f3, int n, int n2, int n3) {
        string = this.field_569fcf45_Dne + "." + string;
        EZg eZg = this.field_367c742_Dne.method_28495f03_Dne(string);
        this.method_9057b0a5_Dne(eZg.field_2092ae_Dne, eZg.field_21260d_FWm);
        this.field_f27c122c_Dne.add(new UgT(this, this.field_2092ae_Dne, this.field_21260d_FWm, f, f2, f3, n, n2, n3, 0.0f).method_2850d373_Dne(string));
        return this;
    }

    public rxL(Gor gor) {
        this(gor, null);
    }

    public void method_143f92d9_bzF(float f) {
        if (!this.field_2e5f2c_bzF && this.field_21261e_FWm) {
            if (!this.field_267d06_Qnq) {
                this.method_7ed96ebf_Qnq(f);
            }
            if (this.field_388da3_zGp == 0.0f && this.field_20b854_DyG == 0.0f && this.field_2f0dd5_div == 0.0f) {
                if (this.field_2e5f18_bzF != 0.0f || this.field_267cf2_Qnq != 0.0f || this.field_2d29f1_aFZ != 0.0f) {
                    GL11.glTranslatef(this.field_2e5f18_bzF * f, this.field_267cf2_Qnq * f, this.field_2d29f1_aFZ * f);
                }
            } else {
                GL11.glTranslatef(this.field_2e5f18_bzF * f, this.field_267cf2_Qnq * f, this.field_2d29f1_aFZ * f);
                if (this.field_2f0dd5_div != 0.0f) {
                    GL11.glRotatef(this.field_2f0dd5_div * 57.295776f, 0.0f, 0.0f, 1.0f);
                }
                if (this.field_20b854_DyG != 0.0f) {
                    GL11.glRotatef(this.field_20b854_DyG * 57.295776f, 0.0f, 1.0f, 0.0f);
                }
                if (this.field_388da3_zGp != 0.0f) {
                    GL11.glRotatef(this.field_388da3_zGp * 57.295776f, 1.0f, 0.0f, 0.0f);
                }
            }
        }
    }

    public rxL method_e17a7504_FWm(int n, int n2) {
        this.field_2092ab_Dne = n;
        this.field_21260a_FWm = n2;
        return this;
    }

    public rxL method_cbecd0a8_Dne(float f, float f2, float f3, int n, int n2, int n3) {
        this.field_f27c122c_Dne.add(new UgT(this, this.field_2092ae_Dne, this.field_21260d_FWm, f, f2, f3, n, n2, n3, 0.0f));
        return this;
    }

    public rxL(Gor gor, String string) {
        this.field_367c742_Dne = gor;
        gor.field_f27c122c_Dne.add(this);
        this.field_569fcf45_Dne = string;
        this.method_e17a7504_FWm(gor.field_2e5f1b_bzF, gor.field_267cf5_Qnq);
    }

    public rxL method_9057b0a5_Dne(int n, int n2) {
        this.field_2092ae_Dne = n;
        this.field_21260d_FWm = n2;
        return this;
    }

    private void method_7ed96ebf_Qnq(float f) {
        this.field_2e5f1b_bzF = pZS.method_ce7f5d9c_Dne(1);
        GL11.glNewList(this.field_2e5f1b_bzF, 4864);
        WAR wAR = WAR.field_36e5ca4_Dne;
        for (int i = 0; i < this.field_f27c122c_Dne.size(); ++i) {
            ((UgT)this.field_f27c122c_Dne.get(i)).method_d5c19081_Dne(wAR, f);
        }
        GL11.glEndList();
        this.field_267d06_Qnq = true;
    }

    public void method_ce7f5266_Dne(float f) {
        if (!this.field_2e5f2c_bzF && this.field_21261e_FWm) {
            if (!this.field_267d06_Qnq) {
                this.method_7ed96ebf_Qnq(f);
            }
            GL11.glTranslatef(this.field_22c5ff_IjH, this.field_334489_mrb, this.field_29186a_XHL);
            if (this.field_388da3_zGp == 0.0f && this.field_20b854_DyG == 0.0f && this.field_2f0dd5_div == 0.0f) {
                if (this.field_2e5f18_bzF == 0.0f && this.field_267cf2_Qnq == 0.0f && this.field_2d29f1_aFZ == 0.0f) {
                    GL11.glCallList(this.field_2e5f1b_bzF);
                    if (this.field_6a0474ed_FWm != null) {
                        for (int i = 0; i < this.field_6a0474ed_FWm.size(); ++i) {
                            ((rxL)this.field_6a0474ed_FWm.get(i)).method_ce7f5266_Dne(f);
                        }
                    }
                } else {
                    GL11.glTranslatef(this.field_2e5f18_bzF * f, this.field_267cf2_Qnq * f, this.field_2d29f1_aFZ * f);
                    GL11.glCallList(this.field_2e5f1b_bzF);
                    if (this.field_6a0474ed_FWm != null) {
                        for (int i = 0; i < this.field_6a0474ed_FWm.size(); ++i) {
                            ((rxL)this.field_6a0474ed_FWm.get(i)).method_ce7f5266_Dne(f);
                        }
                    }
                    GL11.glTranslatef(-this.field_2e5f18_bzF * f, -this.field_267cf2_Qnq * f, -this.field_2d29f1_aFZ * f);
                }
            } else {
                GL11.glPushMatrix();
                GL11.glTranslatef(this.field_2e5f18_bzF * f, this.field_267cf2_Qnq * f, this.field_2d29f1_aFZ * f);
                if (this.field_2f0dd5_div != 0.0f) {
                    GL11.glRotatef(this.field_2f0dd5_div * 57.295776f, 0.0f, 0.0f, 1.0f);
                }
                if (this.field_20b854_DyG != 0.0f) {
                    GL11.glRotatef(this.field_20b854_DyG * 57.295776f, 0.0f, 1.0f, 0.0f);
                }
                if (this.field_388da3_zGp != 0.0f) {
                    GL11.glRotatef(this.field_388da3_zGp * 57.295776f, 1.0f, 0.0f, 0.0f);
                }
                GL11.glCallList(this.field_2e5f1b_bzF);
                if (this.field_6a0474ed_FWm != null) {
                    for (int i = 0; i < this.field_6a0474ed_FWm.size(); ++i) {
                        ((rxL)this.field_6a0474ed_FWm.get(i)).method_ce7f5266_Dne(f);
                    }
                }
                GL11.glPopMatrix();
            }
            GL11.glTranslatef(-this.field_22c5ff_IjH, -this.field_334489_mrb, -this.field_29186a_XHL);
        }
    }

    public void method_7ccc8363_Dne(float f, float f2, float f3, int n, int n2, int n3, float f4) {
        this.field_f27c122c_Dne.add(new UgT(this, this.field_2092ae_Dne, this.field_21260d_FWm, f, f2, f3, n, n2, n3, f4));
    }

    public void method_117d0ea7_FWm(float f) {
        if (!this.field_2e5f2c_bzF && this.field_21261e_FWm) {
            if (!this.field_267d06_Qnq) {
                this.method_7ed96ebf_Qnq(f);
            }
            GL11.glPushMatrix();
            GL11.glTranslatef(this.field_2e5f18_bzF * f, this.field_267cf2_Qnq * f, this.field_2d29f1_aFZ * f);
            if (this.field_20b854_DyG != 0.0f) {
                GL11.glRotatef(this.field_20b854_DyG * 57.295776f, 0.0f, 1.0f, 0.0f);
            }
            if (this.field_388da3_zGp != 0.0f) {
                GL11.glRotatef(this.field_388da3_zGp * 57.295776f, 1.0f, 0.0f, 0.0f);
            }
            if (this.field_2f0dd5_div != 0.0f) {
                GL11.glRotatef(this.field_2f0dd5_div * 57.295776f, 0.0f, 0.0f, 1.0f);
            }
            GL11.glCallList(this.field_2e5f1b_bzF);
            GL11.glPopMatrix();
        }
    }
}

