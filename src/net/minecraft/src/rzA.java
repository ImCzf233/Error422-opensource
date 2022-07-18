package net.minecraft.src;
/*
 * Decompiled with CFR 0.152.
 */
import org.lwjgl.opengl.GL11;

public class rzA
extends jte_0 {
    private EVc field_20204ab9_FWm;
    public static rzA field_37b7693_Dne;
    private EVc field_3667eda_Dne = new EVc(0, 0, 64, 32);

    public void method_a38e11b5_Dne(CUf cUf, double d, double d2, double d3, float f) {
        this.method_afa438aa_Dne((float)d, (float)d2, (float)d3, cUf.method_d44b4585_zGp() & 7, (float)(cUf.method_7c6f602c_FWm() * 360) / 16.0f, cUf.method_7a46288d_Dne(), cUf.method_eecad346_Dne());
    }

    @Override
    public void method_bdc49bcc_Dne(ipD ipD2, double d, double d2, double d3, float f) {
        this.method_a38e11b5_Dne((CUf)ipD2, d, d2, d3, f);
    }

    @Override
    public void method_8dffa4b4_Dne(xwr_0 xwr_02) {
        super.method_8dffa4b4_Dne(xwr_02);
        field_37b7693_Dne = this;
    }

    public void method_afa438aa_Dne(float f, float f2, float f3, int n, float f4, int n2, String string) {
        EVc eVc = this.field_3667eda_Dne;
        switch (n2) {
            default: {
                this.method_8f501fe4_Dne("/mob/skeleton.png");
                break;
            }
            case 1: {
                this.method_8f501fe4_Dne("/mob/skeleton_wither.png");
                break;
            }
            case 2: {
                this.method_8f501fe4_Dne("/mob/zombie.png");
                eVc = this.field_20204ab9_FWm;
                break;
            }
            case 3: {
                if (string != null && string.length() > 0) {
                    String string2 = "http://skins.minecraft.net/MinecraftSkins/" + vCA.method_39193c_Dne(string) + ".png";
                    if (!rzA.field_37b7693_Dne.field_36f2779_Dne.field_36d36bf_Dne.method_8f501fe8_Dne(string2)) {
                        rzA.field_37b7693_Dne.field_36f2779_Dne.field_36d36bf_Dne.method_ce6d8658_Dne(string2, new VGP());
                    }
                    this.method_abaa98ae_Dne(string2, "/mob/char.png");
                    break;
                }
                this.method_8f501fe4_Dne("/mob/char.png");
                break;
            }
            case 4: {
                this.method_8f501fe4_Dne("/mob/creeper.png");
            }
        }
        GL11.glPushMatrix();
        GL11.glDisable(2884);
        if (n != 1) {
            switch (n) {
                case 2: {
                    GL11.glTranslatef(f + 0.5f, f2 + 0.25f, f3 + 0.74f);
                    break;
                }
                case 3: {
                    GL11.glTranslatef(f + 0.5f, f2 + 0.25f, f3 + 0.26f);
                    f4 = 180.0f;
                    break;
                }
                case 4: {
                    GL11.glTranslatef(f + 0.74f, f2 + 0.25f, f3 + 0.5f);
                    f4 = 270.0f;
                    break;
                }
                default: {
                    GL11.glTranslatef(f + 0.26f, f2 + 0.25f, f3 + 0.5f);
                    f4 = 90.0f;
                    break;
                }
            }
        } else {
            GL11.glTranslatef(f + 0.5f, f2, f3 + 0.5f);
        }
        float f5 = 0.0625f;
        GL11.glEnable(32826);
        GL11.glScalef(-1.0f, -1.0f, 1.0f);
        GL11.glEnable(3008);
        eVc.method_3a102820_Dne(null, 0.0f, 0.0f, 0.0f, f4, 0.0f, f5);
        GL11.glPopMatrix();
    }

    public rzA() {
        this.field_20204ab9_FWm = new EVc(0, 0, 64, 64);
    }
}

