package net.minecraft.src;
/*
 * Decompiled with CFR 0.152.
 */
public abstract class sHZ
extends NhY {
    abstract boolean method_bb343406_Dne(sHZ var1);

    @Override
    public final boolean equals(Object object) {
        return this == object ? true : object instanceof DVm && this.method_bb343406_Dne(((DVm)object).method_2314c0a6_Dne());
    }

    @Override
    public sHZ method_2314c0a6_Dne() {
        return this;
    }

    @Override
    public abstract int hashCode();
}

