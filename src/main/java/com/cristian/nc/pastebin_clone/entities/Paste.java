package com.cristian.nc.pastebin_clone.entities;

import javax.persistence.*;
import java.text.SimpleDateFormat;
import java.util.Date;

@Entity
@Table(name="paste")
public class Paste {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private long pasteId;

    private String pasteName;

    private Date pasteInstanceMoment = new Date( );

    @Column(name = "ft", columnDefinition = "LONGTEXT")
    private SimpleDateFormat ft = new SimpleDateFormat("dd.MM.yyyy");

    private String pasteInstanceMomentString = ft.format(pasteInstanceMoment); //new Date();

    private Boolean syntaxHighlightingStatus;

    private String syntaxHighlighting = "text";

    @Column(name = "text", columnDefinition = "LONGTEXT")
    private String pasteText;

    private long expiration;

    private String exposure;

    private String folder;

    private boolean passwordStatus;

    private String password;

    private boolean burnAfterRead;

    private long objectSize;

    public long getPasteId() {
        return pasteId;
    }

    public void setPasteId(long pasteId) {
        this.pasteId = pasteId;
    }

    public String getPasteName() {
        return pasteName;
    }

    public void setPasteName(String pasteName) {
        this.pasteName = pasteName;
    }

    public Date getPasteInstanceMoment() {
        return pasteInstanceMoment;
    }

    public void setPasteInstanceMoment(Date pasteInstanceMoment) {
        this.pasteInstanceMoment = pasteInstanceMoment;
    }

    public Boolean getSyntaxHighlightingStatus() {
        return syntaxHighlightingStatus;
    }

    public void setSyntaxHighlightingStatus(Boolean syntaxHighlightingStatus) {
        this.syntaxHighlightingStatus = syntaxHighlightingStatus;
    }

    public String getPasteText() {
        return pasteText;
    }

    public void setPasteText(String pasteText) {
        this.pasteText = pasteText;
    }

    public long getExpiration() {
        return expiration;
    }

    public void setExpiration(long expiration) {
        this.expiration = expiration;
    }

    public String getExposure() {
        return exposure;
    }

    public void setExposure(String exposure) {
        this.exposure = exposure;
    }

    public String getFolder() {
        return folder;
    }

    public void setFolder(String folder) {
        this.folder = folder;
    }

    public boolean isPasswordStatus() {
        return passwordStatus;
    }

    public void setPasswordStatus(boolean passwordStatus) {
        this.passwordStatus = passwordStatus;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public boolean isBurnAfterRead() {
        return burnAfterRead;
    }

    public void setBurnAfterRead(boolean burnAfterRead) {
        this.burnAfterRead = burnAfterRead;
    }

    public long getObjectSize() {
        return objectSize;
    }

    public void setObjectSize(long objectSize) {
        this.objectSize = objectSize;
    }

    public String getSyntaxHighlighting() {
        return syntaxHighlighting;
    }

    public void setSyntaxHighlighting(String syntaxHighlighting) {
        this.syntaxHighlighting = syntaxHighlighting;
    }

    public String getPasteInstanceMomentString() {
        return pasteInstanceMomentString;
    }

    public void setPasteInstanceMomentString(String pasteInstanceMomentString) {
        this.pasteInstanceMomentString = pasteInstanceMomentString;
    }

    @Override
    public String toString() {
        return "Paste{" +
                "pasteId=" + pasteId +
                ", pasteName='" + pasteName + '\'' +
                ", pasteInstanceMoment=" + pasteInstanceMoment +
                ", syntaxHighlightingStatus=" + syntaxHighlightingStatus +
                ", syntaxHighlighting='" + syntaxHighlighting + '\'' +
                ", pasteText='" + pasteText + '\'' +
                ", expiration=" + expiration +
                ", exposure='" + exposure + '\'' +
                ", folder='" + folder + '\'' +
                ", passwordStatus=" + passwordStatus +
                ", password='" + password + '\'' +
                ", burnAfterRead=" + burnAfterRead +
                ", objectSize=" + objectSize +
                '}';
    }
}
