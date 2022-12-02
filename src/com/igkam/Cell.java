package com.igkam;

import java.util.ArrayList;

public class Cell {
    ArrayList<Cell> near;
    Status status;

    public Cell() {
        status = Status.NONE;
        near = new ArrayList<>();
    }

     void addNear(Cell cell) {
        near.add(cell);
    }

    void firstStep() {
        int around = countNearCells();
        status = status.firstStep(around);
    }


    void secondStep() {
        status = status.secondStep();
    }

    private int countNearCells() {
        int count = 0;
        for (Cell cell : near) {
            if (cell.status.isCell()) count++;
        }
        return count;
    }

    public void turn() {
        for(Cell cell: near) {
            if ((Math.random() >= 0.5)) {
                cell.status = cell.status.isCell()?Status.NONE: Status.LIVE;
            }
        }
    }
}
