package net.minecraft.src;
/*
 * Decompiled with CFR 0.152.
 */
import java.util.Calendar;
import org.lwjgl.opengl.GL11;

public class pEE
extends jte_0 {
    private XLo field_36efdd1_Dne = new XLo();
    private XLo field_2028c9b0_FWm = new BRL();
    private boolean field_2092bf_Dne;

    public void method_3dfd0743_Dne(gon_0 gon_02, double d, double d2, double d3, float f) {
        Object object;
        int n;
        if (!gon_02.method_907a9d25_Qnq()) {
            n = 0;
        } else {
            object = gon_02.method_2317f94c_Dne();
            n = gon_02.method_d44b4585_zGp();
            if (object instanceof gHK && n == 0) {
                ((gHK)object).method_5452795d_bzF(gon_02.method_2305dd77_Dne(), gon_02.field_267cf5_Qnq, gon_02.field_2d29f4_aFZ, gon_02.field_388da6_zGp);
                n = gon_02.method_d44b4585_zGp();
            }
            gon_02.method_a98a0660_aFZ();
        }
        if (gon_02.field_3674ac6_Dne == null && gon_02.field_75af18b3_bzF == null) {
            float f2;
            if (gon_02.field_202116a5_FWm == null && gon_02.field_5e50b98d_Qnq == null) {
                object = this.field_36efdd1_Dne;
                if (gon_02.method_7a46288d_Dne() == 1) {
                    this.method_8f501fe4_Dne("/item/chests/trap_small.png");
                } else if (this.field_2092bf_Dne) {
                    this.method_8f501fe4_Dne("/item/xmaschest.png");
                } else {
                    this.method_8f501fe4_Dne("/item/chest.png");
                }
            } else {
                object = this.field_2028c9b0_FWm;
                if (gon_02.method_7a46288d_Dne() == 1) {
                    this.method_8f501fe4_Dne("/item/chests/trap_large.png");
                } else if (this.field_2092bf_Dne) {
                    this.method_8f501fe4_Dne("/item/largexmaschest.png");
                } else {
                    this.method_8f501fe4_Dne("/item/largechest.png");
                }
            }
            GL11.glPushMatrix();
            GL11.glEnable(32826);
            GL11.glColor4f(1.0f, 1.0f, 1.0f, 1.0f);
            GL11.glTranslatef((float)d, (float)d2 + 1.0f, (float)d3 + 1.0f);
            GL11.glScalef(1.0f, -1.0f, -1.0f);
            GL11.glTranslatef(0.5f, 0.5f, 0.5f);
            int n2 = 0;
            if (n == 2) {
                n2 = 180;
            }
            if (n == 3) {
                n2 = 0;
            }
            if (n == 4) {
                n2 = 90;
            }
            if (n == 5) {
                n2 = -90;
            }
            if (n == 2 && gon_02.field_202116a5_FWm != null) {
                GL11.glTranslatef(1.0f, 0.0f, 0.0f);
            }
            if (n == 5 && gon_02.field_5e50b98d_Qnq != null) {
                GL11.glTranslatef(0.0f, 0.0f, -1.0f);
            }
            GL11.glRotatef(n2, 0.0f, 1.0f, 0.0f);
            GL11.glTranslatef(-0.5f, -0.5f, -0.5f);
            float f3 = gon_02.field_21260a_FWm + (gon_02.field_2092ab_Dne - gon_02.field_21260a_FWm) * f;
            if (gon_02.field_3674ac6_Dne != null && (f2 = gon_02.field_3674ac6_Dne.field_21260a_FWm + (gon_02.field_3674ac6_Dne.field_2092ab_Dne - gon_02.field_3674ac6_Dne.field_21260a_FWm) * f) > f3) {
                f3 = f2;
            }
            if (gon_02.field_75af18b3_bzF != null && (f2 = gon_02.field_75af18b3_bzF.field_21260a_FWm + (gon_02.field_75af18b3_bzF.field_2092ab_Dne - gon_02.field_75af18b3_bzF.field_21260a_FWm) * f) > f3) {
                f3 = f2;
            }
            f3 = 1.0f - f3;
            f3 = 1.0f - f3 * f3 * f3;
            ((XLo)object).field_37b7066_Dne.field_388da3_zGp = -(f3 * (float)Math.PI / 2.0f);
            ((XLo)object).method_7a46289a_Dne();
            GL11.glDisable(32826);
            GL11.glPopMatrix();
            GL11.glColor4f(1.0f, 1.0f, 1.0f, 1.0f);
        }
    }

    public pEE() {
        Calendar calendar = Calendar.getInstance();
        if (calendar.get(2) + 1 == 12 && calendar.get(5) >= 24 && calendar.get(5) <= 26) {
            this.field_2092bf_Dne = true;
        }
    }

    @Override
    public void method_bdc49bcc_Dne(ipD ipD2, double d, double d2, double d3, float f) {
        this.method_3dfd0743_Dne((gon_0)ipD2, d, d2, d3, f);
    }
}

