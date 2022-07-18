package net.minecraft.src;
/*
 * Decompiled with CFR 0.152.
 */
import java.net.URI;
import org.lwjgl.input.Keyboard;
import org.lwjgl.opengl.GL11;

public class yZI
extends qVZ {
    @Override
    protected void method_81183ff7_Dne(pee_0 pee_02) {
        switch (pee_02.field_2d29f4_aFZ) {
            case 1: {
                pee_02.field_2092bf_Dne = false;
                try {
                    Class<?> clazz = Class.forName("java.awt.Desktop");
                    Object object = clazz.getMethod("getDesktop", new Class[0]).invoke(null, new Object[0]);
                    clazz.getMethod("browse", URI.class).invoke(object, new URI("http://www.minecraft.net/store?source=demo"));
                }
                catch (Throwable throwable) {
                    throwable.printStackTrace();
                }
                break;
            }
            case 2: {
                this.field_493682ed_Dne.method_b88fcbd2_Dne(null);
                this.field_493682ed_Dne.method_a98a0660_aFZ();
            }
        }
    }

    @Override
    public void method_ae128dc7_bzF() {
        super.method_ae128dc7_bzF();
    }

    @Override
    public void method_a98a0660_aFZ() {
        super.method_a98a0660_aFZ();
        GL11.glColor4f(1.0f, 1.0f, 1.0f, 1.0f);
        this.field_493682ed_Dne.field_36d36bf_Dne.method_8f501fe4_Dne("/gui/demo_bg.png");
        int n = (this.field_21260d_FWm - 248) / 2;
        int n2 = (this.field_2e5f1b_bzF - 166) / 2;
        this.method_17d7ea99_FWm(n, n2, 0, 0, 248, 166);
    }

    @Override
    public void method_2c2cec86_Dne(int n, int n2, float f) {
        this.method_a98a0660_aFZ();
        int n3 = (this.field_21260d_FWm - 248) / 2 + 10;
        int n4 = (this.field_2e5f1b_bzF - 166) / 2 + 8;
        this.field_3791671_Dne.method_e88b55f3_FWm(KGL.method_39193c_Dne("demo.help.title"), n3, n4, 0x1F1F1F);
        fZI fZI2 = this.field_493682ed_Dne.field_3758af7_Dne;
        String string = KGL.method_39193c_Dne("demo.help.movementShort");
        string = String.format(string, Keyboard.getKeyName(fZI2.field_37c9f9e_Dne.field_2092ae_Dne), Keyboard.getKeyName(fZI2.field_20366b7d_FWm.field_2092ae_Dne), Keyboard.getKeyName(fZI2.field_75c46d8b_bzF.field_2092ae_Dne), Keyboard.getKeyName(fZI2.field_5e660e65_Qnq.field_2092ae_Dne));
        this.field_3791671_Dne.method_e88b55f3_FWm(string, n3, n4 += 12, 0x4F4F4F);
        string = KGL.method_39193c_Dne("demo.help.movementMouse");
        this.field_3791671_Dne.method_e88b55f3_FWm(string, n3, n4 + 12, 0x4F4F4F);
        string = KGL.method_39193c_Dne("demo.help.jump");
        string = String.format(string, Keyboard.getKeyName(fZI2.field_714023e4_aFZ.field_2092ae_Dne));
        this.field_3791671_Dne.method_e88b55f3_FWm(string, n3, n4 + 24, 0x4F4F4F);
        string = KGL.method_39193c_Dne("demo.help.inventory");
        string = String.format(string, Keyboard.getKeyName(fZI2.field_f0ae5e96_zGp.field_2092ae_Dne));
        this.field_3791671_Dne.method_e88b55f3_FWm(string, n3, n4 + 36, 0x4F4F4F);
        this.field_3791671_Dne.method_5ebbb6a4_Dne(KGL.method_39193c_Dne("demo.help.fullWrapped"), n3, n4 + 68, 218, 0x1F1F1F);
        super.method_2c2cec86_Dne(n, n2, f);
    }

    @Override
    public void method_7a46289a_Dne() {
        this.field_f27c122c_Dne.clear();
        int n = -16;
        this.field_f27c122c_Dne.add(new pee_0(1, this.field_21260d_FWm / 2 - 116, this.field_2e5f1b_bzF / 2 + 62 + n, 114, 20, KGL.method_39193c_Dne("demo.help.buy")));
        this.field_f27c122c_Dne.add(new pee_0(2, this.field_21260d_FWm / 2 + 2, this.field_2e5f1b_bzF / 2 + 62 + n, 114, 20, KGL.method_39193c_Dne("demo.help.later")));
    }
}

