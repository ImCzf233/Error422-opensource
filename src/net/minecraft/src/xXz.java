package net.minecraft.src;
/*
 * Decompiled with CFR 0.152.
 */
import java.io.File;

public class xXz
extends yxO {
    @Override
    public void method_7a46289a_Dne() {
        try {
            Osh.field_36b7808_Dne.method_7a46289a_Dne();
        }
        catch (InterruptedException interruptedException) {
            interruptedException.printStackTrace();
        }
        LoG.method_7a46289a_Dne();
    }

    @Override
    public void method_b34bd92c_Dne(xoY xoY2, WkD wkD) {
        xoY2.method_7ed97a02_Qnq(19133);
        super.method_b34bd92c_Dne(xoY2, wkD);
    }

    @Override
    public YHU method_c0b631c6_Dne(Jik jik) {
        File file = this.method_9189e6b3_Dne();
        if (jik instanceof XjO) {
            File file2 = new File(file, "DIM-1");
            file2.mkdirs();
            return new EwP(file2);
        }
        if (jik instanceof TKg) {
            File file3 = new File(file, "DIM1");
            file3.mkdirs();
            return new EwP(file3);
        }
        return new EwP(file);
    }

    public xXz(File file, String string, boolean bl) {
        super(file, string, bl);
    }
}

