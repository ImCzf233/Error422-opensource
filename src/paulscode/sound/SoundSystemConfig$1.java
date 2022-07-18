/*
 * Decompiled with CFR 0.152.
 */
package paulscode.sound;

import java.util.ListIterator;
import paulscode.sound.IStreamListener;
import paulscode.sound.SoundSystemConfig;

final class SoundSystemConfig$1
extends Thread {
    final /* synthetic */ int val$qSize;
    final /* synthetic */ String val$srcName;

    /*
     * WARNING - Removed try catching itself - possible behaviour change.
     */
    public void run() {
        Object object = SoundSystemConfig.access$000();
        synchronized (object) {
            if (SoundSystemConfig.access$100() == null) {
                return;
            }
            ListIterator listIterator = SoundSystemConfig.access$100().listIterator();
            while (listIterator.hasNext()) {
                IStreamListener iStreamListener = (IStreamListener)listIterator.next();
                if (iStreamListener == null) {
                    listIterator.remove();
                    continue;
                }
                iStreamListener.endOfStream(this.val$srcName, this.val$qSize);
            }
        }
    }

    SoundSystemConfig$1(String string, int n) {
        this.val$srcName = string;
        this.val$qSize = n;
    }
}

