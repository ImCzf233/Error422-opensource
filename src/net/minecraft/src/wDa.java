package net.minecraft.src;
// Decompiled with: FernFlower
// Class Version: 8
import java.io.IOException;

class wDa extends Thread {
    final Qyp field_36c7844_Dne;

    wDa(Qyp var1, String var2) {
        super(var2);
        this.field_36c7844_Dne = var1;
    }

    public void run() {
        Qyp.field_fe96e884_FWm.getAndIncrement();

        try {
            while(Qyp.method_83ebeec3_Dne(this.field_36c7844_Dne)) {
                boolean var1;
                for(var1 = false; Qyp.method_6be369c_Qnq(this.field_36c7844_Dne); var1 = true) {
                }

                try {
                    if (var1 && Qyp.method_ee39ccdf_Dne(this.field_36c7844_Dne) != null) {
                        Qyp.method_ee39ccdf_Dne(this.field_36c7844_Dne).flush();
                    }
                } catch (IOException var8) {
                    if (!Qyp.method_d769bcbd_aFZ(this.field_36c7844_Dne)) {
                        Qyp.method_54a9fd27_Dne(this.field_36c7844_Dne, var8);
                    }

                    var8.printStackTrace();
                }

                try {
                    sleep(2L);
                } catch (InterruptedException var7) {
                }
            }
        } finally {
            Qyp.field_fe96e884_FWm.getAndDecrement();
        }

    }
}
 
