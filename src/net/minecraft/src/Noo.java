package net.minecraft.src;
/*
 * Decompiled with CFR 0.152.
 */
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.Callable;

public class Noo {
    private final String field_569fcf45_Dne;
    private StackTraceElement[] field_f751effc_Dne;
    private final List field_f27c122c_Dne = new ArrayList();
    private final McM field_36a4ff5_Dne;

    public int method_ce7f5d9c_Dne(int n) {
        StackTraceElement[] stackTraceElementArray = Thread.currentThread().getStackTrace();
        this.field_f751effc_Dne = new StackTraceElement[stackTraceElementArray.length - 3 - n];
        System.arraycopy(stackTraceElementArray, 3 + n, this.field_f751effc_Dne, 0, this.field_f751effc_Dne.length);
        return this.field_f751effc_Dne.length;
    }

    public static void method_4b34e06a_Dne(Noo noo, int n, int n2, int n3, int n4, int n5) {
        noo.method_2aeeb7ad_Dne("Block type", new QdM(n4));
        noo.method_2aeeb7ad_Dne("Block data value", new unI(n5));
        noo.method_2aeeb7ad_Dne("Block location", new pcM(n, n2, n3));
    }

    public static String method_2c81c77c_Dne(double d, double d2, double d3) {
        return String.format("%.2f,%.2f,%.2f - %s", d, d2, d3, Noo.method_924467f7_Dne(geR.method_117d0718_FWm(d), geR.method_117d0718_FWm(d2), geR.method_117d0718_FWm(d3)));
    }

    public void method_37db6a91_Dne(String string, Throwable throwable) {
        this.method_5e295ec0_Dne(string, throwable);
    }

    public static String method_924467f7_Dne(int n, int n2, int n3) {
        int n4;
        int n5;
        int n6;
        int n7;
        int n8;
        int n9;
        int n10;
        int n11;
        StringBuilder stringBuilder = new StringBuilder();
        try {
            stringBuilder.append(String.format("World: (%d,%d,%d)", n, n2, n3));
        }
        catch (Throwable throwable) {
            stringBuilder.append("(Error finding world loc)");
        }
        stringBuilder.append(", ");
        try {
            int n12 = n >> 4;
            n11 = n3 >> 4;
            n10 = n & 0xF;
            n9 = n2 >> 4;
            n8 = n3 & 0xF;
            n7 = n12 << 4;
            n6 = n11 << 4;
            n5 = (n12 + 1 << 4) - 1;
            n4 = (n11 + 1 << 4) - 1;
            stringBuilder.append(String.format("Chunk: (at %d,%d,%d in %d,%d; contains blocks %d,0,%d to %d,255,%d)", n10, n9, n8, n12, n11, n7, n6, n5, n4));
        }
        catch (Throwable throwable) {
            stringBuilder.append("(Error finding chunk loc)");
        }
        stringBuilder.append(", ");
        try {
            int n13 = n >> 9;
            n11 = n3 >> 9;
            n10 = n13 << 5;
            n9 = n11 << 5;
            n8 = (n13 + 1 << 5) - 1;
            n7 = (n11 + 1 << 5) - 1;
            n6 = n13 << 9;
            n5 = n11 << 9;
            n4 = (n13 + 1 << 9) - 1;
            int n14 = (n11 + 1 << 9) - 1;
            stringBuilder.append(String.format("Region: (%d,%d; contains chunks %d,%d to %d,%d, blocks %d,0,%d to %d,255,%d)", n13, n11, n10, n9, n8, n7, n6, n5, n4, n14));
        }
        catch (Throwable throwable) {
            stringBuilder.append("(Error finding world loc)");
        }
        return stringBuilder.toString();
    }

    public boolean method_1a58e7de_Dne(StackTraceElement stackTraceElement, StackTraceElement stackTraceElement2) {
        if (this.field_f751effc_Dne.length != 0 && stackTraceElement != null) {
            StackTraceElement stackTraceElement3 = this.field_f751effc_Dne[0];
            if (stackTraceElement3.isNativeMethod() == stackTraceElement.isNativeMethod() && stackTraceElement3.getClassName().equals(stackTraceElement.getClassName()) && stackTraceElement3.getFileName().equals(stackTraceElement.getFileName()) && stackTraceElement3.getMethodName().equals(stackTraceElement.getMethodName())) {
                if (stackTraceElement2 != null != this.field_f751effc_Dne.length > 1) {
                    return false;
                }
                if (stackTraceElement2 != null && !this.field_f751effc_Dne[1].equals(stackTraceElement2)) {
                    return false;
                }
                this.field_f751effc_Dne[0] = stackTraceElement;
                return true;
            }
            return false;
        }
        return false;
    }

    public Noo(McM mcM, String string) {
        this.field_f751effc_Dne = new StackTraceElement[0];
        this.field_36a4ff5_Dne = mcM;
        this.field_569fcf45_Dne = string;
    }

    public void method_5e295ec0_Dne(String string, Object object) {
        this.field_f27c122c_Dne.add(new VPj(string, object));
    }

    public void method_ce7f5da9_Dne(int n) {
        StackTraceElement[] stackTraceElementArray = new StackTraceElement[this.field_f751effc_Dne.length - n];
        System.arraycopy(this.field_f751effc_Dne, 0, stackTraceElementArray, 0, stackTraceElementArray.length);
        this.field_f751effc_Dne = stackTraceElementArray;
    }

    public void method_c93df0d1_Dne(StringBuilder var1) {
        var1.append("-- ").append(this.field_569fcf45_Dne).append(" --\n");
        var1.append("Details:");
        Iterator var2 = this.field_f27c122c_Dne.iterator();

        while(var2.hasNext()) {
            VPj var3 = (VPj)var2.next();
            var1.append("\n\t");
            var1.append(var3.method_eecad346_Dne());
            var1.append(": ");
            var1.append(var3.method_d1f1ed87_FWm());
        }

        if (this.field_f751effc_Dne != null && this.field_f751effc_Dne.length > 0) {
            var1.append("\nStacktrace:");
            StackTraceElement[] var7 = this.field_f751effc_Dne;
            int var4 = var7.length;

            for(int var5 = 0; var5 < var4; ++var5) {
                StackTraceElement var6 = var7[var5];
                var1.append("\n\tat ");
                var1.append(var6.toString());
            }
        }

    }

    public void method_2aeeb7ad_Dne(String string, Callable callable) {
        try {
            this.method_5e295ec0_Dne(string, callable.call());
        }
        catch (Throwable throwable) {
            this.method_37db6a91_Dne(string, throwable);
        }
    }
}

