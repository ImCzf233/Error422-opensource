package net.minecraft.src;
/*
 * Decompiled with CFR 0.152.
 */
import org.lwjgl.opengl.GL11;

/*
 * Renamed from Jte
 */
public abstract class jte_0 {
    protected xwr_0 field_36f2779_Dne;

    protected void method_abaa98ae_Dne(String string, String string2) {
        Snh snh = this.field_36f2779_Dne.field_36d36bf_Dne;
        if (snh != null) {
            GL11.glBindTexture(3553, snh.method_abaa98a1_Dne(string, string2));
        }
        snh.method_7a46289a_Dne();
    }

    protected void method_8f501fe4_Dne(String string) {
        Snh snh = this.field_36f2779_Dne.field_36d36bf_Dne;
        if (snh != null) {
            snh.method_8f501fe4_Dne(string);
        }
    }

    public msA method_2312a4d0_Dne() {
        return this.field_36f2779_Dne.method_2312a4d0_Dne();
    }

    public void method_83516093_Dne(Qnq qnq) {
    }

    public void method_8dffa4b4_Dne(xwr_0 xwr_02) {
        this.field_36f2779_Dne = xwr_02;
    }

    public abstract void method_bdc49bcc_Dne(ipD var1, double var2, double var4, double var6, float var8);
}

