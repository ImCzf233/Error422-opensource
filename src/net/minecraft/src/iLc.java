package net.minecraft.src;
/*
 * Decompiled with CFR 0.152.
 */
class iLc
extends Thread {
    final yJm field_37df650_Dne;

    iLc(yJm yJm2) {
        this.field_37df650_Dne = yJm2;
    }

    @Override
    public void run() {
        try {
            if (yJm.method_6b25acc0_Dne(this.field_37df650_Dne) != null) {
                yJm.method_9381797f_Dne(this.field_37df650_Dne, yJm.method_6b25acc0_Dne(this.field_37df650_Dne), yJm.method_64dd2d22_Dne(this.field_37df650_Dne), yJm.method_e6995b01_FWm(this.field_37df650_Dne), yJm.method_1d2d810f_bzF(this.field_37df650_Dne));
            } else if (yJm.method_64dd2d22_Dne(this.field_37df650_Dne).exists()) {
                yJm.method_feff7f0f_Dne(this.field_37df650_Dne, yJm.method_7be101e5_Dne(this.field_37df650_Dne, yJm.method_64dd2d22_Dne(this.field_37df650_Dne), yJm.method_e6995b01_FWm(this.field_37df650_Dne), yJm.method_1d2d810f_bzF(this.field_37df650_Dne)));
            }
        }
        catch (Exception exception) {
            exception.printStackTrace();
        }
        finally {
            yJm.method_ed2dd26d_Dne(this.field_37df650_Dne, false);
        }
    }
}

