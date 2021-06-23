package com.whatsapp;

import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;

public class InteractiveAnnotation implements Serializable {
    public static final long serialVersionUID = -3211751283609597L;
    public SerializablePoint[] polygonVertices;
    public SerializableLocation serializableLocation;

    public InteractiveAnnotation(double d, double d2, String str, SerializablePoint[] serializablePointArr) {
        this.polygonVertices = serializablePointArr;
        this.serializableLocation = new SerializableLocation(d, d2, str);
    }

    public InteractiveAnnotation(SerializablePoint[] serializablePointArr, SerializableLocation serializableLocation2) {
        this.polygonVertices = serializablePointArr;
        this.serializableLocation = serializableLocation2;
    }

    private void readObject(ObjectInputStream objectInputStream) {
        this.polygonVertices = (SerializablePoint[]) objectInputStream.readObject();
        this.serializableLocation = (SerializableLocation) objectInputStream.readObject();
    }

    private void writeObject(ObjectOutputStream objectOutputStream) {
        objectOutputStream.writeObject(this.polygonVertices);
        objectOutputStream.writeObject(this.serializableLocation);
    }
}
