package net.minecraft.src;
/*
 * Decompiled with CFR 0.152.
 */
import net.minecraft.client.Minecraft;
import org.lwjgl.opengl.GL11;

public class gTB
extends MlO {
    private float field_2e5f18_bzF;
    private float field_2092ab_Dne;

    public static void method_90e03f57_Dne(Minecraft minecraft, int n, int n2, int n3, float f, float f2) {
        GL11.glEnable(2903);
        GL11.glPushMatrix();
        GL11.glTranslatef(n, n2, 50.0f);
        GL11.glScalef(-n3, n3, n3);
        GL11.glRotatef(180.0f, 0.0f, 0.0f, 1.0f);
        float f3 = minecraft.field_369f6b6_Dne.field_22c5ff_IjH;
        float f4 = minecraft.field_369f6b6_Dne.field_334489_mrb;
        float f5 = minecraft.field_369f6b6_Dne.field_29186a_XHL;
        GL11.glRotatef(135.0f, 0.0f, 1.0f, 0.0f);
        Cit.method_7c6f6039_FWm();
        GL11.glRotatef(-135.0f, 0.0f, 1.0f, 0.0f);
        GL11.glRotatef(-((float)Math.atan(f2 / 40.0f)) * 20.0f, 1.0f, 0.0f, 0.0f);
        minecraft.field_369f6b6_Dne.field_22c5ff_IjH = (float)Math.atan(f / 40.0f) * 20.0f;
        minecraft.field_369f6b6_Dne.field_334489_mrb = (float)Math.atan(f / 40.0f) * 40.0f;
        minecraft.field_369f6b6_Dne.field_29186a_XHL = -((float)Math.atan(f2 / 40.0f)) * 20.0f;
        minecraft.field_369f6b6_Dne.field_36e4d7_vSL = minecraft.field_369f6b6_Dne.field_334489_mrb;
        GL11.glTranslatef(0.0f, minecraft.field_369f6b6_Dne.field_36b0a6_udO, 0.0f);
        ptH.field_37a7828_Dne.field_2092ab_Dne = 180.0f;
        ptH.field_37a7828_Dne.method_31745cde_Dne(minecraft.field_369f6b6_Dne, 0.0, 0.0, 0.0, 0.0f, 1.0f);
        minecraft.field_369f6b6_Dne.field_22c5ff_IjH = f3;
        minecraft.field_369f6b6_Dne.field_334489_mrb = f4;
        minecraft.field_369f6b6_Dne.field_29186a_XHL = f5;
        GL11.glPopMatrix();
        Cit.method_7a46289a_Dne();
        GL11.glDisable(32826);
        oCF.method_ce7f5da9_Dne(oCF.field_21260d_FWm);
        GL11.glDisable(3553);
        oCF.method_ce7f5da9_Dne(oCF.field_2092ae_Dne);
    }

    @Override
    public void method_2c2cec86_Dne(int n, int n2, float f) {
        super.method_2c2cec86_Dne(n, n2, f);
        this.field_2092ab_Dne = n;
        this.field_2e5f18_bzF = n2;
    }

    @Override
    protected void method_2c02b146_Dne(float f, int n, int n2) {
        GL11.glColor4f(1.0f, 1.0f, 1.0f, 1.0f);
        this.field_493682ed_Dne.field_36d36bf_Dne.method_8f501fe4_Dne("/gui/inventory.png");
        int n3 = this.field_2d29f4_aFZ;
        int n4 = this.field_388da6_zGp;
        this.method_17d7ea99_FWm(n3, n4, 0, 0, this.field_2092ae_Dne, this.field_267cf5_Qnq);
        gTB.method_90e03f57_Dne(this.field_493682ed_Dne, n3 + 51, n4 + 75, 30, (float)(n3 + 51) - this.field_2092ab_Dne, (float)(n4 + 75 - 50) - this.field_2e5f18_bzF);
    }

    public gTB(FiG fiG) {
        super(fiG.field_36bb35e_Dne);
        this.field_21261e_FWm = true;
        fiG.method_df3461c5_Dne(qlg.field_36522b5_Dne, 1);
    }

    @Override
    protected void method_16cca7a_Dne(int n, int n2) {
        this.field_3791671_Dne.method_e88b55f3_FWm(KGL.method_39193c_Dne("container.crafting"), 86, 16, 0x404040);
    }

    @Override
    public void method_ae128dc7_bzF() {
        if (this.field_493682ed_Dne.field_36c390e_Dne.method_a98a0664_aFZ()) {
            this.field_493682ed_Dne.method_b88fcbd2_Dne(new VXB(this.field_493682ed_Dne.field_369f6b6_Dne));
        }
    }

    @Override
    protected void method_81183ff7_Dne(pee_0 pee_02) {
        if (pee_02.field_2d29f4_aFZ == 0) {
            this.field_493682ed_Dne.method_b88fcbd2_Dne(new apb(this.field_493682ed_Dne.field_3673fc1_Dne));
        }
        if (pee_02.field_2d29f4_aFZ == 1) {
            this.field_493682ed_Dne.method_b88fcbd2_Dne(new ZyA(this, this.field_493682ed_Dne.field_3673fc1_Dne));
        }
    }

    @Override
    public void method_7a46289a_Dne() {
        this.field_f27c122c_Dne.clear();
        if (this.field_493682ed_Dne.field_36c390e_Dne.method_a98a0664_aFZ()) {
            this.field_493682ed_Dne.method_b88fcbd2_Dne(new VXB(this.field_493682ed_Dne.field_369f6b6_Dne));
        } else {
            super.method_7a46289a_Dne();
        }
    }
}

