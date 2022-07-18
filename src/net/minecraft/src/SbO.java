package net.minecraft.src;
/*
 * Decompiled with CFR 0.152.
 */
import java.io.File;
import java.io.IOException;
import java.net.URI;
import net.minecraft.client.Minecraft;
import org.lwjgl.Sys;

public class SbO
extends qVZ {
    private int field_2092ae_Dne = -1;
    private fZI field_3758af7_Dne;
    protected qVZ field_37a7e17_Dne;
    private XIv field_36ef367_Dne;
    private String field_569fcf45_Dne = "";

    static Minecraft method_ccd123ea_DyG(SbO sbO) {
        return sbO.field_493682ed_Dne;
    }

    @Override
    protected void method_81183ff7_Dne(pee_0 pee_02) {
        if (pee_02.field_2092bf_Dne) {
            if (pee_02.field_2d29f4_aFZ == 5) {
                if (Minecraft.method_230980ad_Dne() == ZPT.field_5e596115_Qnq) {
                    try {
                        this.field_493682ed_Dne.method_230e0120_Dne().method_8f501fe4_Dne(this.field_569fcf45_Dne);
                        Runtime.getRuntime().exec(new String[]{"/usr/bin/open", this.field_569fcf45_Dne});
                        return;
                    }
                    catch (IOException iOException) {
                        iOException.printStackTrace();
                    }
                } else if (Minecraft.method_230980ad_Dne() == ZPT.field_75b7c03b_bzF) {
                    String string = String.format("cmd.exe /C start \"Open file\" \"%s\"", this.field_569fcf45_Dne);
                    try {
                        Runtime.getRuntime().exec(string);
                        return;
                    }
                    catch (IOException iOException) {
                        iOException.printStackTrace();
                    }
                }
                boolean bl = false;
                try {
                    Class<?> clazz = Class.forName("java.awt.Desktop");
                    Object object = clazz.getMethod("getDesktop", new Class[0]).invoke(null, new Object[0]);
                    clazz.getMethod("browse", URI.class).invoke(object, new File(Minecraft.method_9189e6b3_Dne(), "texturepacks").toURI());
                }
                catch (Throwable throwable) {
                    throwable.printStackTrace();
                    bl = true;
                }
                if (bl) {
                    this.field_493682ed_Dne.method_230e0120_Dne().method_8f501fe4_Dne("Opening via system class!");
                    Sys.openURL("file://" + this.field_569fcf45_Dne);
                }
            } else if (pee_02.field_2d29f4_aFZ == 6) {
                this.field_493682ed_Dne.method_b88fcbd2_Dne(this.field_37a7e17_Dne);
            } else {
                this.field_36ef367_Dne.method_81183ff7_Dne(pee_02);
            }
        }
    }

    @Override
    protected void method_2c2cf7c9_Dne(int n, int n2, int n3) {
        super.method_2c2cf7c9_Dne(n, n2, n3);
    }

    static Minecraft method_d8ad85f9_zGp(SbO sbO) {
        return sbO.field_493682ed_Dne;
    }

    static Minecraft method_1cc79920_FWm(SbO sbO) {
        return sbO.field_493682ed_Dne;
    }

    static msA method_29130e50_bzF(SbO sbO) {
        return sbO.field_3791671_Dne;
    }

    @Override
    public void method_ae128dc7_bzF() {
        super.method_ae128dc7_bzF();
        --this.field_2092ae_Dne;
    }

    static Minecraft method_f7718501_Dne(SbO sbO) {
        return sbO.field_493682ed_Dne;
    }

    static Minecraft method_6cfc8208_Qnq(SbO sbO) {
        return sbO.field_493682ed_Dne;
    }

    static Minecraft method_edf450ab_div(SbO sbO) {
        return sbO.field_493682ed_Dne;
    }

    static Minecraft method_2ee35c69_kGO(SbO sbO) {
        return sbO.field_493682ed_Dne;
    }

    static Minecraft method_e02f97ae_bzF(SbO sbO) {
        return sbO.field_493682ed_Dne;
    }

    static Minecraft method_53cde05f_mrb(SbO sbO) {
        return sbO.field_493682ed_Dne;
    }

    static Minecraft method_169877c7_aFZ(SbO sbO) {
        return sbO.field_493682ed_Dne;
    }

    @Override
    public void method_7a46289a_Dne() {
        irb irb2 = irb.method_2310d392_Dne();
        this.field_f27c122c_Dne.add(new Cpw(5, this.field_21260d_FWm / 2 - 154, this.field_2e5f1b_bzF - 48, irb2.method_39193c_Dne("texturePack.openFolder")));
        this.field_f27c122c_Dne.add(new Cpw(6, this.field_21260d_FWm / 2 + 4, this.field_2e5f1b_bzF - 48, irb2.method_39193c_Dne("gui.done")));
        this.field_493682ed_Dne.field_373a352_Dne.method_7c6f6039_FWm();
        this.field_569fcf45_Dne = new File(Minecraft.method_9189e6b3_Dne(), "texturepacks").getAbsolutePath();
        this.field_36ef367_Dne = new XIv(this);
        this.field_36ef367_Dne.method_b6186b2b_Dne(this.field_f27c122c_Dne, 7, 8);
    }

    static msA method_ecd4f0dd_Dne(SbO sbO) {
        return sbO.field_3791671_Dne;
    }

    static msA method_c9b6dc1e_FWm(SbO sbO) {
        return sbO.field_3791671_Dne;
    }

    static Minecraft method_b869955_IjH(SbO sbO) {
        return sbO.field_493682ed_Dne;
    }

    static Minecraft method_fdc2f29_Zpi(SbO sbO) {
        return sbO.field_493682ed_Dne;
    }

    public SbO(qVZ qVZ2, fZI fZI2) {
        this.field_37a7e17_Dne = qVZ2;
        this.field_3758af7_Dne = fZI2;
    }

    @Override
    protected void method_a6aca7ca_FWm(int n, int n2, int n3) {
        super.method_a6aca7ca_FWm(n, n2, n3);
    }

    @Override
    public void method_2c2cec86_Dne(int n, int n2, float f) {
        this.field_36ef367_Dne.method_2c2cec86_Dne(n, n2, f);
        if (this.field_2092ae_Dne <= 0) {
            this.field_493682ed_Dne.field_373a352_Dne.method_7c6f6039_FWm();
            this.field_2092ae_Dne += 20;
        }
        irb irb2 = irb.method_2310d392_Dne();
        this.method_32faf66d_Dne(this.field_3791671_Dne, irb2.method_39193c_Dne("texturePack.title"), this.field_21260d_FWm / 2, 16, 0xFFFFFF);
        this.method_32faf66d_Dne(this.field_3791671_Dne, irb2.method_39193c_Dne("texturePack.folderInfo"), this.field_21260d_FWm / 2 - 77, this.field_2e5f1b_bzF - 26, 0x808080);
        super.method_2c2cec86_Dne(n, n2, f);
    }

    static Minecraft method_29a6c380_XHL(SbO sbO) {
        return sbO.field_493682ed_Dne;
    }
}

