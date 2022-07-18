package net.minecraft.src;
/*
 * Decompiled with CFR 0.152.
 */
final class QCn {
    private final String field_569fcf45_Dne;

    QCn(String string) {
        this.field_569fcf45_Dne = string.replace("\\", "\\\\").replace("\"", "\\\"").replace("\b", "\\b").replace("\f", "\\f").replace("\n", "\\n").replace("\r", "\\r").replace("\t", "\\t");
    }

    public String toString() {
        return this.field_569fcf45_Dne;
    }
}

