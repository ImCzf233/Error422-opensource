package net.minecraft.src;
/*
 * Decompiled with CFR 0.152.
 */
import java.util.Map;
import java.util.Map.Entry;

public class Kvh
extends sAy {
    private double field_2092a9_Dne = 0.01;

    public Kvh() {
    }

    public Kvh(Map map) {
        for (Object obj : map.entrySet()) {
        	Map.Entry entry = (Entry) obj;
            if (!((String)entry.getKey()).equals("chance")) continue;
            this.field_2092a9_Dne = geR.method_5ab43cc8_Dne((String)entry.getValue(), this.field_2092a9_Dne);
        }
    }

    @Override
    protected boolean method_16cca7e_Dne(int n, int n2) {
        return this.field_7331eae7_Dne.nextDouble() < this.field_2092a9_Dne && this.field_7331eae7_Dne.nextInt(80) < Math.max(Math.abs(n), Math.abs(n2));
    }

    @Override
    protected JhS method_90454696_Dne(int n, int n2) {
        return new HDz(this.field_36c4f18_Dne, this.field_7331eae7_Dne, n, n2);
    }
}

