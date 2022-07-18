package net.minecraft.src;
/*
 * Decompiled with CFR 0.152.
 */
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Osh
implements Runnable {
    private volatile long field_2092af_Dne = 0L;
    public static final Osh field_36b7808_Dne = new Osh();
    private volatile long field_21260e_FWm = 0L;
    private List field_f27c122c_Dne = Collections.synchronizedList(new ArrayList());
    private volatile boolean field_2092bf_Dne = false;

    @Override
    public void run() {
        while (true) {
            this.method_7c6f6039_FWm();
        }
    }

    private void method_7c6f6039_FWm() {
        for (int i = 0; i < this.field_f27c122c_Dne.size(); ++i) {
            ROX rOX = (ROX)this.field_f27c122c_Dne.get(i);
            boolean bl = rOX.method_7a46289e_Dne();
            if (!bl) {
                this.field_f27c122c_Dne.remove(i--);
                ++this.field_21260e_FWm;
            }
            try {
                Thread.sleep(this.field_2092bf_Dne ? 0L : 10L);
                continue;
            }
            catch (InterruptedException interruptedException) {
                interruptedException.printStackTrace();
            }
        }
        if (this.field_f27c122c_Dne.isEmpty()) {
            try {
                Thread.sleep(25L);
            }
            catch (InterruptedException interruptedException) {
                interruptedException.printStackTrace();
            }
        }
    }

    public void method_7a46289a_Dne() throws InterruptedException {
        this.field_2092bf_Dne = true;
        while (this.field_2092af_Dne != this.field_21260e_FWm) {
            Thread.sleep(10L);
        }
        this.field_2092bf_Dne = false;
    }

    private Osh() {
        Thread thread = new Thread((Runnable)this, "File IO Thread");
        thread.setPriority(1);
        thread.start();
    }

    public void method_8346034c_Dne(ROX rOX) {
        if (!this.field_f27c122c_Dne.contains(rOX)) {
            ++this.field_2092af_Dne;
            this.field_f27c122c_Dne.add(rOX);
        }
    }
}

