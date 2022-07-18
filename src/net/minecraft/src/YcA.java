package net.minecraft.src;
/*
 * Decompiled with CFR 0.152.
 */
import org.lwjgl.opengl.GL11;

public class YcA
extends qVZ {
    private int field_2092ae_Dne;

    @Override
    public void method_2c2cec86_Dne(int n, int n2, float f) {
        this.method_c6b5263a_Dne(0, 0, this.field_21260d_FWm, this.field_2e5f1b_bzF, 0x60500000, -1602211792);
        GL11.glPushMatrix();
        GL11.glScalef(2.0f, 2.0f, 2.0f);
        boolean bl = this.field_493682ed_Dne.field_36ebf36_Dne.method_231798c9_Dne().method_907a9d25_Qnq();
        String string = bl ? KGL.method_39193c_Dne("deathScreen.title.hardcore") : KGL.method_39193c_Dne("deathScreen.title");
        this.method_32faf66d_Dne(this.field_3791671_Dne, string, this.field_21260d_FWm / 2 / 2, 30, 0xFFFFFF);
        GL11.glPopMatrix();
        if (bl) {
            this.method_32faf66d_Dne(this.field_3791671_Dne, KGL.method_39193c_Dne("deathScreen.hardcoreInfo"), this.field_21260d_FWm / 2, 144, 0xFFFFFF);
        }
        this.method_32faf66d_Dne(this.field_3791671_Dne, KGL.method_39193c_Dne("deathScreen.score") + ": " + (Object)((Object)Dne.field_ab1f2987_ooe) + this.field_493682ed_Dne.field_369f6b6_Dne.method_998e661c_Vxn(), this.field_21260d_FWm / 2, 100, 0xFFFFFF);
        super.method_2c2cec86_Dne(n, n2, f);
    }

    @Override
    public void method_ae128dc7_bzF() {
        super.method_ae128dc7_bzF();
        ++this.field_2092ae_Dne;
        if (this.field_2092ae_Dne == 20) {
            for (pee_0 pee_02 : this.field_f27c122c_Dne) {
                pee_02.field_2092bf_Dne = true;
            }
        }
    }

    @Override
    public boolean method_7a46289e_Dne() {
        return false;
    }

    @Override
    protected void method_16a1040_Dne(char c, int n) {
    }

    @Override
    protected void method_81183ff7_Dne(pee_0 pee_02) {
        switch (pee_02.field_2d29f4_aFZ) {
            case 1: {
                this.field_493682ed_Dne.field_369f6b6_Dne.method_907a9d21_Qnq();
                this.field_493682ed_Dne.method_b88fcbd2_Dne(null);
                break;
            }
            case 2: {
                this.field_493682ed_Dne.field_36ebf36_Dne.method_8288d6ee_IjH();
                this.field_493682ed_Dne.method_8c784131_Dne(null);
                this.field_493682ed_Dne.method_b88fcbd2_Dne(new MKS());
            }
        }
    }

    @Override
    public void method_7a46289a_Dne() {
        this.field_f27c122c_Dne.clear();
        if (this.field_493682ed_Dne.field_36ebf36_Dne.method_231798c9_Dne().method_907a9d25_Qnq()) {
            if (this.field_493682ed_Dne.method_d44b4596_zGp()) {
                this.field_f27c122c_Dne.add(new pee_0(1, this.field_21260d_FWm / 2 - 100, this.field_2e5f1b_bzF / 4 + 96, KGL.method_39193c_Dne("deathScreen.deleteWorld")));
            } else {
                this.field_f27c122c_Dne.add(new pee_0(1, this.field_21260d_FWm / 2 - 100, this.field_2e5f1b_bzF / 4 + 96, KGL.method_39193c_Dne("deathScreen.leaveServer")));
            }
        } else {
            this.field_f27c122c_Dne.add(new pee_0(1, this.field_21260d_FWm / 2 - 100, this.field_2e5f1b_bzF / 4 + 72, KGL.method_39193c_Dne("deathScreen.respawn")));
            this.field_f27c122c_Dne.add(new pee_0(2, this.field_21260d_FWm / 2 - 100, this.field_2e5f1b_bzF / 4 + 96, KGL.method_39193c_Dne("deathScreen.titleScreen")));
            if (this.field_493682ed_Dne.field_37d3e5f_Dne == null) {
                ((pee_0)this.field_f27c122c_Dne.get((int)1)).field_2092bf_Dne = false;
            }
        }
        for (pee_0 pee_02 : this.field_f27c122c_Dne) {
            pee_02.field_2092bf_Dne = false;
        }
    }
}

