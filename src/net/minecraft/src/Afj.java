package net.minecraft.src;
/*
 * Decompiled with CFR 0.152.
 */
import net.minecraft.client.Minecraft;
import org.lwjgl.opengl.Display;
import org.lwjgl.opengl.GL11;

public class Afj
implements TaY {
    private Minecraft field_493682ed_Dne;
    private String field_569fcf45_Dne = "";
    private long field_2092af_Dne = Minecraft.method_7a46288e_Dne();
    private boolean field_2092bf_Dne = false;
    private String field_d9a85c6_FWm = "";

    @Override
    public void method_110c4dc3_FWm(String string) {
        this.field_2092bf_Dne = true;
        this.method_47a073d1_bzF(string);
    }

    @Override
    public void method_5acf91a_d_() {
    }

    public void method_47a073d1_bzF(String string) {
        this.field_d9a85c6_FWm = string;
        if (!this.field_493682ed_Dne.field_20b868_DyG) {
            if (!this.field_2092bf_Dne) {
                throw new MCb();
            }
        } else {
            IJm iJm = new IJm(this.field_493682ed_Dne.field_3758af7_Dne, this.field_493682ed_Dne.field_2092ae_Dne, this.field_493682ed_Dne.field_21260d_FWm);
            GL11.glClear(256);
            GL11.glMatrixMode(5889);
            GL11.glLoadIdentity();
            GL11.glOrtho(0.0, iJm.method_7a462888_Dne(), iJm.method_7c6f6027_FWm(), 0.0, 100.0, 300.0);
            GL11.glMatrixMode(5888);
            GL11.glLoadIdentity();
            GL11.glTranslatef(0.0f, 0.0f, -200.0f);
        }
    }

    @Override
    public void method_ce7f5da9_Dne(int n) {
        if (!this.field_493682ed_Dne.field_20b868_DyG) {
            if (!this.field_2092bf_Dne) {
                throw new MCb();
            }
        } else {
            long l = Minecraft.method_7a46288e_Dne();
            if (l - this.field_2092af_Dne >= 100L) {
                this.field_2092af_Dne = l;
                IJm iJm = new IJm(this.field_493682ed_Dne.field_3758af7_Dne, this.field_493682ed_Dne.field_2092ae_Dne, this.field_493682ed_Dne.field_21260d_FWm);
                int n2 = iJm.method_7a46288d_Dne();
                int n3 = iJm.method_7c6f602c_FWm();
                GL11.glClear(256);
                GL11.glMatrixMode(5889);
                GL11.glLoadIdentity();
                GL11.glOrtho(0.0, iJm.method_7a462888_Dne(), iJm.method_7c6f6027_FWm(), 0.0, 100.0, 300.0);
                GL11.glMatrixMode(5888);
                GL11.glLoadIdentity();
                GL11.glTranslatef(0.0f, 0.0f, -200.0f);
                GL11.glClear(16640);
                WAR wAR = WAR.field_36e5ca4_Dne;
                this.field_493682ed_Dne.field_36d36bf_Dne.method_8f501fe4_Dne("/rock.png");
                float f = 32.0f;
                wAR.method_7a46289a_Dne();
                wAR.method_143f9e1c_bzF(0x404040);
                wAR.method_c38c5864_Dne(0.0, n3, 0.0, 0.0, (float)n3 / f);
                wAR.method_c38c5864_Dne(n2, n3, 0.0, (float)n2 / f, (float)n3 / f);
                wAR.method_c38c5864_Dne(n2, 0.0, 0.0, (float)n2 / f, 0.0);
                wAR.method_c38c5864_Dne(0.0, 0.0, 0.0, 0.0, 0.0);
                wAR.method_7a46288d_Dne();
                if (n >= 0) {
                    int n4 = 100;
                    int n5 = 2;
                    int n6 = n2 / 2 - n4 / 2;
                    int n7 = n3 / 2 + 16;
                    GL11.glDisable(3553);
                    wAR.method_7a46289a_Dne();
                    wAR.method_143f9e1c_bzF(0x808080);
                    wAR.method_2be429a4_Dne(n6, n7, 0.0);
                    wAR.method_2be429a4_Dne(n6, n7 + n5, 0.0);
                    wAR.method_2be429a4_Dne(n6 + n4, n7 + n5, 0.0);
                    wAR.method_2be429a4_Dne(n6 + n4, n7, 0.0);
                    wAR.method_143f9e1c_bzF(0x80FF80);
                    wAR.method_2be429a4_Dne(n6, n7, 0.0);
                    wAR.method_2be429a4_Dne(n6, n7 + n5, 0.0);
                    wAR.method_2be429a4_Dne(n6 + n, n7 + n5, 0.0);
                    wAR.method_2be429a4_Dne(n6 + n, n7, 0.0);
                    wAR.method_7a46288d_Dne();
                    GL11.glEnable(3553);
                }
                this.field_493682ed_Dne.field_3791671_Dne.method_7eed4432_Dne(this.field_d9a85c6_FWm, (n2 - this.field_493682ed_Dne.field_3791671_Dne.method_8f501fd7_Dne(this.field_d9a85c6_FWm)) / 2, n3 / 2 - 4 - 16, 0xFFFFFF);
                this.field_493682ed_Dne.field_3791671_Dne.method_7eed4432_Dne(this.field_569fcf45_Dne, (n2 - this.field_493682ed_Dne.field_3791671_Dne.method_8f501fd7_Dne(this.field_569fcf45_Dne)) / 2, n3 / 2 - 4 + 8, 0xFFFFFF);
                Display.update();
                try {
                    Thread.yield();
                }
                catch (Exception exception) {
                    // empty catch block
                }
            }
        }
    }

    @Override
    public void method_a9a920ab_Qnq(String string) {
        if (!this.field_493682ed_Dne.field_20b868_DyG) {
            if (!this.field_2092bf_Dne) {
                throw new MCb();
            }
        } else {
            this.field_2092af_Dne = 0L;
            this.field_569fcf45_Dne = string;
            this.method_ce7f5da9_Dne(-1);
            this.field_2092af_Dne = 0L;
        }
    }

    @Override
    public void method_8f501fe4_Dne(String string) {
        this.field_2092bf_Dne = false;
        this.method_47a073d1_bzF(string);
    }

    public Afj(Minecraft minecraft) {
        this.field_493682ed_Dne = minecraft;
    }
}

