package net.minecraft.src;
/*
 * Decompiled with CFR 0.152.
 */
import java.util.Collection;
import java.util.Iterator;
import java.util.Random;

public class nGp {
    public static Twy method_e347da17_Dne(Random random, Twy[] twyArray) {
        return nGp.method_e6408e62_Dne(random, twyArray, nGp.method_c8a024e3_Dne(twyArray));
    }

    public static int method_c8a024e3_Dne(Twy[] twyArray) {
        int n = 0;
        Twy[] twyArray2 = twyArray;
        int n2 = twyArray.length;
        for (int i = 0; i < n2; ++i) {
            Twy twy = twyArray2[i];
            n += twy.field_2e5f1b_bzF;
        }
        return n;
    }

    public static Twy method_4d96d567_Dne(Random random, Collection collection, int n) {
        Twy twy;
        if (n <= 0) {
            throw new IllegalArgumentException();
        }
        int n2 = random.nextInt(n);
        Iterator iterator = collection.iterator();
        do {
            if (!iterator.hasNext()) {
                return null;
            }
            twy = (Twy)iterator.next();
        } while ((n2 -= twy.field_2e5f1b_bzF) >= 0);
        return twy;
    }

    public static Twy method_5a3a1e72_Dne(Random random, Collection collection) {
        return nGp.method_4d96d567_Dne(random, collection, nGp.method_18d926be_Dne(collection));
    }

    public static Twy method_e6408e62_Dne(Random random, Twy[] twyArray, int n) {
        if (n <= 0) {
            throw new IllegalArgumentException();
        }
        int n2 = random.nextInt(n);
        Twy[] twyArray2 = twyArray;
        int n3 = twyArray.length;
        for (int i = 0; i < n3; ++i) {
            Twy twy = twyArray2[i];
            if ((n2 -= twy.field_2e5f1b_bzF) >= 0) continue;
            return twy;
        }
        return null;
    }

    public static int method_18d926be_Dne(Collection<Twy> collection) {
        int n = 0;
        for (Twy twy : collection) {
            n += twy.field_2e5f1b_bzF;
        }
        return n;
    }
}

