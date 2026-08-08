package com.example.textile_factory_management_system.NonUser;

import java.io.Serializable;

public class ProductionOutput implements Serializable {
    private int outputId, batchId, totalProduced, defectCount, usableCount;

    public ProductionOutput(int outputId, int batchId, int totalProduced, int defectCount, int usableCount) {
        this.outputId = outputId;
        this.batchId = batchId;
        this.totalProduced = 0;
        this.defectCount = 0;
        this.usableCount = 0;
    }

    public int getOutputId() {
        return outputId;
    }

    public void setOutputId(int outputId) {
        this.outputId = outputId;
    }

    public int getBatchId() {
        return batchId;
    }

    public void setBatchId(int batchId) {
        this.batchId = batchId;
    }

    public int getTotalProduced() {
        return totalProduced;
    }

    public void setTotalProduced(int totalProduced) {
        this.totalProduced = totalProduced;
    }

    public int getDefectCount() {
        return defectCount;
    }

    public void setDefectCount(int defectCount) {
        this.defectCount = defectCount;
    }

    public int getUsableCount() {
        return usableCount;
    }

    public void setUsableCount(int usableCount) {
        this.usableCount = usableCount;
    }

    @Override
    public String toString() {
        return "ProductionOutput{" +
                "outputId=" + outputId +
                ", batchId=" + batchId +
                ", totalProduced=" + totalProduced +
                ", defectCount=" + defectCount +
                ", usableCount=" + usableCount +
                '}';
    }
}
