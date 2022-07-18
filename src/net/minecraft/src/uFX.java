package net.minecraft.src;
/*
 * Decompiled with CFR 0.152.
 */
import java.util.HashMap;
import java.util.Map;

public class uFX
implements yEI {
    protected final Map field_83b1c1b0_Dne = new HashMap();

    @Override
    public void method_eabd8452_Dne(Object object, Object object2) {
        this.field_83b1c1b0_Dne.put(object, object2);
    }

    @Override
    public Object method_8dde1bfc_Dne(Object object) {
        return this.field_83b1c1b0_Dne.get(object);
    }
}

