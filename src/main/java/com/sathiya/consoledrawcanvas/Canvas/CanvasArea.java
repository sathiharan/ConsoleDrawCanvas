package com.sathiya.consoledrawcanvas.Canvas;

/**
 * Defining Canvas Area
 *
 * @author smdgandhi
 */
public class CanvasArea {

    private int width;
    private int height;
    private char[][] canvasArea;

    public CanvasArea(int width, int height) {
        this.width = width;
        this.height = height;
        this.canvasArea = new char[height][width];
        this.initCanvasArea();
    }

    private void initCanvasArea() {
        for (int i = 0; i < height; i++) {
            for (int j = 0; j < width; j++) {
                canvasArea[i][j] = ' ';
            }
        }
    }

    public void setElement(int col, int row, char element) {
        col = col - 1;
        row = row - 1;
        if (col >= 0 && col < width && row >= 0 && row < height) {
            canvasArea[row][col] = element;
        }
    }

    public Character getElement(int col, int row) {
        col = col - 1;
        row = row - 1;
        if (col >= 0 && col < width && row >= 0 && row < height) {
            return canvasArea[row][col];
        }
        return ' ';
    }

    public int getWidth() {
        return width;
    }

    public int getHeight() {
        return height;
    }

}
