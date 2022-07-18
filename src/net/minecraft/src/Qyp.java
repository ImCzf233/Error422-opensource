package net.minecraft.src;
/*
 * Decompiled with CFR 0.152.
 */
import java.io.BufferedOutputStream;
import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.net.Socket;
import java.net.SocketAddress;
import java.net.SocketException;
import java.security.PrivateKey;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.atomic.AtomicInteger;
import javax.crypto.SecretKey;

public class Qyp
implements RXf {
    private boolean field_2d2a05_aFZ = false;
    private List field_7eb83e1f_bzF;
    public static int[] field_3f1c589_Dne;
    private final SocketAddress field_28085168_Dne;
    private int field_2e5f1b_bzF = 0;
    private pPV field_379f2b6_Dne;
    private Socket field_448254da_Dne;
    public static int[] field_4039e0a_FWm;
    private final Object field_63dcf1d7_Dne = new Object();
    private SecretKey field_8d2d5db0_Dne = null;
    private List field_f27c122c_Dne = Collections.synchronizedList(new ArrayList());
    private PrivateKey field_99f81ac_Dne = null;
    private volatile DataOutputStream field_6605c63_Dne;
    private Thread field_2e0496ed_FWm;
    private Object[] field_322705c_Dne;
    boolean field_2092bf_Dne = false;
    private volatile DataInputStream field_3df41888_Dne;
    private String field_569fcf45_Dne = "";
    private Thread field_7709e06c_Dne;
    private volatile boolean field_2e5f2c_bzF = true;
    private int field_21260d_FWm = 0;
    public static AtomicInteger field_58b5fbe5_Dne;
    private volatile boolean field_267d06_Qnq = false;
    private final dLs field_37472c1_Dne;
    private List field_6a0474ed_FWm = Collections.synchronizedList(new ArrayList());
    public int field_2092ae_Dne = 0;
    boolean field_21261e_FWm = false;
    private int field_267cf5_Qnq = 50;
    public static AtomicInteger field_fe96e884_FWm;

    static Thread method_ec4db347_FWm(Qyp qyp) {
        return qyp.field_7709e06c_Dne;
    }

    static boolean method_83ebeec3_Dne(Qyp qyp) {
        return qyp.field_2e5f2c_bzF;
    }

    private boolean method_7c6f603d_FWm() {
        boolean bl = false;
        try {
            NER nER = NER.method_b04c492_Dne(this.field_37472c1_Dne, this.field_3df41888_Dne, this.field_379f2b6_Dne.method_7c6f603d_FWm(), this.field_448254da_Dne);
            if (nER != null) {
                int n;
                if (nER instanceof nsl && !this.field_2092bf_Dne) {
                    if (this.field_379f2b6_Dne.method_7c6f603d_FWm()) {
                        this.field_8d2d5db0_Dne = ((nsl)nER).method_645503e0_Dne(this.field_99f81ac_Dne);
                    }
                    this.method_a98a0660_aFZ();
                }
                int[] nArray = field_3f1c589_Dne;
                int n2 = n = nER.method_a98a0653_aFZ();
                nArray[n2] = nArray[n2] + (nER.method_7a46288d_Dne() + 1);
                if (!this.field_2d2a05_aFZ) {
                    if (nER.method_7a46289e_Dne() && this.field_379f2b6_Dne.method_7a46289e_Dne()) {
                        this.field_21260d_FWm = 0;
                        nER.method_b68494b1_Dne(this.field_379f2b6_Dne);
                    } else {
                        this.field_f27c122c_Dne.add(nER);
                    }
                }
                bl = true;
            } else {
                this.method_feb678cd_Dne("disconnect.endOfStream", new Object[0]);
            }
            return bl;
        }
        catch (Exception exception) {
            if (!this.field_267d06_Qnq) {
                this.method_95840a2c_Dne(exception);
            }
            return false;
        }
    }

    public Qyp(dLs dLs2, Socket socket, String string, pPV pPV2, PrivateKey privateKey) throws IOException {
        this.field_7eb83e1f_bzF = Collections.synchronizedList(new ArrayList());
        this.field_99f81ac_Dne = privateKey;
        this.field_448254da_Dne = socket;
        this.field_37472c1_Dne = dLs2;
        this.field_28085168_Dne = socket.getRemoteSocketAddress();
        this.field_379f2b6_Dne = pPV2;
        try {
            socket.setSoTimeout(30000);
            socket.setTrafficClass(24);
        }
        catch (SocketException socketException) {
            System.err.println(socketException.getMessage());
        }
        this.field_3df41888_Dne = new DataInputStream(socket.getInputStream());
        this.field_6605c63_Dne = new DataOutputStream(new BufferedOutputStream(socket.getOutputStream(), 5120));
        this.field_2e0496ed_FWm = new WRa(this, string + " read thread");
        this.field_7709e06c_Dne = new wDa(this, string + " write thread");
        this.field_2e0496ed_FWm.start();
        this.field_7709e06c_Dne.start();
    }

    static Thread method_22298ce8_Dne(Qyp qyp) {
        return qyp.field_2e0496ed_FWm;
    }

    @Override
    public void method_b68494b1_Dne(pPV pPV2) {
        this.field_379f2b6_Dne = pPV2;
    }

    static boolean method_6be369c_Qnq(Qyp qyp) {
        return qyp.method_7a46289e_Dne();
    }

    private boolean method_7d28cc_Dne(NER nER, boolean bl) {
        NER nER2;
        if (!nER.method_7c6f603d_FWm()) {
            return false;
        }
        List list = bl ? this.field_7eb83e1f_bzF : this.field_6a0474ed_FWm;
        Iterator iterator = list.iterator();
        do {
            if (iterator.hasNext()) continue;
            return false;
        } while ((nER2 = (NER)iterator.next()).method_a98a0653_aFZ() != nER.method_a98a0653_aFZ());
        return nER.method_7be2fb90_Dne(nER2);
    }

    public Socket method_f6d64cb9_Dne() {
        return this.field_448254da_Dne;
    }

    @Override
    public void method_ae128dc7_bzF() {
        if (!this.field_2d2a05_aFZ) {
            this.method_7a46289a_Dne();
            this.field_2d2a05_aFZ = true;
            this.field_2e0496ed_FWm.interrupt();
            new zGQ(this).start();
        }
    }

    @Override
    public void method_7c6f6039_FWm() {
        if (this.field_2e5f1b_bzF > 0x200000) {
            this.method_feb678cd_Dne("disconnect.overflow", new Object[0]);
        }
        if (this.field_f27c122c_Dne.isEmpty()) {
            if (this.field_21260d_FWm++ == 1200) {
                this.method_feb678cd_Dne("disconnect.timeout", new Object[0]);
            }
        } else {
            this.field_21260d_FWm = 0;
        }
        int n = 1000;
        while (!this.field_f27c122c_Dne.isEmpty() && n-- >= 0) {
            NER nER = (NER)this.field_f27c122c_Dne.remove(0);
            nER.method_b68494b1_Dne(this.field_379f2b6_Dne);
        }
        this.method_7a46289a_Dne();
        if (this.field_267d06_Qnq && this.field_f27c122c_Dne.isEmpty()) {
            this.field_379f2b6_Dne.method_feb678cd_Dne(this.field_569fcf45_Dne, this.field_322705c_Dne);
        }
    }

    @Override
    public void method_907a9d21_Qnq() {
        this.method_7a46289a_Dne();
        this.field_7709e06c_Dne = null;
        this.field_2e0496ed_FWm = null;
    }

    private boolean method_7a46289e_Dne() {
        boolean bl = false;
        try {
            int n;
            int[] nArray;
            NER nER;
            if ((this.field_2092ae_Dne == 0 || !this.field_6a0474ed_FWm.isEmpty() && System.currentTimeMillis() - ((NER)this.field_6a0474ed_FWm.get((int)0)).field_2092af_Dne >= (long)this.field_2092ae_Dne) && (nER = this.method_21b7e790_Dne(false)) != null) {
                NER.method_519d53f4_Dne(nER, this.field_6605c63_Dne);
                if (nER instanceof nsl && !this.field_21261e_FWm) {
                    if (!this.field_379f2b6_Dne.method_7c6f603d_FWm()) {
                        this.field_8d2d5db0_Dne = ((nsl)nER).method_e6eb9cf1_Dne();
                    }
                    this.method_d44b4592_zGp();
                }
                nArray = field_4039e0a_FWm;
                int n2 = n = nER.method_a98a0653_aFZ();
                nArray[n2] = nArray[n2] + (nER.method_7a46288d_Dne() + 1);
                bl = true;
            }
            if (this.field_267cf5_Qnq-- <= 0 && (this.field_2092ae_Dne == 0 || !this.field_7eb83e1f_bzF.isEmpty() && System.currentTimeMillis() - ((NER)this.field_7eb83e1f_bzF.get((int)0)).field_2092af_Dne >= (long)this.field_2092ae_Dne) && (nER = this.method_21b7e790_Dne(true)) != null) {
                NER.method_519d53f4_Dne(nER, this.field_6605c63_Dne);
                nArray = field_4039e0a_FWm;
                int n3 = n = nER.method_a98a0653_aFZ();
                nArray[n3] = nArray[n3] + (nER.method_7a46288d_Dne() + 1);
                this.field_267cf5_Qnq = 0;
                bl = true;
            }
            return bl;
        }
        catch (Exception exception) {
            if (!this.field_267d06_Qnq) {
                this.method_95840a2c_Dne(exception);
            }
            return false;
        }
    }

    public Qyp(dLs dLs2, Socket socket, String string, pPV pPV2) throws IOException {
        this(dLs2, socket, string, pPV2, null);
    }

    static boolean method_5d3fa284_FWm(Qyp qyp) {
        return qyp.field_2d2a05_aFZ;
    }

    private void method_a98a0660_aFZ() throws IOException {
        this.field_2092bf_Dne = true;
        InputStream inputStream = this.field_448254da_Dne.getInputStream();
        this.field_3df41888_Dne = new DataInputStream(Mjb.method_e904d0e7_Dne(this.field_8d2d5db0_Dne, inputStream));
    }

    private void method_95840a2c_Dne(Exception exception) {
        exception.printStackTrace();
        this.method_feb678cd_Dne("disconnect.genericReason", "Internal exception: " + exception.toString());
    }

    private void method_d44b4592_zGp() throws IOException {
        this.field_6605c63_Dne.flush();
        this.field_21261e_FWm = true;
        BufferedOutputStream bufferedOutputStream = new BufferedOutputStream(Mjb.method_d2677927_Dne(this.field_8d2d5db0_Dne, this.field_448254da_Dne.getOutputStream()), 5120);
        this.field_6605c63_Dne = new DataOutputStream(bufferedOutputStream);
    }

    static boolean method_75e0bdb6_bzF(Qyp qyp) {
        return qyp.method_7c6f603d_FWm();
    }

    @Override
    public void method_feb678cd_Dne(String string, Object ... objectArray) {
        if (this.field_2e5f2c_bzF) {
            this.field_267d06_Qnq = true;
            this.field_569fcf45_Dne = string;
            this.field_322705c_Dne = objectArray;
            this.field_2e5f2c_bzF = false;
            new ftb_0(this).start();
            try {
                this.field_3df41888_Dne.close();
            }
            catch (Throwable throwable) {
                // empty catch block
            }
            try {
                this.field_6605c63_Dne.close();
            }
            catch (Throwable throwable) {
                // empty catch block
            }
            try {
                this.field_448254da_Dne.close();
            }
            catch (Throwable throwable) {
                // empty catch block
            }
            this.field_3df41888_Dne = null;
            this.field_6605c63_Dne = null;
            this.field_448254da_Dne = null;
        }
    }

    @Override
    public SocketAddress method_81c690a9_Dne() {
        return this.field_28085168_Dne;
    }

    static {
        field_58b5fbe5_Dne = new AtomicInteger();
        field_fe96e884_FWm = new AtomicInteger();
        field_3f1c589_Dne = new int[256];
        field_4039e0a_FWm = new int[256];
    }

    @Override
    public int method_7a46288d_Dne() {
        return this.field_7eb83e1f_bzF.size();
    }

    static boolean method_d769bcbd_aFZ(Qyp qyp) {
        return qyp.field_267d06_Qnq;
    }

    static void method_54a9fd27_Dne(Qyp qyp, Exception exception) {
        qyp.method_95840a2c_Dne(exception);
    }

    @Override
    public void method_7a46289a_Dne() {
        if (this.field_2e0496ed_FWm != null) {
            this.field_2e0496ed_FWm.interrupt();
        }
        if (this.field_7709e06c_Dne != null) {
            this.field_7709e06c_Dne.interrupt();
        }
    }

    /*
     * WARNING - Removed try catching itself - possible behaviour change.
     */
    private NER method_21b7e790_Dne(boolean bl) {
        NER nER = null;
        List list = bl ? this.field_7eb83e1f_bzF : this.field_6a0474ed_FWm;
        Object object = this.field_63dcf1d7_Dne;
        Object object2 = this.field_63dcf1d7_Dne;
        synchronized (object2) {
            while (!list.isEmpty() && nER == null) {
                nER = (NER)list.remove(0);
                this.field_2e5f1b_bzF -= nER.method_7a46288d_Dne() + 1;
                if (!this.method_7d28cc_Dne(nER, bl)) continue;
                nER = null;
            }
            return nER;
        }
    }

    static DataOutputStream method_ee39ccdf_Dne(Qyp qyp) {
        return qyp.field_6605c63_Dne;
    }

    /*
     * WARNING - Removed try catching itself - possible behaviour change.
     */
    @Override
    public void method_7be2fb8c_Dne(NER nER) {
        if (!this.field_2d2a05_aFZ) {
            Object object = this.field_63dcf1d7_Dne;
            Object object2 = this.field_63dcf1d7_Dne;
            synchronized (object2) {
                this.field_2e5f1b_bzF += nER.method_7a46288d_Dne() + 1;
                this.field_6a0474ed_FWm.add(nER);
            }
        }
    }
}

