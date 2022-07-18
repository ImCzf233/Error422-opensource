package net.minecraft.src;
/*
 * Decompiled with CFR 0.152.
 */
import java.util.Collection;
import org.lwjgl.opengl.GL11;

public abstract class MlO
extends Sss {
    private boolean field_267d06_Qnq;

    private void method_d44b4592_zGp() {
        int n = this.field_2d29f4_aFZ - 124;
        int n2 = this.field_388da6_zGp;
        Collection collection = this.field_493682ed_Dne.field_369f6b6_Dne.method_be5f586d_Dne();
        if (!collection.isEmpty()) {
            GL11.glColor4f(1.0f, 1.0f, 1.0f, 1.0f);
            GL11.glDisable(2896);
            int n3 = 33;
            if (collection.size() > 5) {
                n3 = 132 / (collection.size() - 1);
            }
            for (NAx nAx : this.field_493682ed_Dne.field_369f6b6_Dne.method_be5f586d_Dne()) {
                SXd sXd = SXd.field_83633108_Dne[nAx.method_7a46288d_Dne()];
                GL11.glColor4f(1.0f, 1.0f, 1.0f, 1.0f);
                this.field_493682ed_Dne.field_36d36bf_Dne.method_8f501fe4_Dne("/gui/inventory.png");
                this.method_17d7ea99_FWm(n, n2, 0, 166, 140, 32);
                if (sXd.method_7c6f603d_FWm()) {
                    int n4 = sXd.method_7c6f602c_FWm();
                    this.method_17d7ea99_FWm(n + 6, n2 + 7, 0 + n4 % 8 * 18, 198 + n4 / 8 * 18, 18, 18);
                }
                String string = KGL.method_39193c_Dne(sXd.method_eecad346_Dne());
                if (nAx.method_ae128dba_bzF() == 1) {
                    string = string + " II";
                } else if (nAx.method_ae128dba_bzF() == 2) {
                    string = string + " III";
                } else if (nAx.method_ae128dba_bzF() == 3) {
                    string = string + " IV";
                }
                this.field_3791671_Dne.method_7eed4432_Dne(string, n + 10 + 18, n2 + 6, 0xFFFFFF);
                String string2 = SXd.method_1ab1893e_Dne(nAx);
                this.field_3791671_Dne.method_7eed4432_Dne(string2, n + 10 + 18, n2 + 6 + 10, 0x7F7F7F);
                n2 += n3;
            }
        }
    }

    public MlO(Pdb pdb) {
        super(pdb);
    }

    @Override
    public void method_2c2cec86_Dne(int n, int n2, float f) {
        super.method_2c2cec86_Dne(n, n2, f);
        if (this.field_267d06_Qnq) {
            this.method_d44b4592_zGp();
        }
    }

    @Override
    public void method_7a46289a_Dne() {
        super.method_7a46289a_Dne();
        if (!this.field_493682ed_Dne.field_369f6b6_Dne.method_be5f586d_Dne().isEmpty()) {
            this.field_2d29f4_aFZ = 160 + (this.field_21260d_FWm - this.field_2092ae_Dne - 200) / 2;
            this.field_267d06_Qnq = true;
        }
    }
}

