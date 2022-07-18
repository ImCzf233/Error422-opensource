package net.minecraft.src;
/*
 * Decompiled with CFR 0.152.
 */
import java.util.Random;
import org.lwjgl.opengl.GL11;
import org.lwjgl.util.glu.GLU;

public class IfV
extends Sss {
    private HhP field_3681d3c_Dne;
    public float field_267cf2_Qnq;
    private String field_569fcf45_Dne;
    public float field_20b854_DyG;
    public float field_388da3_zGp;
    public int field_20b857_DyG;
    public float field_2092ab_Dne;
    public float field_2e5f18_bzF;
    private Random field_7331eae7_Dne = new Random();
    NMq field_36a761a_Dne;
    private static wsR field_37da436_Dne = new wsR();
    public float field_2d29f1_aFZ;

    @Override
    protected void method_2c2cf7c9_Dne(int n, int n2, int n3) {
        super.method_2c2cf7c9_Dne(n, n2, n3);
        int n4 = (this.field_21260d_FWm - this.field_2092ae_Dne) / 2;
        int n5 = (this.field_2e5f1b_bzF - this.field_267cf5_Qnq) / 2;
        for (int i = 0; i < 3; ++i) {
            int n6 = n - (n4 + 60);
            int n7 = n2 - (n5 + 14 + 19 * i);
            if (n6 < 0 || n7 < 0 || n6 >= 108 || n7 >= 19 || !this.field_3681d3c_Dne.method_961e82c4_Dne(this.field_493682ed_Dne.field_369f6b6_Dne, i)) continue;
            this.field_493682ed_Dne.field_36c390e_Dne.method_16cca7a_Dne(this.field_3681d3c_Dne.field_2092ae_Dne, i);
        }
    }

    @Override
    protected void method_2c02b146_Dne(float f, int n, int n2) {
        GL11.glColor4f(1.0f, 1.0f, 1.0f, 1.0f);
        this.field_493682ed_Dne.field_36d36bf_Dne.method_8f501fe4_Dne("/gui/enchant.png");
        int n3 = (this.field_21260d_FWm - this.field_2092ae_Dne) / 2;
        int n4 = (this.field_2e5f1b_bzF - this.field_267cf5_Qnq) / 2;
        this.method_17d7ea99_FWm(n3, n4, 0, 0, this.field_2092ae_Dne, this.field_267cf5_Qnq);
        GL11.glPushMatrix();
        GL11.glMatrixMode(5889);
        GL11.glPushMatrix();
        GL11.glLoadIdentity();
        IJm iJm = new IJm(this.field_493682ed_Dne.field_3758af7_Dne, this.field_493682ed_Dne.field_2092ae_Dne, this.field_493682ed_Dne.field_21260d_FWm);
        GL11.glViewport((iJm.method_7a46288d_Dne() - 320) / 2 * iJm.method_ae128dba_bzF(), (iJm.method_7c6f602c_FWm() - 240) / 2 * iJm.method_ae128dba_bzF(), 320 * iJm.method_ae128dba_bzF(), 240 * iJm.method_ae128dba_bzF());
        GL11.glTranslatef(-0.34f, 0.23f, 0.0f);
        GLU.gluPerspective(90.0f, 1.3333334f, 9.0f, 80.0f);
        float f2 = 1.0f;
        GL11.glMatrixMode(5888);
        GL11.glLoadIdentity();
        Cit.method_7c6f6039_FWm();
        GL11.glTranslatef(0.0f, 3.3f, -16.0f);
        GL11.glScalef(f2, f2, f2);
        float f3 = 5.0f;
        GL11.glScalef(f3, f3, f3);
        GL11.glRotatef(180.0f, 0.0f, 0.0f, 1.0f);
        this.field_493682ed_Dne.field_36d36bf_Dne.method_8f501fe4_Dne("/item/book.png");
        GL11.glRotatef(20.0f, 1.0f, 0.0f, 0.0f);
        float f4 = this.field_20b854_DyG + (this.field_388da3_zGp - this.field_20b854_DyG) * f;
        GL11.glTranslatef((1.0f - f4) * 0.2f, (1.0f - f4) * 0.1f, (1.0f - f4) * 0.25f);
        GL11.glRotatef(-(1.0f - f4) * 90.0f - 90.0f, 0.0f, 1.0f, 0.0f);
        GL11.glRotatef(180.0f, 1.0f, 0.0f, 0.0f);
        float f5 = this.field_2e5f18_bzF + (this.field_2092ab_Dne - this.field_2e5f18_bzF) * f + 0.25f;
        float f6 = this.field_2e5f18_bzF + (this.field_2092ab_Dne - this.field_2e5f18_bzF) * f + 0.75f;
        f5 = (f5 - (float)geR.method_ce7f4ad7_Dne(f5)) * 1.6f - 0.3f;
        f6 = (f6 - (float)geR.method_ce7f4ad7_Dne(f6)) * 1.6f - 0.3f;
        if (f5 < 0.0f) {
            f5 = 0.0f;
        }
        if (f6 < 0.0f) {
            f6 = 0.0f;
        }
        if (f5 > 1.0f) {
            f5 = 1.0f;
        }
        if (f6 > 1.0f) {
            f6 = 1.0f;
        }
        GL11.glEnable(32826);
        field_37da436_Dne.method_3a102820_Dne(null, 0.0f, f5, f6, f4, 0.0f, 0.0625f);
        GL11.glDisable(32826);
        Cit.method_7a46289a_Dne();
        GL11.glMatrixMode(5889);
        GL11.glViewport(0, 0, this.field_493682ed_Dne.field_2092ae_Dne, this.field_493682ed_Dne.field_21260d_FWm);
        GL11.glPopMatrix();
        GL11.glMatrixMode(5888);
        GL11.glPopMatrix();
        Cit.method_7a46289a_Dne();
        GL11.glColor4f(1.0f, 1.0f, 1.0f, 1.0f);
        this.field_493682ed_Dne.field_36d36bf_Dne.method_8f501fe4_Dne("/gui/enchant.png");
        BfF.field_3655a4a_Dne.method_ce7f616a_Dne(this.field_3681d3c_Dne.field_2092af_Dne);
        for (int i = 0; i < 3; ++i) {
            String string = BfF.field_3655a4a_Dne.method_eecad346_Dne();
            this.field_21260a_FWm = 0.0f;
            this.field_493682ed_Dne.field_36d36bf_Dne.method_8f501fe4_Dne("/gui/enchant.png");
            int n5 = this.field_3681d3c_Dne.field_3f1c589_Dne[i];
            GL11.glColor4f(1.0f, 1.0f, 1.0f, 1.0f);
            if (n5 == 0) {
                this.method_17d7ea99_FWm(n3 + 60, n4 + 14 + 19 * i, 0, 185, 108, 19);
                continue;
            }
            String string2 = "" + Integer.toBinaryString(n5);
            msA msA2 = this.field_493682ed_Dne.field_2032e250_FWm;
            int n6 = 6839882;
            if (this.field_493682ed_Dne.field_369f6b6_Dne.field_2f0276_eHV < n5 && !this.field_493682ed_Dne.field_369f6b6_Dne.field_37cb681_Dne.field_267d06_Qnq) {
                this.method_17d7ea99_FWm(n3 + 60, n4 + 14 + 19 * i, 0, 185, 108, 19);
                msA2.method_5ebbb6a4_Dne(string, n3 + 62, n4 + 16 + 19 * i, 104, (n6 & 0xFEFEFE) >> 1);
                msA2 = this.field_493682ed_Dne.field_3791671_Dne;
                n6 = 4226832;
                msA2.method_7eed4432_Dne(string2, n3 + 62 + 104 - msA2.method_8f501fd7_Dne(string2), n4 + 16 + 19 * i + 7, n6);
                continue;
            }
            int n7 = n - (n3 + 60);
            int n8 = n2 - (n4 + 14 + 19 * i);
            if (n7 >= 0 && n8 >= 0 && n7 < 108 && n8 < 19) {
                this.method_17d7ea99_FWm(n3 + 60, n4 + 14 + 19 * i, 0, 204, 108, 19);
                n6 = 0xFFFF80;
            } else {
                this.method_17d7ea99_FWm(n3 + 60, n4 + 14 + 19 * i, 0, 166, 108, 19);
            }
            msA2.method_5ebbb6a4_Dne(string, n3 + 62, n4 + 16 + 19 * i, 104, n6);
            msA2 = this.field_493682ed_Dne.field_3791671_Dne;
            n6 = 8453920;
            msA2.method_7eed4432_Dne(string2, n3 + 62 + 104 - msA2.method_8f501fd7_Dne(string2), n4 + 16 + 19 * i + 7, n6);
        }
    }

    @Override
    public void method_ae128dc7_bzF() {
        super.method_ae128dc7_bzF();
        this.method_d44b4592_zGp();
    }

    public void method_d44b4592_zGp() {
        float f;
        float f2;
        NMq nMq = this.field_36bb35e_Dne.method_9e7d935f_Dne(0).method_23040479_Dne();
        if (!NMq.method_68dd7a5d_FWm(nMq, this.field_36a761a_Dne)) {
            this.field_36a761a_Dne = nMq;
            do {
                this.field_267cf2_Qnq += (float)(this.field_7331eae7_Dne.nextInt(4) - this.field_7331eae7_Dne.nextInt(4));
            } while (this.field_2092ab_Dne <= this.field_267cf2_Qnq + 1.0f && this.field_2092ab_Dne >= this.field_267cf2_Qnq - 1.0f);
        }
        ++this.field_20b857_DyG;
        this.field_2e5f18_bzF = this.field_2092ab_Dne;
        this.field_20b854_DyG = this.field_388da3_zGp;
        boolean bl = false;
        for (int i = 0; i < 3; ++i) {
            if (this.field_3681d3c_Dne.field_3f1c589_Dne[i] == 0) continue;
            bl = true;
        }
        this.field_388da3_zGp = bl ? (this.field_388da3_zGp += 0.2f) : (this.field_388da3_zGp -= 0.2f);
        if (this.field_388da3_zGp < 0.0f) {
            this.field_388da3_zGp = 0.0f;
        }
        if (this.field_388da3_zGp > 1.0f) {
            this.field_388da3_zGp = 1.0f;
        }
        if ((f2 = (this.field_267cf2_Qnq - this.field_2092ab_Dne) * 0.4f) < -(f = 0.2f)) {
            f2 = -f;
        }
        if (f2 > f) {
            f2 = f;
        }
        this.field_2d29f1_aFZ += (f2 - this.field_2d29f1_aFZ) * 0.9f;
        this.field_2092ab_Dne += this.field_2d29f1_aFZ;
    }

    public IfV(MOS mOS, Qnq qnq, int n, int n2, int n3, String string) {
        super(new HhP(mOS, qnq, n, n2, n3));
        this.field_3681d3c_Dne = (HhP)this.field_36bb35e_Dne;
        this.field_569fcf45_Dne = string;
    }

    @Override
    protected void method_16cca7a_Dne(int n, int n2) {
        this.field_3791671_Dne.method_e88b55f3_FWm(this.field_569fcf45_Dne == null ? KGL.method_39193c_Dne("container.enchant") : this.field_569fcf45_Dne, 12, 5, 0x404040);
        this.field_3791671_Dne.method_e88b55f3_FWm(KGL.method_39193c_Dne("container.inventory"), 8, this.field_267cf5_Qnq - 96 + 2, 0x404040);
    }
}

