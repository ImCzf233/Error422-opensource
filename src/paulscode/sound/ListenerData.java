/*
 * Decompiled with CFR 0.152.
 */
package paulscode.sound;

import paulscode.sound.Vector3D;

public class ListenerData {
    public Vector3D lookAt;
    public float angle = 0.0f;
    public Vector3D position;
    public Vector3D velocity;
    public Vector3D up;

    public void setVelocity(Vector3D vector3D) {
        this.velocity.x = vector3D.x;
        this.velocity.y = vector3D.y;
        this.velocity.z = vector3D.z;
    }

    public void setData(float f, float f2, float f3, float f4, float f5, float f6, float f7, float f8, float f9, float f10) {
        this.position.x = f;
        this.position.y = f2;
        this.position.z = f3;
        this.lookAt.x = f4;
        this.lookAt.y = f5;
        this.lookAt.z = f6;
        this.up.x = f7;
        this.up.y = f8;
        this.up.z = f9;
        this.angle = f10;
    }

    public ListenerData() {
        this.position = new Vector3D(0.0f, 0.0f, 0.0f);
        this.lookAt = new Vector3D(0.0f, 0.0f, -1.0f);
        this.up = new Vector3D(0.0f, 1.0f, 0.0f);
        this.velocity = new Vector3D(0.0f, 0.0f, 0.0f);
        this.angle = 0.0f;
    }

    public void setVelocity(float f, float f2, float f3) {
        this.velocity.x = f;
        this.velocity.y = f2;
        this.velocity.z = f3;
    }

    public ListenerData(Vector3D vector3D, Vector3D vector3D2, Vector3D vector3D3, float f) {
        this.position = vector3D.clone();
        this.lookAt = vector3D2.clone();
        this.up = vector3D3.clone();
        this.velocity = new Vector3D(0.0f, 0.0f, 0.0f);
        this.angle = f;
    }

    public ListenerData(float f, float f2, float f3, float f4, float f5, float f6, float f7, float f8, float f9, float f10) {
        this.position = new Vector3D(f, f2, f3);
        this.lookAt = new Vector3D(f4, f5, f6);
        this.up = new Vector3D(f7, f8, f9);
        this.velocity = new Vector3D(0.0f, 0.0f, 0.0f);
        this.angle = f10;
    }

    public void setOrientation(float f, float f2, float f3, float f4, float f5, float f6) {
        this.lookAt.x = f;
        this.lookAt.y = f2;
        this.lookAt.z = f3;
        this.up.x = f4;
        this.up.y = f5;
        this.up.z = f6;
    }

    public void setPosition(float f, float f2, float f3) {
        this.position.x = f;
        this.position.y = f2;
        this.position.z = f3;
    }

    public void setPosition(Vector3D vector3D) {
        this.position.x = vector3D.x;
        this.position.y = vector3D.y;
        this.position.z = vector3D.z;
    }

    public void setAngle(float f) {
        this.angle = f;
        this.lookAt.x = -1.0f * (float)Math.sin(this.angle);
        this.lookAt.z = -1.0f * (float)Math.cos(this.angle);
    }

    public void setData(Vector3D vector3D, Vector3D vector3D2, Vector3D vector3D3, float f) {
        this.position.x = vector3D.x;
        this.position.y = vector3D.y;
        this.position.z = vector3D.z;
        this.lookAt.x = vector3D2.x;
        this.lookAt.y = vector3D2.y;
        this.lookAt.z = vector3D2.z;
        this.up.x = vector3D3.x;
        this.up.y = vector3D3.y;
        this.up.z = vector3D3.z;
        this.angle = f;
    }

    public void setOrientation(Vector3D vector3D, Vector3D vector3D2) {
        this.lookAt.x = vector3D.x;
        this.lookAt.y = vector3D.y;
        this.lookAt.z = vector3D.z;
        this.up.x = vector3D2.x;
        this.up.y = vector3D2.y;
        this.up.z = vector3D2.z;
    }

    public void setData(ListenerData listenerData) {
        this.position.x = listenerData.position.x;
        this.position.y = listenerData.position.y;
        this.position.z = listenerData.position.z;
        this.lookAt.x = listenerData.lookAt.x;
        this.lookAt.y = listenerData.lookAt.y;
        this.lookAt.z = listenerData.lookAt.z;
        this.up.x = listenerData.up.x;
        this.up.y = listenerData.up.y;
        this.up.z = listenerData.up.z;
        this.angle = listenerData.angle;
    }
}

