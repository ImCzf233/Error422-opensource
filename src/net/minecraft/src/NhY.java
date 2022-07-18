package net.minecraft.src;
/*
 * Decompiled with CFR 0.152.
 */
public abstract class NhY
implements DVm {
    @Override
    public abstract sHZ method_2314c0a6_Dne();

    public int hashCode() {
        return this.method_2314c0a6_Dne().hashCode();
    }

    public boolean equals(Object object) {
        if (this == object) {
            return true;
        }
        if (!(object instanceof DVm)) {
            return false;
        }
        DVm dVm = (DVm)object;
        return this.method_2314c0a6_Dne().equals(dVm.method_2314c0a6_Dne());
    }
}

