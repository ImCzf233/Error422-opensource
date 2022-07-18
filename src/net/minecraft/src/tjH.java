package net.minecraft.src;
/*
 * Decompiled with CFR 0.152.
 */
import java.io.IOException;
import java.io.Reader;
import java.io.StringReader;

public final class tjH {
    public bab method_c6f1b738_Dne(Reader reader) throws IOException, pPp {
        iWY iWY2 = new iWY();
        new gJi().method_53462c02_Dne(reader, iWY2);
        return iWY2.method_230d6528_Dne();
    }

    public bab method_2856a772_Dne(String string) throws pPp {
        try {
            bab bab2 = this.method_c6f1b738_Dne(new StringReader(string));
            return bab2;
        }
        catch (IOException iOException) {
            throw new RuntimeException("Coding failure in Argo:  StringWriter gave an IOException", iOException);
        }
    }
}

