/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package edu.escuelaing.arsw.easyparking.model;

/**
 *
 * @author Vashi
 */
public class Slot {

    private int h;
    private String i;
    private Boolean isDraggable;
    private Boolean isResizable;
    private Double maxH;
    private Double maxW;
    private Double minH;
    private Double minW;
    private Boolean moved;
    private Boolean static1;
    private int w;
    private int x;
    private int y;

    public Slot() {
    }

    public Slot(int h, String i, Boolean isDraggable, Boolean isResizable, Double maxH, Double maxW, Double minH, Double minW, Boolean moved, Boolean static1, int w, int x, int y) {
        this.h = h;
        this.i = i;
        this.isDraggable = isDraggable;
        this.isResizable = isResizable;
        this.maxH = maxH;
        this.maxW = maxW;
        this.minH = minH;
        this.minW = minW;
        this.moved = moved;
        this.static1 = static1;
        this.w = w;
        this.x = x;
        this.y = y;
    }

    public int getH() {
        return h;
    }

    public void setH(int h) {
        this.h = h;
    }

    public String getI() {
        return i;
    }

    public void setI(String i) {
        this.i = i;
    }

    public Boolean getIsDraggable() {
        return isDraggable;
    }

    public void setIsDraggable(Boolean isDraggable) {
        this.isDraggable = isDraggable;
    }

    public Boolean getIsResizable() {
        return isResizable;
    }

    public void setIsResizable(Boolean isResizable) {
        this.isResizable = isResizable;
    }

    public Double getMaxH() {
        return maxH;
    }

    public void setMaxH(Double maxH) {
        this.maxH = maxH;
    }

    public Double getMaxW() {
        return maxW;
    }

    public void setMaxW(Double maxW) {
        this.maxW = maxW;
    }

    public Double getMinH() {
        return minH;
    }

    public void setMinH(Double minH) {
        this.minH = minH;
    }

    public Double getMinW() {
        return minW;
    }

    public void setMinW(Double minW) {
        this.minW = minW;
    }

    public Boolean getMoved() {
        return moved;
    }

    public void setMoved(Boolean moved) {
        this.moved = moved;
    }

    public Boolean getStatic1() {
        return static1;
    }

    public void setStatic1(Boolean static1) {
        this.static1 = static1;
    }

    public int getW() {
        return w;
    }

    public void setW(int w) {
        this.w = w;
    }

    public int getX() {
        return x;
    }

    public void setX(int x) {
        this.x = x;
    }

    public int getY() {
        return y;
    }

    public void setY(int y) {
        this.y = y;
    }

    @Override
    public String toString() {
        return "Slot{" + "h=" + h + ", i=" + i + ", isDraggable=" + isDraggable + ", isResizable=" + isResizable + ", maxH=" + maxH + ", maxW=" + maxW + ", minH=" + minH + ", minW=" + minW + ", moved=" + moved + ", static1=" + static1 + ", w=" + w + ", x=" + x + ", y=" + y + '}';
    }


}
