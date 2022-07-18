package net.minecraft.src;
/*
 * Decompiled with CFR 0.152.
 */
import java.lang.reflect.Field;
import java.lang.reflect.Modifier;

public abstract class uOw {
    private static boolean method_cd95a337_Dne(Field field) {
        return Modifier.isStatic(field.getModifiers());
    }

    public String toString() {
        StringBuilder stringBuilder = new StringBuilder("{");
        for (Field field : this.getClass().getFields()) {
            if (uOw.method_cd95a337_Dne(field)) continue;
            try {
                stringBuilder.append(field.getName()).append("=").append(field.get(this)).append(" ");
            }
            catch (IllegalAccessException illegalAccessException) {
                // empty catch block
            }
        }
        stringBuilder.deleteCharAt(stringBuilder.length() - 1);
        stringBuilder.append('}');
        return stringBuilder.toString();
    }
}

