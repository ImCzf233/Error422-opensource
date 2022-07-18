package net.minecraft.src;
import java.util.Iterator;
/*
 * Decompiled with CFR 0.152.
 */
import java.util.List;

public class hTp
extends Onb {
    @Override
    public boolean method_7a46289e_Dne() {
        return true;
    }

    @Override
    public int method_ea14417e_Dne(List var1) {
        float var2 = 0.0F;

        int var3;
        float var4;
        for(Iterator var5 = var1.iterator(); var5.hasNext(); var2 += (float)var3 / var4) {
            FiG var6 = (FiG)var5.next();
            var3 = var6.method_9a443a8c_XHL();
            var4 = (float)var6.method_7a46288d_Dne();
            if (var3 < 0) {
                var3 = 0;
            }

            if ((float)var3 > var4) {
                var3 = var6.method_7a46288d_Dne();
            }
        }

        if (var1.size() > 0) {
            var2 /= (float)var1.size();
        }

        return geR.method_ce7f5259_Dne(var2 * 19.0F) + (var2 > 0.0F ? 1 : 0);
    }

    public hTp(String string) {
        super(string);
    }
}

