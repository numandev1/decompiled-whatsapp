package com.whatsapp;

import java.io.File;
import java.io.Serializable;

public class MediaData implements Serializable {
    public static final long serialVersionUID = -3211751283609594L;
    public transient boolean A00;
    public boolean autodownloadRetryEnabled;
    public long cachedDownloadedBytes;
    public byte[] cipherKey;
    public String directPath;
    public String doodleId;
    public int faceX;
    public int faceY;
    public int failErrorCode;
    public File file;
    public long fileSize;
    public int firstScanLength;
    public byte[] firstScanSidecar;
    public int gifAttribution;
    public boolean hasStreamingSidecar;
    public int height;
    public byte[] hmacKey;
    public InteractiveAnnotation[] interactiveAnnotations;
    public byte[] iv;
    public String mediaJobUuid;
    public byte[] mediaKey;
    public long mediaKeyTimestampMs;
    public long progress;
    public byte[] refKey;
    public boolean showDownloadedBytes;
    public int suspiciousContent;
    public float thumbnailHeightWidthRatio;
    public boolean transcoded;
    public boolean transferred;
    public long trimFrom;
    public long trimTo;
    public boolean uploadRetry;
    public String uploadUrl;
    public int width;

    public MediaData() {
    }

    public MediaData(MediaData mediaData) {
        this.cipherKey = mediaData.cipherKey;
        this.directPath = mediaData.directPath;
        this.doodleId = mediaData.doodleId;
        this.faceX = mediaData.faceX;
        this.faceY = mediaData.faceY;
        this.file = mediaData.file;
        this.fileSize = mediaData.fileSize;
        this.firstScanLength = mediaData.firstScanLength;
        this.firstScanSidecar = mediaData.firstScanSidecar;
        this.hasStreamingSidecar = mediaData.hasStreamingSidecar;
        this.gifAttribution = mediaData.gifAttribution;
        this.height = mediaData.height;
        this.hmacKey = mediaData.hmacKey;
        this.interactiveAnnotations = mediaData.interactiveAnnotations;
        this.iv = mediaData.iv;
        this.mediaJobUuid = mediaData.mediaJobUuid;
        this.mediaKey = mediaData.mediaKey;
        this.mediaKeyTimestampMs = mediaData.mediaKeyTimestampMs;
        this.suspiciousContent = mediaData.suspiciousContent;
        this.thumbnailHeightWidthRatio = mediaData.thumbnailHeightWidthRatio;
        this.transferred = mediaData.transferred;
        this.width = mediaData.width;
    }

    public boolean equals(Object obj) {
        return this == obj;
    }
}
