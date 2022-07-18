package net.minecraft.src;
/*
 * Decompiled with CFR 0.152.
 */
import java.io.File;

class bwp
implements Ejs {
    final ark field_373a352_Dne;

    bwp(ark ark2) {
        this.field_373a352_Dne = ark2;
    }

    @Override
    public void method_be931c91_Dne(File file) {
        if (ark.method_9ed48e51_Dne(this.field_373a352_Dne)) {
            ark.method_6c4b34c9_Dne(this.field_373a352_Dne, new eqx(ark.method_7b05101c_Dne(this.field_373a352_Dne, file), file, ark.method_f87771ec_FWm()));
            ark.method_8e47951b_Dne(this.field_373a352_Dne).method_c073daf8_mrb();
        }
    }
}

