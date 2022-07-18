package net.minecraft.src;
/*
 * Decompiled with CFR 0.152.
 */
import java.lang.management.ManagementFactory;
import java.lang.management.RuntimeMXBean;
import java.util.List;
import java.util.concurrent.Callable;

class DhS
implements Callable {
    final McM field_36a4ff5_Dne;

    public String method_eecad346_Dne() {
        RuntimeMXBean runtimeMXBean = ManagementFactory.getRuntimeMXBean();
        List<String> list = runtimeMXBean.getInputArguments();
        int n = 0;
        StringBuilder stringBuilder = new StringBuilder();
        for (Object obj : list) {String string = (String) obj;
            if (!string.startsWith("-X")) continue;
            if (n++ > 0) {
                stringBuilder.append(" ");
            }
            stringBuilder.append(string);
        }
        return String.format("%d total; %s", n, stringBuilder.toString());
    }

    public Object call() {
        return this.method_eecad346_Dne();
    }

    DhS(McM mcM) {
        this.field_36a4ff5_Dne = mcM;
    }
}

