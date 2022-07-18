package net.minecraft.src;
/*
 * Decompiled with CFR 0.152.
 */
import java.lang.management.ManagementFactory;
import java.lang.management.RuntimeMXBean;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Timer;
import java.util.TimerTask;
import java.util.UUID;

public class evf {
    private Map field_83b1c1b0_Dne = new HashMap();
    private final Timer field_6aaa0ca7_Dne;
    private final long field_2092af_Dne;
    private int field_2092ae_Dne = 0;
    private final String field_569fcf45_Dne = UUID.randomUUID().toString();
    private final hur field_376de07_Dne;
    private boolean field_2092bf_Dne = false;
    private final URL field_3bdb143a_Dne;
    private final Object field_63dcf1d7_Dne;

    public evf(String string, hur hur2) {
        this.field_6aaa0ca7_Dne = new Timer("Snooper Timer", true);
        this.field_63dcf1d7_Dne = new Object();
        this.field_2092af_Dne = System.currentTimeMillis();
        try {
            this.field_3bdb143a_Dne = new URL("http://snoop.minecraft.net/" + string + "?version=" + 1);
        }
        catch (MalformedURLException malformedURLException) {
            throw new IllegalArgumentException();
        }
        this.field_376de07_Dne = hur2;
    }

    static URL method_52d3af63_Dne(evf evf2) {
        return evf2.field_3bdb143a_Dne;
    }

    static int method_a5de08e5_Dne(evf evf2) {
        return evf2.field_2092ae_Dne++;
    }

    public String method_eecad346_Dne() {
        return this.field_569fcf45_Dne;
    }

    static hur method_49060be_Dne(evf evf2) {
        return evf2.field_376de07_Dne;
    }

    public boolean method_7a46289e_Dne() {
        return this.field_2092bf_Dne;
    }

    public void method_7c6f6039_FWm() {
        this.method_5e295ec0_Dne("memory_total", Runtime.getRuntime().totalMemory());
        this.method_5e295ec0_Dne("memory_max", Runtime.getRuntime().maxMemory());
        this.method_5e295ec0_Dne("memory_free", Runtime.getRuntime().freeMemory());
        this.method_5e295ec0_Dne("cpu_cores", Runtime.getRuntime().availableProcessors());
        this.method_5e295ec0_Dne("run_time", (System.currentTimeMillis() - this.field_2092af_Dne) / 60L * 1000L);
        this.field_376de07_Dne.method_a5de08f2_Dne(this);
    }

    private void method_a98a0660_aFZ() {
        RuntimeMXBean runtimeMXBean = ManagementFactory.getRuntimeMXBean();
        List<String> list = runtimeMXBean.getInputArguments();
        int n = 0;
        for (Object obj : list) {String string = (String) obj;
            if (!string.startsWith("-X")) continue;
            this.method_5e295ec0_Dne("jvm_arg[" + n++ + "]", string);
        }
        this.method_5e295ec0_Dne("jvm_args", n);
    }

    static Map method_4bcc8ba7_Dne(evf evf2) {
        return evf2.field_83b1c1b0_Dne;
    }

    static Object method_c951d080_Dne(evf evf2) {
        return evf2.field_63dcf1d7_Dne;
    }

    /*
     * WARNING - Removed try catching itself - possible behaviour change.
     */
    public Map method_d410254f_Dne() {
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        Object object = this.field_63dcf1d7_Dne;
        Object object2 = this.field_63dcf1d7_Dne;
        synchronized (object2) {
            this.method_7c6f6039_FWm();
            for (Object obj : this.field_83b1c1b0_Dne.entrySet()) { Map.Entry entry = (Map.Entry) obj;
                linkedHashMap.put(entry.getKey(), entry.getValue().toString());
            }
            return linkedHashMap;
        }
    }

    /*
     * WARNING - Removed try catching itself - possible behaviour change.
     */
    public void method_5e295ec0_Dne(String string, Object object) {
        Object object2 = this.field_63dcf1d7_Dne;
        Object object3 = this.field_63dcf1d7_Dne;
        synchronized (object3) {
            this.field_83b1c1b0_Dne.put(string, object);
        }
    }

    public void method_7a46289a_Dne() {
        if (!this.field_2092bf_Dne) {
            this.field_2092bf_Dne = true;
            this.method_907a9d21_Qnq();
            this.field_6aaa0ca7_Dne.schedule((TimerTask)new TFY(this), 0L, 900000L);
        }
    }

    public void method_ae128dc7_bzF() {
        this.field_6aaa0ca7_Dne.cancel();
    }

    private void method_907a9d21_Qnq() {
        this.method_a98a0660_aFZ();
        this.method_5e295ec0_Dne("snooper_token", this.field_569fcf45_Dne);
        this.method_5e295ec0_Dne("os_name", System.getProperty("os.name"));
        this.method_5e295ec0_Dne("os_version", System.getProperty("os.version"));
        this.method_5e295ec0_Dne("os_architecture", System.getProperty("os.arch"));
        this.method_5e295ec0_Dne("java_version", System.getProperty("java.version"));
        this.method_5e295ec0_Dne("version", "UNKNOWN");
        this.field_376de07_Dne.method_7f31bcb3_FWm(this);
    }
}

