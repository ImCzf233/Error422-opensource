package net.minecraft.src;
/*
 * Decompiled with CFR 0.152.
 */
import org.lwjgl.input.Keyboard;
import org.lwjgl.opengl.GL11;

public class MYL
extends qVZ {
    private pee_0 field_36bb77c_Dne;
    private AjG field_364f50e_Dne;
    protected String field_569fcf45_Dne = "Edit sign message:";
    private static final String field_d9a85c6_FWm = BAQ.field_569fcf45_Dne;
    private int field_267cf5_Qnq = 0;
    private int field_2092ae_Dne;

    @Override
    protected void method_16a1040_Dne(char c, int n) {
        if (n == 200) {
            this.field_267cf5_Qnq = this.field_267cf5_Qnq - 1 & 3;
        }
        if (n == 208 || n == 28) {
            this.field_267cf5_Qnq = this.field_267cf5_Qnq + 1 & 3;
        }
        if (n == 14 && this.field_364f50e_Dne.field_f5e54dca_Dne[this.field_267cf5_Qnq].length() > 0) {
            this.field_364f50e_Dne.field_f5e54dca_Dne[this.field_267cf5_Qnq] = this.field_364f50e_Dne.field_f5e54dca_Dne[this.field_267cf5_Qnq].substring(0, this.field_364f50e_Dne.field_f5e54dca_Dne[this.field_267cf5_Qnq].length() - 1);
        }
        if (field_d9a85c6_FWm.indexOf(c) >= 0 && this.field_364f50e_Dne.field_f5e54dca_Dne[this.field_267cf5_Qnq].length() < 15) {
            this.field_364f50e_Dne.field_f5e54dca_Dne[this.field_267cf5_Qnq] = this.field_364f50e_Dne.field_f5e54dca_Dne[this.field_267cf5_Qnq] + c;
        }
        if (n == 1) {
            this.method_81183ff7_Dne(this.field_36bb77c_Dne);
        }
    }

    @Override
    public void method_ae128dc7_bzF() {
        ++this.field_2092ae_Dne;
    }

    @Override
    protected void method_81183ff7_Dne(pee_0 pee_02) {
        if (pee_02.field_2092bf_Dne && pee_02.field_2d29f4_aFZ == 0) {
            this.field_364f50e_Dne.method_582b297_a_();
            this.field_493682ed_Dne.method_b88fcbd2_Dne(null);
        }
    }

    @Override
    public void method_7a46289a_Dne() {
        this.field_f27c122c_Dne.clear();
        Keyboard.enableRepeatEvents(true);
        this.field_36bb77c_Dne = new pee_0(0, this.field_21260d_FWm / 2 - 100, this.field_2e5f1b_bzF / 4 + 120, "Done");
        this.field_f27c122c_Dne.add(this.field_36bb77c_Dne);
        this.field_364f50e_Dne.method_ce7f9d7a_Dne(false);
    }

    public MYL(AjG ajG) {
        this.field_364f50e_Dne = ajG;
    }

    @Override
    public void method_2c2cec86_Dne(int n, int n2, float f) {
        this.method_a98a0660_aFZ();
        this.method_32faf66d_Dne(this.field_3791671_Dne, this.field_569fcf45_Dne, this.field_21260d_FWm / 2, 40, 0xFFFFFF);
        GL11.glPushMatrix();
        GL11.glTranslatef(this.field_21260d_FWm / 2, 0.0f, 50.0f);
        float f2 = 93.75f;
        GL11.glScalef(-f2, -f2, -f2);
        GL11.glRotatef(180.0f, 0.0f, 1.0f, 0.0f);
        zKP zKP2 = this.field_364f50e_Dne.method_2317f94c_Dne();
        if (zKP2 == zKP.field_2c863000_LVR) {
            float f3 = (float)(this.field_364f50e_Dne.method_d44b4585_zGp() * 360) / 16.0f;
            GL11.glRotatef(f3, 0.0f, 1.0f, 0.0f);
            GL11.glTranslatef(0.0f, -1.0625f, 0.0f);
        } else {
            int n3 = this.field_364f50e_Dne.method_d44b4585_zGp();
            float f4 = 0.0f;
            if (n3 == 2) {
                f4 = 180.0f;
            }
            if (n3 == 4) {
                f4 = 90.0f;
            }
            if (n3 == 5) {
                f4 = -90.0f;
            }
            GL11.glRotatef(f4, 0.0f, 1.0f, 0.0f);
            GL11.glTranslatef(0.0f, -1.0625f, 0.0f);
        }
        if (this.field_2092ae_Dne / 6 % 2 == 0) {
            this.field_364f50e_Dne.field_2092ae_Dne = this.field_267cf5_Qnq;
        }
        xwr_0.field_36f2779_Dne.method_bdc49bcc_Dne(this.field_364f50e_Dne, -0.5, -0.75, -0.5, 0.0f);
        this.field_364f50e_Dne.field_2092ae_Dne = -1;
        GL11.glPopMatrix();
        super.method_2c2cec86_Dne(n, n2, f);
    }

    @Override
    public void method_7c6f6039_FWm() {
        Keyboard.enableRepeatEvents(false);
        fzy fzy2 = this.field_493682ed_Dne.method_230f9746_Dne();
        if (eCD.method_ce7f5d9c_Dne(20) == 0) {
            for (int i = 0; i < 4; ++i) {
                this.field_364f50e_Dne.field_f5e54dca_Dne[i] = nVa.method_eecad346_Dne();
            }
        }
        if (fzy2 != null) {
            fzy2.method_5536af4d_FWm(new eFM(this.field_364f50e_Dne.field_267cf5_Qnq, this.field_364f50e_Dne.field_2d29f4_aFZ, this.field_364f50e_Dne.field_388da6_zGp, this.field_364f50e_Dne.field_f5e54dca_Dne));
        }
        this.field_364f50e_Dne.method_ce7f9d7a_Dne(true);
    }
}

